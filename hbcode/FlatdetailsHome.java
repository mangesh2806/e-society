// default package
// Generated Dec 5, 2015 12:06:35 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Flatdetails.
 * @see .Flatdetails
 * @author Hibernate Tools
 */
@Stateless
public class FlatdetailsHome {

	private static final Log log = LogFactory.getLog(FlatdetailsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Flatdetails transientInstance) {
		log.debug("persisting Flatdetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Flatdetails persistentInstance) {
		log.debug("removing Flatdetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Flatdetails merge(Flatdetails detachedInstance) {
		log.debug("merging Flatdetails instance");
		try {
			Flatdetails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Flatdetails findById(int id) {
		log.debug("getting Flatdetails instance with id: " + id);
		try {
			Flatdetails instance = entityManager.find(Flatdetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
