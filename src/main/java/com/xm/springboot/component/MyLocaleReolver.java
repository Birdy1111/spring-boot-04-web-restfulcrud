package com.xm.springboot.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author xm
 * @create 2019/8/11-16:37
 */
@Configuration
public class MyLocaleReolver implements LocaleResolver{


    @Override
    public Locale resolveLocale(HttpServletRequest request) {
       String l = request.getParameter("l");
        Locale locale =Locale.getDefault();
        if(!StringUtils.isEmpty(l)){
           String[] split =l.split("_");
            locale=  new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, @Nullable HttpServletResponse httpServletResponse, @Nullable Locale locale) {

    }
}
