package com.bsquare.datav.trucksidetool.re;

public class DtcIn implements java.io.Serializable {
    static final long serialVersionUID = 1L;

    private String code;

    private Integer occurrences;

    private Integer order;

    private Boolean active;

    public DtcIn() {
    }

    public DtcIn(String code, Integer occurrences, Integer order, Boolean active) {
        this.code = code;
        this.occurrences = occurrences;
        this.order = order;
        this.active = active;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getOccurrences() { return this.occurrences; }

    public void setOccurrences(Integer occurrences) { this.occurrences = occurrences; }

    public Integer getOrder() {
        return this.order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
