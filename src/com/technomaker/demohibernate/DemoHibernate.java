package com.technomaker.demohibernate;

import com.technomaker.demohibernate.service.GestionnaireFormation;
import com.technomaker.demohibernate.simple.Formation;
import com.technomaker.demohibernate.simple.Participant;
import com.technomaker.demohibernate.simple.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class DemoHibernate {

	public static void main(String[] args) {
		GestionnaireFormation gestionnaireFormation = new GestionnaireFormation();

		Formation formation = new Formation("Hibernate");
		gestionnaireFormation.save(formation);

		Participant participant = new Participant("asmae","imazzi",formation);
		gestionnaireFormation.save(participant);

//		Participant participant1 = new Participant("asmae1","imazzi1",formation);
//		gestionnaireFormation.save(participant1);

//		Set<Participant> participants = new HashSet<>();
//		participants.add(new Participant("asmae1","imazzi",formation));
//		formation.setParticipants(participants);
//		gestionnaireFormation.save(formation);


	}
}
