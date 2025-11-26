package com.finn.wishlist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finn.wishlist.domain.UserRoleJoin;
import com.finn.wishlist.mapper.UserRoleJoinMapper;
import com.finn.wishlist.service.IUserRoleJoinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserRoleJoinServiceImpl extends ServiceImpl<UserRoleJoinMapper, UserRoleJoin> implements IUserRoleJoinService {
}
