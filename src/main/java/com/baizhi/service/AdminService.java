package com.baizhi.service;

import com.baizhi.entity.Admin;

public interface AdminService {
    public Admin find(String username, String password);

}
