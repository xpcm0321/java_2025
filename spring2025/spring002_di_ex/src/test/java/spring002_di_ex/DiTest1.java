package spring002_di_ex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class) // Spring ����
@ContextConfiguration(locations = "classpath:config/test1.xml") // ����

public class DiTest1 {
	@Autowired ApplicationContext context;  // 1. bean(Spring�� �����ϴ� ��ü��)
	// 2. ApplicationContext - bean �������� �Ҹ���� ����
	// 3. @Autowired ������, property �ִ��� �׽�Ʈ �� �ڵ�����, ����
	
	@Test
	public void test() {
		AnimalFarm farm = context.getBean("animalFarm", AnimalFarm.class);
		farm.print();
	}
}
