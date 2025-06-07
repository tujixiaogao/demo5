建表语句：
CREATE TABLE `booking_details` (
`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID，唯一标识每条预订记录',
`booking_number` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
`name` VARCHAR(255) NULL DEFAULT NULL COMMENT '预订人姓名' COLLATE 'utf8_general_ci',
`booking_date` DATE NULL DEFAULT NULL COMMENT '预订日期',
`booking_status` VARCHAR(24) NULL DEFAULT NULL COMMENT '预订状态（如：CONFIRMED, COMPLETED, CANCELLED等）' COLLATE 'utf8_general_ci',
`departure` VARCHAR(255) NULL DEFAULT NULL COMMENT '出发地机场代码/名称' COLLATE 'utf8_general_ci',
`destination` VARCHAR(255) NULL DEFAULT NULL COMMENT '目的地机场代码/名称' COLLATE 'utf8_general_ci',
`booking_class` VARCHAR(255) NULL DEFAULT NULL COMMENT '舱位等级（经济舱/商务舱等）' COLLATE 'utf8_general_ci',
`create_by` VARCHAR(255) NULL DEFAULT NULL COMMENT '创建人标识' COLLATE 'utf8_general_ci',
`create_time` DATETIME NULL DEFAULT NULL COMMENT '创建时间戳',
`update_by` VARCHAR(255) NULL DEFAULT NULL COMMENT '最后更新人标识' COLLATE 'utf8_general_ci',
`update_time` DATETIME NULL DEFAULT NULL COMMENT '最后更新时间戳',
`update_version` INT(11) NULL DEFAULT '0' COMMENT '数据版本号，用于乐观锁控制',
PRIMARY KEY (`id`) USING BTREE
)
COMMENT='航班预订详情表，包含核心业务数据及审计字段'
COLLATE='utf8_general_ci'
ENGINE=MyISAM
AUTO_INCREMENT=17;