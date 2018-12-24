package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface Admindao {
//查看账号密码
    @Select("select * from admin where username=#{username} and password=#{password}")
    public Admin find(@Param("username") String username,@Param("password") String password);
}
