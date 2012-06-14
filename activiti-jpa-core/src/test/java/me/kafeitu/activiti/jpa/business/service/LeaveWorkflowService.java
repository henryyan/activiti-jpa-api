package me.kafeitu.activiti.jpa.business.service;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import me.kafeitu.activiti.jpa.business.entity.Leave;
import me.kafeitu.activiti.jpa.business.repository.LeaveRepository;
import me.kafeitu.activiti.jpa.entity.runtime.ExecutionJpaEntity;
import me.kafeitu.activiti.jpa.repository.runtime.ProcessInstanceRepository;
import me.kafeitu.activiti.jpa.service.base.AbstractWorkflowService;

import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Leave workflow service
 *
 * @author HenryYan
 */
@Service
@Transactional
public class LeaveWorkflowService extends AbstractWorkflowService {

	protected LeaveRepository leaveRepository;
	
	protected ProcessInstanceRepository processInstanceRepository;
	
	@PersistenceContext
	protected EntityManager em;
	
	/**
	 * start process instance with save entity
	 * 
	 * @param entity		business entity
	 * @param variables		process instance variables for start action
	 */
	public ProcessInstance start(Leave entity, Map<String, Object> variables) {
		leaveRepository.save(entity);
		
		logger.debug("create leave: {}", entity.getId());
		
		// start process instance
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("leave", entity.getId().toString(), variables);
		
		// set process instance to entity
		ExecutionJpaEntity executionJpaEntity = processInstanceRepository.findOne(processInstance.getId());
		entity.setProcessInstance(executionJpaEntity);
		leaveRepository.save(entity);
		
		return processInstance;
	}
	
	public List<Leave> find(String qlString) {
		TypedQuery<Leave> query = em.createQuery(qlString, Leave.class);
		return query.getResultList();
	}

	@Autowired
	public void setLeaveDao(LeaveRepository leaveRepository) {
		this.leaveRepository = leaveRepository;
	}

	@Autowired
	public void setProcessInstanceRepository(ProcessInstanceRepository processInstanceRepository) {
		this.processInstanceRepository = processInstanceRepository;
	}

	@Override
	public void flush() {
		leaveRepository.flush();
	}

}
