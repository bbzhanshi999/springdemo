package edu.nju.springdemo.app.model;


import edu.nju.springdemo.sys.config.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseModel {


    private String username;
    private String password;
    private String name;
    private String phone;

    private List<Role> roles;

}
