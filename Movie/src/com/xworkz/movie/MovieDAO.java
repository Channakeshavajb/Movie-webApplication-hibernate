package com.xworkz.movie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MovieDAO {
	
	
public MovieDAO() {
	System.out.println("Movie DAO created...!!");
}
	
	public void save(MovieDTO dto)
	{
		
		System.out.println("saving Movie \t"+dto);
		Configuration configuration=new Configuration();
		configuration.configure("hibernat.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		System.out.println(factory!=null ? "factoryFound":"factory not found");
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try{
					
			System.out.println("Saving dto with session \t"+dto.getMovieName());
			session.save(dto);
			transaction.commit();
			System.out.println("Saving dto was successful\t"+dto.getMovieName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.err.println("Exception in saving dto\t"+dto.getMovieName());
			transaction.rollback();
		}
		finally{
			session.close();
			System.out.println("closing session only");
		}
	
	}

}
