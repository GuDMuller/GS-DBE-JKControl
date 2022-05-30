package br.com.jkcontrol.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import br.com.jkcontrol.model.*;
public class VisitanteDAO {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("jkcontrol-persistence-unit");
	EntityManager manager = factory.createEntityManager();
	
	
	public void insert(Visitante visitante) {

		manager.getTransaction().begin();
		manager.persist(visitante);
		manager.getTransaction().commit();
		
		manager.clear();
		
	}
	
	public List<Visitante> list(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jkcontrol-persistence-unit");
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Visitante> query = manager.createQuery("SELECT v FROM Visitante v",Visitante.class);
		return query.getResultList();
		
	}
	public void delete(Visitante visitante) {
		manager.getTransaction().begin();
		visitante = manager.merge(visitante);
		manager.remove(visitante);
		manager.getTransaction().commit();
		
	}

	public void update(Visitante visitante) {
		manager.getTransaction().begin();
		visitante = manager.merge(visitante);
		manager.getTransaction().commit();
	}

	
}


