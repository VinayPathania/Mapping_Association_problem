package com.masai.service;

import com.masai.model.Collage;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Set;

public interface CollageService {
    EntityManager em = EMUtil.provideEntityManager();

    public Collage registerCollage(Collage clg);
    public Set<Student> getStudentByCollageId(int cid);
    public Collage getCollageByStudentId(int roll);
}
