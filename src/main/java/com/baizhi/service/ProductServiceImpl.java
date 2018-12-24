package com.baizhi.service;

import com.baizhi.dao.Productdao;
import com.baizhi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private Productdao productdao;
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Product> findAll() {
        return productdao.findAll();
    }

    @Override
    public void add(Product product) {
        String id = UUID.randomUUID().toString();
        product.setId(id);
        productdao.add(product);
    }

    @Override
    public void delete(String id) {
        productdao.delete(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public Product selectOne(String id) {
        return productdao.selectOne(id);
    }

    @Override
    public void update(Product product) {
        productdao.update(product);
    }
}
