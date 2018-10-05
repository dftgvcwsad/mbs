package cn.sxt.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import cn.sxt.domain.Operator;
import cn.sxt.mapper.OperatorMapper;
import cn.sxt.service.OperatorService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 阿银
 * @since 2018-10-01
 */
@Service
public class OperatorServiceImpl extends ServiceImpl<OperatorMapper, Operator> implements OperatorService {

}
