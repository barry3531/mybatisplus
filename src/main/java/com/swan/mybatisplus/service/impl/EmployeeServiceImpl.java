package com.swan.mybatisplus.service.impl;

import com.swan.mybatisplus.beans.Employee;
import com.swan.mybatisplus.mapper.EmployeeMapper;
import com.swan.mybatisplus.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hujq
 * @since 2019-07-31
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
