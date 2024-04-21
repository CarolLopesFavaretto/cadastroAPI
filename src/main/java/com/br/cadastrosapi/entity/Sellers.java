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
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

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

    private Date dateOfBirth;

    @CPF(message = "CPF invalido")
    private String cpf;

    @CNPJ
    private String cnpj;

    @Email
    private String email;

    private ContractType contractType = ContractType.OUT;
}
