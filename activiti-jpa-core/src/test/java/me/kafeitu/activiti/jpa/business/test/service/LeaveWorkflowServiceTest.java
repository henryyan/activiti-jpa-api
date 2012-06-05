package me.kafeitu.activiti.jpa.business.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import me.kafeitu.activiti.jpa.base.test.SpringTransactionalTestCase;
import me.kafeitu.activiti.jpa.business.entity.Leave;
import me.kafeitu.activiti.jpa.business.service.LeaveWorkflowService;
import me.kafeitu.activiti.jpa.entity.runtime.ExecutionJpaEntity;
import me.kafeitu.activiti.jpa.service.RuntimeJpaService;

import org.activiti.engine.RuntimeService;
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
	
	@Autowired
	private RuntimeService runtimeService;
	
	@Autowired
	private RuntimeJpaService runtimeJpaService;
	
	private Leave leave;
	private ProcessInstance processInstance;

	@Test
	public void testBeans() {
		assertNotNull(leaveWorkflowService);
	}

	@Test
	public void testStartProcessInstance() throws Exception {
		Map<String, Object> variables = new HashMap<String, Object>();
		startSingleProcessInstance(variables);
		
		assertNotNull(processInstance);
		
		// flush session to db
		em.flush();
		
		assertEquals(processInstance.getBusinessKey(), leave.getId().toString());
	}
	
	@Test
	public void testProcessInstanceQuery() throws Exception {
		Map<String, Object> variables = new HashMap<String, Object>();
		startSingleProcessInstance(variables);
		
		long count = runtimeService.createProcessInstanceQuery().count();
		assertEquals(1, count);
		
		Iterable<ExecutionJpaEntity> all = runtimeJpaService.all();
		List<ExecutionJpaEntity> allList = new ArrayList<ExecutionJpaEntity>();
		for (ExecutionJpaEntity executionJpaEntity : all) {
			allList.add(executionJpaEntity);
		}
		assertEquals(1, allList.size());
	}

	/**
	 * start a process instance of leave
	 */
	private void startSingleProcessInstance(Map<String, Object> variables) {
		leave = new Leave();
		leave.setApplyTime(new Date());
		leave.setStartTime(new jodd.datetime.JDateTime("2012-05-22").convertToSqlDate());
		leave.setEndTime(new jodd.datetime.JDateTime("2012-05-23").convertToSqlDate());
		leave.setLeaveType("公休");
		leave.setUserId("kafeitu");
		leave.setReason("no reason");
		processInstance = leaveWorkflowService.start(leave, variables);
	}

}
