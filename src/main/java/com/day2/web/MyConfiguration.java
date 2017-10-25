package com.day2.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by pk4 on 10/25/17.
 */

// instead of xml
@Configuration
@EnableWebMvc //<mvc:annotation-driven/>
public class MyConfiguration extends WebMvcConfigurerAdapter{

    /*<bean class="InternalResourceViewResolver">
    *  <property name="prefix" value"/" />
    *  <property naem="suffix" value=".jsp"/>
     */
    @Bean
    public ViewResolver createViewResolver()
    {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;

    }

    @Override
    public void  configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {
        configurer.enable();

    }
}
