package fr.istic.tpjpa.jpa;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.tpjpa.domain.Heater;
import fr.istic.tpjpa.domain.Home;
import fr.istic.tpjpa.domain.Person;


public class JpaTest {

	private EntityManager manager;
 
	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		
		JpaTest test = new JpaTest(manager);
		

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		// TODO create entity
			try {
				test.createHome();
				
				
				Heater clim = new Heater();
				clim.setConso_heater(56.89);
				clim.setName("Machin");
				clim.setHome(null);
				manager.persist(clim);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		tx.commit();
		
	//test.listPersons();
		
		// TODO run request
		manager.close();

		System.out.println(".. done");
	
	}
	

	private void createHome(){

		for(int i = 0; i<10; i++){

			if (i%2==0){
				Person personne = new Person("Durand"+i,"toto"+i, "masculin", "adurand@gmail.com"+i,new Date(10));
				manager.persist(personne);// ajouter dans la base de données

				Home mamaison = new Home("Rennes"+i, 45+i, 52+i, personne);

				manager.persist(mamaison);
			}
			else{


				Person personne = new Person("Dupont"+i,"titi"+i, "feminin", "adupond@gmail.com"+i,new Date(10));
				manager.persist(personne);// ajouter dans la base de données

				Home mamaison = new Home("Rennes"+i, 45+i, 52+i, personne);

				manager.persist(mamaison);

			}
		}
	}

	/*
	 * question 5: criteria code
	 * 
	 * CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
// assuming a is an Integer  
// if returning multiple fields, look into using a Tuple 
//    or specifying the return type as an Object or Object[]
CriteriaQuery<Integer.class> query = criteriaBuilder.createQuery(Integer.class);
Root<B.class> from = query.from(Bean.class);
query.select(from.get("a"))
     .where(from.get("a").in(1, 2, 3, 4));

// create query and execute...
... 
	 */

/*	private void createPersons() {
		int numOfPersons =  manager.createNamedQuery("Select a from Person a", Person.class).getResultList().size();
		
		if (numOfPersons == 0){
			Home home = new Home("MyHouse", numOfPersons, numOfPersons);
			manager.persist(home);
			
			manager.persist(new Person("Maurice",null, null, null, null, null, home));
			manager.persist(new Person("christelle", null, null, null, null, null, home));
		}
	}

	private void listPersons {
		
		
		int numPersons = manager.createQuery("Select a from Person a", person.class)
//		Person personne = new Person("Kinfack","Mariane","Feminin","myabenz@yahoo.fr","12 Juin 1990","maria");
//		manager.persist(personne);
		Person personne = new Person();
		
		Home home = new Home("12 avenue Paul",360,25);
		manager.persist(new Person("Kinfack","Mariane","Feminin","myabenz@yahoo.fr","12 Juin 1990","maria", amis));
		
		
	}
	*/

	 

}
