package amrom.vcode.db.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * user基本信息表
 * @author linjinbao66@gmail.com
 * @date 2020/3/4
 */

@Entity
@Table(name = "manager_user")
public class User extends BaseEntity implements Serializable {
    @Column(unique = true,nullable = false)
    private String username;
    private String passwd;
    private Integer isactive;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public Integer getIsactive() {
        return isactive;
    }
    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }
}
