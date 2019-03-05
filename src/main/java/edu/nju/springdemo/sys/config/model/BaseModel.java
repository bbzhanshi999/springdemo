package edu.nju.springdemo.sys.config.model;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {

    protected Long id;
    protected Date createTime;
    protected String delFlag;

    public static final String NORMAL="0";
    public static final String DELETED="1";
}
