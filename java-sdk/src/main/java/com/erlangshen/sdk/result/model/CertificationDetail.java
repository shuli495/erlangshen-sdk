package com.erlangshen.sdk.result.model;

import com.erlangshen.sdk.result.BaseResult;

public class CertificationDetail extends BaseResult {

    private Certification data;

    public Certification getData() {
        return data;
    }

    public void setData(Certification data) {
        this.data = data;
    }
}
