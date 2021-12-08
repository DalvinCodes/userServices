package com.dalvincodes.user;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;


@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class User {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private  String email;


}
