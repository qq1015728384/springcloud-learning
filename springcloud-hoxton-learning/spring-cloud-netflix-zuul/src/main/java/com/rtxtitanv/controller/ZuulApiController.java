package com.rtxtitanv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.controller.ZuulController
 * @description a
 * @date 2020/3/2 18:57
 */
@RequestMapping("/local")
@RestController
public class ZuulApiController {

    @GetMapping("/home")
    public String home() {
        return "跳转到本地";
    }
}
