package com.erlangshen.sdk.result;

import com.erlangshen.sdk.result.model.Permission;

public class PermissionResult extends BaseResult implements com.erlangshen.sdk.result.interfaces.Result<Permission> {

    private Permission data;

    @Override
    public Permission getData() {
        return data;
    }

    @Override
    public void setData(Permission data) {
        this.data = data;
    }
}
