package edu.nju.springdemo.app.model;

import edu.nju.springdemo.sys.config.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role extends BaseModel {
    private String roleName;

    public Role(Long id,String roleName) {
        this.roleName = roleName;
        this.id = id;
    }
}
