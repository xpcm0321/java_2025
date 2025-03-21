# ■ 복습문제 (집계함수)
use mbasic;
select deptno, job, avg(sal) `평균급여`
from emp
where sal <= 3000
group by deptno, job
having avg(sal) >= 2000
order by deptno asc;

select @@sql_mode;
set session sql_mode = 'STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

select deptno, job, count(*) `사원수`, max(sal) `최고급여`, sum(sal)`급여합`, avg(sal) `평균급여`
from emp
group by deptno, job
order by deptno, job asc;

# ■ 진도 - fuction
#1. Number
#2. String
#3. Date
#4. if / case

-----------------------------------------------------------
#1. Number ( ceil 올림, floor 내림, round 반올림, mod 나머지 )
-----------------------------------------------------------
--           2                 1                2                  1
select ceil(1.1) `올림`, floor(1.9) `내림`, round(1.5) `반올림`, mod(10,3) `나머지`;

-- 연습문제
select 123.4578, round(123.4578, 0) `ROUND1`, round(123.4578, -1) `ROUND2`, round(123.4578, 1) `ROUND3`, round(123.4578, 2) `ROUND4`;
select 123.4578, ceil(123.4578) `CEIL`, floor(123.4578) `FLOOR`;

-----------------------------------------------------------
#2. String
-----------------------------------------------------------

-- 2-1. basic
-- 1) length(문자열)  개수
select length('abc');

-- 2) upper / lower (대문자 / 소문자)`
select 'abc', upper('abc'), lower('abc');

-- 3) instr(문자열, 찾을 문자열) 위치, 못 찾으면 0
select instr('abc', 'b') `b의 위치`, instr('abc', 'ab') `ab의 위치`, instr('abc', 'ac') `ac의 위치`;

-- 4) left(문자열, 몇개), right, substr(문자열, 시작, 몇개) 문자열 일부분
select left('abc', 1), left('abc', 2), right('abc', 1), right('abc', 2); -- a, ab, b, bc
select substr('abcde', 2, 2) `bc`, substr('abcde', 2, 3) `bcd`, substr('abcde', 1, 3) `abc`;

-- 5) 문자열 연결 concat(문자열1, 문자열2)
select concat('hello ', 'mysql') `hello mysql`;

-- 6) trim 좌우공백 빼기
select trim(' a b c ') `a b c`;

select concat('#', trim(' a b c '), '#') `#a b c#`, concat('#', ltrim(' a b c '), '#') `#a b c #`, concat('#', rtrim(' a b c '), '#') `# a b c#`;

-- 7) replace(문자열에서, 찾아서, 바꾸기)
select replace("hello sally", 'sally', 'alpha') `hello alpha`;

-- 8) repeat(뭐를, 몇개반복)
select repeat('*', 5) `*****`;

-- 9) 빈칸채우기
select lpad('abc', 10, '#') `#######abc`, rpad('abc', 10, '#') `abc#######`;


-- 1) length(문자열)  개수
-- 2) upper / lower (대문자 / 소문자)
-- 3) instr(문자열, 찾을 문자열) 위치, 못 찾으면 0
-- 4) left(문자열, 몇개), right, substr(문자열, 시작, 몇개) 문자열 일부분
-- 5) 문자열 연결 concat(문자열1, 문자열2)
-- 6) trim 좌우공백 빼기
-- 7) replace(문자열에서, 찾아서, 바꾸기)
-- 8) repeat(뭐를, 몇개반복)
-- 9) 빈칸채우기

-- 연습문제

create table fn_select_userinfo2(
no int not null default(0),
name varchar(20) not null,
age int not null,
email varchar(20) not null);
desc fn_select_userinfo2;

insert into fn_select_userinfo2 values (1, 'aaa', 11, 'aaa@gmail.com');
insert into fn_select_userinfo2 values (2, 'bbb', 22, 'bbb@gmail.com');
insert into fn_select_userinfo2 values (3, 'ccc', 33, 'ccc@gmail.com');
insert into fn_select_userinfo2 values (4, 'ddd', 44, 'ddd@gmail.com');
insert into fn_select_userinfo2 values (5, 'abc', 55, 'abc@gmail.com');
insert into fn_select_userinfo2 values (6, 'bca', 66, 'bca@gmail.com');
select * from fn_select_userinfo2;
alter table fn_select_userinfo2 rename fn_select_userinfo;
-- 1)
select name `이름`, length(name) `갯수`
from fn_select_userinfo;

-- 2)
select name, left(name, 1) `첫번째 글자`, right(name, 1) `마지막 글자`
from fn_select_userinfo;

-- 3)
select name, replace(name, 'aaa', 'aaa 1등')
from fn_select_userinfo;

-- 4)
select concat(name, '는 개발자입니다.') `직업`
from fn_select_userinfo;

-- 5)
select upper(name)
from fn_select_userinfo;

-- 6)
select lower(name)
from fn_select_userinfo;

-- 7)
select name, instr(name, 'b')
from fn_select_userinfo
where age >= 40;

-- 8)
select name, instr(name, 'b')
from fn_select_userinfo
where age >= 40
order by age desc
limit 2;

-- 9)
select name, concat(left(name, 1), '*', right(name, 1)) `test`
from fn_select_userinfo;

-- 10)
select name, concat(left(name, 1), repeat('*', length(name)-2), right(name, 1)) `test`
from fn_select_userinfo2;

create table fn_select_userinfo2 (
no int not null  auto_increment primary key,
name varchar(20) not null,
age int not null,
email varchar(20) not null
)default charset=utf8;

desc fn_select_userinfo2;

insert into fn_select_userinfo2 (name, age, email) values ('aaaaa' , 11 ,'aaa@gmail.com');
insert into fn_select_userinfo2 (name, age, email) values ('bbaab' , 22 ,'bbb@gmail.com');
insert into fn_select_userinfo2 (name, age, email) values ('ccaac' , 33 ,'ccc@gmail.com');
insert into fn_select_userinfo2 (name, age, email) values ('ddddd' , 44 ,'ddd@gmail.com');
insert into fn_select_userinfo2 (name, age, email) values ('abc' , 55 ,'abc@gmail.com');
insert into fn_select_userinfo2 (name, age, email) values ('baaca' , 66 ,'bca@gmail.com');