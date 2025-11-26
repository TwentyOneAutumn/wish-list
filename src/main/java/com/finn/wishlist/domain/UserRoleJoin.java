package com.finn.wishlist.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.finn.wishlist.domain.entry.TimeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("role_menu_join")
@EqualsAndHashCode(callSuper = true)
public class RoleMenuJoin extends TimeEntity {

    /**
     * 主键ID
     */
    @TableId
    private Integer id;

    /**
     * 角色ID
     */
    private String roleId;

    /**
     * 菜单ID
     */
    private String menuId;
}
