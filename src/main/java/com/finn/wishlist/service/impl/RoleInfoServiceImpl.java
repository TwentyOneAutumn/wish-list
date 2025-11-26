package com.finn.wishlist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finn.wishlist.domain.RoleInfo;
import com.finn.wishlist.mapper.RoleInfoMapper;
import com.finn.wishlist.service.IRoleInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RoleInfoServiceImpl extends ServiceImpl<RoleInfoMapper, RoleInfo> implements IRoleInfoService {
}
