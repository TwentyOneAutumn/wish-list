package com.finn.wishlist.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.finn.wishlist.domain.UserInfo;
import com.finn.wishlist.domain.dto.LoginDto;
import com.finn.wishlist.domain.entry.Row;
import com.finn.wishlist.domain.vo.LoginVo;
import com.finn.wishlist.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private IUserInfoService userInfoService;

    @Autowired
    private IRoleInfoService roleInfoService;

    @Autowired
    private IMenuInfoService menuInfoService;

    @Autowired
    private IRoleMenuJoinService roleMenuJoinService;

    @Autowired
    private IUserRoleJoinService userRoleJoinService;

    /**
     * 登录
     */
    @Override
    public Row<LoginVo> toLogin(LoginDto dto) {
        String userCode = dto.getUserCode();
        String password = dto.getPassword();
        long count = userInfoService.count(new LambdaQueryWrapper<UserInfo>()
                .eq(UserInfo::getUserCode, userCode)
                .eq(UserInfo::getPassword, password)
        );
        if(count == 0){
            throw new RuntimeException("账号或密码错误");
        }

        roleMenuJoinService.list(new LambdaQueryWrapper<>());


        return null;
    }
}
