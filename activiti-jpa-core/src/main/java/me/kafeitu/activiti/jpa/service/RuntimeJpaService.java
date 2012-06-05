package me.kafeitu.activiti.jpa.service;

import me.kafeitu.activiti.jpa.entity.runtime.ExecutionJpaEntity;

import org.activiti.engine.RuntimeService;

/**
 * Extend {@link RuntimeService}
 * 
 * <p><b>T</b>：entity type</p>
 * <p><b>PK</b>：entity key type</p>
 *
 * @author HenryYan
 */
public interface RuntimeJpaService {

	public Iterable<ExecutionJpaEntity> all();
	
}
