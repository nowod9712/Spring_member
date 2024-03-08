package com.study.erum;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.erum.sample.Restaurant;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	
	@Autowired
	private Restaurant restaurant;
	
	@Test//4버전일때는 JUnit
	public void testExit() {
		assertNotNull(restaurant);//비어있는지 확인
		
		log.info(restaurant);
		log.info("--------------------------------");
		log.info(restaurant.getChef());
		
		//log.info를 사용하는 이유 - 개발할때는 info레벨에 맞추다가 출하할때 warning레벨로 맞추면 안보임.
		
	}
}
