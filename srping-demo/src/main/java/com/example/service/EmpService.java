package com.example.service;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.example.bean.EmpBean;

import com.example.dao.EmployeeDao;



@Service

public class EmpService {

@Autowired

private EmployeeDao edao;

public int addEmployee(EmpBean eb)

{

return edao.addEmployee(eb);

}

public int updateEmployee(EmpBean eb)

{

return edao.updateEmployee(eb);

}

public int deleteEmployee(int id)

{

return edao.deleteEmployee(id);

}

public ArrayList<EmpBean> selectAll()

{

return edao.selectAll();

}

public EmpBean selectById(int id)

{

return edao.selectById(id);

}

}