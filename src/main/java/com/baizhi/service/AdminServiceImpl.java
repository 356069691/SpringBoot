package com.baizhi.service;

import com.baizhi.dao.Admindao;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private Admindao dao;
    @Override
    public Admin find(String username, String password) {
        return dao.find(username,password);
    }
}
