create database clientestc;
use clientestc;
CREATE TABLE IF NOT EXISTS `clientes` (
  `identidad` varchar(20) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `genero` char(10) DEFAULT NULL,
  `idDireccion` int DEFAULT NULL,
  PRIMARY KEY (`identidad`),
  KEY `fk_direccion` (`idDireccion`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `direcciones` (
  `idDireccion` int NOT NULL AUTO_INCREMENT,
  `departamento` varchar(20) DEFAULT NULL,
  `ciudad` varchar(20) DEFAULT NULL,
  `calle` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idDireccion`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `tarjetas` (
  `idUnico` int NOT NULL AUTO_INCREMENT,
  `numeroTarjeta` varchar(20) DEFAULT NULL,
  `fechaVencimiento` date DEFAULT NULL,
  `cvv` int DEFAULT NULL,
  `identidad` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idUnico`),
  KEY `fk_cliente` (`identidad`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

COMMIT;