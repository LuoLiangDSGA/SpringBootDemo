package org.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 罗亮
 * @since 2017-10-31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get() {
        return "get";
    }
}
