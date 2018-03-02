package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 引导类,引导启动加载开启配置启动springboot
 * 
 * @author mengmeng梁
 *
 */
@SpringBootApplication
// 将自定义的用来解析配置项的类加载进来
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
