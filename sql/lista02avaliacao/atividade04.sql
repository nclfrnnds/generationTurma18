CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;

CREATE TABLE tb_categoria(
 id bigint auto_increment,
 nome varchar(100),
 ativa boolean,
 primary key (id)
);

INSERT INTO tb_categoria (nome, ativa) VALUES ("Bovinos", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Suínos", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Aves", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Embutidos", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Outros", true);

CREATE TABLE tb_produto(
 id bigint auto_increment,
 nome varchar(100),
 descricao varchar(200),
 quantidade int,
 preco decimal,
 categoria_id bigint,
 primary key (id),
 foreign key (categoria_id) references tb_categoria(id)
);

INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Maminha", "peça maminha", 34, 55, 1);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Fraldinha", "peça fraldinha", 55, 30, 1);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Linguiça toscana", "dúzia", 33, 20, 4);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Lombo", "meia dúzia", 20, 12, 2);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Coxa com sobrecoxa", "meia dúzia", 10, 15, 3);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Picanha", "peça picanha", 14, 60, 1);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Asa de frango", "meia dúzia", 12, 15, 3);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Bisteca", "meia dúzia", 31, 10, 2);

SELECT * FROM tb_produto;
SELECT * FROM tb_categoria;

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome LIKE "%C%";
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id WHERE tb_categoria.id = 1;