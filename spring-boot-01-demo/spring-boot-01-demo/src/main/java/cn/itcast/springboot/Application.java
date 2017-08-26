package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import cn.itcast.springboot.properties.ItcastProperties;

/**
 * @SpringBootApplication组合注解：如果使用spring boot这是必须的；默认扫描当前类所在的包及其子包的spring注解
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(ItcastProperties.class)//生效配置对象
public class Application {//Application任意写

	public static void main(String[] args) {
		//启动的时候会在控制台输出spring logo字符串
		//SpringApplication.run(Application.class, args);
		//如果不需要spring 的logo字符串输出到控制台的话，可以如下配置：
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setBannerMode(Mode.OFF);//不显示
		springApplication.run(args);
	}
}
