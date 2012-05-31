package me.kafeitu.activiti.jpa.business.test.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import me.kafeitu.activiti.jpa.base.test.SpringTransactionalTestCase;
import me.kafeitu.activiti.jpa.business.dao.LeaveDao;
import me.kafeitu.activiti.jpa.business.entity.Leave;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Leave DAO test
 *
 * @author HenryYan
 */
@ContextConfiguration(locations = { "/applicationContext-test-auto-hbm2dll.xml" })
public class LeaveDaoTest extends SpringTransactionalTestCase {

	@Autowired
	private LeaveDao entityDao;

	@PersistenceContext
	private EntityManager em;

	@Test
	//如果你需要真正插入数据库,将Rollback设为false
	//@Rollback(false) 
	public void crudEntity() {

		// 保存请假
		Leave leave = new Leave();
		leave.setApplyTime(new Date());
		leave.setStartTime(new jodd.datetime.JDateTime("2012-05-22").convertToSqlDate());
		leave.setEndTime(new jodd.datetime.JDateTime("2012-05-23").convertToSqlDate());
		leave.setLeaveType("公休");
		leave.setUserId("kafeitu");
		leave.setReason("no reason");
		entityDao.save(leave);
		em.flush();

		// 获取用户
		leave = entityDao.findOne(leave.getId());
		assertNotNull(leave);

		// 删除请假
		entityDao.delete(leave);
		em.flush();

		// 获取用户
		leave = entityDao.findOne(leave.getId());
		assertNull(leave);
	}

}
