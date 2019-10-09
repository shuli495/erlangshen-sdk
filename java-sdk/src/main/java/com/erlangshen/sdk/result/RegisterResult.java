package com.erlangshen.sdk.result;

import com.erlangshen.sdk.result.model.Register;

public class RegisterResult extends BaseResult implements com.erlangshen.sdk.result.interfaces.Result<Register> {

    private Register data;

    @Override
    public Register getData() {
        return data;
    }

    @Override
    public void setData(Register data) {
        this.data = data;
    }
}
