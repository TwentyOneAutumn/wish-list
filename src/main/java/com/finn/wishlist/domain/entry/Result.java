package com.finn.wishlist.domain.entry;

import cn.hutool.http.HttpStatus;
import lombok.Data;

import java.io.Serializable;

/**
 * 相应状态类
 */
@Data
public class Result implements Serializable {

    /**
     * 状态码
     */
    private int code;

    /**
     * 信息
     */
    private String msg;

    protected Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    protected static Result success() {
        return new Result(HttpStatus.HTTP_OK, "操作成功");
    }

    protected static Result success(String msg) {
        return new Result(HttpStatus.HTTP_OK, msg);
    }

    protected static Result error() {
        return new Result(HttpStatus.HTTP_INTERNAL_ERROR, "操作失败");
    }

    protected static Result error(String msg) {
        return new Result(HttpStatus.HTTP_INTERNAL_ERROR, msg);
    }

    protected static Result error(int code, String msg) {
        return new Result(code, msg);
    }


    /**
     * 是否成功
     */
    public boolean successIf(){
        return code > 199 && code < 300;
    }



    /**
     * 是否异常
     */
    public void errorIf(String msg){
        if(!successIf()){
            throw new RuntimeException(msg);
        }
    }
}
