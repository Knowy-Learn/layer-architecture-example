package com.knowy.layer_architecture_example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "private_users")
public class PrivateUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_public_user")
    private PublicUserEntity publicUser;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}