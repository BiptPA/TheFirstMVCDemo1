/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50534
Source Host           : localhost:3306
Source Database       : mvc

Target Server Type    : MYSQL
Target Server Version : 50534
File Encoding         : 65001

Date: 2019-01-14 08:27:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `auto_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`auto_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '张三', '123456');
