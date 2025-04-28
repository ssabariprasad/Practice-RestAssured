package JSONPathExamples;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterPredicateExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Filter filter=Filter.filter(Criteria.where("id").lt(4).and("first_name").is("Janet"));
		
		Configuration config= Configuration.defaultConfiguration();
        List<Map<String,Object>> result=JsonPath.using(config)
        .parse(new File("src/test/resources/response.json"))
        .read("$.data[?]",filter);
		System.out.println(result.size());
		System.out.println(result.get(0).get("email"));	
}

	}


