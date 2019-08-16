package ljh.dao;

import ljh.entity.DeptEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component(value = "deptDao")
public interface DeptDao{

    int insert(DeptEntity deptEntity);

    int updateById(DeptEntity deptEntity);

    List<DeptEntity> selectById(DeptEntity deptDto);

}