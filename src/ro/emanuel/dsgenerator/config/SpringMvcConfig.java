package ro.emanuel.dsgenerator.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import ro.emanuel.dsgenerator.dao.MetadataDAO;
import ro.emanuel.dsgenerator.dao.MetadataDAOImpl;
import ro.emanuel.dsgenerator.dao.StudentDAO;
import ro.emanuel.dsgenerator.dao.StudentDAOImpl;

@Configuration
@EnableWebMvc
@ComponentScan (basePackages = "ro.emanuel.dsgenerator")
public class SpringMvcConfig implements WebMvcConfigurer {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ds-generator");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return resolver;
	}
	
	@Bean
	public StudentDAO getStudentDAO() {
		return new StudentDAOImpl(getDataSource());
	}

	@Bean
	public MetadataDAO getMetadataDAO() {
		return new MetadataDAOImpl(getDataSource());
	}
}
