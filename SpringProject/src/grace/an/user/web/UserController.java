package grace.an.user.web;

import grace.an.user.dao.impl.UserDaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

	@Autowired 
	protected UserDaoImpl userDao;
	
}
