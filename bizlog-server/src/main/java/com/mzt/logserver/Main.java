package com.mzt.logserver;

import com.mzt.logapi.starter.annotation.EnableLogRecord;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceTransactionManagerAutoConfiguration.class})
@MapperScan(basePackages = "com.mzt.logserver.repository.mapper", annotationClass = Mapper.class)
@EnableLogRecord
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
