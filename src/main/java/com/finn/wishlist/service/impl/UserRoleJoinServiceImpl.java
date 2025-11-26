package com.finn.wishlist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finn.wishlist.domain.UserInfo;
import com.finn.wishlist.mapper.UserInfoMapper;
import com.finn.wishlist.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RoleMenuJoinServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {
}
