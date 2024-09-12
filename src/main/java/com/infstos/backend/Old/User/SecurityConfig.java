// package com.infstos.backend.Old.User;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
// import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

// @SuppressWarnings("deprecation")
// @Configuration
// @EnableGlobalMethodSecurity(prePostEnabled = true) // Możesz włączyć jeśli chcesz używać adnotacji @PreAuthorize itp.
// public class SecurityConfig {

//     private final UserService userService;

//     public SecurityConfig(UserService userService) {
//         this.userService = userService;
//     }

//     @Bean
//     public UserDetailsService userDetailsService() {
//         return userService; // Zakładając, że `UserService` implementuje `UserDetailsService`
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }

//     @Bean
//     public DaoAuthenticationProvider authenticationProvider() {
//         DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//         authProvider.setUserDetailsService(userDetailsService());
//         authProvider.setPasswordEncoder(passwordEncoder());
//         return authProvider;
//     }

//     @Bean
//     public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
//         return config.getAuthenticationManager();
//     }

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http.csrf(csrf -> csrf.disable()) // W produkcji w³¹cz CSRF i odpowiedni¹ politykê
//                 .authorizeHttpRequests(authorize -> authorize
//                                 .requestMatchers("/api/auth/**").permitAll() // Pozwól na dostêp do endpointów autoryzacyjnych bez uwierzytelnienia
//                                 .anyRequest().authenticated()
//                 )
//                 .authenticationProvider(authenticationProvider());

//         return http.build();
//     }
// }