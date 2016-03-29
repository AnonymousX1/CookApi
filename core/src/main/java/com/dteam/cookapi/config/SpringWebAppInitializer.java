package com.dteam.cookapi.config;

import org.h2.server.web.WebServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class SpringWebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringWebConfig.class);

        servletContext.addListener(new ContextLoaderListener(context));

        ServletRegistration.Dynamic dispatcher =
                servletContext.addServlet("dispatcherServlet", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.setAsyncSupported(true);
        dispatcher.addMapping("/");

        /**
         * Servlet for embedded database H2
         * TODO: should be excluded in production
         */
        ServletRegistration.Dynamic h2 =
                servletContext.addServlet("h2Servlet", new WebServlet());
        h2.setLoadOnStartup(2);
        h2.addMapping("/database/*");
    }
}
