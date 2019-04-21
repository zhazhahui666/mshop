package com.zzh.mshop.member.mapper;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.zzh.mshop.member.MemberApplicationTest;
import com.zzh.mshop.member.entity.Member;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zzh
 * @date 2019/4/21
 */
public class MemberMapperTest extends MemberApplicationTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void insert(){
        Member member = new Member();
        member.setMemberLevelId(1);
        member.setUsername("zzh");
        member.setPassword("1234");
        member.setNickname("zhazhahui");
        member.setPhone("13237526295");
        member.setStatus(1);
        member.setCreateTime(LocalDateTime.now());
        member.setIcon("http://dadada");
        member.setGender(1);
        member.setBirthday(LocalDate.now());
        member.setCity("nanchang");
        member.setJob("java");
        member.setPersonalizedSignature("12313");
        member.setSourceType(1);
        member.setIntegration(2);
        member.setGrowth(1);
        member.setLuckeyCount(1);
        member.setHistoryIntegration(1);
        memberMapper.insert(member);

    }
}
