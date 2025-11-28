package com.finn.wishlist.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.finn.wishlist.domain.entry.TimeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user_target")
@EqualsAndHashCode(callSuper = true)
public class UserTarget extends TimeEntity {

    /**
     * 主键ID
     */
    @TableId
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 目标
     */
    private String target;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 是否完成
     */
    private Boolean isFinished;

    /**
     * 完成时间
     */
    private LocalDate finishedTime;

    /**
     * 备注
     */
    private String remark;
}
