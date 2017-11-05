package com.baizhi.dao;

import com.baizhi.entity.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * create by LiangS
 * on 2017/10/23
 */
public interface CompanyDao {

    List<Company> getAll(@Param("start") int start, @Param("size") int size);

    int insert(Company company);

    List<Company> queryByKeyWord(@Param("keyWord") String keyWord);

}
