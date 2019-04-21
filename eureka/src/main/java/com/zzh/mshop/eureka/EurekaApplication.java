package com.zzh.mshop.eureka;
import java.util.List;
import com.zzh.mshop.member.entity.Member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zzh
 * @date 2019/4/5
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    @org.springframework.beans.factory.annotation.Autowired
    private com.zzh.mshop.member.mapper.MemberMapper memberMapper;

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

	public List<Member> findByUsername(String username){
		 return memberMapper.findByUsername(username);
	}



}
