// default package
// Generated Dec 5, 2015 12:06:35 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Member.
 * @see .Member
 * @author Hibernate Tools
 */
@Stateless
public class MemberHome {

	private static final Log log = LogFactory.getLog(MemberHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Member transientInstance) {
		log.debug("persisting Member instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Member persistentInstance) {
		log.debug("removing Member instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Member merge(Member detachedInstance) {
		log.debug("merging Member instance");
		try {
			Member result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Member findById(String id) {
		log.debug("getting Member instance with id: " + id);
		try {
			Member instance = entityManager.find(Member.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
