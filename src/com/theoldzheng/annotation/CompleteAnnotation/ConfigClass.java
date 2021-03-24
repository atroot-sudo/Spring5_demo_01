package com.theoldzheng.annotation.CompleteAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.24 20:13
 */
@Configuration //作为配置类的声明注解
@ComponentScan(basePackages = {"com.theoldzheng.annotation"}) //他的值是以数组的形式进行存储的
public class ConfigClass {
}
