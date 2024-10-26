package com.net.han.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ApplicationConfig @Description  
 *
 * @author han @Date 2024/10/26 17:26 @Version 1.0
 */

@MapperScan(basePackages = {"com.net.han.mapper"})
@Configuration
public class ApplicationConfig {

}
