package com.cnw.diarygram.member;

import com.cnw.diarygram.member.repository.MemberRepository;
import com.cnw.diarygram.member.service.MemberService;
import com.cnw.diarygram.member.service.MemberServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
@AllArgsConstructor
public class MemberConfig {

    @Autowired
    private MemberRepository memberRepository;



    @Bean
    MemberService memberService() {
        return new MemberServiceImpl(memberRepository);
    }

}
