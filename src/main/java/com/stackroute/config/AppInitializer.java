package com.stackroute.config;
/*
@Override:
    Used to override the method of an inherited class.
 */

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{com.stackroute.config.WebConfig.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}