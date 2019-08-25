import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;

@SpringBootApplication
public class TwitterMongoApplication extends AbstractReactiveMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "Tweet";
	}
	@Bean
	public MongoClient reactiveMongoClient() {
		return MongoClients.create();
	}
	public static void main(String[] args) {
		SpringApplication.run(TwitterMongoApplication.class, args);
	}

}
