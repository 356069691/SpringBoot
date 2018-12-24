package com.baizhi.controller;

import com.baizhi.entity.Product;
import com.baizhi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    //展示所有
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Product> list = productService.findAll();
        model.addAttribute("list",list);
        return "emplist";
    }
    //添加
    @RequestMapping("/add")
    public String add(String productname,String productsalary,String productaddr,Date productdate){
        Product product=new Product();
        product.setProductsalary(productsalary);
        product.setProductaddr(productaddr);
        product.setProductname(productname);
        product.setProductdate(productdate);
        productService.add(product);
        return "redirect:/product/findAll";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(String id){
    productService.delete(id);
    return "redirect:/product/findAll";
    }
    //修改
    @RequestMapping("/selectOne")
    public String  selectOne(String id,Model model){
        Product product = productService.selectOne(id);
        model.addAttribute("product",product);
        return "updateEmp";
    }
    @RequestMapping("/update")
    public String  update(String id, String productname, String productsalary, Date productdate,String productaddr ){
        Product p=new Product();
        p.setId(id);
        p.setProductaddr(productaddr);
        p.setProductname(productname);
        p.setProductsalary(productsalary);
        p.setProductdate(productdate);
        productService.update(p);
         return "redirect:/product/findAll";
    }
}
