package com.ancrazyking.dao;

import com.ancrazyking.pojo.BaseDict;

import java.util.List;

/**
 * @author Ancrazyking
 * @date 2018/5/14 12:06
 **/
public interface BaseDictDao
{

    List<BaseDict> selectBaseDictListByCode(String code);
}
