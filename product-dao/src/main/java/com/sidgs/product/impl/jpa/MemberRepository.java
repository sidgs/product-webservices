package com.sidgs.product.impl.jpa;

import com.sidgs.product.model.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long>
{

}
