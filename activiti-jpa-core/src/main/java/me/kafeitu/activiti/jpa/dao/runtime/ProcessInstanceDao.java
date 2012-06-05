package me.kafeitu.activiti.jpa.dao.runtime;

import me.kafeitu.activiti.jpa.entity.runtime.ExecutionJpaEntity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

/**
 * 
 *
 * @author HenryYan
 */
@Component
public interface ProcessInstanceDao extends PagingAndSortingRepository<ExecutionJpaEntity, String> {

}
