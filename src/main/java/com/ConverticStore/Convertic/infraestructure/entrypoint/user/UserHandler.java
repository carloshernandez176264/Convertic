package com.ConverticStore.Convertic.infraestructure.entrypoint.user;

import com.ConverticStore.Convertic.domain.model.User;
import com.ConverticStore.Convertic.domain.model.gateways.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class UserHandler {

    private final UserRepository userRepository;

    public Mono<ServerResponse> createUser(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(User.class)
                .flatMap(user -> userRepository.saveUser(user))
                .flatMap(saveUser -> ServerResponse
                        .status(HttpStatus.CREATED)
                        .bodyValue(saveUser))
                .onErrorResume(exception -> ServerResponse
                        .unprocessableEntity()
                        .bodyValue("Error al crear el usuario")
                );
    }

//  public Mono<ServerResponse> queryUsers(ServerRequest serverRequest) {
//      return userRepository
//               .findAll()
//               .collectList()
//               .flatMap(users -> {
//                  if (!users.isEmpty()) {
//                       return ServerResponse.ok().bodyValue(users);
//                   } else {
//                       return ServerResponse.noContent().build();
//                   }
//               }).switchIfEmpty(ServerResponse.noContent().build());
//   }

    public Mono<ServerResponse> queryUserById(ServerRequest serverRequest) {
        return userRepository
                .findById(Integer.valueOf(serverRequest.pathVariable("id")))
                .flatMap(user -> ServerResponse
                        .ok()
                        .bodyValue(user))
                .switchIfEmpty(ServerResponse
                        .status(HttpStatus.NO_CONTENT)
                        .bodyValue("Usuario no encontrado"));

    }

    public Mono<ServerResponse> updateUser(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(User.class)
                .flatMap(userRepository::update)
                .flatMap(saveUser -> ServerResponse
                        .status(HttpStatus.CREATED)
                        .bodyValue(saveUser))
                .onErrorResume(exception -> ServerResponse
                        .unprocessableEntity()
                        .bodyValue("Error al actualizar el usuario")
                );
    }

    public Mono<ServerResponse> deleteUser(ServerRequest serverRequest) {
        return userRepository
                .delete(Integer.valueOf(serverRequest.pathVariable("id")))
                .flatMap(user -> ServerResponse
                        .ok()
                        .bodyValue(user))
                .switchIfEmpty(ServerResponse
                        .status(HttpStatus.NO_CONTENT)
                        .bodyValue("Usuario no encontrado"));

    }


}
