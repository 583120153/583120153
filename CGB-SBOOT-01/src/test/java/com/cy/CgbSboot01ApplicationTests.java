package com.cy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * @SpringBootTest 描述的类为一个单元测试类，并且此类也会交给spring容器管理。
 */
@SpringBootTest
class CgbSboot01ApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("hello spring boot");
	}

}
