package com.ancrazyking.pojo;

import common.utils.Page;

/**
 * @author Ancrazyking
 * @date 2018/5/14 15:31
 **/
public class QueryVo
{
    private String CustName;
    private String CustSource;
    private String CustIndustry;
    private String CustLevel;

    //当前页
    private Integer page;
    //每页数
    private Integer size=10;
    //开始行
    private Integer startRow=0;

    public String getCustName()
    {
        return CustName;
    }

    public void setCustName(String custName)
    {
        CustName = custName;
    }

    public String getCustSource()
    {
        return CustSource;
    }

    public void setCustSource(String custSource)
    {
        CustSource = custSource;
    }

    public String getCustIndustry()
    {
        return CustIndustry;
    }

    public void setCustIndustry(String custIndustry)
    {
        CustIndustry = custIndustry;
    }

    public String getCustLevel()
    {
        return CustLevel;
    }

    public void setCustLevel(String custLevel)
    {
        CustLevel = custLevel;
    }

    public Integer getPage()
    {
        return page;
    }

    public void setPage(Integer page)
    {
        this.page = page;
    }

    public Integer getSize()
    {
        return size;
    }

    public void setSize(Integer size)
    {
        this.size = size;
    }

    public Integer getStartRow()
    {
        return startRow;
    }

    public void setStartRow(Integer startRow)
    {
        this.startRow = startRow;
    }
}
