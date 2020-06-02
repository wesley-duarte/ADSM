package br.usjt.springclima;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.springclima.model.Usuario;
import br.usjt.springclima.repository.JPAUtil;

public class TesteInsereUmUsuario {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = new Usuario ();
		u.setLogin("admin");
		u.setSenha("admin");
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}