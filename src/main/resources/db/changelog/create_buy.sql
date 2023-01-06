--liquibase formatted sql
--changeset gustavo.oliveira:1
CREATE TABLE tb_buy(
    id              BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    customer_id     BIGINT,
    store_id        BIGINT,
    product_id      BIGINT
);
--rollback DROP TB_BUY