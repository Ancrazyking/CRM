package com.ancrazyking.controller;

import com.ancrazyking.pojo.BaseDict;
import com.ancrazyking.pojo.Customer;
import com.ancrazyking.pojo.QueryVo;
import com.ancrazyking.service.BaseDictService;
import com.ancrazyking.service.CustomerService;
import common.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ancrazyking
 * @date 2018/5/14 12:25
 **/
@Controller
@RequestMapping("/customer")
public class CustomerController
{


    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private CustomerService customerService;

    @Value("${CUSTOMER_FROM_TYPE}")
    private String CUSTOMER_FROM_TYPE;


    @Value("${CUSTOMER_INDUSTRY_TYPE}")
    private String CUSTOMER_INDUSTRY_TYPE;

    @Value("${CUSTOMER_LEVEL_TYPE}")
    private String CUSTOMER_LEVEL_TYPE;

    @RequestMapping("/list")
    public String list(QueryVo vo,Model model){
        List<BaseDict> fromType=baseDictService.selectBaseDictListByCode(CUSTOMER_FROM_TYPE);
        List<BaseDict> industryType=baseDictService.selectBaseDictListByCode(CUSTOMER_INDUSTRY_TYPE);
        List<BaseDict> levelType=baseDictService.selectBaseDictListByCode(CUSTOMER_LEVEL_TYPE);
        model.addAttribute("fromType",fromType);
        model.addAttribute("industryType",industryType);
        model.addAttribute("levelType",levelType);


        Page<Customer> page=customerService.selectPageByQueryVo(vo);
        model.addAttribute("page",page);


        return "customer";
    }


    @RequestMapping("/edit")
    @ResponseBody
    public  Customer edit(Integer id){
        return  customerService.selectCustomerById(id);
    }



    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Integer id){
        customerService.deleteCustomerById(id);
        return "OK";
    }


    @RequestMapping("/update")
    @ResponseBody
    public String update(Customer customer){
        customerService.updateCustomerById(customer);
        return "OK";
    }



}
