package com.baizhi.service;

import com.baizhi.entity.Product;

import java.util.List;

public interface ProductService {
    //展示所有
    public List<Product> findAll();
    //添加
    public void add(Product product);
    //删除
    public void delete(String id);
    //修改
    public Product selectOne(String id);
    public void update(Product product);
}
