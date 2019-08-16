package ljh.dao;


import ljh.entity.EmployeeEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Repository
public interface EmployeeDao{

    int insert(EmployeeEntity employeeEntity);

    int updateById(EmployeeEntity employeeEntity);

    List<EmployeeEntity> selectById(EmployeeEntity employeeDto);

    int deleteByPrimaryKey(Integer empId);

}