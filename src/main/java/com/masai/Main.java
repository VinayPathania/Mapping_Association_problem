package com.masai;

import com.masai.model.Collage;
import com.masai.model.Student;
import com.masai.service.CollageServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CollageServiceImpl ci = new CollageServiceImpl();

        Collage clg = new Collage();
        clg.setCollageAddress("Delhi");
        clg.setCollageName("AB");

        Student std1 = new Student("Vinay","7382837273","abc@gmail.com",clg);
        Student std2 = new Student("Vinay","7382837273","abc@gmail.com",clg);
        Student std3 = new Student("Vinay","7382837273","abc@gmail.com",clg);
        Student std4 = new Student("Vinay","7382837273","abc@gmail.com",clg);

        Set<Student> s = new HashSet<>();
        s.add(std1);
        s.add(std2);
        s.add(std3);
        s.add(std4);

        clg.setStudentList(s);

        System.out.println(ci.registerCollage(clg));

    }
}