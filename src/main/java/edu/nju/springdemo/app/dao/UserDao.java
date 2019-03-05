package edu.nju.springdemo.app.dao;

import edu.nju.springdemo.app.model.User;
import edu.nju.springdemo.sys.config.base.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseDao<User> {
}
