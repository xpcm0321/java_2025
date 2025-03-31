package spring003_bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest1.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class) // Spring 구동
@ContextConfiguration(locations = "classpath:config/test1.xml") // 설정
// @ContextConfiguration(locations = "classpath:config/test2.xml") // 2. 설정파일경로

public class DiTest1 {
	@Autowired ApplicationContext context;  // 1. bean(Spring이 관리하는 객체들)
	// 2. ApplicationContext - bean 생성부터 소멸까지 관리
	// 3. @Autowired 생성자, property 있는지 테스트 후 자동연결, 적용
	
	@Test
	public void test() {
		AnimalFarm farm = context.getBean("animalFarm", AnimalFarm.class);
		// assertEquals("alpha>Dog-eat", farm.aniEat());
		farm.print();
	}
}
