package org.springboot.service;

import org.springboot.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 罗亮
 * @since 2017-10-31
 */
public interface IUserService extends IService<User> {
	void test();
}
