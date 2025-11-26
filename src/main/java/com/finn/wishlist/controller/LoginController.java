package com.finn.wishlist.controller;

import com.finn.wishlist.domain.dto.LoginDto;
import com.finn.wishlist.domain.entry.Row;
import com.finn.wishlist.domain.vo.LoginVo;
import com.finn.wishlist.service.ILoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Row<LoginVo> toLogin(@Valid @RequestBody LoginDto dto){
        return loginService.toLogin(dto);
    }
}
