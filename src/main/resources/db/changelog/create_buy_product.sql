--liquibase formatted sql
--changeset gustavo.oliveira:1
CREATE TABLE tb_buy_product(
    id          BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    product_id  BIGINT,
    buy_id      BIGINT,
    quantity    BIGINT
);
--rollback DROP TB_BUY_PRODUCT