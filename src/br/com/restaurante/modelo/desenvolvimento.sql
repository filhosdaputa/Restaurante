-- Valentina Studio --
-- MySQL dump --
-- ---------------------------------------------------------
-- CREATE DATABASE "restaurante" ---------------------------
-- CREATE DATABASE IF NOT EXISTS `restaurante` CHARACTER SET utf8 COLLATE utf8_general_ci;
-- USE `restaurante`;
-- ---------------------------------------------------------
-- CREATE TABLE "marca" ------------------------------------
CREATE TABLE `marca` ( 
	`id` Int( 255 ) AUTO_INCREMENT NOT NULL,
	`descricao` VarChar( 255 ) NOT NULL,
        PRIMARY KEY (`id`) )
ENGINE = InnoDB
AUTO_INCREMENT = 1;
-- ---------------------------------------------------------
-- CREATE TABLE "unidade" ----------------------------------
CREATE TABLE `unidade` ( 
	`id` Int( 255 ) AUTO_INCREMENT NOT NULL,
	`descricao` VarChar( 255 ) NOT NULL,
	`sigla` VarChar( 255 ) NOT NULL,
        PRIMARY KEY (`id`) )
ENGINE = InnoDB
AUTO_INCREMENT = 1;
-- ---------------------------------------------------------
-- CREATE TABLE "grupo" ------------------------------------
CREATE TABLE `grupo` ( 
	`id` Int( 255 ) AUTO_INCREMENT NOT NULL,
	`descricao` VarChar( 255 ) NOT NULL,
        PRIMARY KEY (`id`) )
ENGINE = InnoDB
AUTO_INCREMENT = 1;
-- ---------------------------------------------------------
-- CREATE TABLE "produto" ----------------------------------
CREATE TABLE `produto` ( 
	`id` Int( 255 ) AUTO_INCREMENT NOT NULL,
	`descricao` VarChar( 255 ) NOT NULL,
        `precoCompra` Float( 9, 2 ) NOT NULL,
        `dataCadastro` Date NULL,
	`grupo_id` Int( 255 ) NOT NULL,
	`marca_id` Int( 255 ) NOT NULL,
	`unidade_id` Int( 255 ) NOT NULL,
        PRIMARY KEY (`id`) )
ENGINE = InnoDB
AUTO_INCREMENT = 1;

-- ---------------------------------------------------------
-- CREATE LINK "produto_fkmarca" -----------------------------------
ALTER TABLE `produto`
ADD CONSTRAINT `produto_fkmarca` FOREIGN KEY (`marca_id`)
REFERENCES `marca`(`id`);

-- ---------------------------------------------------------
-- CREATE LINK "produto_fkunidade" -----------------------------------
ALTER TABLE `produto`
ADD CONSTRAINT `produto_fkunidade` FOREIGN KEY (`unidade_id`)
REFERENCES `unidade`(`id`);

-- ---------------------------------------------------------
-- CREATE LINK "produto_fkgrupo" -----------------------------------
ALTER TABLE `produto`
ADD CONSTRAINT `produto_fkgrupo` FOREIGN KEY (`grupo_id`)
REFERENCES `grupo`(`id`);


INSERT INTO unidade VALUES
(1, 'Unidade', 'un'),
(2, 'Metro', 'm'),
(3, 'Quilograma', 'kg'),
(4, 'Litro', 'm'),
(5, 'Caixa', 'cx'),
(6, 'Fardo', 'fd'),
(7, 'Grama', 'g'),
(8, 'Mililitro', 'ml'),
(9, 'Miligrama', 'mg');

INSERT INTO grupo VALUES
(1, 'Bebidas'),
(2, 'Pratos Quentes'),
(3, 'Pratos Frios');

INSERT INTO marca VALUES
(1,'Arisco'),
(2,'Nestle'),
(3,'Knorr'),
(4,'Sadia'),
(5,'Coca-Cola'),
(6,'Fanta');

INSERT INTO produto VALUES
(1,'Refrigerante Lata',2.49,NOW(),1,5,8),
(2,'Refrigerante Lata',2.49,NOW(),1,6,8);
