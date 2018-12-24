package com.baizhi;

import com.baizhi.dao.Admindao;
import com.baizhi.dao.Productdao;
import com.baizhi.entity.Admin;
import com.baizhi.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class test {
@Autowired
    private Admindao admindao;
    @Autowired
    private Productdao productdao;
@Test
    public void  test(){
    Admin admin = admindao.find("123", "123");
    System.out.println(admin);
}
    @Test
    public void  test1(){
        List<Product> list = productdao.findAll();
        for(Product c:list) {
            System.out.println(c);
        }
    }
}
