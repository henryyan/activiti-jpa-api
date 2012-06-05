package me.kafeitu.activiti.jpa.service;

import java.util.List;

import me.kafeitu.activiti.jpa.entity.runtime.ExecutionJpaEntity;

import org.activiti.engine.RuntimeService;

/**
 * Extend {@link RuntimeService}
 * 
 * @author HenryYan
 */
public interface RuntimeJpaService {

	public List<ExecutionJpaEntity> all();
	
}
