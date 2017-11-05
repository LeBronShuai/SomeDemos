package com.baizhi.service;

import com.baizhi.entity.Company;

import java.util.List;
import java.util.Map;

/**
 * create by LiangS
 * on 2017/10/23
 */
public interface CompanyService {
    Map<String,Object> getAll(int page, int size);
    boolean add(Company company);
    List<Company> getByKeyWord(String keyWord);
}
