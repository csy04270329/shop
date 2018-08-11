package com.soo.shop.repository;

import com.soo.shop.dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member,Long>{
}
