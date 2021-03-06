package proyectoweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("proyectoweb")
public class WebConfig extends WebMvcConfigurerAdapter{
	
	
	    @Bean
		public InternalResourceViewResolver resolver() {
			InternalResourceViewResolver resol = new InternalResourceViewResolver();
			resol.setPrefix("/WEB-INF/views/");
			resol.setSuffix(".jsp");
			return resol;
		}
	    //Ruta de recursos como; css, js, imagenes, iconos, bootstrap, jquery
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	          .addResourceHandler("/resources/**")
	          .addResourceLocations("classpath:/resources/");	  
	    }
}
