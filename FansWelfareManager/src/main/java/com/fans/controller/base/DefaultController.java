package com.fans.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by caisinan on 2017/6/12.
 */
@Controller
public class DefaultController {
    @RequestMapping("/")
    public String print_view_default(){
        return "index";
    }
}
