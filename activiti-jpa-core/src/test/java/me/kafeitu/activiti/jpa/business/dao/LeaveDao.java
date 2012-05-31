package me.kafeitu.activiti.jpa.business.dao;

import me.kafeitu.activiti.jpa.business.entity.Leave;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Leave Entity DAO
 *
 * @author HenryYan
 */
@Component
public interface LeaveDao extends CrudRepository<Leave, Long> {
	
}
