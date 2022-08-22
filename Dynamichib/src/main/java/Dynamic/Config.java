package Dynamic;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Config {
	public static SessionFactory hibConfig() {
		//SSR is used to map the config file and execute it
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		//Metadata in the config file should be executed
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		//session factory
		SessionFactory sf=md.getSessionFactoryBuilder().build();
	return sf;
	}


}
