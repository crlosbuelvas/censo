-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-07-2016 a las 22:03:09
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `censo-veiculos`
--
CREATE DATABASE IF NOT EXISTS `censo-veiculos` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `censo-veiculos`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductores`
--
-- Creación: 19-07-2016 a las 17:08:26
--

CREATE TABLE `conductores` (
  `cod_conductor` bigint(5) NOT NULL,
  `placa` varchar(6) NOT NULL,
  `id_conductor` bigint(12) NOT NULL,
  `ape1_con` varchar(20) NOT NULL,
  `ape2_con` varchar(20) DEFAULT NULL,
  `nom_com` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELACIONES PARA LA TABLA `conductores`:
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfiles`
--
-- Creación: 19-07-2016 a las 17:08:26
--

CREATE TABLE `perfiles` (
  `cod_perfil` int(1) NOT NULL,
  `desc_perfil` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELACIONES PARA LA TABLA `perfiles`:
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `poseedores`
--
-- Creación: 19-07-2016 a las 17:08:27
--

CREATE TABLE `poseedores` (
  `id_poseedor` bigint(20) NOT NULL,
  `tipo_id` int(2) NOT NULL,
  `ape1_pos` varchar(20) NOT NULL,
  `ape2_pos` varchar(20) DEFAULT NULL,
  `dir_pos` varchar(60) NOT NULL,
  `estrato_pos` varchar(1) DEFAULT NULL,
  `ciudad_pos` varchar(15) DEFAULT NULL,
  `licencia` varchar(2) DEFAULT NULL,
  `sexo_pos` varchar(1) DEFAULT NULL,
  `nacimiento_pos` date DEFAULT NULL,
  `personas_cargo` varchar(2) DEFAULT NULL,
  `n_hijos` varchar(2) DEFAULT NULL,
  `estado_civil` varchar(10) DEFAULT NULL,
  `escolaridad_pos` varchar(12) DEFAULT NULL,
  `profecion_pos` varchar(15) DEFAULT NULL,
  `salud_pos` varchar(15) DEFAULT NULL,
  `nom_pos` varchar(50) NOT NULL,
  `placa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELACIONES PARA LA TABLA `poseedores`:
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietarios`
--
-- Creación: 19-07-2016 a las 17:08:27
--

CREATE TABLE `propietarios` (
  `id_propietario` bigint(20) NOT NULL,
  `tipo_id` int(2) NOT NULL,
  `ape1_pro` varchar(20) NOT NULL,
  `ape2_pro` varchar(20) DEFAULT NULL,
  `dir_pro` varchar(60) NOT NULL,
  `estrato_pro` varchar(1) DEFAULT NULL,
  `ciudad_pro` varchar(15) DEFAULT NULL,
  `licencia` varchar(2) DEFAULT NULL,
  `sexo_pro` varchar(1) DEFAULT NULL,
  `nacimiento_pro` date DEFAULT NULL,
  `personas_cargo` varchar(2) DEFAULT NULL,
  `n_hijos` varchar(2) DEFAULT NULL,
  `estado_civil` varchar(10) DEFAULT NULL,
  `escolaridad_pro` varchar(12) DEFAULT NULL,
  `profecion_pro` varchar(15) DEFAULT NULL,
  `salud_pro` varchar(15) DEFAULT NULL,
  `nom_pro` varchar(50) NOT NULL,
  `placa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELACIONES PARA LA TABLA `propietarios`:
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--
-- Creación: 19-07-2016 a las 17:08:27
--

CREATE TABLE `usuarios` (
  `id_usuario` bigint(12) NOT NULL,
  `cod_id` int(11) NOT NULL,
  `ape1_usuario` varchar(20) NOT NULL,
  `ape2_usuario` varchar(20) DEFAULT NULL,
  `nom_usuario` varchar(50) NOT NULL,
  `dir_usuario` varchar(60) DEFAULT NULL,
  `tel_usuario` bigint(15) DEFAULT NULL,
  `mail_usuario` varchar(60) DEFAULT NULL,
  `cod_perfil` int(1) NOT NULL,
  `contrasena_usuario` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELACIONES PARA LA TABLA `usuarios`:
--   `cod_perfil`
--       `perfiles` -> `cod_perfil`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--
-- Creación: 19-07-2016 a las 17:20:21
--

CREATE TABLE `vehiculos` (
  `n_censo` bigint(20) NOT NULL,
  `placa` varchar(10) NOT NULL,
  `clase` varchar(15) NOT NULL,
  `servicio` varchar(15) NOT NULL,
  `modelo` int(4) NOT NULL,
  `cilindraje` int(4) NOT NULL,
  `color` varchar(20) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `linea` varchar(20) NOT NULL,
  `n_motor` varchar(20) NOT NULL,
  `n_chasis` varchar(20) NOT NULL,
  `n_licencia` varchar(20) DEFAULT NULL,
  `o_transito` varchar(15) NOT NULL,
  `soat` varchar(2) DEFAULT NULL,
  `tecno` varchar(2) DEFAULT NULL,
  `extra` varchar(2) DEFAULT NULL,
  `fecha_de_pago` date DEFAULT NULL,
  `n_recibo` varchar(15) DEFAULT NULL,
  `v_pago` varchar(5) DEFAULT NULL,
  `uso_vehiculo` varchar(15) DEFAULT NULL,
  `observacion` varchar(255) DEFAULT NULL,
  `id_propietario` bigint(15) NOT NULL,
  `id_poseedor` bigint(15) NOT NULL,
  `cod_conductor` bigint(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELACIONES PARA LA TABLA `vehiculos`:
--   `id_propietario`
--       `propietarios` -> `id_propietario`
--   `id_poseedor`
--       `poseedores` -> `id_poseedor`
--   `placa`
--       `conductores` -> `placa`
--   `cod_conductor`
--       `conductores` -> `cod_conductor`
--

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `conductores`
--
ALTER TABLE `conductores`
  ADD PRIMARY KEY (`cod_conductor`),
  ADD KEY `placa` (`placa`);

--
-- Indices de la tabla `perfiles`
--
ALTER TABLE `perfiles`
  ADD PRIMARY KEY (`cod_perfil`);

--
-- Indices de la tabla `poseedores`
--
ALTER TABLE `poseedores`
  ADD PRIMARY KEY (`id_poseedor`),
  ADD KEY `placa` (`placa`);

--
-- Indices de la tabla `propietarios`
--
ALTER TABLE `propietarios`
  ADD PRIMARY KEY (`id_propietario`),
  ADD KEY `placa` (`placa`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `cod_id` (`cod_id`),
  ADD KEY `cod_perfil` (`cod_perfil`);

--
-- Indices de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`n_censo`),
  ADD KEY `id_propietario` (`id_propietario`),
  ADD KEY `id_poseedor` (`id_poseedor`),
  ADD KEY `cod_conductor` (`cod_conductor`),
  ADD KEY `placa` (`placa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `conductores`
--
ALTER TABLE `conductores`
  MODIFY `cod_conductor` bigint(5) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `perfiles`
--
ALTER TABLE `perfiles`
  MODIFY `cod_perfil` int(1) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` bigint(12) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  MODIFY `n_censo` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`cod_perfil`) REFERENCES `perfiles` (`cod_perfil`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD CONSTRAINT `vehiculos_ibfk_1` FOREIGN KEY (`id_propietario`) REFERENCES `propietarios` (`id_propietario`) ON UPDATE CASCADE,
  ADD CONSTRAINT `vehiculos_ibfk_2` FOREIGN KEY (`id_poseedor`) REFERENCES `poseedores` (`id_poseedor`) ON UPDATE CASCADE,
  ADD CONSTRAINT `vehiculos_ibfk_3` FOREIGN KEY (`placa`) REFERENCES `conductores` (`placa`) ON UPDATE CASCADE,
  ADD CONSTRAINT `vehiculos_ibfk_4` FOREIGN KEY (`cod_conductor`) REFERENCES `conductores` (`cod_conductor`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
