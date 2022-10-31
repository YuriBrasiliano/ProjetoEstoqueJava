CREATE DATABASE db_estoque;
USE db_estoque;

CREATE TABLE tb_produto (
codigo int NOT NULL PRIMARY KEY,
nome varchar(150) NOT NULL,
descricao varchar(150) NOT NULL,
quantidade int NOT NULL
);
