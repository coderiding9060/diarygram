package com.cnw.diarygram.member.service;

import com.cnw.diarygram.member.domain.Member;
import com.cnw.diarygram.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MemberServiceImpl implements MemberService{

    private MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public String join(Member member) {
        Member result = memberRepository.save(member);
        if (result != null) {
            System.out.println("result = " + result);
        }
        return result.getId();
    }

    @Override
    public Optional<Member> findOne(String id) {
        return memberRepository.findById(id);
    }

    @Override
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
}
