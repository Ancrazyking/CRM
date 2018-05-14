package com.ancrazyking.dao;

import com.ancrazyking.pojo.Customer;
import com.ancrazyking.pojo.QueryVo;
import common.utils.Page;

import javax.management.Query;
import java.util.List;

/**
 * @author Ancrazyking
 * @date 2018/5/14 15:55
 **/
public interface CustomerDao
{
    /**
     * 查询客户的的总条数,为什么要查询客户的总条数呢
     * 因为分页要用啊,傻吊
     * 不查到总条数怎么对结果进行分页
     * Page.total(Field)
     * @param vo
     * @return
     */
   Integer customerCountByQueryVo(QueryVo vo);


    /**
     * 查询所有的结果集
     * 查询符合条件的所有结果集
     * @param vo
     * @return
     */
    List<Customer> selectCustomerListByQueryVo(QueryVo vo);

    Customer selectCustomerById(Integer id);

    void deleteCustomerById(Integer id);


    void updateCustomerById(Customer customer);
}
