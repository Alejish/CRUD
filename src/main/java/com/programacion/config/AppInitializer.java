package com.programacion.config;

import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class AppInitializer extends AbstractContextLoaderInitializer {
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext Context
                = new AnnotationConfigWebApplicationContext();
        Context.register(Config.class);
        return Context;
    }
}
