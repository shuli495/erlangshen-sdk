package com.erlangshen.sdk.result;

public class Result extends BaseResult implements com.erlangshen.sdk.result.interfaces.Result<String> {

    private String data;

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }
}
