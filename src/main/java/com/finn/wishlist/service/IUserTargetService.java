package com.finn.wishlist.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finn.wishlist.domain.UserTarget;
import com.finn.wishlist.domain.dto.UserTargetListDto;
import com.finn.wishlist.domain.entry.TableInfo;
import com.finn.wishlist.domain.vo.UserTargetListVo;

public interface IUserTargetService extends IService<UserTarget>  {

    /**
     * 列表
     */
    TableInfo<UserTargetListVo> toList(UserTargetListDto dto);
}
