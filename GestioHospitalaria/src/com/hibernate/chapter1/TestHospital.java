package com.hibernate.chapter1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestHospital {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration config = new AnnotationConfiguration();
		
		config.addAnnotatedClass(Hospital.class);
		config.configure("hibernate.cfg.xml");
		new SchemaExport(config).create(true, true);
		
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
					
		Hospital hospi = new Hospital();
		hospi.setAdreca("Madrid");
		hospi.setNom("UB Hospital");
		hospi.setDescripcio("hihihihihihihihih");
		
		session.save(hospi);
		session.getTransaction().commit();
		
		
		

	}

}
