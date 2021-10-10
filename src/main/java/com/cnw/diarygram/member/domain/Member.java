package com.cnw.diarygram.member.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
    /*@GenericGenerator(name = "memberNo", strategy = "com.cnw.diarygram.member.util.MemberNoGenerator")*/
    /*@GeneratedValue(generator = "memberNo")*/
    /*@GeneratedValue(strategy = GenerationType.TABLE)*/
    private Long no;

    @Id
    private String id;

    private String pw;
    private String name;
    private String email;
    private String gender;
    @CreationTimestamp
    private Timestamp reg_date;
}
