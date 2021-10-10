package com.cnw.diarygram.member.service;

import com.cnw.diarygram.member.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    String join(Member member);

    Optional<Member> findOne(String id);

    List<Member> findMembers();
}
