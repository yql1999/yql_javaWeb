package com.mytag;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
public class SwitchTag extends SimpleTagSupport{
   private String conditionValue; 
   private boolean caseFound = false;
   public void setConditionValue(String value) {
     this.conditionValue =value;
   }
   public String getConditionValue() {
     return conditionValue;
   }
   public void setCaseFound(boolean caseFound){
  	 this.caseFound = caseFound;
   }
   public boolean getCaseFound(){
  	 return caseFound;
   }
   public void doTag() throws JspException,IOException{
      if (conditionValue.equals("")){
         getJspContext().getOut().print
             ("You did not provide 'action' parameter.");
      }else{
         getJspBody().invoke(null);	
      }
   }
}

