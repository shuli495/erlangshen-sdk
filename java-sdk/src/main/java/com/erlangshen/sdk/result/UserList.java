package com.erlangshen.sdk.result;

import com.erlangshen.sdk.result.model.User;

import java.util.List;

public class UserList extends Result implements com.erlangshen.sdk.result.interfaces.Result<List<User>> {

    private List<User> data;

    @Override
    public List<User> getData() {
        return data;
    }

    @Override
    public void setData(List<User> data) {
        this.data = data;
    }
}
