package spring003_bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest1.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class) // Spring ����
@ContextConfiguration(locations = "classpath:config/test1.xml") // ����
// @ContextConfiguration(locations = "classpath:config/test2.xml") // 2. �������ϰ��

public class DiTest1 {
	@Autowired ApplicationContext context;  // 1. bean(Spring�� �����ϴ� ��ü��)
	// 2. ApplicationContext - bean �������� �Ҹ���� ����
	// 3. @Autowired ������, property �ִ��� �׽�Ʈ �� �ڵ�����, ����
	
	@Test
	public void test() {
		AnimalFarm farm = context.getBean("animalFarm", AnimalFarm.class);
		// assertEquals("alpha>Dog-eat", farm.aniEat());
		farm.print();
	}
}
