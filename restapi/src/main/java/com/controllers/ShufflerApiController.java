package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Porali_S on 12/14/2016.
 */
@Controller
public class ShufflerApiController {

    @RequestMapping("/health")
    @ResponseBody
    String health() {
        return "Service Running !!";
    }
}
