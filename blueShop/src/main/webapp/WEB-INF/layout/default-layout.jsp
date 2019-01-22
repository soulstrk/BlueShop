<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
	<tiles:insertAttribute name="head"/>
</head>
<body style="background-image: url('${pageContext.request.contextPath}/resources/images/swirl_@2X.png');">
	<tiles:insertAttribute name="navi"/>
	<tiles:insertAttribute name="content"/>
	<tiles:insertAttribute name="footer"/>
</body>
</html>