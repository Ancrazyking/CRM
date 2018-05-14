package com.ancrazyking.service;

import com.ancrazyking.dao.CustomerDao;
import com.ancrazyking.pojo.Customer;
import com.ancrazyking.pojo.QueryVo;
import common.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ancrazyking
 * @date 2018/5/14 16:07
 **/
@Service
public class CustomerServiceImpl implements CustomerService
{


    @Autowired
    private CustomerDao customerDao;

    @Override
    public Page<Customer> selectPageByQueryVo(QueryVo vo)
    {
        Page<Customer> page = new Page<>();
        //设置每页的显示的条数
        page.setSize(5);
        vo.setSize(5);
        if (null != vo)
        {
            // 判断当前页
            if (null != vo.getPage())
            {
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() - 1) * vo.getSize());
            }
            if (null != vo.getCustName() && !"".equals(vo.getCustName().trim()))
            {
                vo.setCustName(vo.getCustName().trim());
            }
            if (null != vo.getCustSource() && !"".equals(vo.getCustSource().trim()))
            {
                vo.setCustSource(vo.getCustSource().trim());
            }
            if (null != vo.getCustIndustry() && !"".equals(vo.getCustIndustry().trim()))
            {
                vo.setCustIndustry(vo.getCustIndustry().trim());
            }
            if (null != vo.getCustLevel() && !"".equals(vo.getCustLevel().trim()))
            {
                vo.setCustLevel(vo.getCustLevel().trim());
            }
            //总条数
            page.setTotal(customerDao.customerCountByQueryVo(vo));
            //当前页的记录数
            page.setRow(customerDao.selectCustomerListByQueryVo(vo));
            }
            return page;
        }


    @Override
    public void deleteCustomerById(Integer id)
    {
        customerDao.deleteCustomerById(id);
    }

    @Override
    public Customer selectCustomerById(Integer id)
    {
        return customerDao.selectCustomerById(id);
    }

    @Override
    public void updateCustomerById(Customer customer)
    {
        customerDao.updateCustomerById(customer);
    }
}

