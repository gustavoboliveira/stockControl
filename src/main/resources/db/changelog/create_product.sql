--liquibase formatted sql
--changeset gustavo.oliveira:1
CREATE TABLE tb_product (
    id          BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name        VARCHAR (255),
    buy_price   NUMERIC(18, 2),
    sell_price  NUMERIC(18, 2),
    quantity    BIGINT
);
--rollback DROP TB_PRODUCT