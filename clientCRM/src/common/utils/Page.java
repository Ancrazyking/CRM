package common.utils;

import java.util.List;

/**
 * @author Ancrazyking
 * @date 2018/5/14 15:14 **/
public class Page<T>
{
    //总条数
    private int total;

    //当前页数
    private int page;

    //每页的条数
    private int size;

    //分页后的结果集
    private List<T> row;

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public List<T> getRow()
    {
        return row;
    }

    public void setRow(List<T> row)
    {
        this.row = row;
    }
}
