package com.finn.wishlist.domain.dto;

import lombok.Data;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

@Data
public class LoginDto {

    /**
     * 账号
     */
    @NotBlank(message = "账号不能为空")
    private String userCode;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;
}
