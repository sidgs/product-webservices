package com.sidgs.product;

import com.sidgs.product.error.MemberException;
import com.sidgs.product.model.Member;

import java.util.List;


public interface MemberService {

    public void add ( Member member);
    public void update ( Member member) throws MemberException;
    public List<Member> listAll() throws MemberException;
    public List<Member> findbyFirstName(String name);
    public Member findByUserID(String userID);

}
