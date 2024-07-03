package pe.edu.cibertec.DSWII_T3_TexeAndy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DswiiT3TexeAndyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiT3TexeAndyApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/v1/**")
						.allowedOrigins("https://www.cibertec.edu.pe")
						.allowedMethods("GET", "POST", "PUT")
						.allowedHeaders("*");
			}
		};
	}

}
