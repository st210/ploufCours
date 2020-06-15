package com.miage.td.ams.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class DataSourceConfig {

	private Environment env;

	@Bean
	public MongoDbFactory mongoDbFactory() {
		StringBuilder sb = new StringBuilder();
		sb.append("mongodb://");
		sb.append(env.getProperty("MONGO_USER"));
		sb.append(":");
		sb.append(env.getProperty("MONGO_PASSWORD"));
		sb.append("@");
		sb.append(env.getProperty("MONGO_SERVER_PRIMARY"));
		sb.append(":");
		sb.append(env.getProperty("MONGO_PORT"));
		sb.append(",");
		sb.append(env.getProperty("MONGO_SERVER_SECONDARY"));
		sb.append(":");
		sb.append(env.getProperty("MONGO_PORT"));
		sb.append(",");
		sb.append(env.getProperty("MONGO_SERVER_SECONDARY_REPLICA"));
		sb.append(":");
		sb.append(env.getProperty("MONGO_PORT"));
		sb.append("/");
		sb.append(env.getProperty("MONGO_COLLECTION"));
		sb.append("?ssl=true&replicaSet=mobilite-shard-0&authSource=admin&retryWrites=true&w=majority");
		return new SimpleMongoClientDbFactory(sb.toString());
	}

	@Bean
	public MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoDbFactory());
	}

}
