package com.hzy.controller;

import com.hzy.bean.ApiResp;
import com.hzy.bean.BaseEnumError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTestController {

    @GetMapping("/test1")
    public ApiResp test1() {

        return ApiResp.retOK("Hello World");
    }

    @GetMapping("/test2")
    public ApiResp test2() {

        return ApiResp.retFail(BaseEnumError.SYSTEM_NO_LOGIN);
    }
}
