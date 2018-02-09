package com.bsquare.datav.trucksidetool.re;

public class StepTaken {
    static final long serialVersionUID = 1L;

    private String stepId;

    private Integer order;

    private Boolean yesResponse;

    public StepTaken() {
    }

    public StepTaken(String stepId, Integer order, Boolean yesResponse) {
        this.stepId = stepId;
        this.order = order;
        this.yesResponse = yesResponse;
    }

    public String getStepId() {
        return this.stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getYesResponse() {
        return yesResponse;
    }

    public void setYesResponse(Boolean yesResponse) {
        this.yesResponse = yesResponse;
    }
}
