CREATE DATABASE db_minha_casa_mais_bonita;

USE db_minha_casa_mais_bonita;

CREATE TABLE tb_categoria(
id bigint auto_increment,
nome varchar(100),
descricao varchar(200),
ativa boolean,
primary key (id)
);

INSERT INTO tb_categoria (nome, descricao, ativa) VALUES ("Cadeiras", "categoria de cadeiras", true);
INSERT INTO tb_categoria (nome, descricao, ativa) VALUES ("Mesas", "categoria de mesas", true);
INSERT INTO tb_categoria (nome, descricao, ativa) VALUES ("Estantes", "categoria de estantes", true);
INSERT INTO tb_categoria (nome, descricao, ativa) VALUES ("Camas", "categoria de camas", true);
INSERT INTO tb_categoria (nome, descricao, ativa) VALUES ("Sofás", "categoria de sofás", true);

CREATE TABLE tb_produto(
id bigint auto_increment,
nome varchar(100),
descricao varchar(200),
preco decimal,
estoque int,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

INSERT INTO tb_produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Cadeira de madeira", "descrição cadeira", 101, 10, 1);
INSERT INTO tb_produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Mesa de madeira", "descrição mesa", 202, 20, 2);
INSERT INTO tb_produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Estante de três fileiras", "descrição estante", 303, 30, 3);
INSERT INTO tb_produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Cama de casal", "descrição cama", 404, 40, 4);
INSERT INTO tb_produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Sofá de três lugares", "descrição sofá", 505, 50, 5);
INSERT INTO tb_produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Cadeira de balanço", "descrição cadeira", 111, 10, 1);
INSERT INTO tb_produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Mesa de metal", "descrição mesa", 222, 20, 2);
INSERT INTO tb_produto (nome, descricao, preco, estoque, categoria_id) VALUES ("Estante de quatro fileiras", "descrição estante", 333, 30, 3);

CREATE TABLE tb_usuario(
id bigint auto_increment,
nome varchar(100),
telefone varchar(20),
email varchar(100),
senha varchar(100),
ativo boolean,
primary key (id)
);

INSERT INTO tb_usuario (nome, telefone, email, senha, ativo) VALUES ("Bang Yongguk", "99999-8888", "yongguk@email.com", "123", true);
INSERT INTO tb_usuario (nome, telefone, email, senha, ativo) VALUES ("Jung Daehyun", "88888-7777", "daehyun@email.com", "123", true);
INSERT INTO tb_usuario (nome, telefone, email, senha, ativo) VALUES ("Yoo Youngjae", "77777-6666", "youngjae@email.com", "123", true);
INSERT INTO tb_usuario (nome, telefone, email, senha, ativo) VALUES ("Moon Jongup", "66666-5555", "jongup@email.com", "123", true);
INSERT INTO tb_usuario (nome, telefone, email, senha, ativo) VALUES ("Choi Junhong", "55555-4444", "junhong@email.com", "123", true);

SELECT * FROM tb_categoria;
SELECT * FROM tb_produto;
SELECT * FROM tb_usuario;

SELECT * FROM tb_produto WHERE preco > 300;
SELECT * FROM tb_produto WHERE preco BETWEEN 300 AND 410;
SELECT * FROM tb_produto WHERE nome LIKE "%B%";

SELECT * FROM tb_usuario WHERE nome LIKE "%C%";
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;

SELECT AVG(preco) FROM tb_produto;
SELECT SUM(preco) FROM tb_produto;
SELECT COUNT(*) FROM tb_produto;

SELECT tb_categoria.nome AS 'Categoria', tb_produto.nome AS 'Produto' 
FROM tb_produto INNER JOIN tb_categoria
ON tb_categoria.id = tb_produto.categoria_id
WHERE tb_categoria.id = 1;