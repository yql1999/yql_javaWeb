<%
  request.setCharacterEncoding("gb2312");
  //��ȡsession����������Ϊ"username"��ֵ����ת��Ϊ�ַ���username���档
  String username=(String)session.getAttribute("username");
  //�ж�name�Ƿ�Ϊ��
  if(username==null)//���Ϊ�գ�ת��example6.9.1.jspע��ҳ��
    response.sendRedirect("session4.jsp?info=�޷���Ȩ�ޣ����¼");
%>
