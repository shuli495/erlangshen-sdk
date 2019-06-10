package com.erlangshen.sdk.result;

public class Result {

    /**
     * 状态码
     */
    private String code;

    /**
     * success成功 prompt提示信息 exception异常
     */
    private String status;

    /**
     * 提示、异常返回消息
     */
    private String message;

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
