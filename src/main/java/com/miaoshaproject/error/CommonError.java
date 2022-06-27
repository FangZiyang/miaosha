package com.miaoshaproject.error;

/**
 * @Author: FangZiyang
 * @Date: 2022/6/27 17:45
 * @Desc:
 */
public interface CommonError {
    public int getErrCode();

    public String getErrMsg();

    public CommonError setErrMsg(String errMsg);
}
