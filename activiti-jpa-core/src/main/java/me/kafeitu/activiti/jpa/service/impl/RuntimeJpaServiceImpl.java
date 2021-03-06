package me.kafeitu.activiti.jpa.service.impl;

import java.util.List;

import me.kafeitu.activiti.jpa.entity.runtime.ExecutionJpaEntity;
import me.kafeitu.activiti.jpa.repository.runtime.ProcessInstanceRepository;
import me.kafeitu.activiti.jpa.service.RuntimeJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * runtime service implement
 *
 * @author HenryYan
 */
@Service
@Transactional(readOnly = true)
public class RuntimeJpaServiceImpl implements RuntimeJpaService {

	@Autowired
	protected ProcessInstanceRepository processInstanceDao;
	
	@Override
	public List<ExecutionJpaEntity> all() {
		return processInstanceDao.findAll();
	}

}
