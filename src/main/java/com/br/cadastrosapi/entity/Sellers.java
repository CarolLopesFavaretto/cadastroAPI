package com.br.cadastrosapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sellers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long registry;

    @NotNull
    private String name;

    @CPF(message = "CPF invalido")
    private String cpf;

    @Email
    private String email;

    @NotNull
    private String contractType;
}
