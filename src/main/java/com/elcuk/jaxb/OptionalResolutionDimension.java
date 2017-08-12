/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.XmlValue;
/*    */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*    */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="OptionalResolutionDimension", propOrder={"value"})
/*    */ public class OptionalResolutionDimension
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String value;
/*    */ 
/*    */   @XmlAttribute(name="unitOfMeasure")
/*    */   protected ResolutionUnitOfMeasure unitOfMeasure;
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(String value)
/*    */   {
/* 63 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public ResolutionUnitOfMeasure getUnitOfMeasure()
/*    */   {
/* 75 */     return this.unitOfMeasure;
/*    */   }
/*    */ 
/*    */   public void setUnitOfMeasure(ResolutionUnitOfMeasure value)
/*    */   {
/* 87 */     this.unitOfMeasure = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OptionalResolutionDimension
 * JD-Core Version:    0.6.2
 */