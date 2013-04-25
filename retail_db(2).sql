-- phpMyAdmin SQL Dump
-- version 3.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 17, 2012 at 06:46 PM
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
(12, 'rabin', 'rabin', '787a618784bcf88454b94edc3d0821f1'),
(121, 'Jesus.Christ', 'Jesus.Christ', '305f962e9f917f7d3a932ea8cb8aecd6');

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
(2, 1267),
(3, 534),
(4, 120),
(5, 521),
(6, 34),
(7, 33),
(8, 12),
(9, 34),
(10, 78),
(11, 34),
(12, 9),
(13, 7),
(14, 32),
(15, 8),
(16, 7),
(17, 2011),
(18, 40),
(19, 343),
(20, 23425),
(21, 2016),
(22, 3000),
(23, 30),
(24, 0),
(25, 3);

-- --------------------------------------------------------

--
-- Table structure for table `inv_pos_pck`
--

CREATE TABLE IF NOT EXISTS `inv_pos_pck` (
  `PCK_WID` mediumint(9) NOT NULL,
  `PCK_QTY` int(11) NOT NULL,
  KEY `PCK_ID` (`PCK_WID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pck_dm`
--

CREATE TABLE IF NOT EXISTS `pck_dm` (
  `PCK_ID` mediumint(9) NOT NULL,
  `PROD_WID` int(11) NOT NULL,
  `UPQ` int(11) NOT NULL,
  `PUR_RATE` float NOT NULL,
  `SLS_RATE` float NOT NULL,
  PRIMARY KEY (`PCK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=25 ;

--
-- Dumping data for table `prod_dim`
--

INSERT INTO `prod_dim` (`PROD_ID`, `PROD_NAME`, `SLS_RATE`, `PUR_RATE`) VALUES
(1, 'Vitamin A 500mg', 15, 12),
(2, 'Folic acid ', 87, 23),
(3, 'Cough Syrup 500 ml ', 42, 23),
(4, 'Paracetamol', 32, 23),
(5, 'Analgesic Capsule', 38, 33),
(6, 'Amikacin Amikin', 23, 3),
(7, 'Netilmicin Netromycin', 9, 2),
(8, 'Tobramycin', 12.5, 89),
(9, 'Rifaximin', 10, 7),
(10, 'vitamin d 200 mg', 44, 43),
(11, 'Tobramycin', 12, 7),
(12, 'Geldanamycin', 222, 78),
(13, 'Rifaximin 1000mg', 34, 21),
(14, 'Ertapenem', 18, 8),
(15, 'Meropenem', 96, 89),
(16, 'Cefazolin', 300, 232),
(17, 'Ceftriaxone', 232, 78),
(18, 'Ceftaroline fosamil', 232, 34),
(19, 'Neem Soap', 30, 20),
(20, 'Neem Gel', 56, 52),
(21, 'Hypnotic capsule', 500, 320),
(22, 'Himali Tea', 0, 25),
(23, 'Uknown Medicine', 34, 0),
(24, 'sympus', 0, 33);

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
(2, 1200, 14400, 0),
(3, 500, 11500, 0),
(4, 120, 2760, 0),
(5, 221, 5083, 0),
(6, 34, 1122, 0),
(7, 33, 99, 0),
(8, 12, 24, 0),
(9, 34, 3026, 0),
(10, 78, 546, 0),
(2, 34, 782, 1),
(5, 300, 60000, 1),
(11, 34, 1462, 1),
(12, 7, 49, 1),
(13, 7, 546, 1),
(14, 32, 672, 1),
(15, 8, 64, 1),
(16, 7, 623, 1),
(17, 2000, 464000, 1),
(18, 7, 546, 1),
(19, 343, 11662, 2),
(20, 23425, 468500, 3),
(21, 2016, 104572, 3),
(18, 33, 10989, 4),
(22, 3000, 960000, 5),
(23, 30, 750, 6),
(3, 34, 782, 7),
(24, 0, 100000, 7),
(1, 23, 276, 8),
(2, 33, 759, 9),
(12, 2, 156, 10),
(25, 3, 99, 11),
(17, 11, 858, 12);

-- --------------------------------------------------------

--
-- Table structure for table `pur_fact_pack`
--

CREATE TABLE IF NOT EXISTS `pur_fact_pack` (
  `PCK_WID` mediumint(9) NOT NULL,
  `PUR_WID` int(11) NOT NULL,
  `PCK_QTY` int(11) NOT NULL,
  `PUR_AMT` int(11) NOT NULL,
  KEY `PCK_WID` (`PCK_WID`,`PUR_WID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(0, 'Alkoni Pharma', 'Delhi', '2012-12-16', 38560, 0),
(1, 'Sumeru Pharmacuticals', 'Birgung', '2012-12-16', 567304, 0),
(2, 'Himal Herbal', 'Kathmandu', '2012-12-17', 578966, 0),
(3, 'Neem Pharma', 'Kathmandu', '2012-12-17', 1152038, 0),
(4, 'Everest Medicine Supplier', 'Pokhara', '2012-12-16', 1163027, 0),
(5, 'Hosana Suppliers', 'Austrilia', '2012-12-19', 960000, 0),
(6, 'Sita Suppliers', '34', '2012-12-23', 750, 0),
(7, 'Informal Suppliers', '', '2012-12-16', 100782, 0),
(8, '', '', '2012-12-16', 101058, 0),
(9, '', '', '2012-12-16', 759, 0),
(10, '', '', '2012-12-17', 915, 0),
(11, '', '', '2012-12-17', 99, 0),
(12, '', '', '2012-12-17', 957, 0),
(13, '', '', '2012-12-17', 0, 0);

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
(1, 78, 936, 0),
(1, 23, 276, 1);

-- --------------------------------------------------------

--
-- Table structure for table `sales_tranx_dtl`
--

CREATE TABLE IF NOT EXISTS `sales_tranx_dtl` (
  `SALES_ID` mediumint(9) NOT NULL,
  `CUST_NAME` varchar(30) NOT NULL DEFAULT 'UKN',
  `CUST_LOC` varchar(30) NOT NULL DEFAULT 'UKN',
  `DATE` varchar(10) NOT NULL DEFAULT '4444-44-44',
  `SLS_AMT` int(11) NOT NULL DEFAULT '0',
  `TIME_STMP` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`SALES_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales_tranx_dtl`
--

INSERT INTO `sales_tranx_dtl` (`SALES_ID`, `CUST_NAME`, `CUST_LOC`, `DATE`, `SLS_AMT`, `TIME_STMP`) VALUES
(0, '', '', '2012/12/16', 0, '2012-12-16 13:47:52'),
(1, '', '', '2012/12/16', 0, '2012-12-16 13:48:39'),
(2, '', '', '2012/12/16', 0, '2012-12-16 13:54:32'),
(3, '', '', '2012/12/17', 0, '2012-12-17 17:34:38'),
(4, '', '', '2012/12/17', 0, '2012-12-17 17:36:04'),
(5, '', '', '2012/12/17', 0, '2012-12-17 17:37:00'),
(6, '', '', '2012/12/17', 0, '2012-12-17 17:38:34'),
(7, '', '', '2012/12/17', 0, '2012-12-17 17:39:55'),
(8, '', '', '2012/12/17', 0, '2012-12-17 17:42:45'),
(9, '', '', '2012/12/17', 0, '2012-12-17 17:43:57');

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
(1, 'Rabindra Kharel', 'rabindra.kharel', 'bc3b039759eaf89d1ee1'),
(2, 'Rabindra Kharel', 'rabindra.kharel', 'bc3b039759eaf89d1ee13f0ae3db12f3'),
(121, 'rabin', 'rabin', '787a618784bcf88454b94edc3d0821f1');

-- --------------------------------------------------------

--
-- Table structure for table `usr_log`
--

CREATE TABLE IF NOT EXISTS `usr_log` (
  `SSN_ID` bigint(20) NOT NULL,
  `USR_WID` smallint(6) NOT NULL,
  `YR` year(4) NOT NULL,
  `MNTH` smallint(6) NOT NULL,
  `DT` smallint(6) NOT NULL,
  `DY_NM` int(11) NOT NULL,
  `CHK_IN_TM` time NOT NULL,
  `CHK_OUT_TM` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
