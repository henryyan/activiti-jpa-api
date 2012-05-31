package me.kafeitu.activiti.jpa.base.mapping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import javax.sql.DataSource;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * JPA Unit Test
 *
 * @author HenryYan
 */
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
public class JpaMappingTest extends AbstractJUnit4SpringContextTests {

	private static Logger logger = LoggerFactory.getLogger(JpaMappingTest.class);

	protected DataSource dataSource;
	private ProcessEngine processEngine;

	@PersistenceContext
	private EntityManager em;

	@Before
	public void setUp() throws Exception {
		processEngine = ProcessEngines.getDefaultProcessEngine();
		assertNotNull(processEngine);
	}

	@Test
	public void allClassMapping() throws Exception {
		Metamodel model = em.getEntityManagerFactory().getMetamodel();
		int entityCounter = 0;
		for (EntityType<?> entityType : model.getEntities()) {
			String entityName = entityType.getName();
			em.createQuery("select o from " + entityName + " o").getFirstResult();
			logger.info("ok: " + entityName);
			entityCounter++;
		}
		assertEquals(19, entityCounter);
	}

}
