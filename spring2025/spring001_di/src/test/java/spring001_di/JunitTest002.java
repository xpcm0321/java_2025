package spring001_di;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest.Calc;
import com.company.ioctest.MyArea;

@RunWith(SpringJUnit4ClassRunner.class) // 1. Spring ioc �����̳� ����
@ContextConfiguration(locations = "classpath:config/beans002.xml") // 2. �������ϰ��
public class JunitTest002 {
	@Autowired ApplicationContext context; // 3. Bean (spring�� �����ϴ� ��ü)
	// ApplicationContext - bean ���, ����, ��ȸ, ��ȯ����
	// @Autowired - ��ü�� �ִ��� �˻��ϰ� �ִٸ� �ڵ����� ����
	
	@Test
	//@Ignore
	public void test1() {
		MyArea myArea = context.getBean("myArea", MyArea.class);
		// �����1 : assertEquals("����", "ó���Ұ�");
		assertEquals("alpha>100.0", myArea.myCalc(10, 10));
	}
	
	//@Test
	@Ignore
	public void test2() {
		MyArea area1 = context.getBean("myArea", MyArea.class);
		MyArea area2 = context.getBean("myArea", MyArea.class);
		// �����2 : assertSame(area1, area2);
		assertSame(area1, area2);
	}
}
