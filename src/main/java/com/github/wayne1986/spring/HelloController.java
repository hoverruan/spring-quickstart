package com.github.wayne1986.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: huhuanfeng
 * Date: 13-4-11
 * Time: 下午3:22
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String Hello() {
        return "Hello !";

    }
}
