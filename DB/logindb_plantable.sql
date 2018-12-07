-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: logindb
-- ------------------------------------------------------
-- Server version	5.7.20-log

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
-- Table structure for table `plantable`
--

DROP TABLE IF EXISTS `plantable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plantable` (
  `groupid` int(11) NOT NULL,
  `lessonname` varchar(90) NOT NULL,
  `timetable` varchar(45) NOT NULL,
  `roomnumber` int(11) NOT NULL,
  `teachername` varchar(45) NOT NULL,
  `day` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plantable`
--

LOCK TABLES `plantable` WRITE;
/*!40000 ALTER TABLE `plantable` DISABLE KEYS */;
INSERT INTO `plantable` VALUES (10000,'Introduction to tests','10:00-12:00',123,'Edik Varuten','Monday'),(10000,'Introduction to diplomatic','8:00-10:00',215,'Karl Eiman','Tuesday'),(10000,'Introduction to diplomatic','10:00-12:00',136,'Karl Eiman','Wednesday'),(10000,'Introduction to tests','8:00-10:00',123,'Edik Varuten','Thursday'),(10000,'Introduction to diplomatic','10:00-12:00',136,'Karl Eiman','Friday'),(9999,'Introduction to tests','10:00-12:00',123,'Edik Varuten','Monday'),(9999,'Introduction to tests','10:00-12:00',123,'Edik Varuten','Friday');
/*!40000 ALTER TABLE `plantable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-12 22:34:42
