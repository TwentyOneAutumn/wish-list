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
@TableName("user_role_join")
@EqualsAndHashCode(callSuper = true)
public class UserRoleJoin extends TimeEntity {

    /**
     * 主键ID
     */
    @TableId
    private Integer id;


    /**
     * 用户ID
     */
    private String userId;

    /**
     * 角色ID
     */
    private String roleId;
}
