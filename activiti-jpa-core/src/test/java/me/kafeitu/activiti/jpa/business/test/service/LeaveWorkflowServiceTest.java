package me.kafeitu.activiti.jpa.business.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import me.kafeitu.activiti.jpa.base.test.SpringTransactionalTestCase;
import me.kafeitu.activiti.jpa.business.entity.Leave;
import me.kafeitu.activiti.jpa.business.service.LeaveWorkflowService;

import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * leave workflow service test
 *
 * @author HenryYan
 */
@ContextConfiguration(locations = { "classpath:me/kafeitu/activiti/jpa/business/test/service/LeaveWorkflowServiceTest-context.xml" })
public class LeaveWorkflowServiceTest extends SpringTransactionalTestCase {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private LeaveWorkflowService leaveWorkflowService;
	
	@Test
	public void testBeans() {
		assertNotNull(leaveWorkflowService);
	}

	@Test
	public void testStartProcessInstance() throws Exception {
		// 保存请假
		Leave leave = new Leave();
		leave.setApplyTime(new Date());
		leave.setStartTime(new jodd.datetime.JDateTime("2012-05-22").convertToSqlDate());
		leave.setEndTime(new jodd.datetime.JDateTime("2012-05-23").convertToSqlDate());
		leave.setLeaveType("公休");
		leave.setUserId("kafeitu");
		leave.setReason("no reason");
		Map<String, Object> variables = new HashMap<String, Object>();
		ProcessInstance processInstance = leaveWorkflowService.start(leave, variables);
		assertNotNull(processInstance);
		em.flush();
		assertEquals(processInstance.getBusinessKey(), leave.getId().toString());
	}

}
