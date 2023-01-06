--liquibase formatted sql
--changeset gustavo.oliveira:1
INSERT INTO tb_product (id, name, buy_price, sell_price, quantity)
VALUES (1, "Samngung S22", 1200.00, 2000.00, 10);

INSERT INTO tb_product (id, name, buy_price, sell_price, quantity)
VALUES (2, "Samngung S21 FE", 1000.00, 1800.00, 10);

INSERT INTO tb_product (id, name, buy_price, sell_price, quantity)
VALUES (3, "Samngung S21", 800.00, 1600.00, 10);

INSERT INTO tb_product (id, name, buy_price, sell_price, quantity)
VALUES (4, "Iphone 13", 3000.00, 5000.00, 10);

INSERT INTO tb_product (id, name, buy_price, sell_price, quantity)
VALUES (5, "Iphone 12", 2800.00, 4500.00, 10);
--rollback not required