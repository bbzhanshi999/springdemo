package edu.nju.springdemo.sys.config.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.nju.springdemo.sys.config.base.BaseDao;
import edu.nju.springdemo.sys.config.model.BaseModel;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<E extends BaseModel,D extends BaseDao<E>> {

    @Autowired
    protected D dao;

    public E find(E e){
        return dao.find(e);
    }


    public E findById(Long id){
        return  dao.findById(id);
    }

    public List<E> findList(E e){
        return dao.findList(e);
    }

    public List<E> findAll(){
        return dao.findAll();
    }

    public void delete(Long id){
        dao.delete(id);
    }

    public void save(E e){
        if(e.getId()==null){
            dao.insert(e);
        }else{
            dao.update(e);
        }
    }

    public PageInfo<E> pageInfo(Integer pageNum,Integer pageSize,E e){
        PageHelper.startPage(pageNum!=null?pageNum:1,pageSize!=null?pageSize:10);
        List<E> list = dao.findList(e);
        return new PageInfo<>(list);
    }

}
