package me.kafeitu.activiti.jpa.repository.runtime;

import me.kafeitu.activiti.jpa.entity.runtime.ExecutionJpaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 流程实例Repository
 *
 * @author HenryYan
 */
@Repository
public interface ProcessInstanceRepository extends JpaRepository<ExecutionJpaEntity, String>,
		JpaSpecificationExecutor<ExecutionJpaEntity> {

}
