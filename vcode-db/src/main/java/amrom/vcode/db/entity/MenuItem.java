package amrom.vcode.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/5
 * 菜单表
 */
@Entity
@Table(name = "db_menuitem")
public class MenuItem extends BaseEntity{
    @Column(name = "menuname",nullable = false,columnDefinition = "varchar(100) comment '菜单名称' ")
    private String menuName;
    @Column(name = "fatherid",columnDefinition = "int(11) comment '父菜单id' ")
    private Integer fatherid;
    @Column(name = "menutypeid",columnDefinition = "int(11) comment '分类' ")
    private Integer menutypeid;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getFatherid() {
        return fatherid;
    }

    public void setFatherid(Integer fatherid) {
        this.fatherid = fatherid;
    }

    public Integer getMenutypeid() {
        return menutypeid;
    }

    public void setMenutypeid(Integer menutypeid) {
        this.menutypeid = menutypeid;
    }
}
