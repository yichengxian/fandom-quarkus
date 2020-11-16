package com.j2boot.fandom.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @author yichengxian
 * 公共返回参数
 * @param <T>
 */
@AllArgsConstructor
@Getter
public class CommonResult<T> {

    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 数据封装
     */
    private T data;

    /**
     * 时间戳
     */
    private long time;


    /**
     * 返回成功结果
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data){
        return new CommonResult(
                ResultCode.SUCCESS.getCode(),
                ResultCode.SUCCESS.getMsg(),
                data,
                System.currentTimeMillis()
        );
    }

    /**
     * 返回失败的结果并且展示msg
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(String msg){
        return new CommonResult(
                ResultCode.FAILED.getCode(),
                msg,
                null,
                System.currentTimeMillis()
        );
    }

    /**
     * 返回失败结果
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(){
        return new CommonResult(
                ResultCode.FAILED.getCode(),
                ResultCode.FAILED.getMsg(),
                null,
                System.currentTimeMillis()
        );
    }

    /**
     * 校验失败
     * @param paramName 参数名
     * @param <T>
     * @return
     */
    public static  <T> CommonResult<T> validateFailed(String paramName){
        return new CommonResult(
                ResultCode.VALIDATE_FAILED.getCode(),
                ResultCode.VALIDATE_FAILED.getMsg(),
                paramName,
                System.currentTimeMillis()
        );
    }


}
