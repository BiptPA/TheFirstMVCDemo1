/*
Navicat MySQL Data Transfer

Source Server         : project
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : mvc

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-03-31 01:47:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_company
-- ----------------------------
DROP TABLE IF EXISTS `t_company`;
CREATE TABLE `t_company` (
  `autoId` int(11) NOT NULL AUTO_INCREMENT,
  `companyId` varchar(255) DEFAULT NULL,
  `companyName` varchar(255) DEFAULT NULL,
  `companyDscp` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`autoId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_company
-- ----------------------------
INSERT INTO `t_company` VALUES ('1', '1', '北京市卓越科技有限公司', '互联网公司', '北京市朝阳区', '122345', '323534');

-- ----------------------------
-- Table structure for t_deliveryrecord
-- ----------------------------
DROP TABLE IF EXISTS `t_deliveryrecord`;
CREATE TABLE `t_deliveryrecord` (
  `deliverid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `positionid` int(11) DEFAULT NULL,
  `resumeid` int(11) DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `positions` varchar(255) DEFAULT NULL,
  `acceptorrefuse` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`deliverid`),
  KEY `userid` (`userid`),
  KEY `positionid` (`positionid`),
  KEY `resumeid` (`resumeid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_deliveryrecord
-- ----------------------------
INSERT INTO `t_deliveryrecord` VALUES ('1', '2', '3', '5', '赵枫枫', '大数据分析师', '通过');

-- ----------------------------
-- Table structure for t_employ
-- ----------------------------
DROP TABLE IF EXISTS `t_employ`;
CREATE TABLE `t_employ` (
  `autoId` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `account` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`autoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_employ
-- ----------------------------

-- ----------------------------
-- Table structure for t_employer
-- ----------------------------
DROP TABLE IF EXISTS `t_employer`;
CREATE TABLE `t_employer` (
  `auto_id` int(11) NOT NULL AUTO_INCREMENT,
  `company_id` varchar(200) DEFAULT NULL,
  `employer_name` varchar(200) DEFAULT NULL,
  `employer_pwd` varchar(200) DEFAULT NULL,
  `employer_address` varchar(200) DEFAULT NULL,
  `employer_tel` varchar(200) DEFAULT NULL,
  `employer_email` varchar(200) DEFAULT NULL,
  `employer_account` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`auto_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_employer
-- ----------------------------
INSERT INTO `t_employer` VALUES ('1', '1', '李卓', '123', '北京大兴', '13434343434', '3434343434@qq.com', 'lizhuo');

-- ----------------------------
-- Table structure for t_position
-- ----------------------------
DROP TABLE IF EXISTS `t_position`;
CREATE TABLE `t_position` (
  `positionid` int(11) NOT NULL AUTO_INCREMENT,
  `companyId` varchar(200) DEFAULT '2',
  `positions` varchar(255) DEFAULT NULL,
  `postype` varchar(255) DEFAULT NULL,
  `posdate` varchar(255) DEFAULT NULL,
  `posnum` varchar(255) DEFAULT NULL,
  `posdes` varchar(255) DEFAULT NULL,
  `posreq` varchar(255) DEFAULT NULL,
  `possal` varchar(255) DEFAULT NULL,
  `posphone` varchar(255) DEFAULT NULL,
  `posloc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`positionid`),
  KEY `userid` (`companyId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_position
-- ----------------------------
INSERT INTO `t_position` VALUES ('1', '1', 'java高级工程师', '高级工程师', '2019-03-07', '4', '略', '996', '12k+', '1234567890', '北京市朝阳区');
INSERT INTO `t_position` VALUES ('3', '1', '大数据分析师', '高级工程师', '2019-03-06', '5', '略', '996', '12k+', '9876543210', '北京市西城区');
INSERT INTO `t_position` VALUES ('4', '1', '软件工程师', '高级工程师', '2019-03-05', '4', '略', '996', '18k+', '0123456789', '北京市丰台区');

-- ----------------------------
-- Table structure for t_resume
-- ----------------------------
DROP TABLE IF EXISTS `t_resume`;
CREATE TABLE `t_resume` (
  `resumeid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL DEFAULT '2',
  `realname` varchar(255) DEFAULT NULL,
  `idnum` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `education` varchar(255) DEFAULT NULL,
  `school` varchar(255) DEFAULT NULL,
  `languages` varchar(255) DEFAULT NULL,
  `lanlevel` varchar(255) DEFAULT NULL,
  `comlevel` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `workexp` varchar(255) DEFAULT NULL,
  `positions` varchar(255) DEFAULT NULL,
  `exsalary` varchar(255) DEFAULT NULL,
  `phonenum` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `nowaddress` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resumeid`),
  KEY `userid` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_resume
-- ----------------------------
INSERT INTO `t_resume` VALUES ('5', '2', '赵枫枫', '2211958081334', '男', '本科', '北京石油化工学院', '英语', null, '4级', '计算机科学与技术', '1', '大数据分析师', '15000+', '13879987690', '33800239@qq.com', '33800239', '北京丰台');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `roleid` int(11) NOT NULL,
  `rolename` varchar(255) NOT NULL,
  `roledes` varchar(255) NOT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '1', '1');
