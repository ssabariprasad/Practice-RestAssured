package JSONPathExamples;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class ReadJSONSimple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Configuration config= Configuration.defaultConfiguration();
        List<Object> result=JsonPath.using(config).parse(new File("src/test/resources/response.json")).read("$..email");
		System.out.println(result.size());
		for (Object object : result) {
		System.out.println(object);	
		}
		
	}

}
