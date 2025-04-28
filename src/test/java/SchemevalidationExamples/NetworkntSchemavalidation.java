package SchemevalidationExamples;


import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class NetworkntSchemavalidation 
{
	public static void main(String[] args)throws IOException
	{
	ObjectMapper mapper= new ObjectMapper();

	InputStream schemaInput=new FileInputStream("src/test/resources/Schema.json");
	JsonNode node=mapper.readTree(new File("src/test/resources/response.json"));
	JsonSchemaFactory factory=JsonSchemaFactory.getInstance(VersionFlag.V4);
	JsonSchema schema=factory.getSchema(schemaInput);
	Set<ValidationMessage> result=schema.validate(node);
	
	if(result.isEmpty())
	{
		System.out.println("Validation Successful");
		
	}
	else {
		for (ValidationMessage message : result) {
			System.out.println(message);
		}
	}
	 
	 
	}
}
