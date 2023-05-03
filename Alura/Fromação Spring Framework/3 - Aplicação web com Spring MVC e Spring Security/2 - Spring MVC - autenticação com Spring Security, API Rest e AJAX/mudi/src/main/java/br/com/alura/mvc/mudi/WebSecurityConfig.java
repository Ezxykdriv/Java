package br.com.alura.mvc.mudi;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
	}
	
	@Bean
	@Override
	@SuppressWarnings("deprecation")
	protected UserDetailsService userDetailsService() {
		UserDetails user = User.withDefaultPasswordEncoder().username("matheus").password("matheus").roles("ADM").build();
		return new InMemoryUserDetailsManager(user);
	}

}