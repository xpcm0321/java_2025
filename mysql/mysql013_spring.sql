use mbasic;

desc userinfo;

-- insert : 
insert into userinfo (name, age) values (?, ?);
-- select : 해당번호 검색, 전체검색
-- 해당번호 검색
select * from userinfo where no=?;
-- 전체검색
select * from userinfo;
-- update : 해당번호의 이름과 나이 수정
update userinfo set name=? and age=? where no=?;
-- delete : 해당번호삭제
delete from userinfo where no=?;

create table sboard(
bno int not null auto_increment primary key,
bname varchar(100) not null,
bpass varchar(50) not null,
btitle varchar(1000) not null,
bcontent text not null,
bdate timestamp not null default now(),
bhit int default 0,
bip varchar(50) not null);

desc sboard;