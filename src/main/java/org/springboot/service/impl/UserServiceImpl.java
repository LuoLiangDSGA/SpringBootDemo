package org.springboot.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springboot.entity.User;
import org.springboot.mapper.UserMapper;
import org.springboot.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 罗亮
 * @since 2017-10-31
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public void test() {
        System.out.println(JSON.toJSONString(baseMapper.selectList(new EntityWrapper<>()), true));
        System.out.println("test method");
        log.debug("test method");
    }
}
