/**
 * 
 */
package com.bsquare.datav.trucksidetool.re;

/**
 * @author dwags
 *
 */
public class JobCodeToStep {
    private String jobCode;
    private String stepId;
    
    


    /**
     * @param jobCode
     * @param stepId
     */
    public JobCodeToStep(String jobCode, String stepId) {
        super();
        this.jobCode = jobCode;
        this.stepId = stepId;
    }


    /**
     * @return the jobCode
     */
    public String getJobCode() {
        return jobCode;
    }


    /**
     * @param jobCode the jobCode to set
     */
    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }


    /**
     * @return the stepId
     */
    public String getStepId() {
        return stepId;
    }


    /**
     * @param stepId the stepId to set
     */
    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

}
