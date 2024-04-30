package com.br.cadastrosapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sellers {

    @Id
    private String registry;

    @NotNull
    private String name;

    @CPF
    private String cpf;

    @CNPJ
    private String cnpj;

    @Email
    private String email;

    @NotNull
    private ContractType contractType;
}




