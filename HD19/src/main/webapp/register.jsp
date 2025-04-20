<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@ page import="com.demo.entity.Users" %>
	<jsp:useBean id="" class="w"></jsp:useBean>
	<jsp:setProperty property="*" name="u1"/>
	
	<%
	Configuration cfg =new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Transaction t =s.beginTransaction();
	
	s.save(u1);
	
	t.commit();
	s.close();
	%>
	
	
	<h2>data is inserted</h2>

</body>
</html>