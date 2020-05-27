package com.bs.mstp.mstp01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.bs.mstp.mstp01.dao")
public class MybatisConfig {

}
