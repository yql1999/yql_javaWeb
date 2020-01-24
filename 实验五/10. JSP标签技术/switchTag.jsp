<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="demo" uri="http://www.mydomain.com/sample" %>
<html><body>
<demo:switch conditionValue="${param.action}" >
<demo:case caseValue="sayHello">
Hello!
</demo:case>
<demo:case caseValue="sayGoodBye" >
Good Bye!!
</demo:case>
<demo:default>
I am Dumb!!!
</demo:default>
</demo:switch>
</body></html>
