package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Transcript {
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courseList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    public Transcript(){
        courseList= new ArrayList<>();
    }



    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        int id;
        String firstName;
        String lastName;
        System.out.println("Welcome to the transcript application.");
        System.out.println("Enter Student ID number: 12345");
        id = sc.nextInt();
        setId(id);

        System.out.println("Enter Student's first name: Samantha");
        firstName = sc.next();
        setFirstName(firstName);
        System.out.println("Enter Student's last name: Simpson");
        lastName = sc.next();
        setLastName(lastName);


    }
    public void addCourse(){
        String wantToContinue="Y";
        while(true) {
            Course c = new Course();
            Scanner sc = new Scanner(System.in);
            String course;
            int credits;
            char grade;

            System.out.println("Enter credits: 3");
            credits = sc.nextInt();
            sc.nextLine(); // to protect the buffer after the interger input
            c.setCredits(credits);

            System.out.println("Enter course: java 101");
            course = sc.nextLine();
            c.setCourseName(course);

            System.out.println();
            System.out.println("Enter grade: A");
            grade = sc.next().charAt(0);
            c.setGrade(grade);
            courseList.add(c); // adding to array list
            setCourseList(courseList);// passing to arraylist
            System.out.println("user : want to add course? Y/N");
            if(!sc.next().equalsIgnoreCase("Y")){break;}
        }

    }
    public void displayInfo(){
       System.out.println(this.getFirstName() + " " + this.getLastName());
        System.out.println("Student ID:" + this.getId());
        System.out.println("Course \t Credits \t Grade \t Quality Points");
        System.out.println("-----\t------\t-------------\t---------");
        for(Course c : courseList){
            System.out.println(c.getCourseName() + "\t\t " + c.getCredits() + "\t\t" + c.getGrade() + "\t\t" + convertGrade(c.getGrade()));
        }

        System.out.println("Over all GPA :" + getOverAllGBA());
    }
    public double getOverAllGBA(){
        double cumulative=0;
        for(Course c : getCourseList()){
            cumulative= cumulative +  convertGrade(c.getGrade());

        }
        return cumulative / getCourseList().size();
    }
        public int convertGrade(char grade){

            if(Character.toUpperCase(grade)=='A') return 4;
            if(Character.toUpperCase(grade)=='B') return 3;
            if(Character.toUpperCase(grade)=='C') return 2;
            if(Character.toUpperCase(grade)=='D') return 1;
            if(Character.toUpperCase(grade)=='F') return 0;
            return -1;
        }
    }









