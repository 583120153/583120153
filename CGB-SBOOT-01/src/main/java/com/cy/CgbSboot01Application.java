package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 使用框架最重要是：尊重规范，尊重规则。
 * 项目启动时默认创建的项目启动类(对于基于SpringBoot创建的项目，启动类只能有一个)，此类会使用
 * @SpringBootApplication 注解进行描述(这个注解用于告诉底层这个类是启动类)。
 */
@SpringBootApplication
public class CgbSboot01Application {
	public static void main(String[] args) {
		//读取CgbSboot01Application类上的标识(例如注解)，基于标识的描述，初始化spring boot系统资源
		//1)对系统进行默认配置(由spring boot的自动配置机制设计和实现)
		//2)扫描启动类所在包以及子包中的类，然后进行加载，配置，初始化。
		SpringApplication.run(CgbSboot01Application.class, args);
	}//klklklkldasdasdasdasdasdas
}	//2222222222222222222222
