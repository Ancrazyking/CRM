package com.ancrazyking.service;

import com.ancrazyking.pojo.Customer;
import com.ancrazyking.pojo.QueryVo;
import common.utils.Page;

import javax.management.Query;
import java.util.List;

/**
 * @author Ancrazyking
 * @date 2018/5/14 16:06
 **/
public interface CustomerService
{
    //通过四个条件查询分页对象
    Page<Customer> selectPageByQueryVo(QueryVo vo);

    //通过ID查询客户
    Customer selectCustomerById(Integer id);

    //通过ID删除客户
    void  deleteCustomerById(Integer id);

    //修改客户通过ID
    void updateCustomerById(Customer customer);
}
