package pri.xf.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor //全参构造
@NoArgsConstructor //无构造
@Data
@Accessors(chain = true)
public class Dept implements Serializable { //1.必须序列化  2.Dept orm mysql->Dept(table)类关系映射

    private long id; //主键
    private String dname; //部门名称
    private String db_source;//来自哪个数据库，因为微服务架构可以一个服务对要一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
