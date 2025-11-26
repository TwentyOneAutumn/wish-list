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
@TableName("role_info")
@EqualsAndHashCode(callSuper = true)
public class RoleInfo extends TimeEntity {

    /**
     * 主键ID
     */
    @TableId
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;
}
