package librarymanagementsystemspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystemspring.dao.UserDAOImp;
import com.capgemini.librarymanagementsystemspring.dto.UserBean;

public class UserdaoTest {
	private UserDAOImp dao = new UserDAOImp();
	 private UserBean bean = new UserBean();
			@Test
			public void testRegister() {
				bean.setEmail("manimutyala888@gmail.com");
				bean.setId(23);
				bean.setMobile(833289172);
				bean.setName("mani");
				bean.setPassword("mani@229");
				bean.setRole("admin");
				boolean status = dao.register(bean);
				Assertions.assertEquals(true,status);
			}
			
			@Test
			public void testRegister1() {
				bean.setEmail("krishna@gmail.com");
				bean.setId(34);
				bean.setMobile(898765432);
				bean.setName("krishna");
				bean.setPassword("krishna@229");
				bean.setRole("student");
				boolean status = dao.register(bean);
				Assertions.assertEquals(true,status);
			}
			
			@Test
			public void testAuth() {
				UserBean bean1 = dao.auth("mahesh@gmail.com", "Mahesh@123");
				Assertions.assertNotNull(bean1);
			}
			
			@Test
			public void testAuth1() {
				UserBean bean1 = dao.auth("jeniffer@gmail.com", "Jennifer@123");
				Assertions.assertNotNull(bean1);
			}

}
