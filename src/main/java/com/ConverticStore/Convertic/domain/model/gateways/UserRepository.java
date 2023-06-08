package com.ConverticStore.Convertic.domain.model.gateways;

import com.ConverticStore.Convertic.domain.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {


    Mono<User> saveUser(User user);

    Mono findById(Integer id);

    Mono update(User user);

    Mono delete(Integer id);

    Flux findAll();
}



