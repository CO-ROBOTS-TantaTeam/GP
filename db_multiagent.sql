-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: db_multiagent
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `locationdes_table`
--

DROP TABLE IF EXISTS `locationdes_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locationdes_table` (
  `task_id` int(11) NOT NULL,
  `location_x` float NOT NULL,
  `location_y` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locationdes_table`
--

LOCK TABLES `locationdes_table` WRITE;
/*!40000 ALTER TABLE `locationdes_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `locationdes_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `robot_table`
--

DROP TABLE IF EXISTS `robot_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `robot_table` (
  `robot_id` int(11) NOT NULL AUTO_INCREMENT,
  `robot_availability` tinyint(4) NOT NULL DEFAULT '1',
  `fk_task_id` int(11) DEFAULT NULL,
  `robot_x` float NOT NULL,
  `robot_y` float NOT NULL,
  `robot_maxLoad` float NOT NULL,
  PRIMARY KEY (`robot_id`),
  UNIQUE KEY `robot_id_UNIQUE` (`robot_id`),
  KEY `fk_task_id_idx` (`fk_task_id`),
  CONSTRAINT `fk_task_id` FOREIGN KEY (`fk_task_id`) REFERENCES `task_table` (`task_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `robot_table`
--

LOCK TABLES `robot_table` WRITE;
/*!40000 ALTER TABLE `robot_table` DISABLE KEYS */;
INSERT INTO `robot_table` VALUES (1,1,NULL,5,6,10),(2,1,NULL,5,6,10),(3,1,NULL,54,64,12),(4,1,NULL,54,64,12),(5,1,NULL,54,64,12),(6,1,NULL,543,64,12),(7,1,NULL,1,3,89),(8,1,NULL,1.4,3.9,89),(9,1,NULL,9.9,8.99,78),(10,1,NULL,8.9,9.88,56),(11,1,NULL,89,88,898);
/*!40000 ALTER TABLE `robot_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `robotdes_table`
--

DROP TABLE IF EXISTS `robotdes_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `robotdes_table` (
  `task_id` int(11) NOT NULL,
  `robotDe_x` float NOT NULL,
  `robotDe_y` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `robotdes_table`
--

LOCK TABLES `robotdes_table` WRITE;
/*!40000 ALTER TABLE `robotdes_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `robotdes_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task_table`
--

DROP TABLE IF EXISTS `task_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task_table` (
  `task_id` int(11) NOT NULL AUTO_INCREMENT,
  `task_name` varchar(45) NOT NULL,
  `task_description` varchar(200) DEFAULT NULL,
  `task_load` float NOT NULL,
  `task_available` tinyint(1) DEFAULT NULL,
  `task_duration` datetime DEFAULT NULL,
  `task_StartDate` datetime DEFAULT NULL,
  PRIMARY KEY (`task_id`),
  UNIQUE KEY `task_id_UNIQUE` (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task_table`
--

LOCK TABLES `task_table` WRITE;
/*!40000 ALTER TABLE `task_table` DISABLE KEYS */;
INSERT INTO `task_table` VALUES (3,'jkjkjk','jjj',6777,NULL,NULL,NULL),(4,'ty','hjj',9.99,NULL,NULL,NULL),(5,'tyi','jhj',67.9,NULL,NULL,NULL),(6,'rykl','kldsfjasd',123,NULL,NULL,NULL);
/*!40000 ALTER TABLE `task_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_table`
--

DROP TABLE IF EXISTS `user_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_table` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_mNumber` varchar(20) NOT NULL,
  `user_password` varchar(20) NOT NULL,
  `user_jobDescription` varchar(45) NOT NULL DEFAULT 'user',
  `user_task_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `fk_userTask_id_idx` (`user_task_id`),
  CONSTRAINT `fk_userTask_id` FOREIGN KEY (`user_task_id`) REFERENCES `task_table` (`task_id`) ON DELETE SET NULL ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_table`
--

LOCK TABLES `user_table` WRITE;
/*!40000 ALTER TABLE `user_table` DISABLE KEYS */;
INSERT INTO `user_table` VALUES (4,'toqa','t@gmail.com','1234','toqa','on',NULL),(5,'aya','a@gmail.com','123','aya','on',NULL);
/*!40000 ALTER TABLE `user_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-13 16:08:38
