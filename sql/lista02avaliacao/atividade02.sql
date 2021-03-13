CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
 id bigint auto_increment,
 nome varchar(100),
 descricao varchar(200),
 primary key (id)
);

INSERT INTO tb_categoria (nome, descricao) VALUES ("Pizzas tradicionais", "Sabores tradicionais e mais pedidos.");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Pizzas premium", "Sabores mais incrementados.");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Pizzas light", "Sabores mais leves.");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Pizzas vegetarianas", "Sabores sem qualquer tipo de carne.");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Pizzas doces", "Sabores doces para sobremesa.");

CREATE TABLE tb_pizza(
 id bigint auto_increment,
 nome varchar(100),
 ingredientes varchar(200),
 massa varchar(20),
 preco decimal,
 categoria_id bigint,
 primary key (id),
 foreign key (categoria_id) references tb_categoria(id)
);

INSERT INTO tb_pizza (nome, ingredientes, massa, preco, categoria_id) VALUES ("Mussarela", "Massa, molho, queijo mussarela e orégano.", "Tradicional", 30, 1);
INSERT INTO tb_pizza (nome, ingredientes, massa, preco, categoria_id) VALUES ("Calabresa", "Massa, molho, calabresa fatiada e cebola.", "Tradicional", 30, 1);
INSERT INTO tb_pizza (nome, ingredientes, massa, preco, categoria_id) VALUES ("5 Queijos", "Massa, molho, queijos mussarela, parmesão, provolone, gorgonzola e catupiry.", "Tradicional", 55, 2);
INSERT INTO tb_pizza (nome, ingredientes, massa, preco, categoria_id) VALUES ("Queijo branco", "Massa, molho, queijo branco, tomate e orégano.", "Fina", 60, 3);
INSERT INTO tb_pizza (nome, ingredientes, massa, preco, categoria_id) VALUES ("Brócolis e champignon", "Massa, molho, brócolis, champignon e tomate.", "Fina", 50, 4);
INSERT INTO tb_pizza (nome, ingredientes, massa, preco, categoria_id) VALUES ("Abobrinha e pimentão", "Massa, molho, abobrinha, pimentão e tomate.", "Fina", 50, 4);
INSERT INTO tb_pizza (nome, ingredientes, massa, preco, categoria_id) VALUES ("Brigadeiro", "Massa, brigadeiro e granulado.", "Doce", 45, 5);
INSERT INTO tb_pizza (nome, ingredientes, massa, preco, categoria_id) VALUES ("Banana com canela", "Massa, banana em rodela e canela em pó.", "Doce", 40, 5);

SELECT * FROM tb_pizza;
SELECT * FROM tb_categoria;

SELECT * FROM tb_pizza WHERE preco > 45;
SELECT * FROM tb_pizza WHERE preco BETWEEN 29 AND 60;
SELECT * FROM tb_pizza WHERE nome LIKE "%C%";
SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.categoria_id;
SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.categoria_id WHERE tb_categoria.id = 1;