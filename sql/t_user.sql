/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50621
Source Host           : 127.0.0.1:3306
Source Database       : mvc

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-03-02 18:57:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `autoid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`autoid`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('23', '吴少轩', '123456');
INSERT INTO `t_user` VALUES ('27', '成功', '129521');
INSERT INTO `t_user` VALUES ('28', '李卓', '129521');
INSERT INTO `t_user` VALUES ('29', '刘博', '23');
INSERT INTO `t_user` VALUES ('30', '吴少轩beijing', '3');
INSERT INTO `t_user` VALUES ('36', 'wenyan', '123456');
INSERT INTO `t_user` VALUES ('37', 'wanyu', '9839953');
INSERT INTO `t_user` VALUES ('38', 'mengge', '32464');
INSERT INTO `t_user` VALUES ('39', 'zhaofengfeng', '2143424352');
