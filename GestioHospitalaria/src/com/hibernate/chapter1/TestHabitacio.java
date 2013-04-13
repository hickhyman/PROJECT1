package com.hibernate.chapter1;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestHabitacio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfiguration config = new AnnotationConfiguration();
		
		config.addAnnotatedClass(Habitacio.class);
		config.configure("hibernate.cfg.xml");
		new SchemaExport(config).create(true, true);

	}

}
