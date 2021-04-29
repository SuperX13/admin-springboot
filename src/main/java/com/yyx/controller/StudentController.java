package com.yyx.controller;


import com.yyx.entity.Student;
import com.yyx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xin
 * @since 2021-04-27
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> list() {
        return this.studentService.list();
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        System.out.println(id);
        return this.studentService.removeById(id);
    }
    @GetMapping("/find/{id}")
    public Student findById(@PathVariable("id") Integer id){
        return this.studentService.getById(id);
    }
}

