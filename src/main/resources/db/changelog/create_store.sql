--liquibase formatted sql
--changeset gustavo.oliveira:1
CREATE TABLE tb_store(
    id              BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    corporate_name  VARCHAR(255),
    customer_id     BIGINT,
    street          VARCHAR(255),
    postal_code     VARCHAR(20),
    city            VARCHAR(100),
    number          BIGINT,
    state           VARCHAR(5)
);
--rollback DROP TB_STORE