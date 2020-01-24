<%@ page contentType="text/html; charset=UTF-8"
           pageEncoding="UTF-8"%>
<html>
<head><title>简单测试</title></head>
<body>
<p>请回答下面的问题：</p>
<form action="simpletest.do" method="post">
<p> 1. Sun公司于2010年被Oracle公司收购。
  <input type="radio" name="quest1" value="1"> 正确
  <input type="radio" name="quest1" value="2"> 错误<br>
<p> 2. Windows操作系统是哪个公司的产品？
  <input type="radio" name="quest2" value="1"> Apple公司
  <input type="radio" name="quest2" value="2"> IBM公司
  <input type="radio" name="quest2" value="3"> Microsoft公司<br>
<p> 3.下面的程序设计语言，哪些是面向对象的？
  <input type="checkbox" name="quest3" value="1"> Java语言
  <input type="checkbox" name="quest3" value="2"> C语言
  <input type="checkbox" name="quest3" value="3"> C++语言<br>
<p> 4.编写Servlet程序应继承哪个类？
<input type="text" name="quest4" size="30"><br>
<p>交卷请点击:<input type="submit" value="交卷">
重答请点击: <input type="reset" value="重答">
 </form>
</body>
</html>
