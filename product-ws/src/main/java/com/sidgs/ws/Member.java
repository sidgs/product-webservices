package com.sidgs.ws;

import com.sidgs.product.MemberService;
import com.sidgs.product.error.MemberException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/member")
public class Member {


    @Autowired
    MemberService memberService;

//    @RequestMapping("/member" method = RequestMethod.GET)
    @RequestMapping (value = "/", method = RequestMethod.GET)
    public List<com.sidgs.product.model.Member> getMembers() throws MemberException {
        return memberService.listAll();
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String addMember(com.sidgs.product.model.Member member) {
        return "added member ";
    }

    @RequestMapping(value = "/",method = RequestMethod.DELETE)
    public String deleteMember(String memberId) {
        return "Delete Successful";
    }

}
