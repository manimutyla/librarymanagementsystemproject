package librarymanagementsystemspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.librarymanagementsystemspring.dto.UserBean;
import com.capgemini.librarymanagementsystemspring.service.UserService;
import com.capgemini.librarymanagementsystemspring.service.UserServiceImp;

public class UserServiceTest {
	@Autowired
	private UserService service ;
		@Test
		public void testRegister() {
			UserBean bean = new UserBean();
			bean.setEmail("manimutyala888@gmail.com");
			bean.setId(12);
			bean.setMobile(833289172);
			bean.setName("mani");
			bean.setPassword("mani@229");
			bean.setRole("admin");
			boolean status = service.register(bean);
			Assertions.assertEquals(true,status);
		}
		
		@Test
		public void testRegister1() {
			UserBean bean = new UserBean();
			bean.setEmail("krishna@gmail.com");
			bean.setId(66);
			bean.setMobile(898765432);
			bean.setName("krishna");
			bean.setPassword("krishna@229");
			bean.setRole("student");
			boolean status = service.register(bean);
			Assertions.assertEquals(true,status);
		}
		
		@Test
		public void testAuth() {
			UserBean bean1 = service.auth("manimutyala888@gmail.com", "mani@229");
			Assertions.assertNotNull(bean1);
		}
		
		@Test
		public void testAuth1() {
			UserBean bean1 = service.auth("krishna@gmail.com", "krishna@229");
			Assertions.assertNotNull(bean1);
		}


}
