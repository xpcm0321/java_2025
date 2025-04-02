package spring005_ex_board;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.BoardDao;
import com.company.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test2_boardDao {
	@Autowired ApplicationContext context;
	@Autowired DataSource dataSource;
	@Autowired BoardDao dao;
	
	@Test
	public void test() throws UnknownHostException {
		// 5. delete
//		BoardDto dto = new BoardDto();
//		dto.setBpass("2222");
//		dto.setBno(2);
//		System.out.println(dao.delete(dto));
		
		// 4. update
//		BoardDto dto = new BoardDto();
//		dto.setBtitle("title2-new");
//		dto.setBpass("2222");
//		dto.setBcontent("content2-new");
//		dto.setBno(2);
//		System.out.println(dao.update(dto));
		
		// 3. selectOne
//		System.out.println(dao.updateHit(2));
//		System.out.println(dao.select(2));
		
		// 2. insert
//		BoardDto dto = new BoardDto();
//		dto.setBname("second");
//		dto.setBtitle("title2");
//		dto.setBpass("2222");
//		dto.setBcontent("content2");
//		dto.setBip(InetAddress.getLocalHost().getHostAddress());
//		System.out.println(dao.insert(dto));
		// 1. selectAll
		System.out.println(dao.selectAll());
	}
}
