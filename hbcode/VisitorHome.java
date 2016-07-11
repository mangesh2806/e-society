// default package
// Generated Jul 11, 2016 12:29:04 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Visitor.
 * @see .Visitor
 * @author Hibernate Tools
 */
@Stateless
public class VisitorHome {

	private static final Log log = LogFactory.getLog(VisitorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Visitor transientInstance) {
		log.debug("persisting Visitor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Visitor persistentInstance) {
		log.debug("removing Visitor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Visitor merge(Visitor detachedInstance) {
		log.debug("merging Visitor instance");
		try {
			Visitor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Visitor findById(int id) {
		log.debug("getting Visitor instance with id: " + id);
		try {
			Visitor instance = entityManager.find(Visitor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
