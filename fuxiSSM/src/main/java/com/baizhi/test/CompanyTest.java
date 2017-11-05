package com.baizhi.test;

import com.baizhi.entity.Company;
import com.baizhi.service.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.text.StyledEditorKit;
import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * create by LiangS
 * on 2017/10/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-spring.xml"})
public class CompanyTest {
    @Autowired
    private CompanyService companyService;
    @Test
    public void test(){
        Map<String, Object> all = companyService.getAll(1, 50);
        List<Company> list = (List<Company>) all.get("list");
        for (Company company : list) {
            System.out.println(company);
        }
    }
    @Test
    public void add(){
        boolean b = companyService.add(new Company("北京汇瑞安网络科技有限公司", "培训公司"));
        if (b){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }
    @Test
    public void addAll() throws IOException {
        File file = new File("F:\\ABC\\fx\\fuxiSSM\\src\\main\\resources\\培训公司.txt");
        InputStream is = new FileInputStream(file);
        Reader reader = new InputStreamReader(is,"utf-8");
        BufferedReader br = new BufferedReader(reader);
        while (true){
            String s = br.readLine();
            if (s==null) break;
            if (s.length()==0) continue;
            companyService.add(new Company(s,"培训机构"));

        }
        br.close();
    }
    @Test
    public void queryKeyWord(){
        List<Company> list = companyService.getByKeyWord("汇瑞");
        for (Company company : list) {
            System.out.println(company);
        }
    }
}
