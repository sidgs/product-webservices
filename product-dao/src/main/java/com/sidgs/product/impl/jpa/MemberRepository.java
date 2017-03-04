package com.sidgs.product.impl.jpa;

import com.sidgs.product.model.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long>
{

    List<Member> findbyUserid(String userID);
}
