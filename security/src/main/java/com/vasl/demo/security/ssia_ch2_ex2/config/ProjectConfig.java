package com.vasl.demo.security.ssia_ch2_ex2.config;

import com.vasl.demo.security.ssia_ch2_ex5.config.CustomAuthenticationProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * we can implement UserDetailService and PasswordEncoder with AuthenticationManagerBuilder
 */

@Configuration
@RequiredArgsConstructor
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    private final CustomAuthenticationProvider customAuthenticationProvider;

 /*   @Bean
    public UserDetailsService userDetailsService() {
        var userDetailService =
                new InMemoryUserDetailsManager();

        var user = User.withUsername("john")
                .password("12345")
                .authorities("read")
                .build();
        userDetailService.createUser(user);

        return userDetailService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.authorizeRequests().anyRequest().authenticated();
    }

    /**
     *
     * @param auth
     * In this method you can create userDetails directly.
     * in this method we should Create Bean for PasswordEncoder
     * @throws Exception
     */

  /*  @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        var userDetails = new InMemoryUserDetailsManager();
        var user = User.withUsername("reza-rez")
                .authorities("read","write")
                .password("12345")
                .build();


        userDetails.createUser(user);

        auth.userDetailsService(userDetails);
    }*/


    /**
     *
     * @param auth
     * we can Implement CustomAuthenticationProvider without use any methods in AuthenticationManagerBuilder
     * @throws Exception
     *
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*auth.inMemoryAuthentication()
                .withUser("john")
                .password("12345")
                .authorities("read")
                .and()
                .passwordEncoder(NoOpPasswordEncoder.getInstance());*/
        auth.authenticationProvider(customAuthenticationProvider);
    }


}
