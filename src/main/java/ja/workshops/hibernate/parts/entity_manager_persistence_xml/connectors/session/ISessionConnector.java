package ja.workshops.hibernate.parts.entity_manager_persistence_xml.connectors.session;

import ja.workshops.hibernate.parts.entity_manager_persistence_xml.connectors.ISession;
import org.hibernate.Session;

/**
 * Interface for objects concerned with session managing.
 * @author Kamil Rojek
 */
public interface ISessionConnector extends ISession {
    Session getSession();
}
