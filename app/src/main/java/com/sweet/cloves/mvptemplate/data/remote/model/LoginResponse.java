package com.sweet.cloves.mvptemplate.data.remote.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponse extends BaseResponse {

    @SerializedName("data")
    private List<LoginResult> data;

}
