package com.erlangshen.sdk.result;

import com.erlangshen.sdk.result.model.User;

public class UserDetailResult extends BaseResult implements com.erlangshen.sdk.result.interfaces.Result<User> {

    private User data;

    @Override
    public User getData() {
        return data;
    }

    @Override
    public void setData(User data) {
        this.data = data;
    }
}
