package org.apache.airavata.integration;

import junit.framework.Assert;
import org.apache.airavata.client.api.AiravataAPI;
import org.apache.airavata.registry.api.workflow.ExperimentData;
import org.apache.airavata.registry.api.impl.WorkflowExecutionDataImpl;
import org.apache.airavata.registry.api.workflow.WorkflowExecutionData;
import org.apache.airavata.registry.api.workflow.NodeExecutionData;
import org.apache.airavata.ws.monitor.MonitorEvent;
import org.apache.airavata.ws.monitor.MonitorEventData;
import org.apache.airavata.ws.monitor.MonitorEventListener;
import org.apache.airavata.ws.monitor.MonitorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Monitor class for integration tests.
 */
public class TestMonitorListener implements MonitorEventListener {

    private static final Logger log = LoggerFactory.getLogger(BaseCaseIT.class);

    private String experimentId;
    private AiravataAPI airavataAPI;

    public TestMonitorListener(AiravataAPI api, String experiment) {
        this.airavataAPI = api;
        this.experimentId = experiment;
    }

    @Override
    public void notify(MonitorEventData eventData, MonitorEvent event) {

        Assert.assertNotNull(eventData);
        Assert.assertNotNull(event);

        if (MonitorUtil.EventType.WORKFLOW_TERMINATED == event.getType()) {
            try {
                verifyOutput("echo_output=Airavata Test");
            } catch (Exception e) {
                log.error("Error verifying output", e);
                throw new RuntimeException(e);
            }
        }

        log.info(eventData.getEvents().toString());
    }

    protected void verifyOutput(String outputVerifyingString) throws Exception {
        log.info("Workflow Experiment ID Returned : " + this.experimentId);

        ExperimentData experimentData = airavataAPI.getProvenanceManager().getExperimentData(this.experimentId);

        log.info("Verifying output ...");

        List<WorkflowExecutionDataImpl> workflowInstanceData = experimentData.getWorkflowExecutionDataList();

//        List<WorkflowInstanceData> workflowInstanceData = experimentData.getWorkflowInstanceData();

        for(WorkflowExecutionDataImpl data:workflowInstanceData){
            List<NodeExecutionData> nodeDataList = data.getNodeDataList();
            for(NodeExecutionData nodeData:nodeDataList){
                Assert.assertEquals("Airavata Test", nodeData.getOutputData().get(0).getValue());
                Assert.assertEquals(outputVerifyingString, nodeData.getInputData().get(0).getValue());
            }
        }
    }
}
