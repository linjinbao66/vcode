package amrom.vcode.db.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/5
 * 分组表
 */
@Entity
@Table(name = "db_group")
public class Group extends BaseEntity{
    private String groupName;
    private String description;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
