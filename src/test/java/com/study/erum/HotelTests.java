package com.study.erum;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.erum.sample.Restaurant;
import com.study.erum.sample.SampleHotel;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HotelTests {

	@Autowired
	private SampleHotel hotel;
	
	@Test//4버전일때는 JUnit 5버전일때는 Jupiter
	public void testExit() {
		assertNotNull(hotel);//비어있는지 확인
		
		log.info(hotel);
		log.info("--------------------------------");
		log.info(hotel.getChef());
		
		//log.info를 사용하는 이유 - 개발할때는 info레벨에 맞추다가 출하할때 warning레벨로 맞추면 안보임.
		
	}
}
