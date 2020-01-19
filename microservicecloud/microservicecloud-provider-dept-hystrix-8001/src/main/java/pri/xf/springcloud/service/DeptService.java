package pri.xf.springcloud.service;

import java.util.List;
import pri.xf.springcloud.model.Dept;


public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(long id);

    public List<Dept> list();
}
