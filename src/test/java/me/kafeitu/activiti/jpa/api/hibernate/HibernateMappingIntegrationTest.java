package me.kafeitu.activiti.jpa.api.hibernate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

import me.kafeitu.activiti.jpa.api.util.orm.HibernateUtil;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.persister.entity.EntityPersister;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hibernate mapping intergration test
 * 
 * @author HenryYan
 */
public class HibernateMappingIntegrationTest {

	private static Logger logger = LoggerFactory.getLogger(HibernateMappingIntegrationTest.class);
	private ProcessEngine processEngine;

	@Before
	public void setUp() throws Exception {
		Class.forName("org.h2.Driver");
		String url = "jdbc:h2:mem:activiti-jpa;DB_CLOSE_DELAY=1000;MVCC=TRUE";
		Connection conn = DriverManager.getConnection(url, "sa", "");
		assertNotNull(conn);

		processEngine = ProcessEngines.getDefaultProcessEngine();
		assertNotNull(processEngine);
	}

	@Test
	public void testMapping() throws Exception {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			Map<?, ?> metadata = sessionFactory.getAllClassMetadata();
			assertEquals(19, metadata.size());
			for (Object o : metadata.values()) {
				EntityPersister persister = (EntityPersister) o;
				String className = persister.getEntityName();
				Query q = session.createQuery("from " + className + " c");
				q.iterate();
				logger.debug("ok: " + className);
			}
		} finally {
			session.close();
		}
	}

}
