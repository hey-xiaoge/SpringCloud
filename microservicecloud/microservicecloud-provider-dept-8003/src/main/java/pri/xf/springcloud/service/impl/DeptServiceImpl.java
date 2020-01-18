package pri.xf.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.xf.springcloud.dao.DeptDao;
import pri.xf.springcloud.model.Dept;
import pri.xf.springcloud.service.DeptService;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }


    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }


    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }


}
