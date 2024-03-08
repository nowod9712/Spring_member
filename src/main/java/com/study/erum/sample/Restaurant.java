package com.study.erum.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component//함수나 클래스를 집어 넣을때 사용
@Data
public class Restaurant {
	
	@Autowired //변수를 주입할때 사용
	private Chef chef;
	

}
