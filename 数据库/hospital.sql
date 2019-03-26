/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50722
Source Host           : 127.0.0.1:3306
Source Database       : hospital

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-03-22 13:11:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '科室id',
  `name` varchar(255) DEFAULT NULL COMMENT '科室名',
  `hospital_id` int(20) DEFAULT NULL COMMENT '医院id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '肛肠科', '5');
INSERT INTO `department` VALUES ('2', '骨科', '5');
INSERT INTO `department` VALUES ('3', '儿科', '5');
INSERT INTO `department` VALUES ('4', '妇产科', '5');
INSERT INTO `department` VALUES ('5', '肛肠科', '2');
INSERT INTO `department` VALUES ('6', '肛肠科', '3');
INSERT INTO `department` VALUES ('7', '骨科', '3');
INSERT INTO `department` VALUES ('8', '神经科', '3');
INSERT INTO `department` VALUES ('9', '儿科', '2');
INSERT INTO `department` VALUES ('10', '眼科', '2');
INSERT INTO `department` VALUES ('11', '神经科', '2');
INSERT INTO `department` VALUES ('13', '眼科', '3');
INSERT INTO `department` VALUES ('15', '肛肠科', '7');
INSERT INTO `department` VALUES ('16', '肛肠科', '8');
INSERT INTO `department` VALUES ('17', '骨科', '2');
INSERT INTO `department` VALUES ('18', '外科', '3');
INSERT INTO `department` VALUES ('20', '骨科', '7');
INSERT INTO `department` VALUES ('21', '骨科', '8');
INSERT INTO `department` VALUES ('22', '妇科', '2');
INSERT INTO `department` VALUES ('23', '儿科', '3');
INSERT INTO `department` VALUES ('24', '儿科', '7');
INSERT INTO `department` VALUES ('25', '儿科', '8');
INSERT INTO `department` VALUES ('26', '妇产科', '2');
INSERT INTO `department` VALUES ('27', '妇产科', '3');
INSERT INTO `department` VALUES ('28', '妇产科', '7');
INSERT INTO `department` VALUES ('29', '妇产科', '8');

-- ----------------------------
-- Table structure for `doctor`
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '医生id',
  `name` varchar(20) DEFAULT NULL COMMENT '医生名',
  `detail` varchar(255) DEFAULT NULL COMMENT '医生介绍',
  `department_id` int(20) DEFAULT NULL COMMENT '医生所属医院科室',
  `headimg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES ('1', '崔医生', '一名专业的骨科专家', '1', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('2', '李医生', '一名专业的神经科专家', '1', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('3', '宋医生', '一名专业的妇产科科专家', '1', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('4', '崔医生', '医生详情', '10', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('5', '李医生', '一名专业的肛肠科专家', '2', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('6', '宋医生', '资深的肛肠科专家', '2', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('7', '崔医生', '医生详情', '11', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('8', '李医生', '一名专业的肛肠科专家', '3', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('9', '宋医生', '资深的肛肠科专家', '3', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('10', '崔医生', '医生详情', '3', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('11', '李医生', '一名专业的肛肠科专家', '4', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('12', '宋医生', '资深的肛肠科专家', '4', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('13', '崔医生', '医生详情', '5', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('14', '李医生', '一名专业的肛肠科专家', '5', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('15', '宋医生', '资深的肛肠科专家', '5', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('16', '崔医生', '医生详情', '6', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('17', '李医生', '一名专业的肛肠科专家', '13', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('18', '宋医生', '资深的肛肠科专家', '13', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('19', '崔医生', '医生详情', '7', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('20', '李医生', '一名专业的肛肠科专家', '15', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('21', '宋医生', '资深的肛肠科专家', '15', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('22', '崔医生', '医生详情', '16', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('23', '李医生', '一名专业的肛肠科专家', '16', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('24', '宋医生', '资深的肛肠科专家', '16', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('25', '崔医生', '医生详情', '8', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('26', '李医生', '一名专业的肛肠科专家', '17', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('27', '宋医生', '资深的肛肠科专家', '17', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('28', '崔医生', '医生详情', '18', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('29', '李医生', '一名专业的肛肠科专家', '18', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('30', '宋医生', '资深的肛肠科专家', '18', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('31', '崔医生', '医生详情', '20', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('32', '李医生', '一名专业的肛肠科专家', '20', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('33', '宋医生', '资深的肛肠科专家', '20', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('34', '崔医生', '医生详情', '9', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('35', '李医生', '一名专业的肛肠科专家', '21', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('36', '宋医生', '资深的肛肠科专家', '21', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('37', '崔医生', '医生详情', '22', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('38', '李医生', '一名专业的肛肠科专家', '22', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('39', '宋医生', '资深的肛肠科专家', '22', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('40', '崔医生', '医生详情', '23', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('41', '李医生', '一名专业的肛肠科专家', '23', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('42', '宋医生', '资深的肛肠科专家', '23', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('43', '崔医生', '医生详情', '24', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('44', '李医生', '一名专业的肛肠科专家', '24', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('45', '宋医生', '资深的肛肠科专家', '24', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('46', '崔医生', '医生详情', '25', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('47', '李医生', '一名专业的肛肠科专家', '25', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('48', '宋医生', '资深的肛肠科专家', '25', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('49', '崔医生', '医生详情', '26', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('50', '李医生', '一名专业的肛肠科专家', '26', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('51', '宋医生', '资深的肛肠科专家', '26', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('52', '崔医生', '医生详情', '27', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('53', '李医生', '一名专业的肛肠科专家', '27', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('54', '宋医生', '资深的肛肠科专家', '27', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('55', '崔医生', '医生详情', '28', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('56', '李医生', '一名专业的肛肠科专家', '28', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('57', '宋医生', '资深的肛肠科专家', '28', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');
INSERT INTO `doctor` VALUES ('58', '崔医生', '医生详情', '29', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551700099710&di=da3bc809292d0aa9886b2c9dfb60e268&imgtype=0&src=http%3A%2F%2Fp4.yuemei.com%2Ftao%2F2016%2F0608%2F160608112543_70cf65.jpg');
INSERT INTO `doctor` VALUES ('59', '李医生', '一名专业的肛肠科专家', '29', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=969956,996921072&fm=26&gp=0.jpg');
INSERT INTO `doctor` VALUES ('60', '宋医生', '资深的肛肠科专家', '29', 'http://thumbs.dreamstime.com/z/%E7%94%9F-52618543.jpg');

-- ----------------------------
-- Table structure for `hospital`
-- ----------------------------
DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '医院id',
  `name` varchar(30) DEFAULT NULL COMMENT '医院名',
  `address` varchar(100) DEFAULT NULL COMMENT '医院地址',
  `detail` varchar(255) DEFAULT NULL COMMENT '医院介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of hospital
-- ----------------------------
INSERT INTO `hospital` VALUES ('2', '友谊医院', '河北省保定市竞秀区', '友谊医院是一家老牌医院');
INSERT INTO `hospital` VALUES ('3', '解放军总医院', '北京市海淀区', '第一医学中心高压氧科是拥有目前全国最大规模的空气加压舱群和动物实验舱群');
INSERT INTO `hospital` VALUES ('5', '保定市第一中心医院', '河北省保定市北市区', '保定市的三甲医院，医疗治愈中心');
INSERT INTO `hospital` VALUES ('7', '协和医院', '七一路东三环路口', '北京协和医院是北京协和医学院的临床学院。中国医学科学院的临床医学研究所,是卫生部指定的全国疑难重症诊治指导中心之一');
INSERT INTO `hospital` VALUES ('8', '保定市儿童医院', '五四路', '保定市儿童医院始建于1958年，是河北省一所市级公立儿童专科医院。2015年5月，北京儿童医院正式托管保定市儿童医院，增挂“北京儿童医院保定医院”标牌，成为京津冀协同发展背景下首家公立医疗机构跨省托管的医院');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '消息id',
  `detail` varchar(255) DEFAULT NULL COMMENT '消息详情',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '您已预约请及时缴费！！！');
INSERT INTO `message` VALUES ('2', '恭喜您预约成功！！！');
INSERT INTO `message` VALUES ('3', '您已提交住院申请，请等待后台审核！！！');
INSERT INTO `message` VALUES ('4', '住院申请通过，请及时缴费！！！');
INSERT INTO `message` VALUES ('5', '请您到前台大厅办理住院手续！！！');
INSERT INTO `message` VALUES ('6', '祝您早日康复');
INSERT INTO `message` VALUES ('7', '住院申请审核失败！！！');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(20) DEFAULT NULL COMMENT '用户账号',
  `sex` int(2) DEFAULT NULL,
  `openid` varchar(128) DEFAULT NULL COMMENT '用户性别',
  `identify` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `messageId` varchar(20) DEFAULT NULL COMMENT '消息id',
  `status` int(10) DEFAULT NULL COMMENT '用户状态(0预约未缴费, 1预约缴费,2住院申请,3住院未缴费,4看病完成)',
  `doctorId` varchar(20) DEFAULT NULL COMMENT '预约医生id',
  `address` varchar(255) DEFAULT NULL,
  `isAdmin` int(2) DEFAULT '0' COMMENT '是否是管理员',
  `tel` bigint(13) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
