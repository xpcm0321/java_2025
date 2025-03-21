-----------------------------------------------------------
#3. Date
-----------------------------------------------------------

-- 1) 시스템의 현재 시각 조회
select now();  -- '2025-03-21 11:58:38'
SELECT CURRENT_TIME();  -- '11:59:26'

-- 2) 요일  (0 = Monday, 1 = Tue, 6 = Sun)
select weekday(now());  -- 4   금
select weekday("2025-03-21");  -- 4   금

-- 3) 날짜형식 date_format( 날짜지정, '%Y-%m-%d' )
select date_format("2025-03-21", '%Y-%m-%d');
select date_format(now(), '%Y-%m-%d %H:%i:%s');  -- '2025-03-21 12:03:47'

-- 4) 100일 전 / 후   date_add
select date_add(now(), interval -10 day);   -- '2025-03-11 12:05:22'
select date_add(now(), interval 10 day);    -- '2025-03-31 12:05:44'
select date_add(now(), interval -3 hour);   -- '2025-03-21 09:06:02'

-- 5) datediff(날짜1, 날짜2) 날짜차이
select datediff('2025-03-22', '2025-03-21');  -- 1
select timestampdiff(hour, '2025-03-22', '2025-03-21');  -- -24


-- 1) 시스템의 현재 시각조회 now / current_now
-- 2) 요일  (0 = Monday, 1 = Tue, 6 = Sun)
-- 3) 날짜형식 date_format( 날짜지정, '%Y-%m-%d' )
-- 4) 100일 전 / 후   date_add
-- 5) datediff(날짜1, 날짜2) 날짜차이


-- 연습문제
select * from userinfo where 1=2;  -- 구조만 복사
create table date_userinfo select * from userinfo where 1=2;
alter table date_userinfo add date datetime default now();
desc date_userinfo;
/*
create table date_userinfo(
no int not null default(0),
name varchar(100) not null,
age int not null,
date datetime default now());
*/
desc date_userinfo;

insert into date_userinfo values (1, 'aaa', 11, '2022-12-30');
insert into date_userinfo values (2, 'bbb', 22, '2022-11-30');
insert into date_userinfo values (3, 'ccc', 33, '2022-10-30');
insert into date_userinfo values (4, 'ddd', 44, '2022-09-30');
select * from date_userinfo;

-- 1)
select name, date
from date_userinfo
where date < '2022-11-01';

-- 2)
select name, date, date_add(date, interval 30 day) `event`
from date_userinfo
where date >= '2022-12-1' and date <= '2022-12-31';

select name, date, date_add(date, interval 30 day) `event`
from date_userinfo
where month(date) = 12;

-- 3)
select name, date_format(date, '%Y년 %m월 %d일') `가입날짜`
from date_userinfo;

-- 번외 연습문제2

-----------------------------------------------------------
#4. if / case
-----------------------------------------------------------
-- if(조건, 참, 거짓)
-- 다형식
/*  case
    when 조건1  then 상태1
    when 조건2  then 상태2
	else 모든조거에 해당하지 않을 떄, 생략가능
    end
*/
create table control(no int);
insert into control values (1), (2), (3);
select * from control;

-- 1-1
select no, if(no = 1, '1이다', '1이 아니다') `상태` from control;

-- 1-2
select no, if(no > 1, '1보다 크다', '1보다 작다') `상태` from control;

-- 1-3. case   when/then    end
select no, case
				when no=1 then '1이다'
				when no=2 then '2이다'
				when no=3 then '3이다'
                else '1, 2, 3이 아니다'
	       end `state`
from control;

-- 1-4. 2이다, 크다, 작다
select no, case
  when no > 2 then'크다'
  when no = 2 then '2이다'
  when no < 2 then '작다'
end `state`
from control;

-- 연습문제
create table if_userinfo(
no int not null auto_increment primary key,
name varchar(100) not null,
age int,
sex char(1),
sns char(1));
desc if_userinfo;

insert into if_userinfo (name, age, sns) values ('first', 11, 'n');
insert into if_userinfo (name, age, sex, sns) values ('second', 22, 'm', 'y');
insert into if_userinfo (name, age, sex, sns) values ('third', 33, 'm', 'y');
insert into if_userinfo (name, age, sex, sns) values ('fourth', 44, 'f', 'n');
insert into if_userinfo (name, age, sex, sns) values ('fifth', 55, 'f', 'y');
insert into if_userinfo (name, age, sex, sns) values ('sixth', 66, 'm', 'n');
select * from if_userinfo;

-- 1) 수신여부상태
select no, name, age, sex, sns, case 
									when sns = 'n' then '수신거부'
                                    else '수신유지'
                                    end `수신거부상태`
from if_userinfo;

select *, if(sns='n', '수신거부', '수신유지') `수신상태여부` from if_userinfo;

-- 2) 미성년자, 성인
select no, name, age, sex, sns, case 
									when age > 19 then '성인'
                                    else '미성년자'
                                    end `성인여부`
from if_userinfo;

select *, if(age < 19, '미성년자', '성인') `성인여부` from if_userinfo;

-- 3) 수신거부 숫자
select count(sns) `sns수신거부수`
from if_userinfo
where sns = 'n';

select sum(if(sns='n', 1, 0)) `sns수신거부수` from if_userinfo;
select count(if(sns='n', 1, null)) `sns수신거부수` from if_userinfo;

-- 4) 부서번호가 10이면 ACCOUNTING, 20이면 RESEARCH, 30이면 SALES
select ename, deptno, case 
							when deptno = 10 then 'ACCOUNTING'
                            when deptno = 20 then 'RESEARCH'
                            when deptno = 30 then 'SALES'
                            end `부서이름`
from emp;

select ename, deptno, case deptno
							when 10 then 'ACCOUNTING'
                            when 20 then 'RESEARCH'
                            when 30 then 'SALES'
                            end `부서이름`
from emp;

-- 5) job이 CLERK이면 판매원, SALESMAN이면 영업사원, 기타는 사원
select ename, job, case 
						when job = 'CLERK' then '판매원'
                        when job = 'SALESMAN' then '영원사원'
                        else '사원'
                        end `job2`
from emp;

select ename, job, case job
						when 'CLERK' then '판매원'
                        when 'SALESMAN' then '영원사원'
                        else '사원'
                        end `job2`
from emp;