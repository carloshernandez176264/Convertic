package com.ConverticStore.Convertic.application.configuration;

import com.ConverticStore.Convertic.domain.model.gateways.UserRepository;
import com.ConverticStore.Convertic.domain.usecase.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public UserUseCase userUseCase(UserRepository userRepository) {

        return new UserUseCase(userRepository);
    }


}
