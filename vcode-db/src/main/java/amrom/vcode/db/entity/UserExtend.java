package amrom.vcode.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/5
 */
@Entity
@Table(name = "manager_user_extend")
public class UserExtend extends BaseEntity {
    @Column(name = "userid",nullable = false,columnDefinition = "int(11) comment '用户id'")
    private Integer userid;
    @Column(name = "sex", columnDefinition = "int(1) default 0 comment '性别0:男1女'")
    private Integer sex;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "groupid", columnDefinition = "int(11) comment '所属分组'")
    private Integer groupid;
    @Column(name = "roleid", columnDefinition = "int(11) comment '角色分组'")
    private Integer roleid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}
