package com.finn.wishlist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finn.wishlist.domain.RoleMenuJoin;
import com.finn.wishlist.mapper.RoleMenuJoinMapper;
import com.finn.wishlist.service.IRoleMenuJoinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RoleMenuJoinServiceImpl extends ServiceImpl<RoleMenuJoinMapper, RoleMenuJoin> implements IRoleMenuJoinService {
}
