package me.dio.decola_tech_API_REST_to_do_list.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("API (to do list) - Danilo Mendes")
                        .version("1.0")
                        .description("API RESTful para gerenciamento de tarefas, oferecendo um sistema completo de criação, recuperação, atualização e exclusão de tarefas (CRUD). \n" +
                                "                 Desenvolvida com as melhores práticas do REST, incluindo paginação e documentação padronizada com OpenAPI. \n" +
                                "               Ideal para integrar aplicações que necessitam de um serviço robusto e escalável para organização de tarefas."));
    }
}
