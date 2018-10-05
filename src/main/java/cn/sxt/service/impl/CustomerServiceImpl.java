package cn.sxt.service.impl;

import cn.sxt.domain.Customer;
import cn.sxt.mapper.CustomerMapper;
import cn.sxt.service.CustomerService;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
