-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmc7l26
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssmc7l26`
--

/*!40000 DROP DATABASE IF EXISTS `ssmc7l26`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmc7l26` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmc7l26`;

--
-- Table structure for table `binglijilu`
--

DROP TABLE IF EXISTS `binglijilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `binglijilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `binglibianhao` varchar(200) DEFAULT NULL COMMENT '病历编号',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiaose` varchar(200) DEFAULT NULL COMMENT '角色',
  `zhusu` varchar(200) DEFAULT NULL COMMENT '主诉',
  `xianbingshi` varchar(200) DEFAULT NULL COMMENT '现病史',
  `jiwangshi` varchar(200) DEFAULT NULL COMMENT '既往史',
  `yaominshi` varchar(200) DEFAULT NULL COMMENT '药敏史',
  `zhenduan` varchar(200) DEFAULT NULL COMMENT '诊断',
  `zhiliaofangan` longtext COMMENT '治疗方案',
  `xiaoyigonghao` varchar(200) DEFAULT NULL COMMENT '校医工号',
  `xiaoyixingming` varchar(200) DEFAULT NULL COMMENT '校医姓名',
  `dengjishijian` datetime DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `binglibianhao` (`binglibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='病例记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `binglijilu`
--

LOCK TABLES `binglijilu` WRITE;
/*!40000 ALTER TABLE `binglijilu` DISABLE KEYS */;
INSERT INTO `binglijilu` VALUES (81,'2022-04-14 03:18:54','1111111111','学号1','姓名1','角色1','主诉1','现病史1','既往史1','药敏史1','诊断1','治疗方案1','校医工号1','校医姓名1','2022-04-14 11:18:54'),(82,'2022-04-14 03:18:54','2222222222','学号2','姓名2','角色2','主诉2','现病史2','既往史2','药敏史2','诊断2','治疗方案2','校医工号2','校医姓名2','2022-04-14 11:18:54'),(83,'2022-04-14 03:18:54','3333333333','学号3','姓名3','角色3','主诉3','现病史3','既往史3','药敏史3','诊断3','治疗方案3','校医工号3','校医姓名3','2022-04-14 11:18:54'),(84,'2022-04-14 03:18:54','4444444444','学号4','姓名4','角色4','主诉4','现病史4','既往史4','药敏史4','诊断4','治疗方案4','校医工号4','校医姓名4','2022-04-14 11:18:54'),(85,'2022-04-14 03:18:54','5555555555','学号5','姓名5','角色5','主诉5','现病史5','既往史5','药敏史5','诊断5','治疗方案5','校医工号5','校医姓名5','2022-04-14 11:18:54'),(86,'2022-04-14 03:18:54','6666666666','学号6','姓名6','角色6','主诉6','现病史6','既往史6','药敏史6','诊断6','治疗方案6','校医工号6','校医姓名6','2022-04-14 11:18:54');
/*!40000 ALTER TABLE `binglijilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussxiaoyi`
--

DROP TABLE IF EXISTS `discussxiaoyi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussxiaoyi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8 COMMENT='校医评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussxiaoyi`
--

LOCK TABLES `discussxiaoyi` WRITE;
/*!40000 ALTER TABLE `discussxiaoyi` DISABLE KEYS */;
INSERT INTO `discussxiaoyi` VALUES (191,'2022-04-14 03:18:54',1,1,'用户名1','评论内容1','回复内容1'),(192,'2022-04-14 03:18:54',2,2,'用户名2','评论内容2','回复内容2'),(193,'2022-04-14 03:18:54',3,3,'用户名3','评论内容3','回复内容3'),(194,'2022-04-14 03:18:54',4,4,'用户名4','评论内容4','回复内容4'),(195,'2022-04-14 03:18:54',5,5,'用户名5','评论内容5','回复内容5'),(196,'2022-04-14 03:18:54',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussxiaoyi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyaopinxinxi`
--

DROP TABLE IF EXISTS `discussyaopinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyaopinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8 COMMENT='药品信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyaopinxinxi`
--

LOCK TABLES `discussyaopinxinxi` WRITE;
/*!40000 ALTER TABLE `discussyaopinxinxi` DISABLE KEYS */;
INSERT INTO `discussyaopinxinxi` VALUES (201,'2022-04-14 03:18:55',1,1,'用户名1','评论内容1','回复内容1'),(202,'2022-04-14 03:18:55',2,2,'用户名2','评论内容2','回复内容2'),(203,'2022-04-14 03:18:55',3,3,'用户名3','评论内容3','回复内容3'),(204,'2022-04-14 03:18:55',4,4,'用户名4','评论内容4','回复内容4'),(205,'2022-04-14 03:18:55',5,5,'用户名5','评论内容5','回复内容5'),(206,'2022-04-14 03:18:55',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussyaopinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fanxiaoshenqing`
--

DROP TABLE IF EXISTS `fanxiaoshenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fanxiaoshenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiaose` varchar(200) DEFAULT NULL COMMENT '角色',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `ruxiaoshijian` datetime DEFAULT NULL COMMENT '入校时间',
  `tiwen` varchar(200) DEFAULT NULL COMMENT '体温',
  `yuekangma` varchar(200) DEFAULT NULL COMMENT '粤康码',
  `xingchengma` varchar(200) DEFAULT NULL COMMENT '行程码',
  `hesuanma` varchar(200) DEFAULT NULL COMMENT '核酸码',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='返校申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fanxiaoshenqing`
--

LOCK TABLES `fanxiaoshenqing` WRITE;
/*!40000 ALTER TABLE `fanxiaoshenqing` DISABLE KEYS */;
INSERT INTO `fanxiaoshenqing` VALUES (111,'2022-04-14 03:18:54','学号1','姓名1','角色1','学院1','2022-04-14 11:18:54','体温1','upload/fanxiaoshenqing_yuekangma1.jpg','upload/fanxiaoshenqing_xingchengma1.jpg','upload/fanxiaoshenqing_hesuanma1.jpg','是',''),(112,'2022-04-14 03:18:54','学号2','姓名2','角色2','学院2','2022-04-14 11:18:54','体温2','upload/fanxiaoshenqing_yuekangma2.jpg','upload/fanxiaoshenqing_xingchengma2.jpg','upload/fanxiaoshenqing_hesuanma2.jpg','是',''),(113,'2022-04-14 03:18:54','学号3','姓名3','角色3','学院3','2022-04-14 11:18:54','体温3','upload/fanxiaoshenqing_yuekangma3.jpg','upload/fanxiaoshenqing_xingchengma3.jpg','upload/fanxiaoshenqing_hesuanma3.jpg','是',''),(114,'2022-04-14 03:18:54','学号4','姓名4','角色4','学院4','2022-04-14 11:18:54','体温4','upload/fanxiaoshenqing_yuekangma4.jpg','upload/fanxiaoshenqing_xingchengma4.jpg','upload/fanxiaoshenqing_hesuanma4.jpg','是',''),(115,'2022-04-14 03:18:54','学号5','姓名5','角色5','学院5','2022-04-14 11:18:54','体温5','upload/fanxiaoshenqing_yuekangma5.jpg','upload/fanxiaoshenqing_xingchengma5.jpg','upload/fanxiaoshenqing_hesuanma5.jpg','是',''),(116,'2022-04-14 03:18:54','学号6','姓名6','角色6','学院6','2022-04-14 11:18:54','体温6','upload/fanxiaoshenqing_yuekangma6.jpg','upload/fanxiaoshenqing_xingchengma6.jpg','upload/fanxiaoshenqing_hesuanma6.jpg','是','');
/*!40000 ALTER TABLE `fanxiaoshenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangshangbao`
--

DROP TABLE IF EXISTS `jiankangshangbao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangshangbao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shoujihao` varchar(200) DEFAULT NULL COMMENT '手机号',
  `jiaose` varchar(200) DEFAULT NULL COMMENT '角色',
  `jiankangma` varchar(200) DEFAULT NULL COMMENT '健康码',
  `xingchengma` varchar(200) DEFAULT NULL COMMENT '行程码',
  `hesuanbaogao` varchar(200) DEFAULT NULL COMMENT '核酸报告',
  `tiwen` varchar(200) DEFAULT NULL COMMENT '体温',
  `beizhu` longtext COMMENT '备注',
  `shangbaoshijian` date DEFAULT NULL COMMENT '上报时间',
  `longitude` float DEFAULT NULL COMMENT '经度',
  `latitude` float DEFAULT NULL COMMENT '纬度',
  `fulladdress` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='健康上报';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangshangbao`
--

LOCK TABLES `jiankangshangbao` WRITE;
/*!40000 ALTER TABLE `jiankangshangbao` DISABLE KEYS */;
INSERT INTO `jiankangshangbao` VALUES (91,'2022-04-14 03:18:54','学号1','姓名1','男','13823888881','角色1','upload/jiankangshangbao_jiankangma1.jpg','upload/jiankangshangbao_xingchengma1.jpg','upload/jiankangshangbao_hesuanbaogao1.jpg','体温1','备注1','2022-04-14',1,1,'宇宙银河系地球1号'),(92,'2022-04-14 03:18:54','学号2','姓名2','男','13823888882','角色2','upload/jiankangshangbao_jiankangma2.jpg','upload/jiankangshangbao_xingchengma2.jpg','upload/jiankangshangbao_hesuanbaogao2.jpg','体温2','备注2','2022-04-14',2,2,'宇宙银河系地球2号'),(93,'2022-04-14 03:18:54','学号3','姓名3','男','13823888883','角色3','upload/jiankangshangbao_jiankangma3.jpg','upload/jiankangshangbao_xingchengma3.jpg','upload/jiankangshangbao_hesuanbaogao3.jpg','体温3','备注3','2022-04-14',3,3,'宇宙银河系地球3号'),(94,'2022-04-14 03:18:54','学号4','姓名4','男','13823888884','角色4','upload/jiankangshangbao_jiankangma4.jpg','upload/jiankangshangbao_xingchengma4.jpg','upload/jiankangshangbao_hesuanbaogao4.jpg','体温4','备注4','2022-04-14',4,4,'宇宙银河系地球4号'),(95,'2022-04-14 03:18:54','学号5','姓名5','男','13823888885','角色5','upload/jiankangshangbao_jiankangma5.jpg','upload/jiankangshangbao_xingchengma5.jpg','upload/jiankangshangbao_hesuanbaogao5.jpg','体温5','备注5','2022-04-14',5,5,'宇宙银河系地球5号'),(96,'2022-04-14 03:18:54','学号6','姓名6','男','13823888886','角色6','upload/jiankangshangbao_jiankangma6.jpg','upload/jiankangshangbao_xingchengma6.jpg','upload/jiankangshangbao_hesuanbaogao6.jpg','体温6','备注6','2022-04-14',6,6,'宇宙银河系地球6号');
/*!40000 ALTER TABLE `jiankangshangbao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `keshi`
--

DROP TABLE IF EXISTS `keshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `keshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `keshi` varchar(200) NOT NULL COMMENT '科室',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='科室';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `keshi`
--

LOCK TABLES `keshi` WRITE;
/*!40000 ALTER TABLE `keshi` DISABLE KEYS */;
INSERT INTO `keshi` VALUES (21,'2022-04-14 03:18:54','科室1'),(22,'2022-04-14 03:18:54','科室2'),(23,'2022-04-14 03:18:54','科室3'),(24,'2022-04-14 03:18:54','科室4'),(25,'2022-04-14 03:18:54','科室5'),(26,'2022-04-14 03:18:54','科室6');
/*!40000 ALTER TABLE `keshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lixiaoshenqing`
--

DROP TABLE IF EXISTS `lixiaoshenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lixiaoshenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiaose` varchar(200) DEFAULT NULL COMMENT '角色',
  `lixiaoshijian` datetime DEFAULT NULL COMMENT '离校时间',
  `mudedi` varchar(200) DEFAULT NULL COMMENT '目的地',
  `tiwen` varchar(200) DEFAULT NULL COMMENT '体温',
  `yuekangma` varchar(200) DEFAULT NULL COMMENT '粤康码',
  `lixiaoliyou` longtext COMMENT '离校理由',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='离校申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lixiaoshenqing`
--

LOCK TABLES `lixiaoshenqing` WRITE;
/*!40000 ALTER TABLE `lixiaoshenqing` DISABLE KEYS */;
INSERT INTO `lixiaoshenqing` VALUES (101,'2022-04-14 03:18:54','学号1','姓名1','角色1','2022-04-14 11:18:54','目的地1','体温1','upload/lixiaoshenqing_yuekangma1.jpg','离校理由1','是',''),(102,'2022-04-14 03:18:54','学号2','姓名2','角色2','2022-04-14 11:18:54','目的地2','体温2','upload/lixiaoshenqing_yuekangma2.jpg','离校理由2','是',''),(103,'2022-04-14 03:18:54','学号3','姓名3','角色3','2022-04-14 11:18:54','目的地3','体温3','upload/lixiaoshenqing_yuekangma3.jpg','离校理由3','是',''),(104,'2022-04-14 03:18:54','学号4','姓名4','角色4','2022-04-14 11:18:54','目的地4','体温4','upload/lixiaoshenqing_yuekangma4.jpg','离校理由4','是',''),(105,'2022-04-14 03:18:54','学号5','姓名5','角色5','2022-04-14 11:18:54','目的地5','体温5','upload/lixiaoshenqing_yuekangma5.jpg','离校理由5','是',''),(106,'2022-04-14 03:18:54','学号6','姓名6','角色6','2022-04-14 11:18:54','目的地6','体温6','upload/lixiaoshenqing_yuekangma6.jpg','离校理由6','是','');
/*!40000 ALTER TABLE `lixiaoshenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8 COMMENT='疫情通告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (181,'2022-04-14 03:18:54','有梦想，就要努力去实现','不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。','upload/news_picture1.jpg','<p>不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?</p><p>你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。其实，我已经厌倦了你这样说说而已的把戏，我觉得就算我告诉你如何去做，你也不会照做，因为你根本什么都不做。</p><p>真正有行动力的人不需要别人告诉他如何做，因为他已经在做了。就算碰到问题，他也会自己想办法，自己动手去解决或者主动寻求可以帮助他的人，而不是等着别人为自己解决问题。</p><p>首先要学习独立思考。花一点时间想一下自己喜欢什么，梦想是什么，不要别人说想环游世界，你就说你的梦想是环游世界。</p><p>很多人说现实束缚了自己，其实在这个世界上，我们一直都可以有很多选择，生活的决定权也—直都在自己手上，只是我们缺乏行动力而已。</p><p>如果你觉得安于现状是你想要的，那选择安于现状就会让你幸福和满足;如果你不甘平庸，选择一条改变、进取和奋斗的道路，在这个追求的过程中，你也一样会感到快乐。所谓的成功，即是按照自己想要的生活方式生活。最糟糕的状态，莫过于当你想要选择一条不甘平庸、改变、进取和奋斗的道路时，却以一种安于现状的方式生活，最后抱怨自己没有得到想要的人生。</p><p>因为喜欢，你不是在苦苦坚持，也因为喜欢，你愿意投入时间、精力，长久以往，获得成功就是自然而然的事情。</p>'),(182,'2022-04-14 03:18:54','又是一年毕业季','又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。','upload/news_picture2.jpg','<p>又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。</p><p>过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。一直都是晚会的忠实参与者，无论是台前还是幕后，忽然间，角色转变，那种感觉确实难以用语言表达。</p><p>	过去的三年，总是默默地期盼着这个好雨时节，因为这时候，会有灿烂的阳光，会有满目的百花争艳，会有香甜的冰激凌，这是个毕业的季节，当时不经世事的我们会殷切地期待学校那一大堆的活动，期待穿上绚丽的演出服或者礼仪服，站在大礼堂镁光灯下尽情挥洒我们的澎拜的激情。</p><p>百感交集，隔岸观火与身临其境的感觉竟是如此不同。从来没想过一场晚会送走的是我们自己的时候会是怎样的感情，毕业就真的意味着结束吗?倔强的我们不愿意承认，谢谢学弟学妹们慷慨的将这次的主题定为“我们在这里”。我知道，这可能是他们对我们这些过来人的尊敬和施舍。</p><p>没有为这场晚会排练、奔波，没有为班级、学生会、文学院出点力，还真有点不习惯，百般无奈中，用“工作忙”个万能的借口来搪塞自己，欺骗别人。其实自己心里明白，那只是在逃避，只是不愿面对繁华落幕后的萧条和落寞。大四了，大家各奔东西，想凑齐班上的人真的是难上加难，敏燕从越南回来，刚落地就匆匆回了学校，那么恋家的人也启程回来了，睿睿学姐也是从家赶来跟我们团圆。大家—如既往的寒暄、打趣、调侃对方，似乎一切又回到了当初的单纯美好。</p><p>看着舞台上活泼可爱的学弟学妹们，如同一群机灵的小精灵，清澈的眼神，稚嫩的肢体，轻快地步伐，用他们那热情洋溢的舞姿渲染着在场的每一个人，我知道，我不应该羡慕嫉妒他们，不应该顾自怜惜逝去的青春，不应该感叹夕阳无限好，曾经，我们也拥有过，曾经，我们也年轻过，曾经，我们也灿烂过。我深深地告诉自己，人生的每个阶段都是美的，年轻有年轻的活力，成熟也有成熟的魅力。多—份稳重、淡然、优雅，也是漫漫时光掠影遗留下的.珍贵赏赐。</p>'),(183,'2022-04-14 03:18:54','挫折路上，坚持常在心间','回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。','upload/news_picture3.jpg','<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>'),(184,'2022-04-14 03:18:54','挫折是另一个生命的开端','当遇到挫折或失败，你是看见失败还是看见机会?挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。','upload/news_picture4.jpg','<p>当遇到挫折或失败，你是看见失败还是看见机会?</p><p>挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。</p><p>人生在世，从古到今，不分天子平民，机遇虽有不同，但总不免有身陷困境或遭遇难题之处，这时候唯有通权达变，才能使人转危为安，甚至反败为胜。</p><p>大部分的人，一生当中，最痛苦的经验是失去所爱的人，其次是丢掉一份工作。其实，经得起考验的人，就算是被开除也不会惊慌，要学会面对。</p><p>	“塞翁失马，焉知非福。”人生的道路，并不是每一步都迈向成功，这就是追求的意义。我们还要认识到一点，挫折作为一种情绪状态和一种个人体验，各人的耐受性是大不相同的，有的人经历了一次次挫折，就能够坚忍不拔，百折不挠;有的人稍遇挫折便意志消沉，一蹶不振。所以，挫折感是一种主观感受，因为人的目的和需要不同，成功标准不同，所以同一种活动对于不同的人可能会造成不同的挫折感受。</p><p>凡事皆以平常心来看待，对于生命顺逆不要太执著。能够“破我执”是很高层的人生境界。</p><p>人事的艰难就是一种考验。就像—支剑要有磨刀来磨，剑才会利:一块璞玉要有粗石来磨，才会发出耀眼的光芒。我们能够做到的，只是如何减少、避免那些由于自身的原因所造成的挫折，而在遇到痛苦和挫折之后，则力求化解痛苦，争取幸福。我们要知道，痛苦和挫折是双重性的，它既是我们人生中难以完全避免的，也是我们在争取成功时，不可缺少的一种动力。因为我认为，推动我们奋斗的力量，不仅仅是对成功的渴望，还有为摆脱痛苦和挫折而进行的奋斗。</p>'),(185,'2022-04-14 03:18:54','你要去相信，没有到不了的明天','有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。','upload/news_picture5.jpg','<p>有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。</p><p>不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。</p><p>	不管你现在是在图书馆里背着怎么也看不进去的英语单词，还是你现在迷茫地看不清未来的方向不知道要往哪走。</p><p>不管你现在是在努力着去实现梦想却没能拉近与梦想的距离，还是你已经慢慢地找不到自己的梦想了。</p><p>你都要去相信，没有到不了的明天。</p><p>	有的时候你的梦想太大，别人说你的梦想根本不可能实现;有的时候你的梦想又太小，又有人说你胸无大志;有的时候你对死党说着将来要去环游世界的梦想，却换来他的不屑一顾，于是你再也不提自己的梦想;有的时候你突然说起将来要开个小店的愿望，却发现你讲述的那个人，并没有听到你在说什么。</p><p>不过又能怎么样呢，未来始终是自己的，梦想始终是自己的，没有人会来帮你实现它。</p><p>也许很多时候我们只是需要朋友的一句鼓励，一句安慰，却也得不到。但是相信我，世界上还有很多人，只是想要和你说说话。</p><p>因为我们都一样。一样的被人说成固执，一样的在追逐他们眼里根本不在意的东西。</p><p>所以，又有什么关系呢，别人始终不是你、不能懂你的心情，你又何必多去解释呢。这个世界会来阻止你，困难也会接踵而至，其实真正关键的只有自己，有没有那个倔强。</p><p>这个世界上没有不带伤的人，真正能治愈自己的，只有自己。</p>'),(186,'2022-04-14 03:18:54','离开是一种痛苦，是一种勇气，但同样也是一个考验，是一个新的开端','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture6.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够确定自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qingjiashenqing`
--

DROP TABLE IF EXISTS `qingjiashenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qingjiashenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qingjiabianhao` varchar(200) DEFAULT NULL COMMENT '请假编号',
  `xiaoyigonghao` varchar(200) DEFAULT NULL COMMENT '校医工号',
  `xiaoyixingming` varchar(200) DEFAULT NULL COMMENT '校医姓名',
  `qingjiashijian` date DEFAULT NULL COMMENT '请假时间',
  `qingjiatianshu` varchar(200) DEFAULT NULL COMMENT '请假天数',
  `qingjialiyou` longtext COMMENT '请假理由',
  `shenqingshijian` datetime DEFAULT NULL COMMENT '申请时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `qingjiabianhao` (`qingjiabianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='请假申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qingjiashenqing`
--

LOCK TABLES `qingjiashenqing` WRITE;
/*!40000 ALTER TABLE `qingjiashenqing` DISABLE KEYS */;
INSERT INTO `qingjiashenqing` VALUES (121,'2022-04-14 03:18:54','1111111111','校医工号1','校医姓名1','2022-04-14','请假天数1','请假理由1','2022-04-14 11:18:54','是',''),(122,'2022-04-14 03:18:54','2222222222','校医工号2','校医姓名2','2022-04-14','请假天数2','请假理由2','2022-04-14 11:18:54','是',''),(123,'2022-04-14 03:18:54','3333333333','校医工号3','校医姓名3','2022-04-14','请假天数3','请假理由3','2022-04-14 11:18:54','是',''),(124,'2022-04-14 03:18:54','4444444444','校医工号4','校医姓名4','2022-04-14','请假天数4','请假理由4','2022-04-14 11:18:54','是',''),(125,'2022-04-14 03:18:54','5555555555','校医工号5','校医姓名5','2022-04-14','请假天数5','请假理由5','2022-04-14 11:18:54','是',''),(126,'2022-04-14 03:18:54','6666666666','校医工号6','校医姓名6','2022-04-14','请假天数6','请假理由6','2022-04-14 11:18:54','是','');
/*!40000 ALTER TABLE `qingjiashenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-04-14 03:18:55');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenzhenhuifu`
--

DROP TABLE IF EXISTS `wenzhenhuifu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenzhenhuifu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiaoyigonghao` varchar(200) DEFAULT NULL COMMENT '校医工号',
  `xiaoyixingming` varchar(200) DEFAULT NULL COMMENT '校医姓名',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiaose` varchar(200) DEFAULT NULL COMMENT '角色',
  `huifushijian` datetime DEFAULT NULL COMMENT '回复时间',
  `huifuneirong` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='问诊回复';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenzhenhuifu`
--

LOCK TABLES `wenzhenhuifu` WRITE;
/*!40000 ALTER TABLE `wenzhenhuifu` DISABLE KEYS */;
INSERT INTO `wenzhenhuifu` VALUES (61,'2022-04-14 03:18:54','校医工号1','校医姓名1','学号1','姓名1','角色1','2022-04-14 11:18:54','回复内容1'),(62,'2022-04-14 03:18:54','校医工号2','校医姓名2','学号2','姓名2','角色2','2022-04-14 11:18:54','回复内容2'),(63,'2022-04-14 03:18:54','校医工号3','校医姓名3','学号3','姓名3','角色3','2022-04-14 11:18:54','回复内容3'),(64,'2022-04-14 03:18:54','校医工号4','校医姓名4','学号4','姓名4','角色4','2022-04-14 11:18:54','回复内容4'),(65,'2022-04-14 03:18:54','校医工号5','校医姓名5','学号5','姓名5','角色5','2022-04-14 11:18:54','回复内容5'),(66,'2022-04-14 03:18:54','校医工号6','校医姓名6','学号6','姓名6','角色6','2022-04-14 11:18:54','回复内容6');
/*!40000 ALTER TABLE `wenzhenhuifu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xianshangguahao`
--

DROP TABLE IF EXISTS `xianshangguahao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xianshangguahao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `guahaobianhao` varchar(200) DEFAULT NULL COMMENT '挂号编号',
  `xiaoyigonghao` varchar(200) DEFAULT NULL COMMENT '校医工号',
  `xiaoyixingming` varchar(200) DEFAULT NULL COMMENT '校医姓名',
  `shijianduan` varchar(200) DEFAULT NULL COMMENT '时间段',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiaose` varchar(200) DEFAULT NULL COMMENT '角色',
  `yuyueshijian` date DEFAULT NULL COMMENT '预约时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `guahaobianhao` (`guahaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='线上挂号';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xianshangguahao`
--

LOCK TABLES `xianshangguahao` WRITE;
/*!40000 ALTER TABLE `xianshangguahao` DISABLE KEYS */;
INSERT INTO `xianshangguahao` VALUES (71,'2022-04-14 03:18:54','1111111111','校医工号1','校医姓名1','08：00-09：00','学号1','姓名1','角色1','2022-04-14'),(72,'2022-04-14 03:18:54','2222222222','校医工号2','校医姓名2','08：00-09：00','学号2','姓名2','角色2','2022-04-14'),(73,'2022-04-14 03:18:54','3333333333','校医工号3','校医姓名3','08：00-09：00','学号3','姓名3','角色3','2022-04-14'),(74,'2022-04-14 03:18:54','4444444444','校医工号4','校医姓名4','08：00-09：00','学号4','姓名4','角色4','2022-04-14'),(75,'2022-04-14 03:18:54','5555555555','校医工号5','校医姓名5','08：00-09：00','学号5','姓名5','角色5','2022-04-14'),(76,'2022-04-14 03:18:54','6666666666','校医工号6','校医姓名6','08：00-09：00','学号6','姓名6','角色6','2022-04-14');
/*!40000 ALTER TABLE `xianshangguahao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaoyi`
--

DROP TABLE IF EXISTS `xiaoyi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaoyi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiaoyigonghao` varchar(200) NOT NULL COMMENT '校医工号',
  `xiaoyixingming` varchar(200) NOT NULL COMMENT '校医姓名',
  `keshi` varchar(200) DEFAULT NULL COMMENT '科室',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `zhicheng` varchar(200) DEFAULT NULL COMMENT '职称',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `yiling` varchar(200) DEFAULT NULL COMMENT '医龄',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `zuozhenshijian` varchar(200) DEFAULT NULL COMMENT '坐诊时间',
  `xiaoyijianjie` longtext COMMENT '校医简介',
  `paibanbiao` longtext COMMENT '排班表',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiaoyigonghao` (`xiaoyigonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='校医';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaoyi`
--

LOCK TABLES `xiaoyi` WRITE;
/*!40000 ALTER TABLE `xiaoyi` DISABLE KEYS */;
INSERT INTO `xiaoyi` VALUES (31,'2022-04-14 03:18:54','校医工号1','校医姓名1','科室1','123456','职称1','男','医龄1','13823888881','upload/xiaoyi_touxiang1.jpg','坐诊时间1','校医简介1','排班表1','2022-04-14 11:18:54'),(32,'2022-04-14 03:18:54','校医工号2','校医姓名2','科室2','123456','职称2','男','医龄2','13823888882','upload/xiaoyi_touxiang2.jpg','坐诊时间2','校医简介2','排班表2','2022-04-14 11:18:54'),(33,'2022-04-14 03:18:54','校医工号3','校医姓名3','科室3','123456','职称3','男','医龄3','13823888883','upload/xiaoyi_touxiang3.jpg','坐诊时间3','校医简介3','排班表3','2022-04-14 11:18:54'),(34,'2022-04-14 03:18:54','校医工号4','校医姓名4','科室4','123456','职称4','男','医龄4','13823888884','upload/xiaoyi_touxiang4.jpg','坐诊时间4','校医简介4','排班表4','2022-04-14 11:18:54'),(35,'2022-04-14 03:18:54','校医工号5','校医姓名5','科室5','123456','职称5','男','医龄5','13823888885','upload/xiaoyi_touxiang5.jpg','坐诊时间5','校医简介5','排班表5','2022-04-14 11:18:54'),(36,'2022-04-14 03:18:54','校医工号6','校医姓名6','科室6','123456','职称6','男','医龄6','13823888886','upload/xiaoyi_touxiang6.jpg','坐诊时间6','校医简介6','排班表6','2022-04-14 11:18:54');
/*!40000 ALTER TABLE `xiaoyi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueyuan`
--

DROP TABLE IF EXISTS `xueyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='学院';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueyuan`
--

LOCK TABLES `xueyuan` WRITE;
/*!40000 ALTER TABLE `xueyuan` DISABLE KEYS */;
INSERT INTO `xueyuan` VALUES (11,'2022-04-14 03:18:54','学院1'),(12,'2022-04-14 03:18:54','学院2'),(13,'2022-04-14 03:18:54','学院3'),(14,'2022-04-14 03:18:54','学院4'),(15,'2022-04-14 03:18:54','学院5'),(16,'2022-04-14 03:18:54','学院6');
/*!40000 ALTER TABLE `xueyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaofangdengji`
--

DROP TABLE IF EXISTS `yaofangdengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaofangdengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `binglibianhao` varchar(200) DEFAULT NULL COMMENT '病历编号',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xiaoyigonghao` varchar(200) DEFAULT NULL COMMENT '校医工号',
  `xiaoyixingming` varchar(200) DEFAULT NULL COMMENT '校医姓名',
  `feiyong` float DEFAULT NULL COMMENT '费用',
  `kaiyaoshijian` datetime DEFAULT NULL COMMENT '开药时间',
  `jibingleixing` varchar(200) DEFAULT NULL COMMENT '疾病类型',
  `jibingmingcheng` varchar(200) DEFAULT NULL COMMENT '疾病名称',
  `yaofang` varchar(200) DEFAULT NULL COMMENT '药方',
  `yongfa` varchar(200) DEFAULT NULL COMMENT '用法',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='药方登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaofangdengji`
--

LOCK TABLES `yaofangdengji` WRITE;
/*!40000 ALTER TABLE `yaofangdengji` DISABLE KEYS */;
INSERT INTO `yaofangdengji` VALUES (151,'2022-04-14 03:18:54','病历编号1','学号1','姓名1','校医工号1','校医姓名1',1,'2022-04-14 11:18:54','疾病类型1','疾病名称1','药方1','用法1','未支付'),(152,'2022-04-14 03:18:54','病历编号2','学号2','姓名2','校医工号2','校医姓名2',2,'2022-04-14 11:18:54','疾病类型2','疾病名称2','药方2','用法2','未支付'),(153,'2022-04-14 03:18:54','病历编号3','学号3','姓名3','校医工号3','校医姓名3',3,'2022-04-14 11:18:54','疾病类型3','疾病名称3','药方3','用法3','未支付'),(154,'2022-04-14 03:18:54','病历编号4','学号4','姓名4','校医工号4','校医姓名4',4,'2022-04-14 11:18:54','疾病类型4','疾病名称4','药方4','用法4','未支付'),(155,'2022-04-14 03:18:54','病历编号5','学号5','姓名5','校医工号5','校医姓名5',5,'2022-04-14 11:18:54','疾病类型5','疾病名称5','药方5','用法5','未支付'),(156,'2022-04-14 03:18:54','病历编号6','学号6','姓名6','校医工号6','校医姓名6',6,'2022-04-14 11:18:54','疾病类型6','疾病名称6','药方6','用法6','未支付');
/*!40000 ALTER TABLE `yaofangdengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaopindingdan`
--

DROP TABLE IF EXISTS `yaopindingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaopindingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinshuliang` int(11) DEFAULT NULL COMMENT '药品数量',
  `yaopinshoujia` float DEFAULT NULL COMMENT '药品售价',
  `zongjine` float DEFAULT NULL COMMENT '总金额',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiaose` varchar(200) DEFAULT NULL COMMENT '角色',
  `goumaishijian` datetime DEFAULT NULL COMMENT '购买时间',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='药品订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaopindingdan`
--

LOCK TABLES `yaopindingdan` WRITE;
/*!40000 ALTER TABLE `yaopindingdan` DISABLE KEYS */;
INSERT INTO `yaopindingdan` VALUES (161,'2022-04-14 03:18:54','药品编号1','药品名称1',1,1,1,'学号1','姓名1','角色1','2022-04-14 11:18:54','未支付'),(162,'2022-04-14 03:18:54','药品编号2','药品名称2',2,2,2,'学号2','姓名2','角色2','2022-04-14 11:18:54','未支付'),(163,'2022-04-14 03:18:54','药品编号3','药品名称3',3,3,3,'学号3','姓名3','角色3','2022-04-14 11:18:54','未支付'),(164,'2022-04-14 03:18:54','药品编号4','药品名称4',4,4,4,'学号4','姓名4','角色4','2022-04-14 11:18:54','未支付'),(165,'2022-04-14 03:18:54','药品编号5','药品名称5',5,5,5,'学号5','姓名5','角色5','2022-04-14 11:18:54','未支付'),(166,'2022-04-14 03:18:54','药品编号6','药品名称6',6,6,6,'学号6','姓名6','角色6','2022-04-14 11:18:54','未支付');
/*!40000 ALTER TABLE `yaopindingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaopinfenlei`
--

DROP TABLE IF EXISTS `yaopinfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaopinfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yaopinfenlei` varchar(200) NOT NULL COMMENT '药品分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yaopinfenlei` (`yaopinfenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='药品分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaopinfenlei`
--

LOCK TABLES `yaopinfenlei` WRITE;
/*!40000 ALTER TABLE `yaopinfenlei` DISABLE KEYS */;
INSERT INTO `yaopinfenlei` VALUES (131,'2022-04-14 03:18:54','药品分类1'),(132,'2022-04-14 03:18:54','药品分类2'),(133,'2022-04-14 03:18:54','药品分类3'),(134,'2022-04-14 03:18:54','药品分类4'),(135,'2022-04-14 03:18:54','药品分类5'),(136,'2022-04-14 03:18:54','药品分类6');
/*!40000 ALTER TABLE `yaopinfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaopinxinxi`
--

DROP TABLE IF EXISTS `yaopinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaopinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yaopinbianhao` varchar(200) DEFAULT NULL COMMENT '药品编号',
  `yaopinmingcheng` varchar(200) DEFAULT NULL COMMENT '药品名称',
  `yaopinzhengshiming` varchar(200) DEFAULT NULL COMMENT '药品正式名',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `danwei` varchar(200) DEFAULT NULL COMMENT '单位',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `yaopinshuliang` int(11) DEFAULT NULL COMMENT '药品数量',
  `yaopinshoujia` float DEFAULT NULL COMMENT '药品售价',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='药品信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaopinxinxi`
--

LOCK TABLES `yaopinxinxi` WRITE;
/*!40000 ALTER TABLE `yaopinxinxi` DISABLE KEYS */;
INSERT INTO `yaopinxinxi` VALUES (141,'2022-04-14 03:18:54','药品编号1','药品名称1','药品正式名1','upload/yaopinxinxi_tupian1.jpg','规格1','单位1','产地1',1,1,'备注1'),(142,'2022-04-14 03:18:54','药品编号2','药品名称2','药品正式名2','upload/yaopinxinxi_tupian2.jpg','规格2','单位2','产地2',2,2,'备注2'),(143,'2022-04-14 03:18:54','药品编号3','药品名称3','药品正式名3','upload/yaopinxinxi_tupian3.jpg','规格3','单位3','产地3',3,3,'备注3'),(144,'2022-04-14 03:18:54','药品编号4','药品名称4','药品正式名4','upload/yaopinxinxi_tupian4.jpg','规格4','单位4','产地4',4,4,'备注4'),(145,'2022-04-14 03:18:54','药品编号5','药品名称5','药品正式名5','upload/yaopinxinxi_tupian5.jpg','规格5','单位5','产地5',5,5,'备注5'),(146,'2022-04-14 03:18:54','药品编号6','药品名称6','药品正式名6','upload/yaopinxinxi_tupian6.jpg','规格6','单位6','产地6',6,6,'备注6');
/*!40000 ALTER TABLE `yaopinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `shoujihao` varchar(200) DEFAULT NULL COMMENT '手机号',
  `jiaose` varchar(200) DEFAULT NULL COMMENT '角色',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (41,'2022-04-14 03:18:54','学号1','姓名1','123456','男',1,'13823888881','学生','学院1','专业1'),(42,'2022-04-14 03:18:54','学号2','姓名2','123456','男',2,'13823888882','学生','学院2','专业2'),(43,'2022-04-14 03:18:54','学号3','姓名3','123456','男',3,'13823888883','学生','学院3','专业3'),(44,'2022-04-14 03:18:54','学号4','姓名4','123456','男',4,'13823888884','学生','学院4','专业4'),(45,'2022-04-14 03:18:54','学号5','姓名5','123456','男',5,'13823888885','学生','学院5','专业5'),(46,'2022-04-14 03:18:54','学号6','姓名6','123456','男',6,'13823888886','学生','学院6','专业6');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zaixianwenzhen`
--

DROP TABLE IF EXISTS `zaixianwenzhen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zaixianwenzhen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiaoyigonghao` varchar(200) DEFAULT NULL COMMENT '校医工号',
  `xiaoyixingming` varchar(200) DEFAULT NULL COMMENT '校医姓名',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiaose` varchar(200) DEFAULT NULL COMMENT '角色',
  `wenzhenshijian` datetime DEFAULT NULL COMMENT '问诊时间',
  `huifuzhuangtai` varchar(200) DEFAULT NULL COMMENT '回复状态',
  `xiangguanbingli` varchar(200) DEFAULT NULL COMMENT '相关病历',
  `zhengzhuangmiaoshu` longtext COMMENT '症状描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='在线问诊';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zaixianwenzhen`
--

LOCK TABLES `zaixianwenzhen` WRITE;
/*!40000 ALTER TABLE `zaixianwenzhen` DISABLE KEYS */;
INSERT INTO `zaixianwenzhen` VALUES (51,'2022-04-14 03:18:54','校医工号1','校医姓名1','upload/zaixianwenzhen_touxiang1.jpg','用户名1','姓名1','角色1','2022-04-14 11:18:54','已回复','','症状描述1'),(52,'2022-04-14 03:18:54','校医工号2','校医姓名2','upload/zaixianwenzhen_touxiang2.jpg','用户名2','姓名2','角色2','2022-04-14 11:18:54','已回复','','症状描述2'),(53,'2022-04-14 03:18:54','校医工号3','校医姓名3','upload/zaixianwenzhen_touxiang3.jpg','用户名3','姓名3','角色3','2022-04-14 11:18:54','已回复','','症状描述3'),(54,'2022-04-14 03:18:54','校医工号4','校医姓名4','upload/zaixianwenzhen_touxiang4.jpg','用户名4','姓名4','角色4','2022-04-14 11:18:54','已回复','','症状描述4'),(55,'2022-04-14 03:18:54','校医工号5','校医姓名5','upload/zaixianwenzhen_touxiang5.jpg','用户名5','姓名5','角色5','2022-04-14 11:18:54','已回复','','症状描述5'),(56,'2022-04-14 03:18:54','校医工号6','校医姓名6','upload/zaixianwenzhen_touxiang6.jpg','用户名6','姓名6','角色6','2022-04-14 11:18:54','已回复','','症状描述6');
/*!40000 ALTER TABLE `zaixianwenzhen` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-14 22:13:50
