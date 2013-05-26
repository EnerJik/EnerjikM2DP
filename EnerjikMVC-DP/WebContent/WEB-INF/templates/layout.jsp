<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<title><tiles:insertAttribute name="title" ignore="true" /></title>
	<link rel="stylesheet" type="text/css" media="screen" href="resources/css/common.css" />
	<script src="//ajax.aspnetcdn.com/ajax/jQuery/jquery-1.9.1.min.js"></script>
</head>

<body>

	<div id="zepage">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		
		<div id="errorMessage" class="fullpage">
			<div class="wrapcenter">
				<tiles:insertAttribute name="errorMesssage" defaultValue="" />
			</div>
		</div>
		
		<div class="fullpage body">
			<div class="wrapcenter">
				<tiles:insertAttribute name="body" />
			</div>
		</div>

		<!-- include tiles footer -->
		<div id="footer" class="nomargin">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
	<!-- zepage -->
	
</body>
</html>
