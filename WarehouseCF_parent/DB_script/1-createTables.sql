-- 创建员工管理数据库
create TABLE W_STAFF
(
STAFF_ID VARCHAR(20) NOT NULL,
STAFF_NAME VARCHAR(20) NOT NULL,
STAFF_GENDER enum('男','女'),
STAFF_POSITION VARCHAR(50),
STAFF_POWER INT(2) NOT NULL,
PRIMARY KEY(STAFF_ID)
);
-- 创建EasyUI后台菜单按钮
create TABLE W_B_MENUS
(
ID VARCHAR(20) NOT NULL,
PID VARCHAR(20) NULL,
TEXT VARCHAR(50) NULL,
STATE VARCHAR(20) NULL,
URL VARCHAR(100) NULL,
PRIMARY KEY(ID),
UNIQUE (TEXT)
);
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('1', '', '员工管理', 'closed', '');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('11', '1', '员工权限管理', 'closed', '');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('111', '11', '添加员工权限', '', '/index/getMenus/addEmployeePower');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('112', '11', '修改员工权限', '', '/index/getMenus/updateEmployeePower');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('113', '11', '删除员工', '', '');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('12', '1', '员工信息管理', 'closed', '');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('121', '12', '查询员工信息', '', '/index/getMenus/loadEmployeeData');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('122', '12', '添加员工信息', '', '/index/getMenus/addEmployeeData');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('123', '12', '删除员工信息', '', '');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('2', '', '数据管理', 'closed', '');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('21', '2', '数据信息导入', '', '');
INSERT INTO `warehousecf`.`w_b_menus` (`ID`, `PID`, `TEXT`, `STATE`, `URL`) VALUES ('22', '2', '数据信息导出', '', '');

-- 测试数据
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0001', '郑明心', '男', '项目经理', '1');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0002', '徐曼丽', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0003', '测试数据', '男', '测试数据111111111111111111111', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0004', '郑途', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0005', '徐洁', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0006', '张与', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0007', '陆小曼', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0008', '高文', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0009', '付余', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0010', '许诺', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0011', '周寅', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0012', '莫淑贤', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0013', '菀茹', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0014', '乾辉', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0015', '罗云', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0016', '周文', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0017', '王强', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0018', '余诗', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0019', '君芝', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0020', '龙山', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0021', '善运', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0022', '周文', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0023', '王强', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0024', '余诗', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0025', '君芝', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0026', '龙山', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0027', '善运', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0028', '周文', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0029', '王强', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0030', '余诗', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0031', '君芝', '女', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0032', '龙山', '男', '普通员工', '5');
INSERT INTO `warehousecf`.`w_staff` (`STAFF_ID`, `STAFF_NAME`, `STAFF_GENDER`, `STAFF_POSITION`, `STAFF_POWER`) VALUES ('0033', '善运', '男', '普通员工', '5');
