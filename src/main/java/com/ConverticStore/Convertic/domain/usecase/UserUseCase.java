package com.ConverticStore.Convertic.domain.usecase;


import com.ConverticStore.Convertic.domain.model.gateways.UserRepository;
import com.ConverticStore.Convertic.infraestructure.entrypoint.dto.UserDTO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserUseCase {

    private UserRepository userRepository;



}

