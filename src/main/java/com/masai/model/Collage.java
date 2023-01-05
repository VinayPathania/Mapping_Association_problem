package com.masai.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Collage {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CID")
    private int collageId;
    private String collageName;
    private String collageAddress;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "collage")
    private Set<Student> studentList=new HashSet<>();

    public Collage() {
    }

    public Collage(String collageName, String collageAddress, Set<Student> studentList) {
        this.collageName = collageName;
        this.collageAddress = collageAddress;
        this.studentList = studentList;
    }

    public int getCollageId() {
        return collageId;
    }

    public void setCollageId(int collageId) {
        this.collageId = collageId;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getCollageAddress() {
        return collageAddress;
    }

    public void setCollageAddress(String collageAddress) {
        this.collageAddress = collageAddress;
    }

    public Set<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Set<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Collage{" +
                "collageId=" + collageId +
                ", collageName='" + collageName + '\'' +
                ", collageAddress='" + collageAddress + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
