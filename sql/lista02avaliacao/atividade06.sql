CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
 id bigint auto_increment,
 nome varchar(100),
 ativa boolean,
 primary key (id)
);

INSERT INTO tb_categoria (nome, ativa) VALUES ("Programação", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Idiomas", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Gestão", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Ferramentas de escritório", true);
INSERT INTO tb_categoria (nome, ativa) VALUES ("Marketing", true);

CREATE TABLE tb_curso(
 id bigint auto_increment,
 nome varchar(100),
 descricao varchar(200),
 turno varchar(50),
 preco decimal,
 categoria_id bigint,
 primary key (id),
 foreign key (categoria_id) references tb_categoria(id)
);

INSERT INTO tb_curso (nome, descricao, turno, preco, categoria_id) VALUES ("Java iniciante", "curso básico", "noturno", 40, 1);
INSERT INTO tb_curso (nome, descricao, turno, preco, categoria_id) VALUES ("Inglês básico", "curso introdutório", "noturno", 44, 2);
INSERT INTO tb_curso (nome, descricao, turno, preco, categoria_id) VALUES ("Metodologia SCRUM", "metodologia ágil", "matutino", 34, 3);
INSERT INTO tb_curso (nome, descricao, turno, preco, categoria_id) VALUES ("Pacote office", "básico do office", "matutino", 42, 4);
INSERT INTO tb_curso (nome, descricao, turno, preco, categoria_id) VALUES ("Vendas", "melhorar vendas", "noturno", 60, 5);
INSERT INTO tb_curso (nome, descricao, turno, preco, categoria_id) VALUES ("Javascript iniciante", "curso básico", "vespertino", 66, 1);
INSERT INTO tb_curso (nome, descricao, turno, preco, categoria_id) VALUES ("Espanhol básico", "curso introdutório", "integral", 70, 2);
INSERT INTO tb_curso (nome, descricao, turno, preco, categoria_id) VALUES ("SQL básico", "curso básico", "matutino", 20, 1);

SELECT * FROM tb_curso;
SELECT * FROM tb_categoria;

SELECT * FROM tb_curso WHERE preco > 50;
SELECT * FROM tb_curso WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_curso WHERE nome LIKE "%J%";
SELECT * FROM tb_curso INNER JOIN tb_categoria ON tb_categoria.id = tb_curso.categoria_id;
SELECT * FROM tb_curso INNER JOIN tb_categoria ON tb_categoria.id = tb_curso.categoria_id WHERE tb_categoria.id = 1;