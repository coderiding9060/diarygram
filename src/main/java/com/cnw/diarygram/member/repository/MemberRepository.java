package com.cnw.diarygram.member.repository;

import com.cnw.diarygram.member.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    List<Member> findAll();

    Optional<Member> findById(String id);

    Optional<Member> findByEmail(String email);
}
