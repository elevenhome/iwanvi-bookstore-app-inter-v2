package com.iwanvi.bookstore.appinterv2.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @describtion swagger 配置类
 * @describtion http://localhost:8080/swagger-ui.html
 * @author zzw
 * @date 2019年3月10日11:39:46
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket customDocket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.iwanvi.bookstore.appinterv2"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
        return docket;
    }


    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("中文书城")
                .description("APP接口-有声图书相关")
                .termsOfServiceUrl("")
                .contact(new Contact("","",""))
                .license("")
                .licenseUrl("")
                .version("0.0.1")
                .build();
    }
}