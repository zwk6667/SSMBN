package com.kaguya.test;

import com.kaguya.dao.StudentMapper;
import com.kaguya.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void t(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/conf/applicationContext.xml");
        StudentMapper studentMapper = applicationContext.getBean(StudentMapper.class);
        int i = studentMapper.insertStu(new Student(null, "aaa", "nan"));
        System.out.println(i);
    }
}
