package com.apress.springrecipes.court.web;

import com.apress.springrecipes.court.config.CourtConfiguration;

import javax.servlet.ServletContainerInitializer;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CourtWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{CourtConfiguration.class}; // 빈 설정파일
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
