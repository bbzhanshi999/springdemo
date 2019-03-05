package edu.nju.springdemo.sys.config.base;

import java.util.List;

public interface BaseDao<T> {

    void insert(T t);

    void update(T t);

    T  find(T condition);

    T findById(Long id);

    List<T> findList(T condition);

    List<T> findAll();

    void delete(Long id);

}
