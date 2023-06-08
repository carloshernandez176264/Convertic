package com.ConverticStore.Convertic.infraestructure.adapters;

import com.ConverticStore.Convertic.infraestructure.adapters.entity.UserDBO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

public interface UserDBORepository extends ReactiveCrudRepository<UserDBO, Integer> {


}
