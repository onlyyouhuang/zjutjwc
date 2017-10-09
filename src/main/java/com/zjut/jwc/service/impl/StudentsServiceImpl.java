package com.zjut.jwc.service.impl;

import com.zjut.jwc.dao.StudentsDao;
import com.zjut.jwc.entity.Students;
import com.zjut.jwc.service.StudentsService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("studentsService")
public class StudentsServiceImpl implements StudentsService {

    @Resource
    private StudentsDao studentsDao;

    public Students getStudent(String sno) {
        List<Students> students = studentsDao.findStudents(sno);
        return students.size() > 0 ? students.get(0) : null;
    }

    public List<Students> getAllStudents() {
        return studentsDao.findStudents("");
    }
}
