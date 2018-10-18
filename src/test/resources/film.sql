/*
Navicat MySQL Data Transfer

Source Server         : Localhost
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-06-23 14:25:27
*/
use crafttool_vrlist;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for film
-- ----------------------------
DROP TABLE IF EXISTS `film`;
CREATE TABLE `film` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `url` varchar(255) NOT NULL,
  `img` varchar(255) NOT NULL,
  `info` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of film
-- ----------------------------
INSERT INTO `film` VALUES ('1','虎口脱险,  / La grande vadrouille,  / 横冲直撞出重围(港) / 大進擊(台)', 'https://movie.douban.com/subject/1296909/', 'https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2399597512.jpg', ' 导演: 杰拉尔·乌里 Gérard Oury   主演: 路易·德·菲耐斯 Louis de Funès... 1966 / 法国 英国 / 喜剧 战争', '1966 ');
SET FOREIGN_KEY_CHECKS=1;
