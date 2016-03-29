package com.dteam.cookapi.config;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.net.UnknownHostException;
import java.util.Properties;

@Configuration
@PropertySource("classpath:application.properties")
//@EnableTransactionManagement
//@EnableJpaRepositories("com.dteam.cookapi.repository")
@EnableSpringDataWebSupport
public class DatabaseConfig {

    @Resource
    private Environment env;


//    @Bean
//    public DataSource dataSource() {
//
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .setName(env.getRequiredProperty("db.name"))
//                .build();
//    }

//    @Bean
//    public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//        factory.setPackagesToScan("com.dteam.cookapi.domain");
//        factory.setDataSource(dataSource);
//        factory.setJpaProperties(jpaProperties());
//        factory.afterPropertiesSet();
//
//        return factory.getObject();
//    }

//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
//
//        JpaTransactionManager txManager = new JpaTransactionManager();
//        txManager.setEntityManagerFactory(emf);
//
//        return txManager;
//    }
//
//    private Properties jpaProperties() {
//
//        Properties props = new Properties();
//        props.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
//        props.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
//        props.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
//        props.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
//
//        return props;
//    }

}
