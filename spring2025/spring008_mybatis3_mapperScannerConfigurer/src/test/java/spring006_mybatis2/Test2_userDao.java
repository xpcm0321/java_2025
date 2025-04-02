package spring006_mybatis2;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.UserDao;
import com.company.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test2_userDao {
	@Autowired UserDao dao;
	//@Ignore
	@Test
	public void selectAll() {
		System.out.println(dao.selectAll());
	}
	@Ignore @Test
	public void insert() {
		UserDto dto = new UserDto();
		dto.setName("fourth");
		dto.setAge(44);
		System.out.println(dao.insert(dto)); // 1
	}
	@Ignore @Test
	public void selectOne() {
		System.out.println(dao.selectOne(1)); // 1
	}
	@Ignore @Test
	public void update() {
		UserDto dto = new UserDto();
		dto.setName("four");
		dto.setAge(4);
		dto.setNo(4); // 있는 번호로 수정한 거 확인	
		System.out.println(dao.update(dto));
		System.out.println(dao.selectOne(4)); // UserDto [no=4, name=four, age=4]
	}
	@Ignore @Test
	public void delete() {
		System.out.println(dao.delete(4)); // 1
	}
}
