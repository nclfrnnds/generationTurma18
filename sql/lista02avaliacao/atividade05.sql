CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
 id bigint auto_increment,
 nome varchar(100),
 descricao varchar(200),
 primary key (id)
);

INSERT INTO tb_categoria (nome, descricao) VALUES ("Pisos", "pisos para o chão");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Tintas", "tintas para parede");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Portas", "portas de todos os tipos");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Janelas", "janelas de todos os tipos");
INSERT INTO tb_categoria (nome, descricao) VALUES ("Azulejos", "variedades de azulejos");

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

INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Piso de madeira", "boa qualidade", 300, 32, 1);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Tinta acrílica", "brilho", 400, 133, 2);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Porta de madeira", "porta entrada", 330, 450, 3);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Janela de madeira", "janela grande", 300, 333, 4);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Piso de porcelanato", "resistente", 200, 34, 1);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Tinta verniz", "extra brilho", 321, 33, 2);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Porta de vidro", "de correr", 540, 233, 3);
INSERT INTO tb_produto (nome, descricao, quantidade, preco, categoria_id) VALUES ("Azulejo esmaltado", "grande qualidade", 331, 24, 5);

SELECT * FROM tb_produto;
SELECT * FROM tb_categoria;

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome LIKE "%C%";
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id WHERE tb_categoria.id = 1;