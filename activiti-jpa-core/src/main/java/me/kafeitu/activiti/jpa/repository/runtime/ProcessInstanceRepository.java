package me.kafeitu.activiti.jpa.repository.runtime;

import me.kafeitu.activiti.jpa.entity.runtime.ExecutionJpaEntity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 *
 * @author HenryYan
 */
@Repository
public interface ProcessInstanceRepository extends PagingAndSortingRepository<ExecutionJpaEntity, String> {

}
