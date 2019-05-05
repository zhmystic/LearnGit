package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEnetity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * <P>
 * Copyright 2019 sun_car All Rights Reserved.
 * </p>
 *
 * @author zhmystic.
 * @date 2019-05-04 14:44
 * @description
 */
@RestController
public class EsController {

    @Autowired
    private UserDao userDao;

    /**
     * 添加文档
     * @param userEntity
     */
    @RequestMapping(value = "/addUser")
    public void addUser(@RequestBody UserEnetity userEntity) {
        userDao.save(userEntity);
    }

    /**
     * 查询文档
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById")
    public Optional<UserEnetity> findById(String id) {
        Optional<UserEnetity> entity = userDao.findById(id);
        return entity;
    }



}
