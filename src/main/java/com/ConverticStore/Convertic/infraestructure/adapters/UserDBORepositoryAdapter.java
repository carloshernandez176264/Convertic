package com.ConverticStore.Convertic.infraestructure.adapters;

import com.ConverticStore.Convertic.domain.model.User;
import com.ConverticStore.Convertic.domain.model.gateways.UserRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository

public class UserDBORepositoryAdapter implements UserRepository {

    private final UserDBORepository userDBORepository;

    public UserDBORepositoryAdapter(UserDBORepository userDBORepository) {
        this.userDBORepository = userDBORepository;
    }

    @Override
    public Mono<User> saveUser(User user) {
        return null;
    }

    @Override
    public Mono findById(Integer id) {
        return null;
    }

    @Override
    public Mono update(User user) {
        return null;
    }

    @Override
    public Mono delete(Integer id) {
        return null;
    }

    @Override
    public Flux findAll() {
        return null;
    }


    //private final UserDBORepository userDBORepository;



}
