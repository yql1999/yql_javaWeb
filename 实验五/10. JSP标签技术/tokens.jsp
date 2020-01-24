<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html><body>
<c:set var="poems" 
       value="白日依山尽,黄河入海流,欲穷千里目,更上一层楼" />
<h4>登鹳雀楼 王之涣 </h4>
<c:forTokens var="line" items="${poems}" delims=",">
     ${line}<br>
 </c:forTokens>
</body></html>	
