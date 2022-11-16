package com.hzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

/**
 * @NAME: SoftApp
 * @USER: DaHuangGO
 * @DATE: 2022/11/15
 * @TIME: 16:15
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 15
 */
@SpringBootApplication
@MapperScan(
        basePackages = {"com.hzh.dao",},
        annotationClass = Repository.class)
public class SoftApp {
    public static void main(String[] args) {
        SpringApplication.run(SoftApp.class,args);
    }
}
