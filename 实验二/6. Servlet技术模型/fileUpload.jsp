<%@ page contentType="text/html; charset=gb2312"

     pageEncoding="gb2312"%>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<title>�ϴ��ļ�</title></head>

<body>

${message}<br>

<form action="fileUpload.do" enctype="multipart/form-data" 

            method="post">

    <table>

    <tr> <td colspan="2" align="center">�ļ��ϴ�</td>

    </tr>

    <tr><td>��Ա�ţ�</td>

       <td><input type="text" name="mnumber" size="30" /></td>

    </tr>

    <tr> <td>�ļ�����</td>

          <td><input type="file" name="fileName" size="30" /></td>

    </tr>

    <tr>

         <td align="right"><input type="submit" value="�ύ" /></td>

         <td align="left"><input type="reset" value="����"/></td>

    </tr>

    </table>

</form>

</body>

</html>
