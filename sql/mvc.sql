/*
Navicat MySQL Data Transfer

Source Server         : project
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : mvc

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-03-20 15:24:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_deliveryrecord
-- ----------------------------
DROP TABLE IF EXISTS `t_deliveryrecord`;
CREATE TABLE `t_deliveryrecord` (
  `deliverid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `positionid` int(11) DEFAULT NULL,
  `resumeid` int(11) DEFAULT NULL,
  `acceptorrefuse` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`deliverid`),
  KEY `userid` (`userid`),
  KEY `positionid` (`positionid`),
  KEY `resumeid` (`resumeid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_deliveryrecord
-- ----------------------------
INSERT INTO `t_deliveryrecord` VALUES ('1', '2', '3', '5', null);
INSERT INTO `t_deliveryrecord` VALUES ('2', '2', '3', '5', null);
INSERT INTO `t_deliveryrecord` VALUES ('3', '2', '3', '7', null);
INSERT INTO `t_deliveryrecord` VALUES ('4', '2', '2', '5', null);
INSERT INTO `t_deliveryrecord` VALUES ('5', '2', '2', '7', null);
INSERT INTO `t_deliveryrecord` VALUES ('6', '2', '1', '5', null);
INSERT INTO `t_deliveryrecord` VALUES ('7', '2', '1', '5', null);
INSERT INTO `t_deliveryrecord` VALUES ('8', '2', '2', '7', null);

-- ----------------------------
-- Table structure for t_position
-- ----------------------------
DROP TABLE IF EXISTS `t_position`;
CREATE TABLE `t_position` (
  `positionid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL DEFAULT '2',
  `positions` varchar(255) DEFAULT NULL,
  `postype` varchar(255) DEFAULT NULL,
  `posdate` varchar(255) DEFAULT NULL,
  `posnum` varchar(255) DEFAULT NULL,
  `posdes` varchar(255) DEFAULT NULL,
  `posreq` varchar(255) DEFAULT NULL,
  `possal` varchar(255) DEFAULT NULL,
  `posphone` varchar(255) DEFAULT NULL,
  `posloc` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `comdes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`positionid`),
  KEY `userid` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_position
-- ----------------------------
INSERT INTO `t_position` VALUES ('1', '2', '软件工程师', '高级工程师', '20190408', '10', '略', '3年工作经验', '18k+', '9876543210', '北京市西城区', '北京市博强科技有限公司', '互联网公司');
INSERT INTO `t_position` VALUES ('2', '2', '大数据分析师', '高级工程师', '20190407', '2', '略', '996', '15k+', '0123456789', '北京市朝阳区', '北京市卓越科技有限公司', '互联网公司');
INSERT INTO `t_position` VALUES ('3', '2', '架构师', '工程师', '2019-03-05', '5', '略', '996', '14k+', '1234567890', '北京市丰台区', '北京市枫骚科技有限公司', '上市互联网公司');

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_resume
-- ----------------------------
INSERT INTO `t_resume` VALUES ('5', '2', '赵枫枫', '2211958081334', '男', '本科', '北京石油化工学院', '英语', '4级', '2级', '计算机科学与技术', '1', '大数据分析师', '15000+', '13879987690', '33800239@qq.com', '33800239', '北京大兴');
INSERT INTO `t_resume` VALUES ('7', '2', '王文雁', '2123122543436', '男', '本科', '北京石油化工学院', '英语', '4级', '2级', '计算机科学与技术', '2', '大数据分析师', '15000+', '1393236475', '33800239@qq.com', '39320239', '北京大兴');

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

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `autoid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`autoid`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('23', '吴少轩', '123456');
INSERT INTO `t_user` VALUES ('28', '李卓', '129521');
INSERT INTO `t_user` VALUES ('29', '傻博', '23');
INSERT INTO `t_user` VALUES ('30', 'xudong', '3');
INSERT INTO `t_user` VALUES ('36', 'wenyan', '123456');
INSERT INTO `t_user` VALUES ('37', 'wanyu', '9839953');
INSERT INTO `t_user` VALUES ('39', 'zhaofengfeng', '2143424352');
INSERT INTO `t_user` VALUES ('40', '贾志', '33466-4');
INSERT INTO `t_user` VALUES ('41', '王健成', '3252346');
INSERT INTO `t_user` VALUES ('42', '薛天杰', '54737');
INSERT INTO `t_user` VALUES ('43', '刘阔', '2334262');

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `userpwd` varchar(255) NOT NULL,
  `roleid` int(11) NOT NULL,
  PRIMARY KEY (`userid`),
  KEY `roleid` (`roleid`),
  CONSTRAINT `t_users_ibfk_1` FOREIGN KEY (`roleid`) REFERENCES `t_role` (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_users
-- ----------------------------
