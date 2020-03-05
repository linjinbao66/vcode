package amrom.vcode.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/5
 * 菜单分类
 */
@Entity
@Table(name = "db_menutype")
public class MenuType extends BaseEntity{

    @Column(name = "typeName", nullable = false, columnDefinition = "varchar(50) comment '菜单分类名称'")
    private String typeName;
    @Column(name = "descrption",nullable = true, columnDefinition = "varchar(100) comment '菜单分类描述'")
    private String descrption;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
}
