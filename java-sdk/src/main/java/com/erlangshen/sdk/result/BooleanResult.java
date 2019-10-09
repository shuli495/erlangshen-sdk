package com.erlangshen.sdk.result;


public class BooleanResult extends BaseResult implements com.erlangshen.sdk.result.interfaces.Result<Boolean> {

    private Boolean data;

    @Override
    public Boolean getData() {
        return data;
    }

    @Override
    public void setData(Boolean data) {
        this.data = data;
    }
}
