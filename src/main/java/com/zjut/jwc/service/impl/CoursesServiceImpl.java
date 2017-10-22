package com.zjut.jwc.service.impl;

import com.zjut.jwc.dao.CoursesDao;
import com.zjut.jwc.service.CoursesService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("coursesService")
public class CoursesServiceImpl implements CoursesService {

    @Resource
    private CoursesDao coursesDao;

    public String getCourseCname(int cno) {
        return coursesDao.getCourseCname(cno);
    }

    public int updateCourseCname(int cno, String cname) {
        return coursesDao.updateCourseCname(cno,cname);
    }

    public String getCourseCredits(int cno) {
        return coursesDao.getCourseCredits(cno);
    }

    public int updateCourseCredits(int cno, float credits) {
        return coursesDao.updateCourseCredits(cno,credits);
    }

    public int deleteCourse(int cno) {
        return coursesDao.deleteCourse(cno);
    }
}
