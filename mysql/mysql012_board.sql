use mbasic;
create table board(
bno int not null auto_increment primary key,
btitle varchar(1000) not null,
bcontent text not null,
bname varchar(100) not null,
bhit int default 0,
bdate timestamp not null default now(),
bip varchar(100) not null);

desc board;