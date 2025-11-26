package com.finn.wishlist.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.finn.wishlist.domain.RoleMenuJoin;
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
    private IUserRoleJoinService userRoleJoinService;

    @Autowired
    private IRoleMenuJoinService roleMenuJoinService;

    /**
     * 登录
     */
    @Override
    public Row<LoginVo> toLogin(LoginDto dto) {
        String userCode = dto.getUserCode();
        String password = dto.getPassword();
        UserInfo userInfo = userInfoService.getOne(new LambdaQueryWrapper<UserInfo>()
                .eq(UserInfo::getUserCode, userCode)
        );
        if(BeanUtil.isEmpty(userInfo)){
            throw new RuntimeException("该账号不存在");
        }
        if(!password.equals(userInfo.getPassword())){
            throw new RuntimeException("密码错误");
        }
        Integer id = userInfo.getId();



         roleMenuJoinService.list(new LambdaQueryWrapper<RoleMenuJoin>()
                .in(RoleMenuJoin::getRoleId, id)
        );


        return null;
    }
}
