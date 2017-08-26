package cn.itcast.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自动映射application.properties配置文件中的配置项
 * 这些配置项的前缀为prefix指定的配置项
 * ignoreUnknownFields如果在配置文件中存在配置项，但是本类中又没有对应的属性的话要不要忽略
 *
 */
@ConfigurationProperties(prefix = "cn.itcast", ignoreUnknownFields = false)
public class ItcastProperties {

	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
