CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
 id bigint auto_increment,
 nome varchar(100),
 ativa boolean,
 primary key (id)
);

INSERT INTO tb_categoria (nome, ativa) VALUES ("Medicamentos", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Medicamentos controlados", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Higiene", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Beleza", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Suplemento", true);

CREATE TABLE tb_produto(
 id bigint auto_increment,
 nome varchar(100),
 descricao varchar(200),
 quantidade bigint,
 preco decimal,
 categoria_id bigint,
 primary key (id),
 foreign key (categoria_id) references tb_categoria(id)
);

INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Buscopan", "reduz cólicas", 140, 20, 1);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Paroxetina", "antidepressivo", 122, 50, 2);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Desodorante Dove", "banho", 190, 15, 3);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Esmalte Impala", "esmalte", 144, 5, 4);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Centrum", "vitamina", 111, 150, 5);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Dorflex", "relaxante muscular", 100, 20, 1);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Topiramato", "estabiliza humor", 177, 60, 2);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Shampoo Pantene", "cabelos", 124, 20, 3);

SELECT * FROM tb_produto;
SELECT * FROM tb_categoria;

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome LIKE "%B%";
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id WHERE tb_categoria.id = 1;