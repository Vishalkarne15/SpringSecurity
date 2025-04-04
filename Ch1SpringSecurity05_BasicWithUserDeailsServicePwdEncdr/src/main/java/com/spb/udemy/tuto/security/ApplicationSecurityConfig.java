package com.spb.udemy.tuto.security;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig {

	@Bean
	public SecurityFilterChain appSecurityConfig(HttpSecurity httpSec) throws Exception {
		
		httpSec.cors(corsConfig -> corsConfig.disable())
				.csrf(csrfConfig-> csrfConfig.disable());
		httpSec.authorizeHttpRequests(authReqConfig->authReqConfig
				.requestMatchers("/order").authenticated()
				.requestMatchers("/welcome").permitAll());
		httpSec.formLogin(flc->flc.disable());
		httpSec.httpBasic(withDefaults());
		return httpSec.build();
	}
	
	@Bean
	public UserDetailsService userService() {
		UserDetails user = User.withUsername("vishal").password("{noop}password").authorities("read").build();
		//UserDetails admin = User.withUsername("admin").password("{noop}admin").authorities("admin").build();
		return new InMemoryUserDetailsManager(user);
	}
//	@Bean
//    public PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
	
}
