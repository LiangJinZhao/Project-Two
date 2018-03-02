package cn.itcast.springboot.dataSource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataSourceConfiguration {

	@Bean(name = "dataSource")
	@Primary
	@ConfigurationProperties(prefix = "druid")
	public DataSource getDataSource() {
		return DataSourceBuilder.create().type(DruidDataSource.class).build();
	}

}
