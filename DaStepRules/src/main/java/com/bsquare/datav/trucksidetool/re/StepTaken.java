package com.bsquare.datav.trucksidetool.re;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class StepTaken implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String stepId;
   private java.lang.Integer order;

   public StepTaken()
   {
   }

   public java.lang.String getStepId()
   {
      return this.stepId;
   }

   public void setStepId(java.lang.String stepId)
   {
      this.stepId = stepId;
   }

   public java.lang.Integer getOrder()
   {
      return this.order;
   }

   public void setOrder(java.lang.Integer order)
   {
      this.order = order;
   }

   public StepTaken(java.lang.String stepId, java.lang.Integer order)
   {
      this.stepId = stepId;
      this.order = order;
   }

}