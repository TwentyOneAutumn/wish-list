package com.finn.wishlist.domain.dto;

import lombok.Data;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

@Data
public class UserTargetListDto {

    /**
     * 用户ID
     */
    @NotBlank(message = "账号不能为空")
    private String id;
}
