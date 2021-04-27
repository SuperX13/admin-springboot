package com.yyx.service.impl;

import com.yyx.entity.Student;
import com.yyx.mapper.StudentMapper;
import com.yyx.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xin
 * @since 2021-04-27
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
