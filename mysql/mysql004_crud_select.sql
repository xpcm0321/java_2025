## 2-1. 데이터 복사 및 추가
create table userinfo_ex select * from userinfo;
select * from userinfo_ex;
alter table userinfo_ex rename select_userinfo;
select * from select_userinfo;

alter table select_userinfo modify no int not null auto_increment primary key;

insert into select_userinfo values (5, 'first', 55);
insert into select_userinfo values (6, 'third', 66);

## 2-2
-- 1. 전체 데이터 검색
select * from select_userinfo;

-- 2. 부분 검색
select name, age from select_userinfo;

-- 3. 중복 제거 (distinct)
select distinct name from select_userinfo;

-- 4. 별명
select name as `이름`, age as `나이` from select_userinfo;

-- 5. where 조건 (= 같다, != <> 다르다, < 작다 <= 작거나같다(포함) > 크다 >= 크거나같다(포함))
select * from select_userinfo where name = 'second';
select * from select_userinfo where name != 'second';
select * from select_userinfo where name <> 'second';

select * from select_userinfo where age < 33;
select * from select_userinfo where age <= 33;
select * from select_userinfo where age > 33;  -- 44 55 66
select * from select_userinfo where age >= 33; -- 33 44 55 66

-- 6. 모든조건 - and, between and / 조건 중에 - or, in
select * from select_userinfo where age>=22 and age<=33;
select * from select_userinfo where age between 22 and 33; -- 포함

select * from select_userinfo where age=22 or age=33;
select * from select_userinfo where age in (22, 33);

-- 7. null 검색 ( is null, is not null, not in, not between )
desc select_userinfo;
alter table select_userinfo modify age int;

select * from select_userinfo;
insert into select_userinfo (name) values ('seven');  -- age가 null 값

## null 값이 비워져있다는 상태를 나타냄
select * from select_userinfo where age=null;  -- (X) age와 null이 동일한 상태여야만함(같은 자료형)
select * from select_userinfo where age!=null; -- (X)

select * from select_userinfo where age is null;      -- null
select * from select_userinfo where age is not null;  -- not null

select * from select_userinfo where age not between 22 and 33;
select * from select_userinfo where age not in (22, 33);

-- 8. like 문자열 검색 ( like 'a%', '%a', '%a%', '_a%' )
select * from select_userinfo where name = 'first';
select * from select_userinfo where name like 'f%';  -- f로 시작
select * from select_userinfo where name like '%t';  -- t로 끝남
select * from select_userinfo where name like '%i%'; -- i포함
select * from select_userinfo where name like '_e%'; -- 두번째 글자 e