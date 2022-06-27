package com.miaoshaproject.error;

/**
 * @Author: FangZiyang
 * @Date: 2022/6/27 17:52
 * @Desc:
 */
public enum EmBusinessError implements CommonError {
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOWN_ERROR(10002, "未知错误"),

    //20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001, "用户不存在"),
    USER_LOGIN_FAIL(20002, "用户手机号或密码不正确"),
    USER_NOT_LOGIN(20003, "用户还未登陆"),
    //30000开头为交易信息错误定义
    STOCK_NOT_ENOUGH(30001, "库存不足")
    ;

    private int errCode;
    private String errMsg;

    EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        return null;
    }
    }
