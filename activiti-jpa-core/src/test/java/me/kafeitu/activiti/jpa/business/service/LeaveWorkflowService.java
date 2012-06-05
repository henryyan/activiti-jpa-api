package me.kafeitu.activiti.jpa.business.service;

import java.util.Map;

import me.kafeitu.activiti.jpa.business.entity.Leave;
import me.kafeitu.activiti.jpa.business.repository.LeaveRepository;
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

	protected LeaveRepository leaveDao;

	/**
	 * start process instance with save entity
	 * 
	 * @param entity		business entity
	 * @param variables		process instance variables for start action
	 */
	public ProcessInstance start(Leave entity, Map<String, Object> variables) {
		leaveDao.save(entity);
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("leave", entity.getId().toString(), variables);
		return processInstance;
	}

	@Autowired
	public void setLeaveDao(LeaveRepository leaveDao) {
		this.leaveDao = leaveDao;
	}

}
