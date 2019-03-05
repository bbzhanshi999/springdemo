package edu.nju.springdemo.app.service;

import edu.nju.springdemo.app.dao.UserDao;
import edu.nju.springdemo.app.model.User;
import edu.nju.springdemo.sys.config.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User,UserDao> {


}
