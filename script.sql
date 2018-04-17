CREATE DATABASE medical;

USE medical;

CREATE TABLE paciente (
    ident           INT PRIMARY KEY AUTO_INCREMENT,
    nome            VARCHAR(255) NOT NULL,
    naturalidade    VARCHAR (100) NOT NULL,
    sexo            VARCHAR(50) NOT NULL,
    cpf             CHAR(15),
    id_endereco     INT NOT NULL UNIQUE
);

CREATE TABLE endereco (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    logradouro  VARCHAR(100) NOT NULL,
    numero      VARCHAR(10),
    bairro      VARCHAR(100),
    cidade      VARCHAR(255),
    estado      CHAR(2)
);

ALTER TABLE paciente ADD CONSTRAINT fk_endereco FOREIGN KEY (id_endereco) REFERENCES endereco(id);

INSERT INTO endereco (logradouro, numero, bairro, cidade, estado) VALUES
 ('Rua 1', '123', 'Vila 10', 'São Paulo', 'SP'),
 ('Rua 2', '123', 'Vila 20', 'São Paulo', 'SP'),
 ('Rua 3', '123', 'Vila 30', 'São Paulo', 'SP'),
 ('Rua 4', '123', 'Vila 40', 'São Paulo', 'SP');

INSERT INTO paciente (nome, naturalidade, sexo, cpf, id_endereco) VALUES
('José', 'Brasileiro', 'Masculino', '123.123.132-12', 1),
('Maria', 'Brasileiro', 'Feminino', '132.123.132-12', 2),
('Stefanny', 'Brasileiro', 'Outro', '321.123.132-12', 3),
('Rogério', 'Italiano', 'Não Informado', '123.123.132-14', 4);