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

CREATE TABLE IF NOT EXISTS ficha (
    id_ficha                    INT PRIMARY KEY AUTO_INCREMENT,
    data_atendimento            DATETIME NOT NULL,
    atestado                    CHAR(3) NOT NULL DEFAULT 'NÃO',
    data_retorno                DATETIME,
    id_paciente_ficha           INT NOT NULL,
    FOREIGN KEY (id_paciente_ficha) REFERENCES paciente(ident) 
);

CREATE TABLE IF NOT EXISTS exame (
    id_exame            INT PRIMARY KEY AUTO_INCREMENT,
    tipo_exame          VARCHAR(255) NOT NULL,
    data_exame          DATETIME NOT NULL,
    id_paciente_exame   INT NOT NULL,
    FOREIGN KEY(id_paciente_exame) REFERENCES paciente(ident)
);

CREATE TABLE IF NOT EXISTS prescricao (
    id_prescricao               INT PRIMARY KEY AUTO_INCREMENT,
    nome_remedio                VARCHAR(255) NOT NULL,
    data_inicio_prescricao      DATE,
    data_fim_prescricao         DATE,
    id_paciente_prescricao      INT NOT NULL,
    FOREIGN KEY (id_paciente_prescricao) REFERENCES paciente(ident)
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

/**
    ficha

   id_ficha                    INT PRIMARY KEY AUTO_INCREMENT,
    data_atendimento            DATETIME NOT NULL,
    atestado                    CHAR(3) NOT NULL DEFAULT 'NÃO',
    data_retorno                DATETIME,
    id_paciente_ficha           INT NOT NULL,
*/
INSERT INTO ficha (data_atendimento, atestado, data_retorno, id_paciente_ficha) VALUES 
    ('2017-12-12', 'Sim', '2018-01-08', 1),
    ('2017-08-13', 'Sim', NULL, 2),
    ('2017-11-12', 'Não', '2018-06-08', 3),
    ('2015-12-12', 'Não', NULL, 4);
    

/**
exame (
    id_exame            INT PRIMARY KEY AUTO_INCREMENT,
    tipo_exame          VARCHAR(255) NOT NULL,
    data_exame          DATETIME NOT NULL,
    id_paciente_exame   INT NOT NULL,
*/
INSERT INTO exame (tipo_exame, data_exame, id_paciente_exame) VALUES
    ('Clínico', '2018-01-19', 1),
    ('Clínico', '2018-01-19', 2),
    ('Clínico', '2018-01-19', 3),
    ('Clínico', '2018-01-19', 4);

/**
prescricao (
    id_prescricao               INT PRIMARY KEY AUTO_INCREMENT,
    nome_remedio                VARCHAR(255) NOT NULL,
    data_inicio_prescricao      DATE,
    data_fim_prescricao         DATE,
    id_paciente_prescricao      INT
*/
INSERT INTO prescricao (nome_remedio, data_inicio_prescricao, data_fim_prescricao, id_paciente_prescricao) VALUES
 ('Cinegripe', '2018-01-01', '2018-01-01', 1),
 ('Cinegripe', '2018-01-01', '2018-01-01', 2),
 ('Cinegripe', '2018-01-01', '2018-01-01', 3),
 ('Cinegripe', '2018-01-01', '2018-01-01', 4);

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
    cep         	CHAR(9),
    opcao 			INT,
    _id 			INT
)
BEGIN 
	IF opcao = 0 THEN
		INSERT INTO endereco (logradouro, numero, bairro, cidade, estado, cep) VALUES 
			(logradouro, numero, bairro, cidade, estado, cep); 
	 
		INSERT INTO paciente (nome, naturalidade, sexo, cpf, id_endereco) VALUES 
			(nome, naturalidade, sexo, cpf, LAST_INSERT_ID());
	ELSE
		UPDATE endereco SET 
			logradouro = logradouro,
			numero = numero,
			bairro = bairro,
			cidade = cidade,
            estado = estado,
            cep = cep 
        WHERE id = (SELECT id_endereco FROM paciente p WHERE p.ident = _id);

        UPDATE paciente SET  
            nome = nome,
            naturalidade = naturalidade,
            sexo = sexo,
            cpf = cpf 
        WHERE ident = _id;
	END IF;
END $$
DELIMITER ;
