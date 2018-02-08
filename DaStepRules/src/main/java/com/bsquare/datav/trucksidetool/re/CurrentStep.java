package com.bsquare.datav.trucksidetool.re;

public class CurrentStep {
    static final long serialVersionUID = 1L;

    private String stepId;

    private Boolean yesResponse;

    public CurrentStep() {
    }

    public CurrentStep(String stepId, Boolean yesResponse) {
        this.stepId = stepId;
        this.yesResponse = yesResponse;
    }

    public String getStepId() {
        return this.stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public Boolean getYesResponse() {
        return yesResponse;
    }

    public void setYesResponse(Boolean yesResponse) {
        this.yesResponse = yesResponse;
    }
}
