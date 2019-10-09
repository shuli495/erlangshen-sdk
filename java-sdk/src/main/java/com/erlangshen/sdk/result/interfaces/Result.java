package com.erlangshen.sdk.result.interfaces;

public interface Result<T> {

    public static String STATUS_SUCCESS = "success";
    public static String STATUS_PROMPT = "prompt";
    public static String STATUS_EXCEPTION = "exception";

    public T getData();

    public void setData(T t);

    public String getCode();

    public String getStatus();

    public String getMessage();
}
