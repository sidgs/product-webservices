package com.sidgs.product;

import com.sidgs.product.error.MemberException;
import com.sidgs.product.model.Member;

import java.util.List;


public interface MemberService {

    void add(Member member) throws MemberException;
    void update(Member member) throws MemberException;
    List<Member> listAll() throws MemberException;
    List<Member> findbyFirstName(String name) throws MemberException;
    Member findByUserID(String userID) throws MemberException;

}
