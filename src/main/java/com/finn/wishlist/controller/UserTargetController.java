package com.finn.wishlist.controller;

import com.finn.wishlist.domain.dto.UserTargetListDto;
import com.finn.wishlist.domain.entry.TableInfo;
import com.finn.wishlist.domain.vo.UserTargetListVo;
import com.finn.wishlist.service.IUserTargetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 登录Controller
 */
@Slf4j
@RestController
@RequestMapping("/user/target")
public class UserTargetController {

    @Autowired
    private IUserTargetService targetService;


    /**
     * 列表
     */
    @GetMapping("/list")
    public TableInfo<UserTargetListVo> toList(@Valid UserTargetListDto dto){
        return targetService.toList(dto);
    }
}
