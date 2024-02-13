package org.zerock.b01.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){

        return new Docket(DocumentationType.OAS_30)
                .useDefaultResponseMessages(false)
                // 파라미터를 false로 설정하면 swagger에서 제공해주는 응답코드(200,401,405,404)에대한 기본메시지 제거
                .select()
                //
                .apis(RequestHandlerSelectors.basePackage("org.zerock.b01.controller"))
                //베이스패키지로 지정하여 해당
                .paths(PathSelectors.any())
                //api들을 다시 필처링하여 문서화
                .build()
                .apiInfo(apiInfo());

    }


    private ApiInfo apiInfo(){

        return new ApiInfoBuilder()
                .title("Boot 01 Project Swagger")
                .build();
    }
}