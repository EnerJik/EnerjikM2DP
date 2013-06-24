<script type="text/javascript">
var datasGen;
$(document).ready(function(){
	var data =
		{
		"home1": {
		    chart: {
		        type: 'line',
		        marginRight: 130,
		        marginBottom: 25
		    },
		    title: {
		    	text: 'Consommation des équipement dans la maison 2000905',
		        x: -20
		    },
		    xAxis: {
		        categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun','Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
		    },
		    yAxis: {
		        title: {
		            text: 'Comsommation (Wh)'
		        },
		        plotLines: [{
		            value: 0,
		            width: 1,
		            color: '#808080'
		        }]
		    },
		    tooltip: {
		        valueSuffix: 'Wh'
		    },
		    legend: {
		        layout: 'vertical',
		        align: 'right',
		        verticalAlign: 'top',
		        x: -10,
		        y: 100,
		        borderWidth: 0
		    },
		    series: [{
		        name: 'Halogen lamp 4',
		        data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 0, 9.6]
		    }, {
		        name: 'Chest freezer (273l)',
		        data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]
		    }]
			},
			"home2": {
			    chart: {
			        type: 'line',
			        marginRight: 130,
			        marginBottom: 25
			    },
			    title: {
			        text: 'Consommation des équipement dans la maison 2000903',
			        x: -20
			    },
	
			    xAxis: {
			        categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun','Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
			    },
			    yAxis: {
			        title: {
			            text: 'Consommation (Wh)'
			        },
			        plotLines: [{
			            value: 0,
			            width: 1,
			            color: '#808080'
			        }]
			    },
			    tooltip: {
			        valueSuffix: 'Wh'
			    },
			    legend: {
			        layout: 'vertical',
			        align: 'right',
			        verticalAlign: 'top',
			        x: -10,
			        y: 100,
			        borderWidth: 0
			    },
			    series: [{
			        name: 'Site consumption ()',
			        data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
			    }, {
			        name: 'Halogen lamp 1 ()',
			        data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]
			    }]
				}
	       };
		datasGen = data;
		graph(datasGen.home1);
});

function graph(data){
	$('#container').highcharts(data);
}
function combo(thelist)
{
  var idx = thelist.selectedIndex;
  var content = thelist.options[idx].innerHTML;
  console.log(content);
  if(content == "home1"){
  	graph(datasGen.home1);
  }
  else if(content == "home2"){
	  graph(datasGen.home2);
  }
}
 </script>
<div>
	<select name="thelist" onChange="combo(this)">
		  <option>home1</option>
		  <option>home2</option>
		  <option></option>
	</select>
</div>
<div id="container" style="min-width: 400px; height: 400px; margin: 0 auto">

</div>
