package br.com.empresa.infrastructure.config;

import gumga.framework.application.GumgaRepositoryFactoryBean;

import java.util.Properties;

import gumga.framework.application.spring.config.DatabaseConfigSupport;
import gumga.framework.domain.GumgaQueryParserProvider;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"br.com.empresa", "gumga.framework"})
@EnableJpaRepositories(repositoryFactoryBeanClass = GumgaRepositoryFactoryBean.class, basePackages = {"br.com.empresa", "gumga.framework"})
@EnableTransactionManagement(proxyTargetClass = true)
public class Application {

    @Bean
    public static PropertyPlaceholderConfigurer dataConfigPropertyConfigurer() {
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setSearchSystemEnvironment(true);
        return configurer;
    }

    @Bean
    public static DataSource dataSource() {
        return new DatabaseConfigSupport().getDataSourceProvider(DatabaseConfigSupport.Database.MYSQL).
                createDataSource("jdbc:mysql://localhost:3306/erpfatecie", "root", "root");
    }

    @Bean
    @Autowired
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        Properties properties = new Properties();
        properties.put("eclipselink.weaving", "false");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.ejb.naming_strategy", "org.hibernate.cfg.EJB3NamingStrategy");
        properties.put("hibernate.show_sql", "false");
        properties.put("hibernate.format_sql", "false");
        properties.put("hibernate.connection.charSet", "UTF-8");
        properties.put("hibernate.connection.characterEncoding", "UTF-8");
        properties.put("hibernate.connection.useUnicode", "true");
        properties.put("hibernate.jdbc.batch_size", "55");
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("gumga.framework.domain","br.com.empresa");
        factory.setDataSource(dataSource);
        factory.setJpaProperties(properties);
        factory.afterPropertiesSet();
        return factory;
    }

    @Bean
    @Autowired
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }

}
