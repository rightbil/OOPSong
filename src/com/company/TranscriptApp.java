package com.company;

import java.util.Scanner;

public class TranscriptApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transcript t = new Transcript();
        t.addStudent();
        boolean wantToContinue = true;
        t.addCourse();
        t.displayInfo();
    }
}
