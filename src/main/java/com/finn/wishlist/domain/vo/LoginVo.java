package com.finn.wishlist.domain.vo;

import com.finn.wishlist.domain.MenuInfo;
import com.finn.wishlist.domain.RoleInfo;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class LoginVo {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 角色
     */
    private List<RoleInfo> roles;

    /**
     * 菜单
     */
    private List<MenuInfo> menus;
}
