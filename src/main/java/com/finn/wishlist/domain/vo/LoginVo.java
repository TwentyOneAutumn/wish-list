package com.finn.wishlist.domain.vo;

import lombok.Data;

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
    private Set<String> roles;

    /**
     * 菜单
     */
    private Set<String> menus;
}
