/*
Q1. milk 테이블의 구조는 다음과 같다 
mysql>
mysql> desc milk;
+--------+-------------+------+-----+---------+----------------+
| Field  | Type        | Null | Key | Default | Extra          |
+--------+-------------+------+-----+---------+----------------+
| mno    | int         | NO   | PRI | NULL    | auto_increment |
| mname  | varchar(20) | NO   |     | NULL    |                |
| mprice | int         | NO   |     | NULL    |                |
+--------+-------------+------+-----+---------+----------------+
3 rows in set (0.04 sec)

mysql>
mysql> select * from milk;
+-----+-------+--------+
| mno | mname | mprice |
+-----+-------+--------+
|  1  | white |   1000 |
|  2  | choco |   1200 |
|  3  | banana|   1800 | 
+-----+-------+--------+
6 rows in set (0.03 sec)

  4 , melon ,  5000 데이터를 추가하시오.

 Q2.  no가 4번인 데이터의 mprice를 1500로 변경하시오.

 Q3.  no가 4번이고 name이 melon인데이터를 삭제하시오.

 Q4.  milk 데이터를 출력하시오. 
*/
use mbasic;
alter table milk drop mtotal;
alter table milk drop mnum;
insert into milk (mname, mprice) values ('white', 1000);
insert into milk (mname, mprice) values ('choco', 1200);
insert into milk (mname, mprice) values ('banana', 1800);
-- 한 줄 실행 : ctrl + enter
-- 여러 줄 실행 : ctrl + shift + enter
# - 4, melon, 5000 데이터 추가
insert into milk (mname, mprice) values ('melon', 5000);

desc milk;
select * from milk;
# - no가 4번인 데이터의 mprice를 1500으로 변경
update milk set mprice=1500 where mno=4;

# - no가 4번이고 name이 melon인 데이터 삭제
delete from milk where mno=4 and mname='melon';

# - milk 데이터 출력
select * from milk;