package com.mytag;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
public class CaseTag extends SimpleTagSupport{
   private String caseValue;
   public void setCaseValue(String caseValue){
      this.caseValue = caseValue;
   }
   public void doTag() throws JspException,IOException{
      SwitchTag parent =(SwitchTag) getParent();  // ���ظ���ǩ����
      String conditionValue = parent.getConditionValue();
      if (conditionValue.equals(caseValue)){
         parent.setCaseFound(true); 
         getJspBody().invoke(null);
       }else{
          return;  // ��ִ�б�ǩ��
      }
  }
}

