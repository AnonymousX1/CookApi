package com.dteam.cookapi.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import static java.util.Collections.singletonList;

@Configuration
@EnableMongoRepositories("com.dteam.cookapi.repository")
public class MongoDBConfig extends AbstractMongoConfiguration {

    @Override
    public String getDatabaseName() {
        return "test2";
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient(singletonList(new ServerAddress("localhost", 27017)),
                singletonList(MongoCredential.createCredential("accountUser", "test2", "password".toCharArray())));
    }
}
