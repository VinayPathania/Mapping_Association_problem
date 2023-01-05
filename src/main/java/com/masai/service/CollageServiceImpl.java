package com.masai.service;

import com.masai.model.Collage;
import com.masai.model.Student;

import javax.persistence.Query;
import java.util.List;
import java.util.Set;

public class CollageServiceImpl implements CollageService{
    @Override
    public Collage registerCollage(Collage clg) {
        em.getTransaction().begin();
        em.persist(clg);
        em.getTransaction().commit();
        em.close();
        return clg;
    }

    @Override
    public Set<Student> getStudentByCollageId(int cid) {
        Query q = em.createQuery("select * from Student where collage_id = cid");
        Set<Student> sList = (Set<Student>) q.getResultList();
        if(sList.size()>0){
            return sList;
        }
        else return sList;
    }

    @Override
    public Collage getCollageByStudentId(int roll) {
        Collage c = em.find(Collage.class,roll);
        return c;
    }
}
