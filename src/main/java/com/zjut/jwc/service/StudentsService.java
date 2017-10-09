package com.zjut.jwc.service;

import com.zjut.jwc.entity.Students;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/students")
@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
public interface StudentsService {

    @GET
    @Path("/getStudent/{sno}")
    public Students getStudent(@PathParam("sno") String sno);

    @GET
    @Path("/getAllStudents")
    public List<Students> getAllStudents();
}
