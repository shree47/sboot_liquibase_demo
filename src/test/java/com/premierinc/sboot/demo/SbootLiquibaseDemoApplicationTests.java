


package com.premierinc.sboot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.premierinc.sboot.demo.config.SbootLiquibaseDemoApplication;

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SbootLiquibaseDemoApplication.class)
public class SbootLiquibaseDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
