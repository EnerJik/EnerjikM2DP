<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
	<head>
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
		
		<link rel="stylesheet" type="text/css" media="screen" href="resources/css/common.css" />
		<link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/jquery-ui/pepper-grinder/jquery-ui-1.8.16.custom.css"/>'/>
		<link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/ui.jqgrid-4.3.1.css"/>'/>
		<link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/style.css"/>'/>	
		
		<script src="//ajax.aspnetcdn.com/ajax/jQuery/jquery-1.9.1.min.js"></script>
		<script type='text/javascript' src='<c:url value="/resources/js/jquery-1.6.4.min.js"/>'></script>
		<script type='text/javascript' src='<c:url value="/resources/js/jquery-ui-1.8.16.custom.min.js"/>'></script>
		<script type='text/javascript' src='<c:url value="/resources/js/grid.locale-en-4.3.1.js"/>'></script>
		<script type='text/javascript' src='<c:url value="/resources/js/jquery.jqGrid.min.4.3.1.js"/>'></script>
		<script type='text/javascript' src='<c:url value="/resources/js/custom.js"/>'></script>
		
		<script src="resources/js/graph/highcharts.js"></script>
		<script src="resources/js/graph/exporting.js"></script>
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
