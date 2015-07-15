-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema gardening_project
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `gardening_project` ;

-- -----------------------------------------------------
-- Schema gardening_project
-- -----------------------------------------------------
CREATE DATABASE IF NOT EXISTS `gardening_project` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `gardening_project` ;

-- -----------------------------------------------------
-- Table `gardening_project`.`USER`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gardening_project`.`USER` ;

CREATE TABLE IF NOT EXISTS `gardening_project`.`USER` (
  `ID` VARCHAR(45) NOT NULL,
  `PASSWORD` VARCHAR(64) NOT NULL,
  `NICKNAME` VARCHAR(20) NOT NULL,
  `PHONE` VARCHAR(45) NOT NULL,
  `PROFILE_IMG`VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `gardening_project`.`ARTICLE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gardening_project`.`ARTICLE` ;

CREATE TABLE IF NOT EXISTS `gardening_project`.`ARTICLE` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `USER_ID` VARCHAR(45) NOT NULL,
  `TITLE` VARCHAR(128) NOT NULL,
  `CONTENT` LONGTEXT NOT NULL,
  `BEFORE_IMG` VARCHAR(45),
  `AFTER_IMG` VARCHAR(45),
  `ADDRESS` VARCHAR(255),
  `NOW_COUNT` INT,
  `RECRUIT_COUNT` INT,
  `ARTICLE_TIME` TIMESTAMP NOT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `fk_ARTICLE_USER1`
    FOREIGN KEY (`USER_ID`)
    REFERENCES `gardening_project`.`USER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gardening_project`.`ARTICLE_COMMENT`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gardening_project`.`ARTICLE_COMMENT` ;

CREATE TABLE IF NOT EXISTS `gardening_project`.`ARTICLE_COMMENT` (
  `ARTICLE_ID` INT NULL,
  `USER_ID` VARCHAR(45) NOT NULL,
  `COMMENT_TIME` TIMESTAMP NOT NULL,
  `CONTENT` LONGTEXT NOT NULL,
  PRIMARY KEY (`ARTICLE_ID`, `USER_ID`, `COMMENT_TIME`),
  CONSTRAINT `fk_ARTICLE_COMMENT_ARTICLE1`
    FOREIGN KEY (`ARTICLE_ID`)
    REFERENCES `gardening_project`.`ARTICLE` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gardening_project`.`POSTSCRIPT`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gardening_project`.`POSTSCRIPT` ;

CREATE TABLE IF NOT EXISTS `gardening_project`.`POSTSCRIPT` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `ARTICLE_ID` INT NULL,
  `TITLE` VARCHAR(128) NOT NULL,
  `CONTENT` LONGTEXT NOT NULL,
  `POSTSCRIPT_TIME` TIMESTAMP NOT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `fk_POSTSCRIPT_ARTICLE1`
    FOREIGN KEY (`ARTICLE_ID`)
    REFERENCES `gardening_project`.`ARTICLE` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gardening_project`.`PEER`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gardening_project`.`PEER` ;

CREATE TABLE IF NOT EXISTS `gardening_project`.`PEER` (
  `USER_ID` VARCHAR(45) NOT NULL,
  `ARTICLE_ID` INT NULL,
  PRIMARY KEY (`USER_ID`, `ARTICLE_ID`),
  CONSTRAINT `fk_PEER_ARTICLE1`
    FOREIGN KEY (`ARTICLE_ID`)
    REFERENCES `gardening_project`.`ARTICLE` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PEER_USER1`
    FOREIGN KEY (`USER_ID`)
    REFERENCES `gardening_project`.`USER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;