package com.ujf.m2miage.enerjikdp.controleur;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ujf.m2miage.enerjikdp.model.User;
import com.ujf.m2miage.enerjikdp.response.JqgridResponse;
import com.ujf.m2miage.enerjikdp.utils.JqgridFilter;
import com.ujf.m2miage.enerjikdp.utils.JqgridObjectMapper;
@Controller
@RequestMapping("/conso")
public class ConsoController {
	
	@RequestMapping
	public String getUsersPage() {
		return "consodetails";
	}
	
	@RequestMapping(value="/records", produces="application/json")
	public @ResponseBody JqgridResponse<User> records(
    		@RequestParam("_search") Boolean search,
    		@RequestParam(value="filters", required=false) String filters,
    		@RequestParam(value="page", required=false) Integer page,
    		@RequestParam(value="rows", required=false) Integer rows,
    		@RequestParam(value="sidx", required=false) String sidx,
    		@RequestParam(value="sord", required=false) String sord) {

		List<User> userDtos = new ArrayList<User>();
		User user = new User("sername", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername1", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);	user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);	user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);	user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);	user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername2", "firstName", "lastName", null);
		userDtos.add(user);
		user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);
		user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);user = new User("sername4545", "firstName444554", "lastName64646464", null);
		userDtos.add(user);
		JqgridResponse<User> response = new JqgridResponse<User>();
		response.setRows(userDtos);
		response.setRecords(Long.valueOf(userDtos.size()).toString());
		response.setTotal(Integer.valueOf(userDtos.size()/5).toString());
		response.setPage(Integer.valueOf(+1).toString());
		return response;
	}
	
	/**
	 * Helper method for returning filtered records
	 */
	public JqgridResponse<User> getFilteredRecords(String filters) {
		String qUsername = null;
		String qFirstName = null;
		String qLastName = null;
		Integer qRole = null;
		
		JqgridFilter jqgridFilter = JqgridObjectMapper.map(filters);
		for (JqgridFilter.Rule rule: jqgridFilter.getRules()) {
			if (rule.getField().equals("username"))
				qUsername = rule.getData();
			else if (rule.getField().equals("firstName"))
				qFirstName = rule.getData();
			else if (rule.getField().equals("lastName"))
				qLastName = rule.getData();
			else if (rule.getField().equals("role"))
				qRole = Integer.valueOf(rule.getData());
		}
	
		List<User> userDtos = new ArrayList<User>();
		JqgridResponse<User> response = new JqgridResponse<User>();
		response.setRows(userDtos);
		response.setRecords(Long.valueOf(5).toString());
		response.setTotal(Integer.valueOf(userDtos.size()/5).toString());
		response.setPage(Integer.valueOf(1).toString());
		return response;
	}
	
	@RequestMapping(value="/get", produces="application/json")
	public @ResponseBody User get(@RequestBody User user) {
		return new User("sername", "firstName", "lastName", null);
	}

}
