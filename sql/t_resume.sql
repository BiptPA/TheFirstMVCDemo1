/*
Navicat MySQL Data Transfer

Source Server         : project
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : mvc

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-02-17 11:05:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_resume
-- ----------------------------
DROP TABLE IF EXISTS `t_resume`;
CREATE TABLE `t_resume` (
  `resumeid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `realname` varchar(255) NOT NULL,
  `idnum` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `education` varchar(255) NOT NULL,
  `school` varchar(255) NOT NULL,
  `languages` varchar(255) NOT NULL,
  `lanlevel` varchar(255) NOT NULL,
  `comlevel` varchar(255) NOT NULL,
  `major` varchar(255) NOT NULL,
  `workexp` varchar(255) NOT NULL,
  `positions` varchar(255) NOT NULL,
  `exsalary` float(255,0) NOT NULL,
  `phonenum` int(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `qq` int(255) NOT NULL,
  `nowaddress` varchar(255) NOT NULL,
  PRIMARY KEY (`resumeid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_resume
-- ----------------------------
INSERT INTO `t_resume` VALUES ('1', '1', '李卓', '211233199602232223', '男', '大学本科', '北京石油化工学院', '英语', 'cet4', '2', '计算机科学与技术', '无', 'java工程师', '8888', '1233456789', 'liubo666@163.com', '12345678', '北京大兴');
