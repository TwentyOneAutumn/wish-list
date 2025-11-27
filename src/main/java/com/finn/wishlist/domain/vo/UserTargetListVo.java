package com.finn.wishlist.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserTargetListVo {

    /**
     * 主键ID
     */
    private Integer id;

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
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm", timezone = "GTM+8")
    private LocalDate finishedTime;

    /**
     * 备注
     */
    private String remark;
}
