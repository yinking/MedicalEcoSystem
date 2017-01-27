-- MySQL dump 10.13  Distrib 5.6.34, for osx10.11 (x86_64)
--
-- Host: medicalecosystem.csm25uyvtekf.us-east-1.rds.amazonaws.com    Database: MedicalEcoSystem
-- ------------------------------------------------------
-- Server version	5.6.27-log

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
-- Table structure for table `Channeling`
--

DROP TABLE IF EXISTS `Channeling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Channeling` (
  `idchanneling` int(11) NOT NULL AUTO_INCREMENT,
  `enterBy` varchar(45) DEFAULT NULL,
  `issueDate` datetime DEFAULT NULL,
  `doctorName` varchar(45) DEFAULT NULL,
  `speciality` varchar(45) DEFAULT NULL,
  `channelData` varchar(45) DEFAULT NULL,
  `channelTime` varchar(45) DEFAULT NULL,
  `patientName` varchar(45) DEFAULT NULL,
  `tpno` varchar(45) DEFAULT NULL,
  `guardian` varchar(45) DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`idchanneling`),
  KEY `fk_channeling_Doctor1_idx` (`idUser`),
  CONSTRAINT `fk_channeling_Doctor1` FOREIGN KEY (`idUser`) REFERENCES `Doctor` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Channeling`
--

LOCK TABLES `Channeling` WRITE;
/*!40000 ALTER TABLE `Channeling` DISABLE KEYS */;
/*!40000 ALTER TABLE `Channeling` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `City`
--

DROP TABLE IF EXISTS `City`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `City` (
  `idCity` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCity`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `City`
--

LOCK TABLES `City` WRITE;
/*!40000 ALTER TABLE `City` DISABLE KEYS */;
INSERT INTO `City` VALUES (1,'Boston'),(2,'BJ'),(4,'New York');
/*!40000 ALTER TABLE `City` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Compound`
--

DROP TABLE IF EXISTS `Compound`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Compound` (
  `idCompound` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` text,
  `molecularFormula` varchar(45) DEFAULT NULL,
  `molecularStructure` varchar(45) DEFAULT NULL,
  `idCompoundCatalog` int(11) NOT NULL,
  `MolecularWeight` varchar(45) DEFAULT NULL,
  `AssignDate` date DEFAULT NULL,
  PRIMARY KEY (`idCompound`),
  KEY `fk_Compound_CompoundCatalog1_idx` (`idCompoundCatalog`),
  CONSTRAINT `fk_Compound_CompoundCatalog1` FOREIGN KEY (`idCompoundCatalog`) REFERENCES `CompoundCatalog` (`idCompoundCatalog`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Compound`
--

LOCK TABLES `Compound` WRITE;
/*!40000 ALTER TABLE `Compound` DISABLE KEYS */;
INSERT INTO `Compound` VALUES (5,'a-c-d','useful','C8O8H3C2N','DN332',6,'4',NULL),(6,'a-p-d','useful','C32I8H4O','CTDS9',7,'4',NULL),(7,'a-ooo-d','useful','CH8N9C2','N5I8',8,'4',NULL),(8,'Oxygen','desc','C3OH','',9,'w',NULL),(9,'cabony','usefui','C3H25ON87C3','',6,'3',NULL),(10,'cabony','ddd','C8HNO','',6,'3',NULL),(11,'AAA_BB','dd','CON','',7,'5',NULL),(12,'A','AA','C24H8O8N','',6,'A',NULL),(13,'Bowesty','Bowesty is associated with a very low incidence of lactic acidosis.','C9H33','',6,'192',NULL),(14,'C','C','CH8I2O15','C',7,'C',NULL),(15,'1-Dimethylbiguanide','description','C8O66H3','stucture',9,'33',NULL),(16,'GRTYU678','GRTYU678 isan agent belonging to the biguanide class of antidiabetics with antihyperglycemic activity.','C7HO3','',6,'1',NULL),(17,'123','dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd','C2H8N3','32',6,'459',NULL),(18,'Cipargamin','ipargamin(NITD609, KAE609) is an experimental synthetic antimalarial molecule belonging to the spiroindolone class','C19H14Cl2FN3O','KAE609',6,'390.24',NULL),(19,'Lumefantrine','Lumefantrine (or benflumetol) is an antimalarial drug. It is only used in combination with artemether.','C30H32Cl3NO','KAF156',6,'528.94',NULL),(20,'Atorvastatin calcium','Atorvastatin is a pyrrole and heptanoic acid derivative,HYDROXYMETHYLGLUTARYL-COA REDUCTASE INHIBITOR (statin), and ANTICHOLESTEREMIC AGENT that is used to reduce serum levels of LDL-CHOLESTEROL; APOLIPOPROTEIN B; AND TRIGLYCERIDES and to increase serum levels of HDL-CHOLESTEROL in the treatment of HYPERLIPIDEMIAS and prevention of CARDIOVASCULAR DISEASES in patients with multiple risk factors.','C33H35FN2O5','',9,'558.64',NULL),(21,'Clopidogrel','Clopidogrel is an oral, thienopyridine-class drug that is used to inhibit blood clots formation.','C16H16ClNO2S','',7,'822',NULL),(22,'Azithromycin','Azithromycin is an antibiotic that is used for the treatment of variety of bacterial infections such as skin, ear, respiratory infections and sexually transmitted diseases (STDs).\n','C38H72N2O12','',6,'748.98',NULL),(23,'Azithromycin','Azithromycin is an antibiotic that is used for the treatment of variety of bacterial infections such as skin, ear, respiratory infections and sexually transmitted diseases (STDs).\n','C38H72N2O12','',8,'748.98',NULL),(24,'Zolpidem','Zolpidem is a prescription short-acting nonbenzodiazepine hypnotic that potentiates gamma-aminobutyric acid (GABA), an inhibitory neurotransmitter, by binding to benzodiazepine receptors which are located on the gamma-aminobutyric acid receptors. ','C19H21N3O','',8,'307.39',NULL),(25,'Warfarindsa','Warfarin is a drug that is used for the treatment of existing blood clots and to prevent new blood clots formation inside the body.\n','C19H15NaO','DHS681',10,'330.31',NULL),(26,'Metroprololysoee','Metoprolol is a beta-blocker that affects the heart and circulation (blood flow through arteries and veins). Metoprolol is used to treat angina (chest pain) and hypertension (high blood pressure). It is also used to treat or prevent heart attack.','C15H25NO3','',6,'267.36',NULL),(27,'Simvastatin211','Simvastatin is a lipid-lowering substance which is synthetically derived after fermentation of the fungus specie Aspergillus terreus.','C25H38O5','HMG-CoA',9,'418.57',NULL),(28,'Esomeprazoley','Esomeprazole is a synthetic pharmaceutical organic compound named 5-methoxy-2-[(S)-(4-methoxy-3,5-dimethylpyridin-2-yl)methanesulfinyl]-1H-1,3-benzodiazole.','C17H19N3O3S','',6,'461',NULL),(29,'Brufen','Ibuprofen, a propionic acid derivative, is a prototypical nonsteroidal anti-inflammatory agent (NSAIA) with analgesic and antipyretic properties.\n','C13H18O2H','',6,'206.29',NULL),(30,'012Brufen','Ibuprofen, a propionic acid derivative, is a prototypical nonsteroidal anti-inflammatory agent (NSAIA) with analgesic and antipyretic properties.\n','C13H18O2','',6,'206.29',NULL),(31,'Glumetza','Metformin is a Biguanide. The chemical classification of metformin is Biguanides.','C4H11N5','Dimethylbiguanide',10,'129.17',NULL),(32,'Amlodipine','By inhibiting the influx of calcium in smooth muscle cells, amlodipine prevents calcium-dependent myocyte contraction and vasoconstriction.','C20H25ClN2O5','Norvasc',10,'408.99',NULL),(33,'Mupirocin','Mupirocin is a natural aliphatic heteromonocyclic antibacterial compound, which is represented with a molecular formula C26H44O9.','C26H44O9','',9,'622',NULL),(34,'Trazodonedt',' It is generally more useful in depressive disorders associated with insomnia and anxiety. ','C19H22ClN5O','5533',7,'371.89',NULL);
/*!40000 ALTER TABLE `Compound` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CompoundCatalog`
--

DROP TABLE IF EXISTS `CompoundCatalog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CompoundCatalog` (
  `idCompoundCatalog` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCompoundCatalog`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CompoundCatalog`
--

LOCK TABLES `CompoundCatalog` WRITE;
/*!40000 ALTER TABLE `CompoundCatalog` DISABLE KEYS */;
INSERT INTO `CompoundCatalog` VALUES (6,'Cabonyf'),(7,'Sulfur'),(8,'Nitrgen'),(9,'Oxygen'),(10,'Other');
/*!40000 ALTER TABLE `CompoundCatalog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Country`
--

DROP TABLE IF EXISTS `Country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Country` (
  `idCountry` int(11) NOT NULL AUTO_INCREMENT,
  `country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCountry`),
  UNIQUE KEY `country_UNIQUE` (`country`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Country`
--

LOCK TABLES `Country` WRITE;
/*!40000 ALTER TABLE `Country` DISABLE KEYS */;
/*!40000 ALTER TABLE `Country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Doctor`
--

DROP TABLE IF EXISTS `Doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Doctor` (
  `idUser` int(11) NOT NULL,
  `idSpeciality` int(11) NOT NULL,
  PRIMARY KEY (`idUser`),
  KEY `fk_Doctor_User1_idx` (`idUser`),
  KEY `fk_Doctor_Speciality1_idx` (`idSpeciality`),
  CONSTRAINT `fk_Doctor_Speciality1` FOREIGN KEY (`idSpeciality`) REFERENCES `Speciality` (`idSpeciality`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Doctor_User1` FOREIGN KEY (`idUser`) REFERENCES `User` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Doctor`
--

LOCK TABLES `Doctor` WRITE;
/*!40000 ALTER TABLE `Doctor` DISABLE KEYS */;
/*!40000 ALTER TABLE `Doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Drug`
--

DROP TABLE IF EXISTS `Drug`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Drug` (
  `idDrug` int(11) NOT NULL AUTO_INCREMENT,
  `drugNumber` varchar(45) DEFAULT NULL,
  `formula` varchar(45) DEFAULT NULL,
  `uses` varchar(100) DEFAULT NULL,
  `manufature` varchar(45) DEFAULT NULL,
  `route` varchar(45) DEFAULT NULL,
  `indication` varchar(45) DEFAULT NULL,
  `idUser` int(11) DEFAULT NULL,
  `idDrugCatalog` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDrug`),
  UNIQUE KEY `drugNumber` (`drugNumber`),
  KEY `fk_Drug_Druggist1_idx` (`idUser`),
  KEY `fk_Drug_DrugCatalog1_idx` (`idDrugCatalog`),
  CONSTRAINT `fk_Drug_DrugCatalog1` FOREIGN KEY (`idDrugCatalog`) REFERENCES `DrugCatalog` (`idDrugCatalog`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Drug_Druggist1` FOREIGN KEY (`idUser`) REFERENCES `Druggist` (`pkUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Drug`
--

LOCK TABLES `Drug` WRITE;
/*!40000 ALTER TABLE `Drug` DISABLE KEYS */;
INSERT INTO `Drug` VALUES (26,'number','formula','usage','manu','route','	inciation',NULL,5,'name'),(27,'123','3','vv','fffff','ffff','dd',NULL,5,'32'),(28,'DR0001','DC53','30mg/day','Phamachem ltd','Enteral','none',NULL,6,'Cipargamin'),(29,'DR76453','DS53','10mg/day','Lipitor','Enteral','No spicy food or drink',NULL,6,'Atorvastatin');
/*!40000 ALTER TABLE `Drug` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DrugCatalog`
--

DROP TABLE IF EXISTS `DrugCatalog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DrugCatalog` (
  `idDrugCatalog` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDrugCatalog`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DrugCatalog`
--

LOCK TABLES `DrugCatalog` WRITE;
/*!40000 ALTER TABLE `DrugCatalog` DISABLE KEYS */;
INSERT INTO `DrugCatalog` VALUES (5,'Generics-Rx'),(4,'NDA-Rx'),(6,'OTC');
/*!40000 ALTER TABLE `DrugCatalog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Drug_Pharmacytrans`
--

DROP TABLE IF EXISTS `Drug_Pharmacytrans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Drug_Pharmacytrans` (
  `Drug_idDrug` int(11) NOT NULL,
  `Pharmacytrans_idPharmacytrans` int(11) NOT NULL,
  PRIMARY KEY (`Drug_idDrug`,`Pharmacytrans_idPharmacytrans`),
  KEY `fk_Drug_has_Pharmacytrans1_Pharmacytrans2_idx` (`Pharmacytrans_idPharmacytrans`),
  KEY `fk_Drug_has_Pharmacytrans1_Drug2_idx` (`Drug_idDrug`),
  CONSTRAINT `fk_Drug_has_Pharmacytrans1_Drug2` FOREIGN KEY (`Drug_idDrug`) REFERENCES `Drug` (`idDrug`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Drug_has_Pharmacytrans1_Pharmacytrans2` FOREIGN KEY (`Pharmacytrans_idPharmacytrans`) REFERENCES `Pharmacytrans` (`idPharmacytrans`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Drug_Pharmacytrans`
--

LOCK TABLES `Drug_Pharmacytrans` WRITE;
/*!40000 ALTER TABLE `Drug_Pharmacytrans` DISABLE KEYS */;
/*!40000 ALTER TABLE `Drug_Pharmacytrans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Drug_has_Compound`
--

DROP TABLE IF EXISTS `Drug_has_Compound`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Drug_has_Compound` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idCompound` int(11) NOT NULL,
  `compoundWeight` varchar(45) DEFAULT NULL,
  `drugNumber` varchar(45) NOT NULL,
  `assignDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniqueIngrience` (`idCompound`,`compoundWeight`),
  KEY `fk_Drug_has_Compound_Compound1_idx` (`idCompound`),
  KEY `drugNumber_idx` (`drugNumber`),
  CONSTRAINT `drugNumber` FOREIGN KEY (`drugNumber`) REFERENCES `Drug` (`drugNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Drug_has_Compound_Compound1` FOREIGN KEY (`idCompound`) REFERENCES `Compound` (`idCompound`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Drug_has_Compound`
--

LOCK TABLES `Drug_has_Compound` WRITE;
/*!40000 ALTER TABLE `Drug_has_Compound` DISABLE KEYS */;
INSERT INTO `Drug_has_Compound` VALUES (1,5,'1','number','2016-12-05'),(2,6,'2','number','2016-12-05'),(4,6,'1','123','2016-12-05'),(5,18,'15','DR0001','2016-12-11'),(6,17,'3','DR0001','2016-12-11'),(7,27,'5','DR0001','2016-12-11'),(8,20,'25','DR76453','2016-12-11'),(9,16,'4','DR76453','2016-12-11'),(10,7,'1','DR76453','2016-12-11'),(11,10,'6','DR76453','2016-12-11');
/*!40000 ALTER TABLE `Drug_has_Compound` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Druggist`
--

DROP TABLE IF EXISTS `Druggist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Druggist` (
  `pkUser` int(11) NOT NULL AUTO_INCREMENT,
  `fkUser` int(11) DEFAULT NULL,
  PRIMARY KEY (`pkUser`),
  KEY `fk_user_idx` (`fkUser`),
  CONSTRAINT `fk_user` FOREIGN KEY (`fkUser`) REFERENCES `User` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Druggist`
--

LOCK TABLES `Druggist` WRITE;
/*!40000 ALTER TABLE `Druggist` DISABLE KEYS */;
/*!40000 ALTER TABLE `Druggist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Enterprise`
--

DROP TABLE IF EXISTS `Enterprise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Enterprise` (
  `idEnterprise` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `type` enum('DrugEnterprise','HospitalEnterprise') NOT NULL,
  `idCity` int(11) NOT NULL,
  PRIMARY KEY (`idEnterprise`),
  KEY `fk_Enterprise_City1_idx` (`idCity`),
  CONSTRAINT `fk_Enterprise_City1` FOREIGN KEY (`idCity`) REFERENCES `City` (`idCity`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Enterprise`
--

LOCK TABLES `Enterprise` WRITE;
/*!40000 ALTER TABLE `Enterprise` DISABLE KEYS */;
INSERT INTO `Enterprise` VALUES (2,'Boston Hospital','HospitalEnterprise',1),(3,'Boston Children Hospital','HospitalEnterprise',1),(4,'MA hospital','HospitalEnterprise',2),(5,'Boston Drug Center','DrugEnterprise',1),(6,'NYC Children Hospital','HospitalEnterprise',4),(7,'Roche','DrugEnterprise',4),(8,'HeartMe','DrugEnterprise',2);
/*!40000 ALTER TABLE `Enterprise` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Message`
--

DROP TABLE IF EXISTS `Message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Message` (
  `idMessage` int(11) NOT NULL AUTO_INCREMENT,
  `sender` int(11) NOT NULL,
  `receiver` int(11) NOT NULL,
  `content` varchar(100) DEFAULT NULL,
  `idReport` int(11) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idMessage`),
  KEY `fk_receiver_idx` (`receiver`),
  KEY `fk_sender` (`sender`),
  CONSTRAINT `fk_receiver` FOREIGN KEY (`receiver`) REFERENCES `User` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sender` FOREIGN KEY (`sender`) REFERENCES `User` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Message`
--

LOCK TABLES `Message` WRITE;
/*!40000 ALTER TABLE `Message` DISABLE KEYS */;
INSERT INTO `Message` VALUES (1,5,7,'content',NULL,'title'),(2,5,7,'a',NULL,'a'),(3,5,6,'yingying',NULL,'ying'),(4,2,8,'Hi, how are you?',NULL,'First Message'),(5,2,10,'',NULL,''),(6,2,7,'hi',NULL,'hi');
/*!40000 ALTER TABLE `Message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Pharmacytrans`
--

DROP TABLE IF EXISTS `Pharmacytrans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Pharmacytrans` (
  `idPharmacytrans` int(11) NOT NULL AUTO_INCREMENT,
  `enterBy` varchar(45) DEFAULT NULL,
  `issueDate` datetime DEFAULT NULL,
  `custName` varchar(45) DEFAULT NULL,
  `doctorName` varchar(45) DEFAULT NULL,
  `qty` varchar(45) DEFAULT NULL,
  `rate` varchar(45) DEFAULT NULL,
  `amout` varchar(45) DEFAULT NULL,
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`idPharmacytrans`),
  KEY `fk_Pharmacytrans_Doctor1_idx` (`idUser`),
  CONSTRAINT `fk_Pharmacytrans_Doctor1` FOREIGN KEY (`idUser`) REFERENCES `Doctor` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pharmacytrans`
--

LOCK TABLES `Pharmacytrans` WRITE;
/*!40000 ALTER TABLE `Pharmacytrans` DISABLE KEYS */;
/*!40000 ALTER TABLE `Pharmacytrans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Report`
--

DROP TABLE IF EXISTS `Report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Report` (
  `idReport` int(11) NOT NULL,
  `study` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`idReport`),
  KEY `fk_Report_Doctor1_idx` (`idUser`),
  CONSTRAINT `fk_Report_Doctor1` FOREIGN KEY (`idUser`) REFERENCES `Doctor` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Report`
--

LOCK TABLES `Report` WRITE;
/*!40000 ALTER TABLE `Report` DISABLE KEYS */;
/*!40000 ALTER TABLE `Report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Role`
--

DROP TABLE IF EXISTS `Role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Role` (
  `idRole` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`idRole`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Role`
--

LOCK TABLES `Role` WRITE;
/*!40000 ALTER TABLE `Role` DISABLE KEYS */;
/*!40000 ALTER TABLE `Role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Speciality`
--

DROP TABLE IF EXISTS `Speciality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Speciality` (
  `idSpeciality` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `Specialitycol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idSpeciality`),
  UNIQUE KEY `name_UNIQUE` (`name`),
  UNIQUE KEY `Specialitycol_UNIQUE` (`Specialitycol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Speciality`
--

LOCK TABLES `Speciality` WRITE;
/*!40000 ALTER TABLE `Speciality` DISABLE KEYS */;
/*!40000 ALTER TABLE `Speciality` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Study`
--

DROP TABLE IF EXISTS `Study`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Study` (
  `idStudy` int(11) NOT NULL AUTO_INCREMENT,
  `idReport` int(11) DEFAULT NULL,
  `idUser` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `studyPhase` enum('Phase1','Phase2','Phase3') DEFAULT NULL,
  `condition` varchar(45) DEFAULT NULL,
  `intervention` varchar(45) DEFAULT NULL,
  `officalTitle` varchar(45) DEFAULT NULL,
  `sponseredBy` varchar(45) DEFAULT NULL,
  `infoProvidedBy` varchar(45) DEFAULT NULL,
  `startDate` datetime DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `idCatalog` int(11) NOT NULL,
  `studyType` varchar(45) DEFAULT NULL,
  `idDrug` int(11) NOT NULL,
  PRIMARY KEY (`idStudy`),
  KEY `fk_Study_Report1_idx` (`idReport`),
  KEY `fk_Study_Druggist1_idx` (`idUser`),
  KEY `fk_Study_Catalog1_idx` (`idCatalog`),
  KEY `fk_Study_Drug1_idx` (`idDrug`),
  CONSTRAINT `fk_Study_Catalog1` FOREIGN KEY (`idCatalog`) REFERENCES `StudyCatalog` (`idCatalog`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Study_Drug1` FOREIGN KEY (`idDrug`) REFERENCES `Drug` (`idDrug`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Study_Druggist1` FOREIGN KEY (`idUser`) REFERENCES `Druggist` (`pkUser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Study_Report1` FOREIGN KEY (`idReport`) REFERENCES `Report` (`idReport`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Study`
--

LOCK TABLES `Study` WRITE;
/*!40000 ALTER TABLE `Study` DISABLE KEYS */;
/*!40000 ALTER TABLE `Study` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StudyCatalog`
--

DROP TABLE IF EXISTS `StudyCatalog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StudyCatalog` (
  `idCatalog` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCatalog`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StudyCatalog`
--

LOCK TABLES `StudyCatalog` WRITE;
/*!40000 ALTER TABLE `StudyCatalog` DISABLE KEYS */;
/*!40000 ALTER TABLE `StudyCatalog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StudyType`
--

DROP TABLE IF EXISTS `StudyType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StudyType` (
  `idStudyType` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idStudyType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StudyType`
--

LOCK TABLES `StudyType` WRITE;
/*!40000 ALTER TABLE `StudyType` DISABLE KEYS */;
/*!40000 ALTER TABLE `StudyType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `idEnterprise` int(11) NOT NULL,
  `role` enum('SystemAdmin','Admin','Druggist','Doctor','Nurse') NOT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `fk_User_Enterprise1_idx` (`idEnterprise`),
  KEY `fk_User_Role1_idx` (`role`),
  CONSTRAINT `fk_User_Enterprise1` FOREIGN KEY (`idEnterprise`) REFERENCES `Enterprise` (`idEnterprise`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (2,NULL,NULL,NULL,NULL,NULL,'Inka','Inka',2,'SystemAdmin'),(3,NULL,NULL,NULL,NULL,NULL,'XiaoMing','123',3,'SystemAdmin'),(5,NULL,NULL,NULL,NULL,NULL,'DrugYing','DrugYing',2,'Druggist'),(6,NULL,NULL,NULL,NULL,NULL,'DoctorYing','DoctorYing',2,'Doctor'),(7,NULL,NULL,NULL,NULL,NULL,'DoctorKe','DoctorKe',4,'Doctor'),(8,NULL,NULL,NULL,NULL,NULL,'DoctorPu','DoctorPu',4,'Doctor'),(9,NULL,NULL,NULL,NULL,NULL,'DoctorA','DoctorA',4,'Doctor'),(10,NULL,NULL,NULL,NULL,NULL,'DoctorB','DoctorB',4,'Doctor'),(11,NULL,NULL,NULL,NULL,NULL,'DoctorC','DoctorC',4,'Doctor'),(12,NULL,NULL,NULL,NULL,NULL,'kal','kal',5,'Admin'),(13,NULL,NULL,NULL,NULL,NULL,'raj','raj',2,'Admin'),(16,NULL,NULL,NULL,NULL,NULL,'sarah','sarah',3,'Nurse'),(17,NULL,NULL,NULL,NULL,NULL,'lin','lin',6,'Nurse'),(18,NULL,NULL,NULL,NULL,NULL,'ren','ren',7,'Admin'),(19,NULL,NULL,NULL,NULL,NULL,'trump','trump',7,'Druggist'),(20,NULL,NULL,NULL,NULL,NULL,'zang','zang',8,'Admin'),(21,NULL,NULL,NULL,NULL,NULL,'li','li',4,'Doctor'),(22,NULL,NULL,NULL,NULL,NULL,'he','he',4,'Doctor'),(23,NULL,NULL,NULL,NULL,NULL,'ran','ran',8,'Druggist'),(24,NULL,NULL,NULL,NULL,NULL,'ping','ping',4,'Nurse'),(25,NULL,NULL,NULL,NULL,NULL,'Zoey','Zoey',5,'Druggist'),(26,NULL,NULL,NULL,NULL,NULL,'doc','doc',3,'Doctor');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctorMES`
--

DROP TABLE IF EXISTS `doctorMES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctorMES` (
  `doctors_id` varchar(11) NOT NULL,
  `doctors_first_name` varchar(20) NOT NULL,
  `doctors_last_name` varchar(20) NOT NULL,
  `department_id` int(11) NOT NULL,
  `designation` varchar(20) NOT NULL,
  `blood_group` enum('A+','A-','B+','B-','AB+','AB-','O-','O+') NOT NULL,
  `gender` enum('Male','Female') NOT NULL,
  `email` varchar(20) NOT NULL,
  `academic_qualification` text NOT NULL,
  `specialization` varchar(20) NOT NULL,
  `phone_number` varchar(20) NOT NULL,
  `id_number` varchar(20) NOT NULL,
  `registration_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `city` varchar(30) NOT NULL,
  `state` varchar(30) NOT NULL,
  `nationality` varchar(30) NOT NULL,
  `postal_code` varchar(30) NOT NULL,
  `kra_pin` varchar(30) NOT NULL,
  `date_of_birth` date NOT NULL,
  PRIMARY KEY (`doctors_id`),
  KEY `department_id` (`department_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctorMES`
--

LOCK TABLES `doctorMES` WRITE;
/*!40000 ALTER TABLE `doctorMES` DISABLE KEYS */;
INSERT INTO `doctorMES` VALUES ('DR09872','Christopher','Maina',15,'DR.','O-','Male','chris@yahoo.com','Heart-related checkups and failure cases.','Hematology','(+254) 765 389076','32679021','2016-06-04 21:00:00','Nairobi','Karen','Kenyan','62,10909','SDYUI89652','1975-03-12'),('DR098761','Henry','Rajab',9,'Hon.','AB+','Male','henryrajb@yahoo.com','University of India - 1970 - 1981\r\n\r\nM.P Shah School - 1952 - 1966','Diabetic','(+254) 723456901','236098765','2012-06-06 21:00:00','Nairobi','Parklands','Indian','78, 00876','SERYUI7853L','1942-03-06'),('DR1234','Simon','Macharia',1,'Hon.','B+','Male','simomach@gmail.com','TUK - 2000 - 2004\r\nThika High School - 1995 - 1999\r\nBrook-House Primary - 1984 - 1994','Surgery','(+254) 78956343','24590789','2016-06-08 21:00:00','Nairobi','Muthaiga','Kenyan','62, 10101','JK096742313','1980-03-08'),('DR187907','Matthew','Omwando',16,'Dr.','AB-','Male','matowando@gmail.com','TUK - 1989 - 1993\r\nMaseno High School - 1984 - 1987\r\nBondo Primary School - 1979 - 1983','Urologist','(+254) 721367457','23409856','2016-05-24 21:00:00','Kisumu','Siaya','Kenyan','78, 400901','REQW3456UI','1961-06-02'),('DR22908','Susan','Muchemi',8,'Dr.','AB-','Female','suzie@gmail.com','K.U - 1989 - 1996\r\nPangani Girls - 1988 - 1984\r\nPangani Primary - 1972 - 1982','Surgeon','(+254) 776554908','23567854','2015-05-31 21:00:00','Nairobi','Kasarani','Kenyan','65, 00876','SDERQ1278','1957-04-01'),('DR564789','Lucy','Wanjira',13,'DR.','B-','Female','lucwanjira@gmail.com','UON - 1995 - 2000\r\nKabare Girls - 1991 -1994\r\nNyeri Junior - 1979 - 1990','Nutrionist','(+254) 720987654','22578964','2016-06-06 21:00:00','Nyeri','Kagumo','Kenyan','54, 10101','KITYR90734','1962-06-06'),('DR67453','Joseph','Kagiri',2,'Hon.','AB-','Male','joekagiri@yahoo.com','UON - BSC. 1994 - 1999\r\n      MSc. 2000 - 2004\r\nThika High School - 1990 - 1993\r\nSnow View Academy - 1975 - 1989','Surgeon','(+254) 776 905 456','20945612','2016-05-31 21:00:00','Nairobi','Karen','Kenyan','67, 10101','RTYIO908745','1970-02-21'),('DR675432','Moses','Muchiri',5,'Msc.','O-','Male','mosesmuch@gmail.com','K.U - Bsc. 1993 - 1998 \r\n      Msc. 2000 - 2004\r\nNyeri High School 1988 - 1992\r\nNyeri Primary 1975 - 1991','Cardiologist','(+254) 767897324','25490745','2016-05-31 21:00:00','Nyeri','Kamakwa','Kenyan','87, 10121','DFJK908765','1954-06-14'),('DR70895','Mary','Mukami',14,'Hon','AB+','Female','marymu@yahoo.com','Harvard School - Specialized in Nutrition and Dietitics in addition to food science.','Pathologist','(+254) 752 890 456','29076532','2015-12-05 21:00:00','Nairobi','Kasarani','Kenyan','90, 100100','IUER4567JH','1966-06-20'),('DR78678','Mohammed','Abdiwahab',19,'Dr.','O-','Male','mohaabdi@aol.com','UON - 1997 - 1990\r\nNairobi School - 1993 - 1996\r\nNairobi Primary - 1978 - 1992','Neuro-Surgeon','(+254) 710 987656','30156734','2016-06-13 21:00:00','Nairobi','Kasarani','Kenyan','65, 002345','WQRTY8967K','1961-05-08'),('DR89045','Martin','Muchemi',1,'Dr.','AB+','Male','matomuch@aol.com','Certified in examining various body allergies','Allergy Examination','(+254) 720 889560','20945645','2016-03-05 21:00:00','Kisumu','Siaya','Kenyan','56, 010101','YREYU57WER','1965-05-13'),('DR89765','Mercy','Akelo',10,'Msc.','B-','Female','mercyalo@yahoo.com','UON - 2000 - 1993\r\nKisumu Grils - 1988 - 1991\r\nKisumu Primary School - 1972 - 1987','Family Consultancy','(+254) 723789056','23598023','2016-04-20 21:00:00','Kisumu','Siaya','Kenyan','67, 400901','YUI908634','2016-05-10'),('DR97542','Moses','Njagi',4,'Hon.','B-','Male','mosesn@yahoo.com','Kikuyu Learning Center - Specialized on Bone transplant and structure of the Human body.','Bone Transplant','(+254) 790 568 450','201345690','2016-06-30 21:00:00','Mombasa','Kilindini','Kenyan','45, 001001','QWERTYUO9021','1976-07-31');
/*!40000 ALTER TABLE `doctorMES` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctors_departments`
--

DROP TABLE IF EXISTS `doctors_departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctors_departments` (
  `idDepartment` int(11) NOT NULL AUTO_INCREMENT,
  `department_id` int(10) NOT NULL,
  `department_name` varchar(30) NOT NULL,
  PRIMARY KEY (`idDepartment`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctors_departments`
--

LOCK TABLES `doctors_departments` WRITE;
/*!40000 ALTER TABLE `doctors_departments` DISABLE KEYS */;
INSERT INTO `doctors_departments` VALUES (1,1,'Allergy and Immunology'),(2,2,'Intensive Care Unit'),(3,3,'Anesthesiology - Pain Clinic'),(4,4,'Bone Marrow Transplantation'),(5,5,'Cardiology'),(6,6,'Cardio-thoracic surgery'),(7,7,'Dermatology'),(8,8,'Neck and Ear Surgery'),(9,9,'Diabetology'),(10,10,'Family Medicine'),(11,11,'Laboratory Medicine'),(12,12,'Neurology'),(13,13,'Nutrition & Diatetics'),(14,14,'Pathology'),(15,15,'Pulmonology & Critical Care '),(16,16,'Urology'),(17,17,'Rheumatology'),(18,18,'Oncology'),(19,19,'Neuro Surgery'),(20,20,'Internal Medicine'),(21,21,'Nephrology'),(22,22,'Gynecology'),(23,23,'ENT'),(24,24,'Cosmetic Surgery'),(25,25,'Thoracic Surgery');
/*!40000 ALTER TABLE `doctors_departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patients`
--

DROP TABLE IF EXISTS `patients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patients` (
  `patients_id` varchar(11) NOT NULL,
  `patients_first_name` varchar(20) NOT NULL,
  `patients_last_name` varchar(20) NOT NULL,
  `gender` enum('Male','Female') NOT NULL,
  `national_id` int(20) NOT NULL,
  `marital_status` enum('Married','Divorced','Single') NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `date_of_birth` date NOT NULL,
  `registration_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `city` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `nationality` varchar(20) NOT NULL,
  `assigned` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`patients_id`),
  UNIQUE KEY `national_id` (`national_id`),
  KEY `patients_first_name` (`patients_first_name`),
  KEY `patients_first_name_2` (`patients_first_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patients`
--

LOCK TABLES `patients` WRITE;
/*!40000 ALTER TABLE `patients` DISABLE KEYS */;
INSERT INTO `patients` VALUES ('PAT00001','Kiongo','Muregi','Male',30043119,'Married','+254 34675646','kiongo@gmail.com','1978-02-20','2015-12-29 21:00:00','Naivasha','Nakuru','Kenyan',0),('PAT00002','Grace','Ocholla','Female',30043120,'Married','+254 23898766','ochollag@hotmail.com','1985-06-01','2014-12-01 21:00:00','Huruma','Nairobi','Kenya',0),('PAT00003','Kiprop','Tigen','Male',30043121,'Single','+254 78425647','kiptigen@outlook.com','1990-01-08','2015-10-13 21:00:00','Kasarani','Nairobi','Kenyan',0),('PAT00004','Mohammed','Muhammed','Male',30043122,'Divorced','+254 23334567','mohammedm@gmail.com','1989-04-12','2015-03-24 21:00:00','Isilii','Nairobi','Somali',0),('PAT00005','Jugen','Mambo','Male',30043123,'Married','+254 23898798','jugen@hotmail.com','1996-12-18','2015-06-21 21:00:00','Kayole','Nairobi','Kenyan',0),('PAT00006','Cherry','Mutinda','Female',30043124,'Divorced','+254 38765567','mutindac@gmail.com','1985-03-11','2015-07-14 21:00:00','Karen','Nairobi','Kenyan',0),('PAT00007','Mary','Mutiso','Female',30043125,'Married','+254 23898445','marym@outlook.com','1987-08-08','2016-01-18 21:00:00','Rongai','Kajiando','Kenyan',0),('PAT00008','Fridah','Chege','Female',30043126,'Single','+254 38787567','fchege@gmail.com','1999-04-22','2016-03-16 21:00:00','Thika','Kiambu','Kenyan',0),('PAT00009','Saint','Kimani','Male',30043127,'Single','+254 23898645','saintk@gmail.com','2003-11-06','2016-04-16 21:00:00','Pangani','Nairobi','Kenyan',0),('PAT00010','Uber','Omolo','Male',30043128,'Divorced','+254 38765342','uberomosh@gmail.com','1968-10-16','2016-01-27 21:00:00','Runda','Nairobi','KeN',0),('PAT00011','Rose','Nyamai','Female',30043129,'Single','+254 722 567 666','rosen@outlook.com','1996-08-01','2016-02-01 21:00:00','Dandora','Nairobi','Kenyan',0),('PAT00012','Kerry','Andika','Female',30043130,'Married','+254 38711722','kerry@hotmail.com','1980-01-23','2016-01-10 21:00:00','Donholm','Nairobi','Kenyan',0),('PAT00013','Luke','James','Male',30043131,'Single','+254 726567456','lukejames@gmail.com','1963-10-17','2016-03-07 21:00:00','Kimbo','Kiambu','Kenyan',0),('PAT00014','Juma','Kilima','Male',30043132,'Single','+254 38711777','jumakilima@gmail.com','1992-05-21','2016-02-09 21:00:00','Kiambu','Kiambu','Kenyan',0),('PAT00015','Kelcie','Msale','Female',30043133,'Single','+254 38778722','kelcie@outlook.com','1994-11-10','2015-12-14 21:00:00','Umoja','Nairobi','Kenyan',0),('PAT00016','Begovic','Kimondo','Male',76422187,'Married','+254 35712722','bkimondo@gmail.com','1974-10-14','2016-04-02 21:00:00','Kinangop','Laikipia','Kenyan',0),('PAT00017','Ruddy','Hassan','Male',35421887,'Single','+254 33411722','hassanr@hotmail.com','1995-07-14','2016-05-09 21:00:00','Pangani','Nairobi','Kenyan',0),('PAT00018','Wambach','Lucy','Female',23498567,'Divorced','+254 23800945','wambach@outlook.com','1982-10-11','2016-04-03 21:00:00','Kileleshwa','Nairobi','Kenyan',0),('PAT00019','Bridget','Kameni','Female',23689110,'Married','+254 22768342','bkameni@yahoo.com','1986-03-14','2016-06-19 21:00:00','Kiambu','Kiambu','Kenyan',0),('PAT00020','Payet','Dimitri','Male',34527876,'Married','+254 722 567 446','payet.d.outlook.com','1985-09-14','2016-05-09 21:00:00','Karen','Nairobi','France',0),('PAT00035','Juguma','Lopata','Male',27637281,'Married','0789234726','lopata@outlook.com','1990-02-09','2016-07-14 17:00:24','Komarok','Nairobi','Kenyan',0),('PAT23452','Moses','Wanjohi','Male',30043134,'Married','(+254)745 678459','mosewan@gmail.com','1991-06-20','2016-06-08 21:00:00','Nairobi','Kasarani','Kenyan',0),('PAT30821','Charles','Mwangi','Male',30043135,'Divorced','(+254) 720 900 700','charles@gmail.com','1996-06-12','2015-08-06 21:00:00','Nairobi','Kileleshwa','Kenyan',0),('PAT32901','Michelle','Akinyi','Female',30043136,'Single','(+254) 722 568 950','michelle@gmail.com','1991-04-05','2016-05-19 21:00:00','Kisumu','Bondo','Kenyan',0),('PAT34208','Grace','Wanjiru','Female',30043137,'Single','(+254) 724 560 907','gracemur@gmail.com','1994-05-26','2015-11-05 21:00:00','Nyeri','Nyeri Town','Kenyan',0),('PAT43216','Patrick','Ndegwa','Male',30043138,'Married','(+254) 734 786 540','pato@gmail.com','1987-04-06','2015-08-12 21:00:00','Nairobi','Westlands','Kenyan',0),('PAT54214','Jeff','Muchemi','Male',30043139,'Single','(+254) 707 567 890','jeff@outlook.com','1987-06-09','2015-06-13 21:00:00','Eldoret','Kitale','Kenyan',0),('PAT54320','Victor','Waruiru','Male',30043140,'Married','(+254) 725 890 678','victorwaru@aol.com','1976-06-01','2015-08-06 21:00:00','Garissa','River Tana','Kenyan',0),('PAT54389','Joyce','Wairimu','Female',30043141,'Single','(+254) 729 900 678','joyce@yahoo.com','1988-05-01','2016-01-04 21:00:00','Kisumu','Bondo','Kenyan',0),('PAT56432','Royce','Wambui','Female',30043142,'Divorced','(+254) 720 896 435','roycewambu@yahoo.com','1993-05-17','2015-06-11 21:00:00','Mombasa','Nyali','Kenyan',0),('PAT56890','Martha','Agutu','Female',30043143,'Single','(+254) 775 908 445','martha@yahoo.com','1984-06-06','2015-12-13 21:00:00','Kisumu','Siaya','Kenyan',0),('PAT56907','Lyndia','Wanjiru','Male',30043144,'Divorced','(+254) 750 890 456','lyndiaw@gmail.com','1985-06-06','2015-07-12 21:00:00','Garissa','River Tana','Kenyan',0),('PAT60780','William','Muchemi','Male',30043145,'Divorced','(+254) 790 456 709','willimu@gmail.com','1978-08-26','2015-06-23 21:00:00','Mombasa','Nyali','Kenyan',0),('PAT76542','Vincent','Okumu','Male',30043146,'Divorced','(+254) 745 098123','vincent@gmail.com','1987-05-06','2016-05-06 21:00:00','Mombasa','Malindi','Kenyan',0),('PAT79590','Cynthia','Muchemi','Female',30043147,'Divorced','(+254) 730 678 456','cynthia@aol.com','1985-06-06','2016-04-02 21:00:00','Nairobi','South B','Kenyan',0),('PAT87609','Marion','Njoki','Female',30043148,'Married','(+254)708 954 678','marionjoki@yahoo.com','1974-05-24','2015-10-09 21:00:00','Kiambu','Juja','Kenyan',0),('PAT89057','Sharon','Mwangi','Female',30043149,'Single','(+254) 726 780 965','sharonm@yahoo.com','1994-06-07','2015-10-05 21:00:00','Mombasa','Kilifi','Kenyan',0),('PAT89068','Benjamin','Muchemi','Male',30043150,'Married','(+254) 786 900 540','benjamu@yahoo.com','1979-05-27','2015-09-20 21:00:00','Kisumu','Homabay','Kenyan',0),('PAT90080','Vivian','Mukami','Female',30043151,'Single','(+254) 724 900 678','vivian@yahoo.com','1998-05-15','2015-07-03 21:00:00','Nairobi','Dagoretti','Kenyan',0),('PAT90456','Martin','Moseti','Male',30043152,'Single','(+254) 723 450 780','matomoset@yahoo.com','1992-05-25','2016-05-09 21:00:00','Nairobi','South B','Kenyan',0);
/*!40000 ALTER TABLE `patients` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-11 23:34:15
