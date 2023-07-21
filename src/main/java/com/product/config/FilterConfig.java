package com.product.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.product.filter.JwtFilter;

@Configuration
public class FilterConfig {

	@Bean
    public FilterRegistrationBean<JwtFilter> jwtFilter() {
        FilterRegistrationBean<JwtFilter> filter= new FilterRegistrationBean<JwtFilter>();
        filter.setFilter(new JwtFilter());
        filter.addUrlPatterns("/product/*");
        return filter;
    }
}
