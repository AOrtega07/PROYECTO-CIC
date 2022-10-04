-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.9.1-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para mydb
CREATE DATABASE IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `mydb`;

-- Volcando estructura para tabla mydb.caso
CREATE TABLE IF NOT EXISTS `caso` (
  `idCaso` int(11) NOT NULL AUTO_INCREMENT,
  `prioridad` varchar(1) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `descripcion` text NOT NULL,
  `registro` date NOT NULL,
  `estado` varchar(45) NOT NULL,
  `Detective_identificacion` int(11) NOT NULL,
  PRIMARY KEY (`idCaso`,`Detective_identificacion`),
  KEY `fk_Caso_Detective_idx` (`Detective_identificacion`),
  CONSTRAINT `fk_Caso_Detective` FOREIGN KEY (`Detective_identificacion`) REFERENCES `detective` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla mydb.caso_has_sospechoso
CREATE TABLE IF NOT EXISTS `caso_has_sospechoso` (
  `Caso_idCaso` int(11) NOT NULL,
  `Caso_Detective_identificacion` int(11) NOT NULL,
  `sospechoso_identificacion` int(11) NOT NULL,
  PRIMARY KEY (`Caso_idCaso`),
  KEY `fk_Caso_has_sospechoso_sospechoso1_idx` (`sospechoso_identificacion`),
  KEY `fk_Caso_has_sospechoso_Caso1_idx` (`Caso_idCaso`,`Caso_Detective_identificacion`),
  CONSTRAINT `fk_Caso_has_sospechoso_Caso1` FOREIGN KEY (`Caso_idCaso`, `Caso_Detective_identificacion`) REFERENCES `caso` (`idCaso`, `Detective_identificacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Caso_has_sospechoso_sospechoso1` FOREIGN KEY (`sospechoso_identificacion`) REFERENCES `sospechoso` (`identificacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla mydb.detective
CREATE TABLE IF NOT EXISTS `detective` (
  `id` int(11) NOT NULL,
  `experiencia` int(11) NOT NULL,
  `especialidad` varchar(45) NOT NULL,
  `Usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`Usuario_id`),
  KEY `fk_Detective_Usuario1_idx` (`Usuario_id`),
  CONSTRAINT `fk_Detective_Usuario1` FOREIGN KEY (`Usuario_id`) REFERENCES `usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla mydb.sospechoso
CREATE TABLE IF NOT EXISTS `sospechoso` (
  `identificacion` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `edad` varchar(45) NOT NULL,
  `alias` varchar(45) DEFAULT NULL,
  `detalles` text NOT NULL,
  PRIMARY KEY (`identificacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla mydb.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Edad` int(11) NOT NULL,
  `Usuario` varchar(45) NOT NULL,
  `Contraseña` varchar(45) NOT NULL,
  `Identificacion` varchar(45) NOT NULL,
  `Administrador` varchar(45) NOT NULL,
  `Detective` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- La exportación de datos fue deseleccionada.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
