package com.baozistore;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "API REST - Baozi Store",
        version = "1.0.0",
        description = "API de controle de clientes, produtos e pedidos da Baozi Store. "
                + "Trabalho de Desenvolvimento Web Back-End - Igor Henrique Afonso (RU 5485028)."))
public class BaoziStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaoziStoreApplication.class, args);
    }
}
