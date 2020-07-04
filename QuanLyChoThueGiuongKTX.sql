#create database quanlychothuegiuongktx;

drop table if exists `tblsinhvien`;
create table `tblsinhvien`(
	`id` int(10) not null auto_increment,
    `ten` varchar(63) not null collate utf8_unicode_ci,
    `masinhvien` varchar(63) not null collate utf8_unicode_ci,
    `khoa` varchar(63) not null collate utf8_unicode_ci,
    `ngaysinh` date not null,
    `gioitinh` varchar(15) not null,
    `quoctich` varchar(63) not null collate utf8_unicode_ci,
    `socmt` varchar(20) not null collate utf8_unicode_ci,
    `quequan` varchar(255) not null collate utf8_unicode_ci,
    `email` varchar(64) not null collate utf8_unicode_ci,
    `sodienthoai` varchar(20) not null,
    primary key(`ID`)
)engine = MyISAM auto_increment = 1 default charset = utf8 collate = utf8_unicode_ci;


drop table if exists `tblNhanVien`;
create table `tblNhanVien`(
	`ID` int(5) not null auto_increment, 
    `tendangnhap` varchar(63) collate utf8_unicode_ci not null,
    `matkhau` varchar(63) not null collate utf8_unicode_ci,
    `ten` varchar(63) not null collate utf8_unicode_ci,
    `vitri` varchar(255) not null collate utf8_unicode_ci,
    `ghichu` varchar(255) not null collate utf8_unicode_ci,
    primary key (`ID`)
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;

drop table if exists `tblgiuong`;
create table `tblgiuong`(
	`ID` int(5) not null auto_increment,
	`IDphong` int(5) not null,
    `tengiuong` varchar(63) collate utf8_unicode_ci not null,
    `kieugiuong` varchar(63) not null collate utf8_unicode_ci,
    `mota` varchar(63) not null collate utf8_unicode_ci,
    `giathue` float(10) not null,
    primary key (`ID`)
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;

drop table if exists `tblkytucxa`;
create table `tblkytucxa`(
	`ID` int(5) not null auto_increment, 
    `tenkytucxa` varchar(63) collate utf8_unicode_ci not null,
    `sotang` int(3)	not null,
    `sophong` int(3) not null,
    `diachi` varchar(255) not null collate utf8_unicode_ci,
    `mota` varchar(63) not null collate utf8_unicode_ci,
    primary key (`ID`)
)engine =  MyISAM auto_increment = 1 default charset utf8 collate utf8_unicode_ci;

drop table if exists `tblphong`;
create table `tblphong`(
	`ID` int(5) not null auto_increment,
    `IDkytucxa` int(5) not null,
    `tenphong` varchar(63) collate utf8_unicode_ci not null,
    `loaiphong` varchar(63) not null collate utf8_unicode_ci,
    `mota` varchar(63) not null collate utf8_unicode_ci,
    `giathue` float(10) not null,
    primary key (`ID`),
    foreign key (`IDkytucxa`) references tblkytucxa(`ID`) on delete cascade
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;


drop table if exists `tblgiuongduocthue`;
create table `tblGiuongDuocThue`(
	`ID` INT(5) auto_increment NOT NULL,
    `IDgiuong` INT(5) not null,
    `ngaybatdau` date not null,
    `ngayketthuc` date not null,
    `ghichu` varchar(255) default null collate utf8_unicode_ci,
    `giathue` float(10) not null,
	primary key (`ID`),
	foreign key (`IDgiuong`) references tblgiuong(`ID`) on delete cascade
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;



drop table if exists `tblhopdong`;
create table `tblhopdong`(
	`ID` int(5) auto_increment not null,
    `IDnhanvien` int(5) not null,
    `IDsinhvien` int(5) not null,
    `IDdiensudung` int(10) not null,
    `IDnuocsudung` int(5) not null,
    `ngaythue` date not null,
    `giathuekhoidiem` float(10) not null,
    `tiendatcot` float(10) not null,
    primary key(`ID`),
    foreign key(`IDnhanvien`) references tblnhanvien(`ID`) on delete cascade,
    foreign key(`IDsinhvien`) references tblsinhvien(`ID`) on delete cascade,
    foreign key(`IDdiensudung`) references tbldiensudung(`ID`) on delete cascade,
    foreign key(`IDnuocsudung`) references tblnuocsudung(`ID`) on delete cascade
)engine = MyISAM auto_increment = 1 default charset = utf8 collate = utf8_unicode_ci;


drop table if exists `tblhoadon`;
create table `tblhoadon`(
	`ID` int(5) auto_increment not null,
    `IDnhanvien` int(5) not null,
    `IDsinhvien` int(5) not null,
    `IDhopdong` int(5) not null,
    `IDgiuongduocthue` int(5) not null,
    `IDdiensudung` int(5) not null,
    `IDnuocsudung` int(5) not null,
    `ngaythanhtoan` date not null,
    `tongtien` float(10) not null,
    `hinhthuc` varchar(63) not null collate utf8_unicode_ci,
    `ghichu` varchar(255) default null collate utf8_unicode_ci,
    primary key(`ID`),
    foreign key(`IDnhanvien`) references tblnhanvien(`ID`) on delete cascade,
    foreign key(`IDsinhvien`) references tblsinhvien(`ID`) on delete cascade,
    foreign key(`IDhopdong`) references tblhopdong(`ID`) on delete cascade,
    foreign key(`IDgiuongduocthue`) references tblgiuongduocthue(`ID`) on delete cascade,
    foreign key(`IDdiensudung`) references tbldiensudung(`ID`) on delete cascade,
    foreign key(`IDnuocsudung`) references tblnuocsudung(`ID`) on delete cascade
)engine = MyISAM auto_increment = 1 default charset = utf8 collate = utf8_unicode_ci;

#############################################################
##############################################################
drop table if exists `tblcosovatchat`;
create table `tblcosovatchat`(
	`ID` int(5) not null auto_increment,
    `tenloai` varchar(63) collate utf8_unicode_ci not null,
    `ghichu` varchar(63) not null collate utf8_unicode_ci,
    `soluong` int(10) not null,
    `gia` float(10) not null,
    primary key (`ID`)
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;

drop table if exists `tblcosovatchatsudung`;
create table `tblcosovatchatsudung`(
	`ID` int(5) not null auto_increment,
    `IDphong` int(5) not null,
    `IDcosovatchat` int(5) not null,
    `ngaysudung` date not null,
    `ghichu` varchar(63) not null collate utf8_unicode_ci,
    `gia` float(10) not null,
    primary key (`ID`)
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;

drop table if exists `tbldichvu`;
create table `tbldichvu`(
	`ID` int(5) not null auto_increment,
    `tendichvu` varchar(63) collate utf8_unicode_ci not null,
    `donvi` varchar(20) not null collate utf8_unicode_ci,
    `dongia` float(10) not null,
    primary key (`ID`)
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;

drop table if exists `tbldichvuduocdung`;
create table `tbldichvuduocdung`(
	`ID` int(5) not null auto_increment,
    `IDhopdong` int(5) not null,
    `IDdichvu` int(5) not null,
    `ngaybatdau` date not null,
    `ngayketthuc` date not null,
    `ghichu` varchar(255) default null,
    primary key (`ID`),
    foreign key(`IDhopdong`) references tblhopdong(`ID`) on delete cascade,
    foreign key(`IDdichvu`) references tbldichvu(`ID`) on delete cascade
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;

drop table if exists `tbldiensudung`;
create table `tbldiensudung`(
	`ID` int(5) not null auto_increment,
    `IDphong` int(5) not null,
    `dongia` float(10) not null,
    `dongho` int(10) not null,
    `dathanhthoan` boolean default false,
    `ngaybatdau` date not null,
    primary key (`ID`),
    foreign key(`IDphong`) references tblphong(`ID`) on delete cascade
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;

drop table if exists `tblnuocsudung`;
create table `tblnuocsudung`(
	`ID` int(5) not null auto_increment,
    `IDphong` int(5) not null,
    `dongia` float(10) not null,
    `dongho` int(10) not null,
    `dathanhthoan` boolean default false,
    `ngaybatdau` date not null,
    primary key (`ID`),
    foreign key(`IDphong`) references tblphong(`ID`) on delete cascade
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;


drop table if exists `tbldichvuthanhtoan`;
create table `tbldichvuthanhtoan`(
	`ID` int(5) not null auto_increment,
    `IDdichvuduocdung` int(5) not null,
    `IDhoadon` int(5) not null,
    `tongtien` float(10) not null,
    primary key (`ID`),
    foreign key(`IDdichvuduocdung`) references tblhopdong(`ID`) on delete cascade,
    foreign key(`IDhoadon`) references tbldichvu(`ID`) on delete cascade
) engine = MyISAM auto_increment=1 default charset = utf8 collate= utf8_unicode_ci;


#################################################################################
INSERT INTO `quanlychothuegiuongktx`.`tblphong` (`ID`, `IDkytucxa`, `tenphong`, `loaiphong`, `mota`, `giathue`) VALUES ('20000', '123456', '201B4', 'phòng 4 người', 'đẹp, thoáng mát', '1000000');
INSERT INTO `quanlychothuegiuongktx`.`tblphong` (`ID`, `IDkytucxa`, `tenphong`, `loaiphong`, `mota`, `giathue`) VALUES ('20001', '123456', '202B4', 'phòng 8 người', 'đẹp, rộng rãi', '2000000');


INSERT INTO `quanlychothuegiuongktx`.`tblgiuong` (`ID`, `IDphong`, `tengiuong`, `kieugiuong`, `mota`, `giathue`) VALUES ('30000', '20000', 'G01_201_B4', 'Giường tầng', 'đẹp', '200000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuong` (`ID`, `IDphong`, `tengiuong`, `kieugiuong`, `mota`, `giathue`) VALUES ('30001', '20000', 'G02_201_B4', 'Giường tầng', 'đẹp', '200000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuong` (`ID`, `IDphong`, `tengiuong`, `kieugiuong`, `mota`, `giathue`) VALUES ('30002', '20000', 'G03_201_B4', 'Giường tầng', 'đẹp', '200000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuong` (`ID`, `IDphong`, `tengiuong`, `kieugiuong`, `mota`, `giathue`) VALUES ('30003', '20000', 'G04_201_B4', 'Giường đơn', 'đẹp', '100000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuong` (`ID`, `IDphong`, `tengiuong`, `kieugiuong`, `mota`, `giathue`) VALUES ('30004', '20001', 'G01_202_B4', 'Giường sắt đơn', 'chắc chắn', '100000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuong` (`ID`, `IDphong`, `tengiuong`, `kieugiuong`, `mota`, `giathue`) VALUES ('30005', '20001', 'G02_202_B4', 'Giường đơn', 'đẹp', '100000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuong` (`ID`, `IDphong`, `tengiuong`, `kieugiuong`, `mota`, `giathue`) VALUES ('30006', '20001', 'G03_202_B4', 'Giường tầng', 'đẹp', '200000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuong` (`ID`, `IDphong`, `tengiuong`, `kieugiuong`, `mota`, `giathue`) VALUES ('30007', '20001', 'G04_202_B4', 'Giường tầng', 'đẹp', '200000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuong` (`ID`, `IDphong`, `tengiuong`, `kieugiuong`, `mota`, `giathue`) VALUES ('30008', '20001', 'G05_202_B4', 'Giường đơn', 'đẹp', '100000');



INSERT INTO `quanlychothuegiuongktx`.`tblgiuongduocthue` (`ID`, `IDgiuong`, `ngaybatdau`, `ngayketthuc`, `giathue`) VALUES ('40000', '30000', '2020-06-01', '2020-06-30', '200000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuongduocthue` (`ID`, `IDgiuong`, `ngaybatdau`, `ngayketthuc`, `giathue`) VALUES ('40001', '30001', '2020-06-02', '2020-06-30', '200000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuongduocthue` (`ID`, `IDgiuong`, `ngaybatdau`, `ngayketthuc`, `giathue`) VALUES ('40002', '30002', '2020-06-03', '2020-06-30', '200000');
INSERT INTO `quanlychothuegiuongktx`.`tblgiuongduocthue` (`ID`, `IDgiuong`, `ngaybatdau`, `ngayketthuc`, `giathue`) VALUES ('40003', '30003', '2020-06-04', '2020-06-30', '100000');


#################################################################################
select * from tblnhanvien; select * from tblkytucxa; 
select * from tblphong;
select * from tblgiuong;
select * from tblgiuongduocthue;

