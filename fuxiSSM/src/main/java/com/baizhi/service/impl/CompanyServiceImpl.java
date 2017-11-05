package com.baizhi.service.impl;

import com.baizhi.dao.CompanyDao;
import com.baizhi.entity.Company;
import com.baizhi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create by LiangS
 * on 2017/10/23
 */
@Service
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyDao companyDao;
    public Map<String,Object> getAll(int page, int size) {
        Map<String,Object> map = new HashMap<>();
        int start = page*size-size;
        List<Company> all = companyDao.getAll(start, size);
        map.put("list",all);
        map.put("page",page);
        return map;
    }

    public boolean add(Company company) {
        int i = companyDao.insert(company);
        if(i==1) return true;
        return false;
    }

    public List<Company> getByKeyWord(String keyWord) {
        return companyDao.queryByKeyWord(keyWord);
    }
}
