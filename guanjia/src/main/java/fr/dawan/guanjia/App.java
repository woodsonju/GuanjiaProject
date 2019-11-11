package fr.dawan.guanjia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("guanjiajpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();    }
}
