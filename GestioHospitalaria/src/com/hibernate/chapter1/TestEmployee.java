package com.hibernate.chapter1;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestEmployee {
	
	public static void main(String[] args) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		//clases que iran en la tabla
		config.addAnnotatedClass(Employee.class);
		//lee la configuración de conexión
		config.configure("hibernate.cfg.xml");
		
		//crear tablas
		new SchemaExport(config).create(true, true);		
	}

}
