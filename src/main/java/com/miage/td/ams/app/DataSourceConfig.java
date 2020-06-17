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
		sb.append(env.getProperty("root"));
		sb.append(":");
		sb.append(env.getProperty("root"));
		sb.append("@");
		sb.append(env.getProperty("clustergruppetto-shard-00-00-yuuna5.mongodb.net"));
		sb.append(":");
		sb.append(env.getProperty("27017"));
		sb.append(",");
		sb.append(env.getProperty("clustergruppetto-shard-00-01-yuuna5.mongodb.net"));
		sb.append(":");
		sb.append(env.getProperty("27017"));
		sb.append(",");
		sb.append(env.getProperty("clustergruppetto-shard-00-02-yuuna5.mongodb.net"));
		sb.append(":");
		sb.append(env.getProperty("27017"));
		sb.append("/");
		sb.append(env.getProperty("cours"));
		sb.append("?ssl=true&replicaSet=mobilite-shard-0&authSource=admin&retryWrites=true&w=majority");
		return new SimpleMongoClientDbFactory(sb.toString());
	}

	@Bean
	public MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoDbFactory());
	}

}
