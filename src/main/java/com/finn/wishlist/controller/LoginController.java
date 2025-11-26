package com.finn.wishlist.controller;

import com.core.domain.*;
import com.finn.wishlist.domain.dto.LoginDto;
import com.finn.wishlist.domain.entry.Row;
import com.finn.wishlist.domain.vo.LoginVo;
import com.finn.wishlist.service.ILoginService;
import com.service.basic.domain.dto.*;
import com.service.basic.domain.vo.*;
import com.service.basic.service.ISysMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 登录Controller
 */
@Slf4j
@RestController
@RequestMapping
public class LoginController {

    @Autowired
    private ILoginService loginService;


    /**
     * 登录
     */
    @PostMapping("/login")
    public Row<LoginVo> toLogin(@Valid LoginDto dto){
        return loginService.toLogin(dto);
    }
}
