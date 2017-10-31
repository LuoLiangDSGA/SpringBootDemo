package org.springboot.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 罗亮
 * @since 2017-10-31
 */
@Data
@Accessors(chain = true)
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private Integer age;
	private Integer sex;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
