package cn.sxt.service.impl;

import cn.sxt.domain.Account;
import cn.sxt.mapper.AccountMapper;
import cn.sxt.service.AccountService;
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
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
