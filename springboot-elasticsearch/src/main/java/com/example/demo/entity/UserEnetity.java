package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * <P>
 * Copyright 2019 sun_car All Rights Reserved.
 * </p>
 *
 * @author zhmystic.
 * @date 2019-05-04 14:37
 * @description
 */
@Document(indexName = "mytest",type = "user")
@Data
public class UserEnetity {

    @Id
    private String id;

    private String name;
    private Integer age;
    private Integer sex;
}
