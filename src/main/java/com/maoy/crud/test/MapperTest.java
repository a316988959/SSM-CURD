package com.maoy.crud.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maoy.crud.bean.Department;
import com.maoy.crud.bean.Employee;
import com.maoy.crud.dao.DepartmentMapper;
import com.maoy.crud.dao.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {

	@Autowired
	DepartmentMapper departmentMapper;

	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	SqlSession sqlSession;

	@Test
	public void testCRUD() {
		//		ApplicationContext ioc = new ClassPathXmlApplicationContext("";);
		//		ioc.getBean(DepartmentMapper.class);
		System.out.println(departmentMapper);

		//1.���벿��
		//		departmentMapper.insertSelective(new Department(null,"������"));
		//		departmentMapper.insertSelective(new Department(null,"���Բ�"));

		//2.����Ա��
		//		employeeMapper.insertSelective(new Employee(null,"Jerry","M","1231@qq.com",1));

		//3.����������Ա��
		/*for (int i = 0; i < array.length; i++) {
			employeeMapper.insertSelective(new Employee(null,"Jerry","M","1231@qq.com",1));
		}*/
		/*EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		for (int i = 0; i < 1000; i++) {
			String uid = UUID.randomUUID().toString().substring(0,5) + i;
			mapper.insertSelective(new Employee(null, uid, "M",uid + "@qq.com", 1));
		}
		System.out.println("�������");*/















	}
}
