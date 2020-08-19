package com.example.springvue.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Value("${vue.dev.url}")
    private String vueDevUrl;

    /**
     * 로컬 개발시 Vue Service와 Ajax 통신하기 위한 CORS 맵핑
     *
     * [참고]
     *  Browser Same-origin policy 문제로 Vue 서비스와 Ajax 통신이 허용되지 않는다.
     *  이 때문에 application.yml에서 설정한 vue.dev.url은 허용하기 위해 이 설정이 필요하다.
     *  다만 운영에서는 Vue 프로젝트 소스는 빌드되어 통합되므로 CORS 문제가 없이 이 설정은 무의미하다.
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins(vueDevUrl);
    }
}
