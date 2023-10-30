package br.com.war.war_ecommerce.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.*;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.crypto.spec.PSource;
import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class SecurityCors extends WebSecurityConfigurer<> {

    @Autowired
    private Environment env;

    @Override
    public void configure(HttpSecurity http) throws Exception{
        if (Arrays.asList(env.getActiveProfiles()).contains("test")){

        }
        //deprecated, search  for new mothod
        //http.cors().and().csrf().disable();
       // http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
       // http.authorizeHttpRequests().anyRequest().permitAll();
    }

    @Bean
    CorsConfigurationSource corsConfiguration(){
        CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
        configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "OPTIONS"));
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
