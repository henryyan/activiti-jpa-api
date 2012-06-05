package me.kafeitu.activiti.jpa.business.repository;

import me.kafeitu.activiti.jpa.business.entity.Leave;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

/**
 * Leave Entity DAO
 *
 * @author HenryYan
 */
@Component
public interface LeaveRepository extends JpaRepository<Leave, Long>, JpaSpecificationExecutor<Leave> {

}
