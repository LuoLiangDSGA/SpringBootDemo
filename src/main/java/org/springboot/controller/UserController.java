package org.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 罗亮
 * @since 2017-10-31
 */
@Controller
@RequestMapping("/user")
public class UserController {
    public String get() {
        return "";
    }
}