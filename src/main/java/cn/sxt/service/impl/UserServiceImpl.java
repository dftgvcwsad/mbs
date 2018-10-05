package cn.sxt.service.impl;

import cn.sxt.domain.User;
import cn.sxt.mapper.UserMapper;
import cn.sxt.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 阿银
 * @since 2018-10-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
