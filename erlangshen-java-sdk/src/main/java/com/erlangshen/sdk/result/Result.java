package com.erlangshen.sdk.result;

public class Result {

    private String code;    //状态码
    private String status;  //success成功 prompt提示信息 exception异常
    private String message; //提示、异常返回消息

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
