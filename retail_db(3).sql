-- phpMyAdmin SQL Dump
-- version 3.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 27, 2013 at 09:46 AM
-- Server version: 5.5.25a
-- PHP Version: 5.4.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `retail_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_dtl`
--

CREATE TABLE IF NOT EXISTS `admin_dtl` (
  `USR_ID` int(11) NOT NULL,
  `FMLY_NM` varchar(20) NOT NULL,
  `USR_NM` varchar(20) NOT NULL,
  `USR_PWD` varchar(50) CHARACTER SET armscii8 COLLATE armscii8_bin NOT NULL,
  PRIMARY KEY (`USR_ID`),
  KEY `USR_PWD` (`USR_PWD`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_dtl`
--

INSERT INTO `admin_dtl` (`USR_ID`, `FMLY_NM`, `USR_NM`, `USR_PWD`) VALUES
(101, 'rajeev', 'iomrajeev', 'ca7738caa02bc11c0fbcf8ee49b5203a'),
(102, 'Rabindra kharel', 'rabin', '787a618784bcf88454b94edc3d0821f1');

-- --------------------------------------------------------

--
-- Table structure for table `inv_pos`
--

CREATE TABLE IF NOT EXISTS `inv_pos` (
  `PROD_WID` mediumint(9) NOT NULL,
  `QTY` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`PROD_WID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inv_pos`
--

INSERT INTO `inv_pos` (`PROD_WID`, `QTY`) VALUES
(258, 56),
(259, 6),
(260, 6),
(261, 3),
(262, 6),
(263, 6),
(264, 4),
(265, 3),
(266, 6),
(268, 16),
(269, 10),
(270, 6),
(271, 6),
(272, 6),
(273, 10),
(274, 13),
(275, 12),
(276, 12),
(277, 18),
(278, 18),
(279, 1),
(280, 1),
(281, 50),
(282, 50),
(283, 56),
(284, 25),
(285, 56),
(286, 56),
(287, 50),
(288, 55),
(289, 12),
(290, 50),
(291, 10),
(292, -17),
(293, 56),
(294, 56);

-- --------------------------------------------------------

--
-- Table structure for table `prod_dim`
--

CREATE TABLE IF NOT EXISTS `prod_dim` (
  `PROD_ID` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `PROD_NAME` varchar(40) NOT NULL,
  `SLS_RATE` float NOT NULL,
  `PUR_RATE` float NOT NULL,
  PRIMARY KEY (`PROD_ID`),
  KEY `PROD_NAME` (`PROD_NAME`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=369 ;

--
-- Dumping data for table `prod_dim`
--

INSERT INTO `prod_dim` (`PROD_ID`, `PROD_NAME`, `SLS_RATE`, `PUR_RATE`) VALUES
(258, 'Quintor 500mg Tab', 0, 89.55),
(259, 'Johnson baby powder 100gm', 0, 66.6),
(260, 'Johnson baby powder 50gm', 0, 35.1),
(261, 'Johnson baby powder 200gm', 0, 110.75),
(262, 'Johnson baby lotion 100ml', 0, 108.01),
(263, 'Johnson baby shampoo 100ml', 0, 112.5),
(264, 'Johnson baby oil 50ml', 0, 64.85),
(265, 'Johnson baby oil 200ml', 0, 214),
(266, 'Johnson baby soap 50gm', 0, 31.5),
(268, 'Meropaz 500mg', 0, 862.06),
(269, 'Moov Cream 25g', 0, 69.5),
(270, 'Boro Plus 40gm', 0, 61.9),
(271, 'Boro Plus 20gm', 0, 32),
(272, 'Krack cream 25gm', 0, 72.5),
(273, 'Soframycin Skin 30gm', 0, 33.15),
(274, 'Vancogen Inj', 0, 491),
(275, 'Apetone Syr', 0, 77.6),
(276, 'Vital Syr 200ml', 0, 73.28),
(277, 'Fortiplex Syr', 0, 86.2),
(278, 'Vogoran Syr 200ml', 0, 81.9),
(279, 'Hansaplast', 0, 116),
(280, 'Hansaplast Washproof', 0, 176),
(281, 'Calcium Gluconate TNT', 0, 16.55),
(282, 'Potassium Chloride TNT 10ml', 0, 16.55),
(283, 'Dextrose 10% 500ml', 0, 47.41),
(284, 'Dextrose 50%', 0, 20.76),
(285, 'NS-500ml', 0, 34.48),
(286, 'Dextrose 5% 500ml', 0, 34.48),
(287, 'FRUSTMTDF TNT', 0, 178.5),
(288, 'Benzyl Penicilin 10 Lakh', 0, 10.75),
(289, 'RFPARTN TNT 5ml', 0, 359.1),
(290, 'Water for TNT Glass Hindustan', 0, 2.41),
(291, 'Astymin Pedia 50ml', 0, 319.87),
(292, 'ADFRNAI TNF TNT', 0, 8.27),
(293, 'DNS-500ml', 0, 34.48),
(294, 'RL-500ml', 0, 47.41);

-- --------------------------------------------------------

--
-- Table structure for table `pur_fact`
--

CREATE TABLE IF NOT EXISTS `pur_fact` (
  `PROD_WID` mediumint(9) NOT NULL,
  `PROD_QTY` float NOT NULL,
  `PUR_AMT` float NOT NULL,
  `PUR_WID` mediumint(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pur_fact`
--

INSERT INTO `pur_fact` (`PROD_WID`, `PROD_QTY`, `PUR_AMT`, `PUR_WID`) VALUES
(259, 56, 3597, 0),
(260, 6, 399.6, 1),
(261, 6, 210.6, 1),
(262, 3, 332.25, 1),
(263, 6, 648.06, 1),
(264, 6, 675, 1),
(265, 4, 259.4, 1),
(266, 3, 642, 1),
(267, 6, 189, 1),
(268, 16, 3, 1),
(269, 10, 13793, 2),
(270, 10, 695, 3),
(271, 6, 371.4, 3),
(272, 6, 192, 3),
(273, 6, 435, 3),
(274, 10, 331.5, 3),
(275, 13, 5025.79, 4),
(276, 12, 776, 4),
(277, 12, 732.8, 4),
(278, 18, 1293, 4),
(279, 18, 1228.5, 4),
(280, 1, 116, 4),
(281, 1, 176, 4),
(282, 50, 827.5, 4),
(283, 50, 827.5, 4),
(284, 56, 2654.96, 4),
(285, 25, 519, 4),
(286, 56, 1930.88, 4),
(287, 56, 1930.88, 4),
(288, 50, 178.5, 4),
(289, 55, 537.5, 4),
(290, 12, 3644.87, 4),
(291, 50, 120.5, 4),
(292, 10, 3198.7, 4),
(293, 50, 413.5, 4),
(294, 56, 1930.88, 4),
(295, 56, 2654.96, 4),
(352, 12, 24, 5),
(353, 12, 144, 5),
(354, 12, 12, 5),
(355, 232, 696, 5),
(356, 134, 1, 5),
(350, 12, 144, 6),
(357, 13, 156, 6),
(358, 14, 168, 6);

-- --------------------------------------------------------

--
-- Table structure for table `pur_tranx_dtl`
--

CREATE TABLE IF NOT EXISTS `pur_tranx_dtl` (
  `PUR_ID` mediumint(9) NOT NULL,
  `SUP_NAME` varchar(30) NOT NULL,
  `SUP_LOC` varchar(30) NOT NULL,
  `DATE` date NOT NULL,
  `PUR_AMT` int(11) NOT NULL DEFAULT '0',
  `SSN_ID` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`PUR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pur_tranx_dtl`
--

INSERT INTO `pur_tranx_dtl` (`PUR_ID`, `SUP_NAME`, `SUP_LOC`, `DATE`, `PUR_AMT`, `SSN_ID`) VALUES
(0, 'Shrestha Medicine House', 'Chhetrapati Kathmandu', '2013-01-03', 3597, 2),
(1, 'Shreem Impex', 'Chettrapati Kathmandu', '2013-01-03', 3971, 2),
(2, 'DKM Pharmacuticals PVT LTD', 'Kuleshowr Naya Basti', '2013-01-10', 13535, 3),
(3, 'Saphal Pharma', 'Chhetrapati Ktm', '2013-01-10', 2025, 3),
(4, 'Gautam Medicine Supplier', 'Chhetrapati Kathmandu', '2013-01-10', 20878, 3);

-- --------------------------------------------------------

--
-- Stand-in structure for view `sales_details`
--
CREATE TABLE IF NOT EXISTS `sales_details` (
`YR` varchar(4)
,`MTH` int(2)
,`DY_OF_MTH` int(2)
,`SALES MAN` varchar(20)
,`PRODUCT NAME` varchar(40)
,`QUANTITY` float
,`AMOUNT` float
);
-- --------------------------------------------------------

--
-- Table structure for table `sales_fact`
--

CREATE TABLE IF NOT EXISTS `sales_fact` (
  `PROD_WID` bigint(20) NOT NULL,
  `SLS_QTY` float NOT NULL,
  `SLS_AMT` float NOT NULL,
  `SALES_WID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales_fact`
--

INSERT INTO `sales_fact` (`PROD_WID`, `SLS_QTY`, `SLS_AMT`, `SALES_WID`) VALUES
(296, 0, 12, 5),
(359, 10, 13, 1),
(359, 10, 122, 2),
(361, 8, 72, 3),
(362, 7, 49, 4),
(363, 9, 81, 4),
(364, 9, 89.1, 6),
(365, 8, 72.89, 6),
(366, 0, 123, 7),
(367, 0, 321, 7),
(368, 2, 4, 8),
(369, 12, 144, 8),
(292, 67, 469, 9);

-- --------------------------------------------------------

--
-- Table structure for table `sales_tranx_dtl`
--

CREATE TABLE IF NOT EXISTS `sales_tranx_dtl` (
  `SALES_ID` mediumint(9) NOT NULL,
  `CUST_NAME` varchar(30) NOT NULL DEFAULT 'UKN',
  `CUST_LOC` varchar(30) NOT NULL DEFAULT 'UKN',
  `SLS_AMT` float NOT NULL DEFAULT '0',
  `DISC_AMT` float NOT NULL DEFAULT '0',
  `YR` varchar(4) NOT NULL,
  `MTH` int(2) NOT NULL,
  `DY_OF_MTH` int(2) NOT NULL,
  `DY_OF_WK` varchar(3) NOT NULL,
  `SSN_ID` bigint(20) NOT NULL,
  `TIME_STMP` varchar(8) NOT NULL,
  PRIMARY KEY (`SALES_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales_tranx_dtl`
--

INSERT INTO `sales_tranx_dtl` (`SALES_ID`, `CUST_NAME`, `CUST_LOC`, `SLS_AMT`, `DISC_AMT`, `YR`, `MTH`, `DY_OF_MTH`, `DY_OF_WK`, `SSN_ID`, `TIME_STMP`) VALUES
(0, '', '', 0, 0, '2013', 1, 20, 'Sun', 5, '08:57:38'),
(1, '', '', 13, 0, '2013', 1, 20, 'Sun', 7, '14:04:21');

-- --------------------------------------------------------

--
-- Table structure for table `sls_fact_pck`
--

CREATE TABLE IF NOT EXISTS `sls_fact_pck` (
  `PCK_WID` mediumint(9) NOT NULL,
  `SLS_WID` int(11) NOT NULL,
  `PCK_QTY` int(11) NOT NULL,
  `SLS_AMT` float NOT NULL,
  KEY `PCK_WID` (`PCK_WID`,`SLS_WID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `usr_dtl`
--

CREATE TABLE IF NOT EXISTS `usr_dtl` (
  `USR_ID` int(11) NOT NULL,
  `FMLY_NM` varchar(20) NOT NULL,
  `USR_NM` varchar(20) NOT NULL,
  `USR_PWD` varchar(50) NOT NULL,
  PRIMARY KEY (`USR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usr_dtl`
--

INSERT INTO `usr_dtl` (`USR_ID`, `FMLY_NM`, `USR_NM`, `USR_PWD`) VALUES
(1, 'Rajeev Ghimire', 'iomrajeev', '73b625e13902790d4e66287312fdd72e'),
(2, 'Rabindra Kharel', 'rabin', '787a618784bcf88454b94edc3d0821f1'),
(3, 'Sita Ghimire', 'sita', '803205ab3f1b9b6fa6990393f5ac6b58'),
(4, 'Lokman Shrestha', 'lokman', 'lokman');

-- --------------------------------------------------------

--
-- Table structure for table `usr_log`
--

CREATE TABLE IF NOT EXISTS `usr_log` (
  `SSN_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `USR_WID` smallint(6) NOT NULL,
  `YR` year(4) NOT NULL,
  `MNTH` smallint(6) NOT NULL,
  `DT` varchar(35) NOT NULL,
  `DY_NM` int(11) NOT NULL,
  `CHK_IN_TM` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CHK_OUT_TM` varchar(35) NOT NULL,
  PRIMARY KEY (`SSN_ID`),
  KEY `USR_WID` (`USR_WID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=37 ;

--
-- Dumping data for table `usr_log`
--

INSERT INTO `usr_log` (`SSN_ID`, `USR_WID`, `YR`, `MNTH`, `DT`, `DY_NM`, `CHK_IN_TM`, `CHK_OUT_TM`) VALUES
(1, 101, 2013, 1, '10', 0, '2013-01-10 15:56:25', 'Thu Jan 10 21:41:37 NPT 2013');

-- --------------------------------------------------------

--
-- Structure for view `sales_details`
--
DROP TABLE IF EXISTS `sales_details`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `sales_details` AS select `sales_tranx_dtl`.`YR` AS `YR`,`sales_tranx_dtl`.`MTH` AS `MTH`,`sales_tranx_dtl`.`DY_OF_MTH` AS `DY_OF_MTH`,`usr_dtl`.`FMLY_NM` AS `SALES MAN`,`prod_dim`.`PROD_NAME` AS `PRODUCT NAME`,`sales_fact`.`SLS_QTY` AS `QUANTITY`,`sales_fact`.`SLS_AMT` AS `AMOUNT` from ((((`sales_fact` join `prod_dim`) join `sales_tranx_dtl`) join `usr_dtl`) join `usr_log`) where ((`sales_fact`.`PROD_WID` = `prod_dim`.`PROD_ID`) and (`sales_fact`.`SALES_WID` = `sales_tranx_dtl`.`SALES_ID`) and (`sales_tranx_dtl`.`SSN_ID` = `usr_log`.`SSN_ID`) and (`usr_log`.`USR_WID` = `usr_dtl`.`USR_ID`));

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
