package com.sweet.cloves.mvptemplate.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponse extends BaseResponse {

    public boolean isSuccess() {
        return !isError();
    }

    @SerializedName("data")
    private List<LoginResult> data;
}
