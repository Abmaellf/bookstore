package com.bookstore.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http
			.httpBasic()
			.and()
			.authorizeHttpRequests()
            .requestMatchers(HttpMethod.POST, "/bookstore/books").permitAll() //TODO COM AUTHENTICAÇÃO
//				.antMatchers(HttpMethod.GET, "/bookstore/**").permitAll() //TODO COM AUTHENTICAÇÃO
//				.antMatchers(HttpMethod.POST, "/bookstore/**").hasRole("USER") //SOMENTE O USUARIO MARIA
//				.antMatchers(HttpMethod.DELETE, "/bookstore/**").hasRole("ADMIN")  //SOMENTE O USUARIO ABMAEL
				.anyRequest().authenticated()
			.and()
			.csrf().disable();
		return http.build();
	}
}
