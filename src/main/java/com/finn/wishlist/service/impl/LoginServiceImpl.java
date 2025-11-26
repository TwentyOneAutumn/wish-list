package com.finn.wishlist.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.finn.wishlist.domain.*;
import com.finn.wishlist.domain.dto.LoginDto;
import com.finn.wishlist.domain.entry.Build;
import com.finn.wishlist.domain.entry.Row;
import com.finn.wishlist.domain.vo.LoginVo;
import com.finn.wishlist.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

        LoginVo vo = BeanUtil.toBean(userInfo, LoginVo.class);
        Integer id = userInfo.getId();

        List<UserRoleJoin> userRoleJoinList = userRoleJoinService.list(new LambdaQueryWrapper<UserRoleJoin>()
                .eq(UserRoleJoin::getUserId, id)
        );

        if(CollUtil.isNotEmpty(userRoleJoinList)){
            Set<String> roleIdSet = userRoleJoinList.stream().map(UserRoleJoin::getRoleId).collect(Collectors.toSet());
            List<RoleInfo> roleInfoList = roleInfoService.listByIds(roleIdSet);
            if(CollUtil.isNotEmpty(roleInfoList)){
                vo.setRoles(roleInfoList);
                List<RoleMenuJoin> roleMenuJoinList = roleMenuJoinService.list(new LambdaQueryWrapper<RoleMenuJoin>()
                        .in(RoleMenuJoin::getRoleId, roleIdSet)
                );
                if(CollUtil.isNotEmpty(roleMenuJoinList)){
                    Set<String> menuIdSet = roleMenuJoinList.stream().map(RoleMenuJoin::getMenuId).collect(Collectors.toSet());
                    List<MenuInfo> menuInfoList = menuInfoService.listByIds(menuIdSet);
                    vo.setMenus(menuInfoList);
                }
            }
        }
        return Build.row(vo);
    }
}
