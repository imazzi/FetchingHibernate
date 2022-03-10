package com.technomaker.demohibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.technomaker.demohibernate.simple.Formation;
import com.technomaker.demohibernate.simple.Participant;
import com.technomaker.demohibernate.simple.util.HibernateUtil;

public class ParticipantDao {

    public void save(Participant participant){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Long idParticipant = (Long) session.save(participant);

        transaction.commit();
        session.close();
    }

}
