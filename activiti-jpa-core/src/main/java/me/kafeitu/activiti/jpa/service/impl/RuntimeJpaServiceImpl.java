package me.kafeitu.activiti.jpa.service.impl;

import me.kafeitu.activiti.jpa.dao.runtime.ProcessInstanceDao;
import me.kafeitu.activiti.jpa.entity.runtime.ExecutionJpaEntity;
import me.kafeitu.activiti.jpa.service.RuntimeJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 *
 * @author HenryYan
 */
@Service
@Transactional(readOnly = true)
public class RuntimeJpaServiceImpl implements RuntimeJpaService {

	@Autowired
	protected ProcessInstanceDao processInstanceDao;
	
	@Override
	public Iterable<ExecutionJpaEntity> all() {
		return processInstanceDao.findAll();
	}

}
