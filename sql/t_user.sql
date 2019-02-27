/*
Navicat MySQL Data Transfer

Source Server         : project
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : mvc

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-02-27 10:35:10
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
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('23', '吴少轩', '123456');
INSERT INTO `t_user` VALUES ('24', '卓', '129521');
INSERT INTO `t_user` VALUES ('25', 'fengfeng', '29123');
INSERT INTO `t_user` VALUES ('26', 'wangcanran', '12952123');
INSERT INTO `t_user` VALUES ('27', '卓', '129521');
INSERT INTO `t_user` VALUES ('28', '李卓', '129521');
INSERT INTO `t_user` VALUES ('29', 'liubo223', '23');
