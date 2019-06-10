package com.erlangshen.sdk.result.interfaces;

public interface Result<T> {

    public T getData();

    public void setData(T t);

    public String getCode();

    public String getStatus();

    public String getMessage();
}
