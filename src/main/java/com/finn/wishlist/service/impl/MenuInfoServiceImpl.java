package com.finn.wishlist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finn.wishlist.domain.MenuInfo;
import com.finn.wishlist.mapper.MenuInfoMapper;
import com.finn.wishlist.service.IMenuInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MenuInfoServiceImpl extends ServiceImpl<MenuInfoMapper, MenuInfo> implements IMenuInfoService {
}
