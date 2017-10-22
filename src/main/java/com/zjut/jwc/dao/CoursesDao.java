package com.zjut.jwc.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesDao {
    String getCourseCname(@Param(value = "cno") int cno);
    int updateCourseCname(@Param(value = "cno") int cno,@Param(value = "cname") String cname);
    String getCourseCredits(@Param(value = "cno") int cno);
    int updateCourseCredits(@Param(value = "cno") int cno,@Param(value = "credits") float credits);
    int deleteCourse(@Param(value = "cno") int cno);
}
