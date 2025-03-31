package spring003_bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest3.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class) // 1. Spring ioc 컨테이너 생성
@ContextConfiguration(locations = "classpath:config/test3.xml") // 2. 설정파일경로

public class DiTest3 {
	@Autowired ApplicationContext context;
	
	@Test
	public void test() {
		AnimalFarm farm = context.getBean("animalFarm", AnimalFarm.class);
		// assertEquals("alpha>Dog-eat", farm.aniEat());
		farm.print();
	}
}
