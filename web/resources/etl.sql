/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : etl

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-04-13 12:04:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for state
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `table_name` varchar(255) DEFAULT NULL,
  `state` enum('uncommitted','waiting','fail','success') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of state
-- ----------------------------
INSERT INTO `state` VALUES ('1', '参保人基础信息表', 'success');
INSERT INTO `state` VALUES ('2', '单位基本信息表', 'fail');
INSERT INTO `state` VALUES ('3', '单位险种表', 'waiting');
INSERT INTO `state` VALUES ('4', '险种表', 'uncommitted');
INSERT INTO `state` VALUES ('5', '个人缴费基数信息表', 'uncommitted');
INSERT INTO `state` VALUES ('6', '个人五险缴费信息表', 'uncommitted');
INSERT INTO `state` VALUES ('7', '养老保险年账户表', 'uncommitted');
INSERT INTO `state` VALUES ('8', '养老保险基本信息表', 'uncommitted');
INSERT INTO `state` VALUES ('9', '离退休人员待遇信息表', 'uncommitted');
INSERT INTO `state` VALUES ('10', '养老保险待遇支付信息表', 'uncommitted');
INSERT INTO `state` VALUES ('11', '养老保险月账户表', 'uncommitted');
INSERT INTO `state` VALUES ('12', '个人失业保险发放信息表', 'uncommitted');
INSERT INTO `state` VALUES ('13', '个人失业保险基本信息表', 'uncommitted');
INSERT INTO `state` VALUES ('14', '失业人员待遇支付明细表', 'uncommitted');
INSERT INTO `state` VALUES ('15', '医疗机构信息表', 'uncommitted');
INSERT INTO `state` VALUES ('16', '医疗保险个人帐户信息表', 'uncommitted');
INSERT INTO `state` VALUES ('17', '个人医疗保险支付信息表', 'uncommitted');
