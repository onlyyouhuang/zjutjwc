package com.zjut.jwc.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/courses")
@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
public interface CoursesService {

    @GET
    @Path("/course/cname/{cno}")
    String getCourseCname(@PathParam("cno") int cno);

    @PUT
    @Path("/course/cname/{cno}/{cname}")
    int updateCourseCname(@PathParam("cno") int cno, @PathParam("cname") String cname);

    @GET
    @Path("/course/credits/{cno}")
    String getCourseCredits(@PathParam("cno") int cno);

    @PUT
    @Path("/course/credits/{cno}/{credits}")
    int updateCourseCredits(@PathParam("cno") int cno, @PathParam("credits") float credits);

    @DELETE
    @Path("/course/{cno}")
    int deleteCourse(@PathParam("cno") int cno);
}
