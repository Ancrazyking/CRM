package com.ancrazyking.service;

import com.ancrazyking.dao.BaseDictDao;
import com.ancrazyking.pojo.BaseDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ancrazyking
 * @date 2018/5/14 12:23
 **/
@Service
public class BaseDictServiceImpl implements BaseDictService
{

    @Autowired
    private BaseDictDao baseDictDao;

    @Override
    public List<BaseDict> selectBaseDictListByCode(String code)
    {
        return baseDictDao.selectBaseDictListByCode(code);
    }
}
