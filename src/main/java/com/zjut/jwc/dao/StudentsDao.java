package com.zjut.jwc.dao;

import com.zjut.jwc.entity.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentsDao {
    List<Students> findStudents(@Param(value = "sno") String sno);
}
