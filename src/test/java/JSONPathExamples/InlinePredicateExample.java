package JSONPathExamples;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class InlinePredicateExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Configuration config= Configuration.defaultConfiguration();
	        List<Object> result=JsonPath.using(config)
	        .parse(new File("src/test/resources/response.json"))
	        .read("$.data[?(@.id<4 && @.first_name=='Janet')]");
			System.out.println(result.size());
			for (Object object : result) {
			System.out.println(object);	
	}

}
}
