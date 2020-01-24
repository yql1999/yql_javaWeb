package sampleLib;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class IfTag implements Tag{
private PageContext pageContext;
private Tag parentTag;
private boolean condition = false;

public void setPageContext(PageContext pageContext){
this.pageContext = pageContext;
}
public void setParent(Tag parentTag){
this.parentTag = parentTag;
}
public Tag getParent(){
return this.parentTag;
}
public void setCondition(boolean condition){
this.condition = condition;
}
public int doStartTag() throws JspException{
if (condition)
return EVAL_BODY_INCLUDE;
else
return SKIP_BODY;
}
public int doEndTag() throws JspException{
return EVAL_PAGE;
}
public void release(){ }
}
