package com.bsquare.datav.trucksidetool.re;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DTCOut implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String code;

   private int order;

   public DTCOut()
   {
   }

   public java.lang.String getCode()
   {
      return this.code;
   }

   public void setCode(java.lang.String code)
   {
      this.code = code;
   }

   public int getOrder()
   {
      return this.order;
   }

   public void setOrder(int order)
   {
      this.order = order;
   }

   public DTCOut(java.lang.String code, int order)
   {
      this.code = code;
      this.order = order;
   }

}