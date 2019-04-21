package com.zzh.mshop.member.service.impl;

import com.zzh.mshop.member.entity.Member;
import com.zzh.mshop.member.mapper.MemberMapper;
import com.zzh.mshop.member.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author zzh
 * @since 2019-04-21
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
