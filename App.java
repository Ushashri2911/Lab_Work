package com.example.PersonOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.PersonOneToOne.PassportDetails;
import com.example.PersonOneToOne.Person;
import com.utility.HibernateUtil;
import com.utility.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try 
		{
			Person person=new Person();
			person.setPname("Ushashri");
			person.setEmail("abc@gmail.com");
			person.setContact(123456);

			PassportDetails passport=new PassportDetails();
			passport.setPn(23);
			passport.setName("Usha");


			person.setPassport(passport);
			passport.setPerson(person);

			session.save(person);
			session.getTransaction().commit();

			Person retrievedPerson=session.get(Person.class, person.getPid());
			PassportDetails retrievedPassport=retrievedPerson.getPassport();

			System.out.println("Person: "+retrievedPerson.getPname());
			System.out.println("Passport Details : "+retrievedPassport.getPn());
		}
		finally 
		{
			session.close();
			sessionFactory.close();

		}

    }
}
