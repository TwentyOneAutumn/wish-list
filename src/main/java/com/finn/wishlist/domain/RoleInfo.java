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
@TableName("user_info")
@EqualsAndHashCode(callSuper = true)
public class UserInfo extends TimeEntity {

    /**
     * 主键ID
     */
    @TableId
    private Integer id;

    /**
     * 账号
     */
    private String userCode;

    /**
     * 密码
     */
    private String password;
}
