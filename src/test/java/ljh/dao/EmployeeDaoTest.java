package ljh.dao;

import ljh.dao.EmployeeDao;
import ljh.entity.EmployeeEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:mybatis/SqlMapConfig.xml", "classpath:spring/applicationContext.xml" })
public class EmployeeDaoTest {

    @Autowired
    private EmployeeDao employeeDao;

    private EmployeeEntity employeeEntity = new EmployeeEntity();

    @Test
    public void insert() {

        for(int i = 1; i <= 100; i++){
            employeeEntity.setdId(1);
            employeeEntity.setEmpName("陈奕迅");
            employeeEntity.setEmail("chenyixun@163.com");
            employeeEntity.setGender("1");
            int result = employeeDao.insert(employeeEntity);
            System.out.println(result);
        }

    }

    @Test
    public void updateById() {
        employeeEntity.setdId(1);
        employeeEntity.setEmpName("刘若英");
        employeeEntity.setEmail("liuruoying@163.com");
        employeeEntity.setEmpId(1);
        employeeEntity.setGender("0");
        int result = employeeDao.updateById(employeeEntity);
        System.out.println(result);

    }

}