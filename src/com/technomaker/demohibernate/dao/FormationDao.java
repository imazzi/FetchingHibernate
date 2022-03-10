package com.technomaker.demohibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.technomaker.demohibernate.simple.Formation;
import com.technomaker.demohibernate.simple.util.HibernateUtil;

public class FormationDao {
    public void save(Formation formation){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(formation);

        transaction.commit();
        session.close();
    }

//
//    public void update(Formation formation) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//
//        session.update(formation);
//
//        transaction.commit();
//        session.close();
//    }
}
