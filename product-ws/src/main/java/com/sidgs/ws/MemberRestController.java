package com.sidgs.ws;

import com.sidgs.product.MemberService;
import com.sidgs.product.error.MemberException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("member")
public class MemberRestController {


    @Autowired
    MemberService memberService;

    @RequestMapping (method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<com.sidgs.product.model.Member> getMembers() throws MemberException {
        return memberService.listAll();
    }

    @RequestMapping (value = "/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody com.sidgs.product.model.Member getMember(@PathVariable String userId) throws MemberException {
        return memberService.findByUserID(userId.trim());
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody void addMember(@RequestBody com.sidgs.product.model.Member member) {

        try {
            memberService.add(member);
        } catch (MemberException e) {
            e.printStackTrace();
        }

        return ;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody void deleteMember(@PathVariable String id) {
        return ;
    }

}
