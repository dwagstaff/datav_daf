package com.bsquare.datav.trucksidetool.re;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NextStep implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String stepId;
   private java.lang.Integer score;

   public NextStep()
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

   public java.lang.Integer getScore()
   {
      return this.score;
   }

   public void setScore(java.lang.Integer score)
   {
      this.score = score;
   }

   public NextStep(java.lang.String stepId, java.lang.Integer score)
   {
      this.stepId = stepId;
      this.score = score;
   }

}