//package com.CodewithAbbas.Parking.Management.System;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//import java.security.Security;
//
//@Configuration
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("User").password("User@123").roles("USER");
//        auth.inMemoryAuthentication().withUser("Admin").password("Admin@123").roles("ADMIN");
//    }
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests().antMatchers("/carparking/slot/**").fullyAuthenticated().and().httpBasic();
//	}  parking/history
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/carparking/slot/parking/history").access("hasRole('ADMIN')")
//                .antMatchers("/carparking/slot/**").access("hasRole('ADMIN') or hasRole('USER')")
//
//                .and().httpBasic();
//
//    }
//
//
//    @Bean
//    NoOpPasswordEncoder passwordEncoder() {
//        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//    }
//}
