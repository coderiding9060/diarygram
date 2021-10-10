package com.cnw.diarygram.member.service;

import com.cnw.diarygram.member.domain.Member;
import com.cnw.diarygram.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceImplTest {
    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    @Test
    /*@Commit*/
    void join() {
        Member member = new Member();
        member.setId("member3");
        member.setPw("1234");
        member.setName("회원3");
        member.setEmail("member3@abc.com");
        member.setGender("남");
        String result = memberService.join(member);
        if (result.length() > 0) {
            System.out.println("result = " + result);
        }
    }

    @Test
    void findOne() {
        Optional<Member> member1 = memberService.findOne("member2");
        if (member1.isPresent()) {
            System.out.println("member1.get() = " + member1.get());
        }
        
    }

    @Test
    void findMembers() {
    }

    @Test
    @Commit
    void edit(){
        Optional<Member> member1 = memberService.findOne("member1");

        member1.ifPresent(selectMember -> {
            selectMember.setPw("12345");
            selectMember.setGender("여");
            Member result = memberRepository.save(selectMember);
            System.out.println("result = " + result);
        });
    }
}