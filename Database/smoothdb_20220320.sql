CREATE DATABASE  IF NOT EXISTS `smoothdb` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `smoothdb`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: smoothdb
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customer_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `phone` varchar(45) NOT NULL,
  `address` mediumtext,
  `total_order` int DEFAULT '0',
  `last_active` date DEFAULT NULL,
  `dob` datetime DEFAULT NULL,
  `card` longtext,
  `email` varchar(45) DEFAULT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingredient`
--

DROP TABLE IF EXISTS `ingredient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingredient` (
  `ingredient_id` int NOT NULL AUTO_INCREMENT,
  `ingredient_name` varchar(255) NOT NULL,
  `ingredient_image_path` text,
  PRIMARY KEY (`ingredient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingredient`
--

LOCK TABLES `ingredient` WRITE;
/*!40000 ALTER TABLE `ingredient` DISABLE KEYS */;
/*!40000 ALTER TABLE `ingredient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location_menu`
--

DROP TABLE IF EXISTS `location_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location_menu` (
  `location_menu_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int DEFAULT NULL,
  `location_tab_id` int DEFAULT NULL,
  `column_no` int DEFAULT NULL,
  `row_no` int DEFAULT NULL,
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`location_menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location_menu`
--

LOCK TABLES `location_menu` WRITE;
/*!40000 ALTER TABLE `location_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `location_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location_mode`
--

DROP TABLE IF EXISTS `location_mode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location_mode` (
  `location_mode_id` int NOT NULL AUTO_INCREMENT,
  `location_mode_name` varchar(255) NOT NULL,
  `location_mode_order` int NOT NULL DEFAULT '1',
  `is_active` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`location_mode_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location_mode`
--

LOCK TABLES `location_mode` WRITE;
/*!40000 ALTER TABLE `location_mode` DISABLE KEYS */;
/*!40000 ALTER TABLE `location_mode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location_tab`
--

DROP TABLE IF EXISTS `location_tab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location_tab` (
  `location_tab_id` int NOT NULL AUTO_INCREMENT,
  `location_tab_name` varchar(255) NOT NULL,
  `location_order` int NOT NULL DEFAULT '1',
  `location_mode_id` int NOT NULL,
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`location_tab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location_tab`
--

LOCK TABLES `location_tab` WRITE;
/*!40000 ALTER TABLE `location_tab` DISABLE KEYS */;
/*!40000 ALTER TABLE `location_tab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `order_at` datetime DEFAULT NULL,
  `order_type_id` int DEFAULT '5',
  `staff_id` int DEFAULT '1',
  `table_section_id` int NOT NULL DEFAULT '0',
  `order_status_id` int DEFAULT '1',
  `payment_id` int DEFAULT '1',
  `customer_id` int DEFAULT '1',
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_detail` (
  `order_detail_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int DEFAULT NULL,
  `popup_item_id` int DEFAULT '1',
  `order_id` int NOT NULL,
  `product_qty` int DEFAULT '0',
  `amount` float DEFAULT '0',
  `comment` mediumtext,
  `cook_status_id` int DEFAULT '1',
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`order_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `popup`
--

DROP TABLE IF EXISTS `popup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `popup` (
  `popup_id` int NOT NULL AUTO_INCREMENT,
  `popup_name` varchar(255) NOT NULL,
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`popup_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `popup`
--

LOCK TABLES `popup` WRITE;
/*!40000 ALTER TABLE `popup` DISABLE KEYS */;
/*!40000 ALTER TABLE `popup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `popup_item`
--

DROP TABLE IF EXISTS `popup_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `popup_item` (
  `popup_item_id` int NOT NULL AUTO_INCREMENT,
  `popup_item_name` varchar(45) DEFAULT NULL,
  `popup_id` int NOT NULL,
  `price` float DEFAULT '0',
  `popup_image_path` longtext,
  PRIMARY KEY (`popup_item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=158 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `popup_item`
--

LOCK TABLES `popup_item` WRITE;
/*!40000 ALTER TABLE `popup_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `popup_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `printer`
--

DROP TABLE IF EXISTS `printer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `printer` (
  `printer_id` int NOT NULL AUTO_INCREMENT,
  `printer_name` varchar(45) NOT NULL,
  `printer_ip` varchar(45) DEFAULT NULL,
  `printer_port` varchar(45) DEFAULT NULL,
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`printer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `printer`
--

LOCK TABLES `printer` WRITE;
/*!40000 ALTER TABLE `printer` DISABLE KEYS */;
/*!40000 ALTER TABLE `printer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `printer_log`
--

DROP TABLE IF EXISTS `printer_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `printer_log` (
  `printer_log_id` int NOT NULL AUTO_INCREMENT,
  `printer_id` int NOT NULL,
  `print_at` datetime NOT NULL,
  `printer_detail` text NOT NULL,
  PRIMARY KEY (`printer_log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `printer_log`
--

LOCK TABLES `printer_log` WRITE;
/*!40000 ALTER TABLE `printer_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `printer_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `printer_product`
--

DROP TABLE IF EXISTS `printer_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `printer_product` (
  `printer_product_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int NOT NULL,
  `printer_id` int NOT NULL,
  `is_active` int DEFAULT '0',
  PRIMARY KEY (`printer_product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `printer_product`
--

LOCK TABLES `printer_product` WRITE;
/*!40000 ALTER TABLE `printer_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `printer_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) NOT NULL,
  `description` longtext,
  `is_available` int DEFAULT '1',
  `product_ingredient_id` int DEFAULT '1',
  `popup_id` int DEFAULT '1',
  `stock` int DEFAULT '0',
  `price` float DEFAULT '0',
  `product_image_path` longtext,
  `food_type_id` int DEFAULT '2',
  `is_active` int DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_ingredient`
--

DROP TABLE IF EXISTS `product_ingredient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_ingredient` (
  `product_id` int NOT NULL,
  `ingredient_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_ingredient`
--

LOCK TABLES `product_ingredient` WRITE;
/*!40000 ALTER TABLE `product_ingredient` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_ingredient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `section`
--

DROP TABLE IF EXISTS `section`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `section` (
  `section_id` int NOT NULL AUTO_INCREMENT,
  `section_name` varchar(255) DEFAULT NULL,
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`section_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `section`
--

LOCK TABLES `section` WRITE;
/*!40000 ALTER TABLE `section` DISABLE KEYS */;
/*!40000 ALTER TABLE `section` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setting`
--

DROP TABLE IF EXISTS `setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setting` (
  `setting_id` int NOT NULL AUTO_INCREMENT,
  `key` varchar(255) NOT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`setting_id`),
  UNIQUE KEY `key_UNIQUE` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setting`
--

LOCK TABLES `setting` WRITE;
/*!40000 ALTER TABLE `setting` DISABLE KEYS */;
/*!40000 ALTER TABLE `setting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `staff_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `staff_position` varchar(45) DEFAULT 'Staff',
  `clock_status` varchar(45) DEFAULT 'In',
  `password` longtext NOT NULL,
  `is_active` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`staff_id`),
  KEY `FK_level_employee` (`staff_position`),
  KEY `FK_status_employee` (`clock_status`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (11,'Test2',NULL,NULL,NULL,'3','1','1234',1);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_time_sheet`
--

DROP TABLE IF EXISTS `staff_time_sheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff_time_sheet` (
  `staff_time_sheet_id` int NOT NULL AUTO_INCREMENT,
  `staff_id` int NOT NULL,
  `clock_in_time` datetime NOT NULL,
  `clock_out_time` datetime NOT NULL,
  PRIMARY KEY (`staff_time_sheet_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_time_sheet`
--

LOCK TABLES `staff_time_sheet` WRITE;
/*!40000 ALTER TABLE `staff_time_sheet` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_time_sheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_section`
--

DROP TABLE IF EXISTS `table_section`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_section` (
  `table_section_id` int NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) NOT NULL,
  `table_section_name` varchar(255) DEFAULT NULL,
  `section_id` int DEFAULT NULL,
  `margin_top` float DEFAULT NULL,
  `margin_bottom` float DEFAULT NULL,
  `margin_right` float DEFAULT NULL,
  `margin_left` float DEFAULT NULL,
  `height` float DEFAULT '50',
  `width` float DEFAULT '50',
  `is_active` int DEFAULT '1',
  PRIMARY KEY (`table_section_id`),
  UNIQUE KEY `u_name_UNIQUE` (`u_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_section`
--

LOCK TABLES `table_section` WRITE;
/*!40000 ALTER TABLE `table_section` DISABLE KEYS */;
/*!40000 ALTER TABLE `table_section` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-20 21:05:37
