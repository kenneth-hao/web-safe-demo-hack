package org.dxy.websafedemohack;


import org.dxy.websafedemohack.interceptor.RequestVarsInitInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Bean
    public RequestVarsInitInterceptor requestVarsInitInterceptor() {
        return new RequestVarsInitInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestVarsInitInterceptor()).addPathPatterns("/**");
    }

}

