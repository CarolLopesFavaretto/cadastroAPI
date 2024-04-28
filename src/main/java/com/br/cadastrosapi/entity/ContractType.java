package com.br.cadastrosapi.entity;

public enum ContractType {

    CLT("CLT"), PJ("Pessoa Juridica"), OUT("Terceiros");

    private String description;
    ContractType(String description) {
        this.description = description;
    }
}
