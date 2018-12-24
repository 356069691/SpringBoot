package com.baizhi.dao;

import com.baizhi.entity.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Productdao {
    //展示所有
    @Select("select * from product")
    public List<Product> findAll();
    //添加
    @Insert("insert into product values(#{id},#{productname},#{productsalary},#{productdate},#{productaddr})")
    public void add(Product product);
    //删除
    @Delete("delete from product where id=#{id}")
    public void delete(String id);
    //修改
    @Select("select * from product where id=#{id}")
    public Product selectOne(String id);
    @Update("update product set productname=#{productname},productsalary=#{productsalary},productdate=#{productdate},productaddr=#{productaddr} where id=#{id}")
    public void update(Product product);
}
