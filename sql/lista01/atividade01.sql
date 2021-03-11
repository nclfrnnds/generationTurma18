CREATE DATABASE db_rh; /*CRIAR BANCO DE DADOS*/
USE db_rh; /*USAR BANCO DE DADOS*/

/*CRIAR TABELA NO BANCO DE DADOS*/
CREATE TABLE tb_funcionarios(
	id bigint auto_increment,
    nome varchar(200),
    data_nascimento date,
    cargo varchar(100),
    salario decimal,
    primary key (id)
);

/*INSERIR DADOS NA TABELA*/
INSERT INTO tb_funcionarios (nome, data_nascimento, cargo, salario) VALUES ("Maria Silva", "1990-06-30", "Gerente de Projeto", 5000);
INSERT INTO tb_funcionarios (nome, data_nascimento, cargo, salario) VALUES ("João Santos", "1988-03-12", "Desenvolvedor", 3000);
INSERT INTO tb_funcionarios (nome, data_nascimento, cargo, salario) VALUES ("Carlos Oliveira", "1995-04-04", "Estagiário", 1800);
INSERT INTO tb_funcionarios (nome, data_nascimento, cargo, salario) VALUES ("Jorge Souza", "1990-06-30", "Estagiário", 1800);
INSERT INTO tb_funcionarios (nome, data_nascimento, cargo, salario) VALUES ("Ana Pereira", "1992-09-13", "Desenvolvedora", 3000);

/*SELECIONAR DADOS DA TABELA PARA MOSTRAR*/
SELECT * FROM tb_funcionarios;
SELECT * FROM tb_funcionarios WHERE salario < 2000;
SELECT * FROM tb_funcionarios WHERE salario > 2000;

/*ALTERAR VALOR EM UMA LINHA*/
UPDATE tb_funcionarios SET salario = 1900 WHERE id = 3;
UPDATE tb_funcionarios SET salario = 1900 WHERE id = 4;