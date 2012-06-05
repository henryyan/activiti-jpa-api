package me.kafeitu.activiti.jpa.business.test.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import me.kafeitu.activiti.jpa.base.test.SpringTransactionalTestCase;
import me.kafeitu.activiti.jpa.business.entity.Leave;
import me.kafeitu.activiti.jpa.business.repository.LeaveRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Leave DAO test
 *
 * @author HenryYan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:me/kafeitu/activiti/jpa/business/test/dao/LeaveDaoTest-context.xml")
public class LeaveRepositoryTest extends SpringTransactionalTestCase {

	@Autowired
	private LeaveRepository entityRepository;

	@PersistenceContext
	private EntityManager em;

	@Test
	public void crudEntity() {

		// 保存请假
		Leave leave = new Leave();
		leave.setApplyTime(new Date());
		leave.setStartTime(new jodd.datetime.JDateTime("2012-05-22").convertToSqlDate());
		leave.setEndTime(new jodd.datetime.JDateTime("2012-05-23").convertToSqlDate());
		leave.setLeaveType("公休");
		leave.setUserId("kafeitu");
		leave.setReason("no reason");
		entityRepository.save(leave);
		em.flush();

		// 获取用户
		leave = entityRepository.findOne(leave.getId());
		assertNotNull(leave);

		// 删除请假
		entityRepository.delete(leave);
		em.flush();

		// 获取用户
		leave = entityRepository.findOne(leave.getId());
		assertNull(leave);
	}

}
