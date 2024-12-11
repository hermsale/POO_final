-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema myGarage
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `myGarage` ;

-- -----------------------------------------------------
-- Schema myGarage
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `myGarage` DEFAULT CHARACTER SET utf8 ;
USE `myGarage` ;

-- -----------------------------------------------------
-- Table `vehiculo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `vehiculo` ;

CREATE TABLE IF NOT EXISTS `vehiculo` (
  `id_vehiculo` INT NOT NULL AUTO_INCREMENT,
  `patente` VARCHAR(15) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `kilometraje` INT NOT NULL,
  PRIMARY KEY (`id_vehiculo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `auto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `auto` ;

CREATE TABLE IF NOT EXISTS `auto` (
  `puertas` INT NOT NULL,
  `ruedas` INT NOT NULL,
  `id_vehiculo` INT NOT NULL,
  PRIMARY KEY (`id_vehiculo`),
  CONSTRAINT `fk_auto_vehiculo`
    FOREIGN KEY (`id_vehiculo`)
    REFERENCES `vehiculo` (`id_vehiculo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `moto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `moto` ;

CREATE TABLE IF NOT EXISTS `moto` (
  `cilindrada` INT NOT NULL,
  `ruedas` INT NOT NULL,
  `id_vehiculo` INT NOT NULL,
  PRIMARY KEY (`id_vehiculo`),
  CONSTRAINT `fk_moto_vehiculo1`
    FOREIGN KEY (`id_vehiculo`)
    REFERENCES `vehiculo` (`id_vehiculo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
