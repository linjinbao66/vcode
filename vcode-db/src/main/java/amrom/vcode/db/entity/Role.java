package amrom.vcode.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/5
 */
@Entity
@Table(name = "manager_role")
public class Role extends BaseEntity {
    @Column(name = "rolename", unique = true, nullable = false)
    private String rolename;
    @Column(name = "description", unique = false, nullable = false)
    private String description;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
