package me.kafeitu.activiti.jpa.business.repository;

import me.kafeitu.activiti.jpa.business.entity.Leave;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Leave Entity DAO
 *
 * @author HenryYan
 */
@Component
public interface LeaveRepository extends CrudRepository<Leave, Long> {
	
}
