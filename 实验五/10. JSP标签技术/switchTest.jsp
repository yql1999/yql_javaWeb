<%@ taglib prefix="demo" uri="/WEB-INF/sampleLib.tld" %>
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
