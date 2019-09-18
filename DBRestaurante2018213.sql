-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DBRestaurante2018213
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DBRestaurante2018213
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DBRestaurante2018213` DEFAULT CHARACTER SET utf8 ;
USE `DBRestaurante2018213` ;

-- -----------------------------------------------------
-- Table `DBRestaurante2018213`.`Areas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2018213`.`Areas` (
  `idareas` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idareas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2018213`.`Mesas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2018213`.`Mesas` (
  `idmesas` INT NOT NULL,
  `idarea` INT NOT NULL,
  PRIMARY KEY (`idmesas`),
  INDEX `fk_area_idx` (`idarea` ASC) VISIBLE,
  CONSTRAINT `fk_area`
    FOREIGN KEY (`idarea`)
    REFERENCES `DBRestaurante2018213`.`Areas` (`idareas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2018213`.`Meseros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2018213`.`Meseros` (
  `idmeseros` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idmeseros`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2018213`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2018213`.`Clientes` (
  `idclientes` INT NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `Sexo` VARCHAR(100) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `dpi` VARCHAR(45) NOT NULL,
  `nit` INT(8) NOT NULL,
  PRIMARY KEY (`idclientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2018213`.`Menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2018213`.`Menu` (
  `idMenu` INT NOT NULL,
  `platillo` VARCHAR(45) NOT NULL,
  `bebida` VARCHAR(45) NOT NULL,
  `postre` VARCHAR(45) NOT NULL,
  `precio` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idMenu`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2018213`.`Cocineros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2018213`.`Cocineros` (
  `idcocineros` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idcocineros`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2018213`.`MetodoPago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2018213`.`MetodoPago` (
  `idmetodopago` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idmetodopago`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2018213`.`Facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2018213`.`Facturas` (
  `idFacturas` INT NOT NULL,
  `fecha` DATETIME NOT NULL,
  `idcliente` INT NOT NULL,
  `idmesa` INT NOT NULL,
  `idmeseros` INT NOT NULL,
  `idmetodopago` INT NOT NULL,
  `totalpago` DOUBLE NOT NULL,
  `ventatotal` INT NOT NULL,
  PRIMARY KEY (`idFacturas`),
  INDEX `fk_cliente_idx` (`idcliente` ASC) VISIBLE,
  INDEX `fk_mesero_idx` (`idmeseros` ASC) VISIBLE,
  INDEX `fk_metodopago_idx` (`idmetodopago` ASC) VISIBLE,
  INDEX `fk_mesas_idx` (`idmesa` ASC) VISIBLE,
  CONSTRAINT `fk_cliente`
    FOREIGN KEY (`idcliente`)
    REFERENCES `DBRestaurante2018213`.`Clientes` (`idclientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_meseros`
    FOREIGN KEY (`idmeseros`)
    REFERENCES `DBRestaurante2018213`.`Meseros` (`idmeseros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_metodopago`
    FOREIGN KEY (`idmetodopago`)
    REFERENCES `DBRestaurante2018213`.`MetodoPago` (`idmetodopago`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_mesas`
    FOREIGN KEY (`idmesa`)
    REFERENCES `DBRestaurante2018213`.`Mesas` (`idmesas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2018213`.`detallefactura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2018213`.`detallefactura` (
  `iddetallefactura` INT NOT NULL,
  `idfactura` INT NOT NULL,
  `idmenu` INT NOT NULL,
  `idcocineros` INT NOT NULL,
  PRIMARY KEY (`iddetallefactura`),
  INDEX `fk_facturas_idx` (`idfactura` ASC) VISIBLE,
  INDEX `fk_menu_idx` (`idmenu` ASC) VISIBLE,
  INDEX `fk_cocineros_idx` (`idcocineros` ASC) VISIBLE,
  CONSTRAINT `fk_facturas`
    FOREIGN KEY (`idfactura`)
    REFERENCES `DBRestaurante2018213`.`Facturas` (`idFacturas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_menu2`
    FOREIGN KEY (`idmenu`)
    REFERENCES `DBRestaurante2018213`.`Menu` (`idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cocineros`
    FOREIGN KEY (`idcocineros`)
    REFERENCES `DBRestaurante2018213`.`Cocineros` (`idcocineros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
