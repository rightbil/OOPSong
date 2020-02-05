package com.company;

import java.util.ArrayList;

public class Transcript {
    private String id;
    private String firstName;
    private String lastName;
    private ArrayList<CourseEnrollment> courseEnrollement;

    public void Transcript() {
        courseEnrollement= new ArrayList<CourseEnrollment>();

    }

    public void addCourse(CourseEnrollment course) {
        courseEnrollement.add(course);

    }

    public ArrayList<CourseEnrollment> getCourses(){

        return  courseEnrollement;
    }

    public double getOverallGPA(ArrayList<CourseEnrollment> courseEnrollement){

        double graduatePointAverage =0.0;
        for(CourseEnrollment course: courseEnrollement)
        {

        }

    }

    public String getFormattedGPA()

}
