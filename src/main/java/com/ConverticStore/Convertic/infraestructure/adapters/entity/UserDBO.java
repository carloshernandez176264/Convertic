package com.ConverticStore.Convertic.infraestructure.adapters.entity;

import com.ConverticStore.Convertic.domain.model.TypeDocument;
import com.ConverticStore.Convertic.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDBO {

    @Id
    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private TypeDocument typeDocument;
    private String numberDocument;

    public static UserDBO fromDomain(User user){
        return UserDBO.builder()
                .name(user.getName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .typeDocument(user.getTypeDocument())
                .numberDocument(user.getNumberDocument())
                .build();
    }

    public static User toDomain(UserDBO userDBO){
        return new  User(userDBO.getName(), userDBO.getLastName(),
                userDBO.getEmail(), userDBO.getPassword(), userDBO.getTypeDocument(), userDBO.getNumberDocument());
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public TypeDocument getTypeDocument() {
        return typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }
}
