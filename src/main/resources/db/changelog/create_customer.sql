--liquibase formatted sql
--changeset gustavo.oliveira:1
CREATE TABLE tb_customer(
    id              BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name            VARCHAR(255),
    cpf             VARCHAR(20),
    street          VARCHAR(255),
    postal_code     VARCHAR(20),
    city            VARCHAR(100),
    number          BIGINT,
    state           VARCHAR(5)
);
--rollback DROP TB_CUSTOMER