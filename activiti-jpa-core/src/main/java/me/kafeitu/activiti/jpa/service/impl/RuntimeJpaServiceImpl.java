package me.kafeitu.activiti.jpa.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.activiti.engine.runtime.ExecutionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;

import me.kafeitu.activiti.jpa.service.RuntimeJpaService;

/**
 * 
 *
 * @author HenryYan
 */
public class RuntimeJpaServiceImpl implements RuntimeJpaService {

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceByKey(java.lang.String)
	 */
	@Override
	public ProcessInstance startProcessInstanceByKey(String processDefinitionKey) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceByKey(java.lang.String, java.lang.String)
	 */
	@Override
	public ProcessInstance startProcessInstanceByKey(String processDefinitionKey, String businessKey) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceByKey(java.lang.String, java.util.Map)
	 */
	@Override
	public ProcessInstance startProcessInstanceByKey(String processDefinitionKey, Map<String, Object> variables) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceByKey(java.lang.String, java.lang.String, java.util.Map)
	 */
	@Override
	public ProcessInstance startProcessInstanceByKey(String processDefinitionKey, String businessKey,
			Map<String, Object> variables) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceById(java.lang.String)
	 */
	@Override
	public ProcessInstance startProcessInstanceById(String processDefinitionId) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceById(java.lang.String, java.lang.String)
	 */
	@Override
	public ProcessInstance startProcessInstanceById(String processDefinitionId, String businessKey) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceById(java.lang.String, java.util.Map)
	 */
	@Override
	public ProcessInstance startProcessInstanceById(String processDefinitionId, Map<String, Object> variables) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceById(java.lang.String, java.lang.String, java.util.Map)
	 */
	@Override
	public ProcessInstance startProcessInstanceById(String processDefinitionId, String businessKey, Map<String, Object> variables) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceByMessage(java.lang.String)
	 */
	@Override
	public ProcessInstance startProcessInstanceByMessage(String messageName) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceByMessage(java.lang.String, java.util.Map)
	 */
	@Override
	public ProcessInstance startProcessInstanceByMessage(String messageName, Map<String, Object> processVariables) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#startProcessInstanceByMessage(java.lang.String, java.lang.String, java.util.Map)
	 */
	@Override
	public ProcessInstance startProcessInstanceByMessage(String messageName, String businessKey,
			Map<String, Object> processVariables) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#deleteProcessInstance(java.lang.String, java.lang.String)
	 */
	@Override
	public void deleteProcessInstance(String processInstanceId, String deleteReason) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#getActiveActivityIds(java.lang.String)
	 */
	@Override
	public List<String> getActiveActivityIds(String executionId) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#signal(java.lang.String)
	 */
	@Override
	public void signal(String executionId) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#signal(java.lang.String, java.util.Map)
	 */
	@Override
	public void signal(String executionId, Map<String, Object> processVariables) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#getVariables(java.lang.String)
	 */
	@Override
	public Map<String, Object> getVariables(String executionId) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#getVariablesLocal(java.lang.String)
	 */
	@Override
	public Map<String, Object> getVariablesLocal(String executionId) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#getVariables(java.lang.String, java.util.Collection)
	 */
	@Override
	public Map<String, Object> getVariables(String executionId, Collection<String> variableNames) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#getVariablesLocal(java.lang.String, java.util.Collection)
	 */
	@Override
	public Map<String, Object> getVariablesLocal(String executionId, Collection<String> variableNames) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#getVariable(java.lang.String, java.lang.String)
	 */
	@Override
	public Object getVariable(String executionId, String variableName) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#getVariableLocal(java.lang.String, java.lang.String)
	 */
	@Override
	public Object getVariableLocal(String executionId, String variableName) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#setVariable(java.lang.String, java.lang.String, java.lang.Object)
	 */
	@Override
	public void setVariable(String executionId, String variableName, Object value) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#setVariableLocal(java.lang.String, java.lang.String, java.lang.Object)
	 */
	@Override
	public void setVariableLocal(String executionId, String variableName, Object value) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#setVariables(java.lang.String, java.util.Map)
	 */
	@Override
	public void setVariables(String executionId, Map<String, ? extends Object> variables) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#setVariablesLocal(java.lang.String, java.util.Map)
	 */
	@Override
	public void setVariablesLocal(String executionId, Map<String, ? extends Object> variables) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#createExecutionQuery()
	 */
	@Override
	public ExecutionQuery createExecutionQuery() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#createProcessInstanceQuery()
	 */
	@Override
	public ProcessInstanceQuery createProcessInstanceQuery() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#suspendProcessInstanceById(java.lang.String)
	 */
	@Override
	public void suspendProcessInstanceById(String processInstanceId) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#activateProcessInstanceById(java.lang.String)
	 */
	@Override
	public void activateProcessInstanceById(String processInstanceId) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#signalEventReceived(java.lang.String)
	 */
	@Override
	public void signalEventReceived(String signalName) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#signalEventReceived(java.lang.String, java.util.Map)
	 */
	@Override
	public void signalEventReceived(String signalName, Map<String, Object> processVariables) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#signalEventReceived(java.lang.String, java.lang.String)
	 */
	@Override
	public void signalEventReceived(String signalName, String executionId) {
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.RuntimeService#signalEventReceived(java.lang.String, java.lang.String, java.util.Map)
	 */
	@Override
	public void signalEventReceived(String signalName, String executionId, Map<String, Object> processVariables) {
	}

}
