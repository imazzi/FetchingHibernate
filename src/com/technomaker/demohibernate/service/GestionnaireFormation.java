package com.technomaker.demohibernate.service;

import com.technomaker.demohibernate.dao.FormationDao;
import com.technomaker.demohibernate.dao.ParticipantDao;
import com.technomaker.demohibernate.simple.Formation;
import com.technomaker.demohibernate.simple.Participant;

public class GestionnaireFormation {


    ParticipantDao participantDao = new ParticipantDao();
    FormationDao formationDao = new FormationDao();

    public GestionnaireFormation() {
    }

    public void save(Formation formation){
        formationDao.save(formation);
    }

    public void save(Participant participant){
        participantDao.save(participant);
    }


//    public void update(Formation formation) {
//        formationDao.update(formation);
//    }
}
