-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 17 mars 2020 à 17:37
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.1

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `compta_transparency_ir`
--

-- --------------------------------------------------------

--
-- Structure de la table `etatir`
--

CREATE TABLE `etatir` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `ir`
--

CREATE TABLE `ir` (
  `id` bigint(20) NOT NULL,
  `anne` int(11) DEFAULT NULL,
  `date_affectation_comptable` datetime DEFAULT NULL,
  `date_finalisation` datetime DEFAULT NULL,
  `date_saisie` datetime DEFAULT NULL,
  `date_soumission` datetime DEFAULT NULL,
  `date_validation` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `honoraire` decimal(19,2) DEFAULT NULL,
  `majoration` decimal(16,4) DEFAULT NULL,
  `mois` int(11) DEFAULT NULL,
  `montant_base_ir` decimal(16,4) DEFAULT NULL,
  `montant_majoration` decimal(16,4) DEFAULT NULL,
  `montant_penalite` decimal(16,4) DEFAULT NULL,
  `montant_retard` decimal(16,4) DEFAULT NULL,
  `montant_total` decimal(16,4) DEFAULT NULL,
  `nomber_mois_retard` int(11) DEFAULT NULL,
  `nombre_employee_declaree` int(11) NOT NULL,
  `penalite` decimal(16,4) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `reference_comptable_createur` varchar(255) DEFAULT NULL,
  `reference_comptable_validateur` varchar(255) DEFAULT NULL,
  `reference_societe` varchar(255) DEFAULT NULL,
  `total_prime` decimal(16,4) DEFAULT NULL,
  `total_salaire` decimal(16,4) DEFAULT NULL,
  `etatir` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `iremploye`
--

CREATE TABLE `iremploye` (
  `id` bigint(20) NOT NULL,
  `honnoraire` decimal(16,4) DEFAULT NULL,
  `majoration` decimal(16,4) DEFAULT NULL,
  `montant_total` decimal(16,4) DEFAULT NULL,
  `penalite` decimal(16,4) DEFAULT NULL,
  `prime` decimal(16,4) DEFAULT NULL,
  `reference_eemploye` varchar(255) DEFAULT NULL,
  `salaire` decimal(16,4) DEFAULT NULL,
  `etatir` bigint(20) DEFAULT NULL,
  `ir` bigint(20) DEFAULT NULL,
  `tauxir` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `tauxir`
--

CREATE TABLE `tauxir` (
  `id` bigint(20) NOT NULL,
  `date_application_debut` datetime DEFAULT NULL,
  `date_application_fin` datetime DEFAULT NULL,
  `majoration` decimal(16,4) DEFAULT NULL,
  `montant` decimal(16,4) DEFAULT NULL,
  `penalite` decimal(16,4) DEFAULT NULL,
  `salair_max` decimal(16,4) DEFAULT NULL,
  `salair_min` decimal(16,4) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `etatir`
--
ALTER TABLE `etatir`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `ir`
--
ALTER TABLE `ir`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlek312mm0r2rrr6d255sk7wqj` (`etatir`);

--
-- Index pour la table `iremploye`
--
ALTER TABLE `iremploye`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKe18g9q5yjv8orn2r1memdutpf` (`etatir`),
  ADD KEY `FK5126o2bsoum8nknug87lxorw4` (`ir`),
  ADD KEY `FKe3uyn2s6v59ykij9rnyvkra69` (`tauxir`);

--
-- Index pour la table `tauxir`
--
ALTER TABLE `tauxir`
  ADD PRIMARY KEY (`id`);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
