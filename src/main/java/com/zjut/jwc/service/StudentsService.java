package com.zjut.jwc.service;

import com.zjut.jwc.entity.Students;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/students")
@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
public interface StudentsService {

    @GET
    @Path("/students")
    List<Students> getAllStudents();

    @GET
    @Path("/student/{sno}")
    Students getStudent(@PathParam("sno") String sno);

    @DELETE
    @Path("/student/{sno}")
    int deleteStudent(@PathParam("sno") String sno);

    @GET
    @Path("/student/sname/{sno}")
    String getStudentSname(@PathParam("sno") String sno);

    @PUT
    @Path("/student/sname/{sno}/{sname}")
    int updateStudentSname(@PathParam("sno") String sno, @PathParam("sname") String sname);

}
