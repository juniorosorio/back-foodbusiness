package com.syst.trades.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityAccessConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(HttpSecurity security) throws Exception {
		security.authorizeRequests()
				.antMatchers("/v2/api-docs",
						"/configuration/ui",
						"/swagger-resources",
						"/configuration/security",
						"/swagger-ui.html",
						"/webjars/**",
						"/swagger-resources/configuration/ui",
						"/swagger-ui.html")
				.permitAll();
	}

}
