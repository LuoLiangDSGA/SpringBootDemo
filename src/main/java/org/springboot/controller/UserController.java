package org.springboot.controller;


import org.springboot.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    @Resource
    private IUserService userService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get() {
        userService.test();
        return "get";
    }
}
