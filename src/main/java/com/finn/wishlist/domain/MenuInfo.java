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
@TableName("menu_info")
@EqualsAndHashCode(callSuper = true)
public class MenuInfo extends TimeEntity {

    /**
     * 主键ID
     */
    @TableId
    private Integer id;

    /**
     * 菜单名称
     */
    private String menuName;
}
