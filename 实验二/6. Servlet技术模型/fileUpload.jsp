<%@ page contentType="text/html; charset=gb2312"

     pageEncoding="gb2312"%>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<title>上传文件</title></head>

<body>

${message}<br>

<form action="fileUpload.do" enctype="multipart/form-data" 

            method="post">

    <table>

    <tr> <td colspan="2" align="center">文件上传</td>

    </tr>

    <tr><td>会员号：</td>

       <td><input type="text" name="mnumber" size="30" /></td>

    </tr>

    <tr> <td>文件名：</td>

          <td><input type="file" name="fileName" size="30" /></td>

    </tr>

    <tr>

         <td align="right"><input type="submit" value="提交" /></td>

         <td align="left"><input type="reset" value="重置"/></td>

    </tr>

    </table>

</form>

</body>

</html>
