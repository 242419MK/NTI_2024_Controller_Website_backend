package com.infstos.backend.zzzOld.User;
// package com.infstos.backend.Old.User;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Service;

// import com.infstos.backend.models.User;

// import java.util.Optional;

// @Service
// public class UserService implements UserDetailsService {

//     @Autowired
//     private UserRepository userRepository;

//     //@Autowired  //Bez skomentowania projekt sie nie builduje, oby nie było konieczne
//     private BCryptPasswordEncoder bCryptPasswordEncoder;

//     // Rejestracja użytkownika
//     public User registerUser(User user) {
//         user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//         return userRepository.save(user);
//     }

//     // Wyszukiwanie użytkownika po nazwie użytkownika
//     public Optional<User> findUserByUsername(String username) {
//         return userRepository.findByUsername(username);
//     }

//     // Implementacja metody z UserDetailsService
//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         User user = userRepository.findByUsername(username)
//             .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

//         return new org.springframework.security.core.userdetails.User(
//             user.getUsername(),
//             user.getPassword(),
//             ((UserDetails) user).getAuthorities() // Możesz tutaj zwrócić role użytkownika jako `GrantedAuthority`
//         );
//     }
// }
