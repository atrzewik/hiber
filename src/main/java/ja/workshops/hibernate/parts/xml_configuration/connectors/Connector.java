package ja.workshops.hibernate.parts.xml_configuration.connectors;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * @author Ola Podorska
 */
public class Connector {

    public static Session getSession(){
        return new Configuration().configure("xml_configuration/hibernate.cfg.xml").buildSessionFactory().getCurrentSession();
    }
}
