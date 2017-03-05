package com.sidgs.product.repositories;

import com.sidgs.product.model.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface MemberRepository extends CrudRepository<Member, Long>
{

}
