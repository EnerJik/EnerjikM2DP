<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/conso/records" var="recordsUrl"/>
<c:url value="/conso/create" var="addUrl"/>
<c:url value="/conso/update" var="editUrl"/>
<c:url value="/conso/delete" var="deleteUrl"/>



	
	
	<title>User Records</title>
	
	<script type='text/javascript'>
	$(function() {
		$("#grid").jqGrid({
		   	url:'${recordsUrl}',
			datatype: 'json',
			mtype: 'GET',
		   	colNames:['Id', 'Home', 'Equipmenet', 'Consommation', 'Unité', 'Role'],
		   	colModel:[
		   		{name:'id',index:'id', width:55, editable:false, editoptions:{readonly:true, size:10}, hidden:true},
		   		{name:'username',index:'username', width:100, editable:true, editrules:{required:true}, editoptions:{size:10}},
		   		{name:'password',index:'password', width:100, editable:true, editrules:{required:true}, editoptions:{size:10}, edittype:'password', hidden:true},
		   		{name:'firstName',index:'firstName', width:100, editable:true, editrules:{required:true}, editoptions:{size:10}},
		   		{name:'lastName',index:'lastName', width:100, editable:true, editrules:{required:true}, editoptions:{size:10}},
		   		{name:'role',index:'role', width:50, editable:true, editrules:{required:true}, 
		   			edittype:"select", formatter:'select', stype: 'select', 
		   			editoptions:{value:"1:Admin;2:Regular"},
		   			formatoptions:{value:"1:Admin;2:Regular"}, 
		   			searchoptions: {sopt:['eq'], value:":;1:Admin;2:Regular"}}
		   	],
		   	postData: {},
			rowNum:20,
		   	rowList:[20,40,60,100,200],
		   	height: 440,
		   	autowidth: true,
			rownumbers: true,
		   	pager: '#pager',
		   	sortname: 'id',
		    viewrecords: true,
		    sortorder: "asc",
		    caption:"Records",
		    emptyrecords: "Empty records",
		    loadonce: false,
		    loadComplete: function() {},
		    jsonReader : {
		        root: "rows",
		        page: "page",
		        total: "total",
		        records: "records",
		        repeatitems: false,
		        cell: "cell",
		        id: "id"
		    }
		});

		$("#grid").jqGrid('navGrid','#pager',
				{edit:false, add:false, del:false, search:true},
				{}, {}, {}, 
				{ 	// search
					sopt:['cn', 'eq', 'ne', 'lt', 'gt', 'bw', 'ew'],
					closeOnEscape: true, 
					multipleSearch: true, 
					closeAfterSearch: true
				}
		);
		// Toolbar Search
		$("#grid").jqGrid('filterToolbar',{stringResult: true,searchOnEnter : true, defaultSearch:"cn"});
	});
	</script>

	<h1 id='banner'>System Records</h1>
	
	<div id='jqgrid'>
		<table id='grid'></table>
		<div id='pager'></div>
	</div>
	
	<div id='msgbox' title='' style='display:none'></div>