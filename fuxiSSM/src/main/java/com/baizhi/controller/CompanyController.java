package com.baizhi.controller;

import com.baizhi.entity.Company;
import com.baizhi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.plugin2.message.GetAppletMessage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create by LiangS
 * on 2017/10/23
 */
@Controller
@RequestMapping("company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @RequestMapping("getAll")
    @ResponseBody
    public Map<String,Object> getAll(int page){
        Map<String,Object> map = new HashMap<>();
        return companyService.getAll(page, 8);
    }
    @RequestMapping("getAllByKeyWord")
    @ResponseBody
    public List<Company> getAllByKeyWord(String keyWord){
        List<Company> list = companyService.getByKeyWord(keyWord);
        return list;
    }
}
