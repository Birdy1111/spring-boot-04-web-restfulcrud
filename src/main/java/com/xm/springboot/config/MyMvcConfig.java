package com.xm.springboot.config;

import com.xm.springboot.component.MyLocaleReolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

import java.net.URL;
import java.security.PublicKey;


/**
 * @author xm
 * @create 2019/8/11-14:57
 */

@Configuration
public class MyMvcConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/no").setViewName("success");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");

    }
    @Bean
    public LocaleResolver localeResolver(){

   return new MyLocaleReolver();
    }
}
