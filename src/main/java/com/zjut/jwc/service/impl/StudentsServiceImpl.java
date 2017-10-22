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

    public List<Students> getAllStudents() {
        return studentsDao.findStudents("");
    }

    public Students getStudent(String sno) {
        List<Students> students = studentsDao.findStudents(sno);
        return students.size() > 0 ? students.get(0) : null;
    }

    public int deleteStudent(String sno) {
        return studentsDao.deleteStudent(sno);
    }

    public String getStudentSname(String sno) {
        return studentsDao.getStudentSname(sno);
    }

    public int updateStudentSname(String sno, String sname) {
        return studentsDao.updateStudentSname(sno,sname);
    }
}
