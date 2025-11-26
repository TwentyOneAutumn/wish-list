package com.finn.wishlist.service;

import com.finn.wishlist.domain.dto.LoginDto;
import com.finn.wishlist.domain.entry.Row;
import com.finn.wishlist.domain.vo.LoginVo;

public interface ILoginService {

    /**
     * 登录
     */
    Row<LoginVo> toLogin(LoginDto dto);
}
