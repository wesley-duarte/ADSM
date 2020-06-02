package br.usjt.springclima;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.springclima.model.Cidade;
import br.usjt.springclima.model.Clima;
import br.usjt.springclima.model.Semana;
import br.usjt.springclima.repository.JPAUtil;

public class SemanaComClima {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = new Semana();
		s.setSemana("Terça");
		manager.persist(s);
		Cidade ci = new Cidade();
		ci.setNome("São Paulo");
		ci.setLatitude(-23.3723);
		ci.setLongitude(-46.3304);
		manager.persist(ci);
		Clima c = new Clima(null, 15, 20, 0.30, "Tempo seco e com muitas nuvens",
				new java.sql.Date(format.parse("31/05/2020").getTime()), s, ci);
		manager.persist(c);
		transaction.commit();
		
		transaction.begin();
		Semana s2 = new Semana();
		s2.setSemana("Quarta");
		manager.persist(s2);
		Cidade ci2 = new Cidade();
		ci2.setNome("São Paulo");
		ci2.setLatitude(-23.3723);
		ci2.setLongitude(-46.3304);
		manager.persist(ci2);
		Clima c2 = new Clima(null, 17, 22, 0.40, "Tempo seco",
				new java.sql.Date(format.parse("01/06/2020").getTime()), s2, ci2);
		manager.persist(c2);
		transaction.commit();
		
		manager.close();
		JPAUtil.close();
	}
}