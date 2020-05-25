-- MySQL dump 10.13  Distrib 8.0.19, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: accreditation
-- ------------------------------------------------------
-- Server version	8.0.19-0ubuntu0.19.10.3

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
-- Table structure for table `civildocs`
--

DROP TABLE IF EXISTS `civildocs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `civildocs` (
  `Sl.No` int NOT NULL,
  `Documents` varchar(70) NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `civildocs`
--

LOCK TABLES `civildocs` WRITE;
/*!40000 ALTER TABLE `civildocs` DISABLE KEYS */;
INSERT INTO `civildocs` VALUES (1,'Average Grade point (last 3 years data of students\' CGPA)','Pending'),(2,'Accreditation reports of past visits','Pending'),(3,'Placements and higher studies data','Pending'),(4,'Curriculum,POs,PEOs,Mission and Vision statements','Pending'),(5,'Direct and indirect assessment to show attainment of POs and PSOs','Pending'),(6,'Details of faculty student ratio','Pending'),(7,'List of students who cleared the program in 4 years','Pending'),(8,'Department budget and allocations','Pending');
/*!40000 ALTER TABLE `civildocs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `csedocs`
--

DROP TABLE IF EXISTS `csedocs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `csedocs` (
  `Sl.No` int NOT NULL,
  `Documents` varchar(70) NOT NULL,
  `Status` varchar(50) NOT NULL,
  PRIMARY KEY (`Sl.No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `csedocs`
--

LOCK TABLES `csedocs` WRITE;
/*!40000 ALTER TABLE `csedocs` DISABLE KEYS */;
INSERT INTO `csedocs` VALUES (1,'Accreditation reports of past visits','Pending'),(2,'Curriculum,POs,PEOs,Mission and Vision statements','Pending'),(3,'List of students who cleared the program in 4 years','Pending'),(4,'Average Grade point (last 3 years data of students\' CGPA)','Pending'),(5,'Placements and higher studies data','Pending'),(6,'Department budget and allocations','Pending'),(7,'Details of faculty student ratio','Pending'),(8,'Direct and indirect assessment to show attainment of POs and PSOs','Pending');
/*!40000 ALTER TABLE `csedocs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dept.login`
--

DROP TABLE IF EXISTS `dept.login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dept.login` (
  `Dept.id` varchar(10) NOT NULL,
  `Dept.name` varchar(60) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept.login`
--

LOCK TABLES `dept.login` WRITE;
/*!40000 ALTER TABLE `dept.login` DISABLE KEYS */;
INSERT INTO `dept.login` VALUES ('','','',''),('','','',''),('','','',''),('','','',''),('','','',''),('','','',''),('D01','Computer Science and Engineering','computerscience@cet','cetcse3000'),('D02','Mechanical Engineering','mechanical@cet','cetmech3000'),('D03','Electronics and Communication Engineering','electronics@cet','cetece3000'),('D04','Electrical and Electronics Engineering','electrical@cet','ceteee3000'),('D05','Civil Engineering','civil@cet','cetcivil3000');
/*!40000 ALTER TABLE `dept.login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ecedocs`
--

DROP TABLE IF EXISTS `ecedocs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ecedocs` (
  `Sl.No` int DEFAULT NULL,
  `Documents` varchar(70) DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ecedocs`
--

LOCK TABLES `ecedocs` WRITE;
/*!40000 ALTER TABLE `ecedocs` DISABLE KEYS */;
INSERT INTO `ecedocs` VALUES (1,'Department budget and allocations','Pending'),(2,'List of students who cleared the program in 4 years','Pending'),(3,'Curriculum,POs,PEOs,Mission and Vision statements','Pending'),(4,'Accreditation reports of past visits','Pending'),(5,'Direct and indirect assessment to show attainment of POs and PSOs','Pending'),(6,'Placements and higher studies data','Pending'),(7,'Details of faculty student ratio','Pending'),(8,'Average Grade point (last 3 years data of students\' CGPA)','Pending');
/*!40000 ALTER TABLE `ecedocs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eeedocs`
--

DROP TABLE IF EXISTS `eeedocs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eeedocs` (
  `Sl.No` int DEFAULT NULL,
  `Documents` varchar(70) DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eeedocs`
--

LOCK TABLES `eeedocs` WRITE;
/*!40000 ALTER TABLE `eeedocs` DISABLE KEYS */;
INSERT INTO `eeedocs` VALUES (1,'Placements and higher studies data','Pending'),(2,'Accreditation reports of past visits','Pending'),(3,'Details of faculty student ratio','Pending'),(4,'Curriculum,POs,PEOs,Mission and Vision statements','Pending'),(5,'Average Grade point (last 3 years data of students\' CGPA)','Pending'),(6,'Department budget and allocations','Pending'),(7,'Direct and indirect assessment to show attainment of POs and PSOs','Pending'),(8,'List of students who cleared the program in 4 years','Pending');
/*!40000 ALTER TABLE `eeedocs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mechdocs`
--

DROP TABLE IF EXISTS `mechdocs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mechdocs` (
  `Sl.No` int NOT NULL,
  `Documents` varchar(90) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Status` varchar(50) NOT NULL,
  PRIMARY KEY (`Sl.No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mechdocs`
--

LOCK TABLES `mechdocs` WRITE;
/*!40000 ALTER TABLE `mechdocs` DISABLE KEYS */;
INSERT INTO `mechdocs` VALUES (1,'Curriculum,POs,PEOs,Mission and Vision statements','Pending'),(2,'Department budget and allocations','Pending'),(3,'Average Grade point (last 3 years data of students\' CGPA)','Pending'),(4,'Details of faculty student ratio','Pending'),(5,'Direct and indirect assessment to show attainment of POs and PSOs','Pending'),(6,'List of students who cleared the program in 4 years','Pending'),(7,'Accreditation reports of past visits','Pending'),(8,'Placements and higher studies data','Pending');
/*!40000 ALTER TABLE `mechdocs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'accreditation'
--

--
-- Dumping routines for database 'accreditation'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-21 16:43:45
