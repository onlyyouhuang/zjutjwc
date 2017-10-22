package com.zjut.jwc.dao;

import com.zjut.jwc.entity.Students;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsDao {
    List<Students> findStudents(@Param(value = "sno") String sno);
    int deleteStudent(@Param(value = "sno") String sno);
    String getStudentSname(@Param(value = "sno") String sno);
    int updateStudentSname(@Param(value = "sno") String sno,@Param(value = "sname") String sname);
}
