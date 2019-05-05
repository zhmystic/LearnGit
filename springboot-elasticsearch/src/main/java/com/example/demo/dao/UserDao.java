package com.example.demo.dao;

import com.example.demo.entity.UserEnetity;
import org.springframework.data.repository.CrudRepository;

/**
 * <P>
 * Copyright 2019 sun_car All Rights Reserved.
 * </p>
 *
 * @author zhmystic.
 * @date 2019-05-04 14:43
 * @description
 */
public interface UserDao extends CrudRepository<UserEnetity,String> {


}
