<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="now" value="<%=new java.util.Date()%>" />

<fmt:formatDate var="date" value="${now}" pattern="yyyy" />

<div class="fullpage footerwrap">
	<div class="wrapcenter">
		<div class="bottom">
			<p>
			</p>
		</div>
	</div>
</div>