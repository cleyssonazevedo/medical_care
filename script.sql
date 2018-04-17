DROP DATABASE IF EXISTS medical;
CREATE DATABASE IF NOT EXISTS medical;

USE medical;

CREATE TABLE IF NOT EXISTS endereco (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    logradouro  VARCHAR(100) NOT NULL,
    numero      VARCHAR(10),
    bairro      VARCHAR(100) NOT NULL,
    cidade      VARCHAR(255) NOT NULL,
    estado      CHAR(2) NOT NULL,
    cep         CHAR(9) NOT NULL
);

CREATE TABLE IF NOT EXISTS paciente (
    ident           INT PRIMARY KEY AUTO_INCREMENT,
    nome            VARCHAR(255) NOT NULL,
    naturalidade    VARCHAR (100) NOT NULL,
    sexo            VARCHAR(50) NOT NULL,
    cpf             CHAR(15),
    id_endereco     INT NOT NULL UNIQUE,
    FOREIGN KEY (id_endereco) REFERENCES endereco(id)
);

INSERT INTO endereco (logradouro, numero, bairro, cidade, estado, cep) VALUES
('Rua 1', '123', 'Vila 10', 'São Paulo', 'SP', '08552-122'),
('Rua 2', '123', 'Vila 20', 'São Paulo', 'SP', '08552-123'),
('Rua 3', '123', 'Vila 30', 'São Paulo', 'SP', '08552-124'),
('Rua 4', '123', 'Vila 40', 'São Paulo', 'SP', '08552-125');

INSERT INTO paciente (nome, naturalidade, sexo, cpf, id_endereco) VALUES
('José', 'Brasileiro', 'Masculino', '123.123.132-12', 1),
('Maria', 'Brasileiro', 'Feminino', '132.123.132-12', 2),
('Stefanny', 'Brasileiro', 'Outro', '321.123.132-12', 3),
('Rogério', 'Italiano', 'Não Informado', '123.123.132-14', 4);


DELIMITER $$
CREATE PROCEDURE sp_inserirPaciente 
(
    nome            VARCHAR(255),
    naturalidade    VARCHAR (100),
    sexo            VARCHAR(50),
    cpf             CHAR(15),
    logradouro  	VARCHAR(100),
    numero      	VARCHAR(10),
    bairro      	VARCHAR(100),
    cidade      	VARCHAR(255),
    estado      	CHAR(2),
    cep         	CHAR(9)
)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION ROLLBACK;
	START TRANSACTION;
		INSERT INTO endereco (logradouro, numero, bairro, cidade, estado, cep) VALUES
		(logradouro, numero, bairro, cidade, estado, cep);
	
		INSERT INTO paciente (nome, naturalidade, sexo, cpf, id_endereco) VALUES
			(nome, naturalidade, sexo, cpf, LAST_INSERT_ID());
    COMMIT;
END $$
DELIMITER ;
