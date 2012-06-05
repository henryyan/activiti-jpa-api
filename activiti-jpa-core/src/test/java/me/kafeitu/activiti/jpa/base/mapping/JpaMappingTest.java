package me.kafeitu.activiti.jpa.base.mapping;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * JPA Unit Test
 *
 * @author HenryYan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:me/kafeitu/activiti/jpa/base/mapping/JpaMappingTest-context.xml")
public class JpaMappingTest {

	private static Logger logger = LoggerFactory.getLogger(JpaMappingTest.class);

	protected DataSource dataSource;

	@PersistenceContext
	private EntityManager em;

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
		assertEquals(20, entityCounter);
	}

}
