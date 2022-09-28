-- phpMyAdmin SQL Dump
-- version 4.4.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-09-2022 a las 17:32:03
-- Versión del servidor: 5.6.25
-- Versión de PHP: 5.6.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `libreria`
--
CREATE DATABASE IF NOT EXISTS `libreria` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `libreria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE IF NOT EXISTS `libros` (
  `codigo` int(11) NOT NULL DEFAULT '0',
  `nombre` varchar(60) DEFAULT NULL,
  `genero` varchar(30) DEFAULT NULL,
  `autor` varchar(60) DEFAULT NULL,
  `paginas` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`codigo`, `nombre`, `genero`, `autor`, `paginas`, `fecha`) VALUES
(1, 'nombre1', 'genero1', 'autor1', 300, '3903-11-05'),
(2, 'nombre2', 'genero2', 'autor2', 400, '3901-11-05'),
(3, 'nombre3', 'genero3', 'autor3', 600, '3902-11-05'),
(4, 'afssa', 'hfghfg', 'golffd', 4324, '3920-11-10');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
