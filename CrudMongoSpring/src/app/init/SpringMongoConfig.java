package app.init;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "app.repositories")
public class SpringMongoConfig  extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "crud2";
	}

	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return new MongoClient("127.0.0.1");
	}

	@Override
	protected String getMappingBasePackage() {
		// TODO Auto-generated method stub
		return "app.repositories";
	}

	
}
