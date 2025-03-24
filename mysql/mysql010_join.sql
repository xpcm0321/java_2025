## 데이터베이스 언어 ★
# 면접문제!
# DDL - create, alter, drop
# DML - insert, select #, update, delete(crud)

# e(entity:테이블)r(relation:관계) 속성:pk, fk
# join ★
-- 두개 이상의 테이블들을 연결해서 데이터를 조회
-- 테이블간의 연결고리(pk, fk)

# 종류 : inner join, outer join

create table join_userinfo select * from userinfo;
select * from join_userinfo;
desc join_userinfo;
alter table join_userinfo modify no int not null auto_increment primary key;
desc join_userban;

/*
question1) join을 이용하여 join_userinfo
  학생의 번호, 이름, 나이, 반을 출력하시오.
+----+--------+-----+------+
| no | name   | age | ban  |
+----+--------+-----+------+
|  1 | first  |  11 | A    |
|  2 | second |  22 | B    |
|  3 | third  |  33 | A    |
|  4 | fourth |  44 | C    |
+----+--------+-----+------+
>>> (1) = join

Error Code: 1052. Column 'no' in filed list is ambiguous  0.000 sec
ambiguous : 어디 소속인지 밝히기
*/
-- 테이블명이 너무 기니까 별명을 지어줌
select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where a.no = b.no;

# >>> (2) join  on
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on (a.no = b.no);

# >>> (3) join  using
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b using(no);

# >>> (4) natural join  - natural join 알아서 join 연결할 부분 찾아서 연결해줌
select no, name, age, ban
from join_userinfo natural join join_userban;

/*
question2) inner join을 이용하여 join_userinfo
  테이블의 20세 이상 40세 이하 학생의 번호, 이름, 나이, 반을 출력
+----+--------+-----+------+
| no | name   | age | ban  |
+----+--------+-----+------+
|  2 | second |  22 | B    |
|  3 | third  |  33 | A    |
+----+--------+-----+------+
*/
# >>> (1) = join
select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where a.age >= 20 and a.age <= 40 and a.no = b.no;

select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where age between 20 and 40 and a.no = b.no;

# >>> (2) join  on
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on (a.no = b.no)
where a.age >= 20 and a.age <= 40;

select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on (a.no = b.no)
where age between 20 and 40;

# >>> (3) join  using
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b using(no)
where age between 20 and 40;

# >>> (4) natural join
select no, name, age, ban
from join_userinfo natural join join_userban
where age between 20 and 40;

/*
question3) outer join
+------+--------+------+------+
| no   | name   | ban  | age  |
+------+--------+------+------+
|    1 | first  | A    |   11 |
|    2 | second | B    |   22 |
|    3 | third  | A    |   33 |
|    4 | fourth | C    |   44 |
| NULL | NULL   | B    | NULL |
| NULL | NULL   | C    | NULL |
+------+--------+------+------+
6 rows in set (0.00 sec)
*/
## right join은 오른쪽 값 보장
select a.no, a.name, b.ban, a.age
from join_userinfo a right join join_userban b on a.no = b.no;

## left join은 왼쪽 값 보장
select a.no, a.name, b.ban, a.age
from join_userban b left join join_userinfo a on a.no = b.no;

/*
question4) left, right join 이용
+----+--------+------+------+
| no | name   | ban  | age  |
+----+--------+------+------+
|  1 | first  | A    |   11 |
|  2 | second | B    |   22 |
|  3 | third  | A    |   33 |
|  4 | fourth | C    |   44 |
|  5 | fifth  | B    | NULL |
|  6 | sixth  | C    | NULL |
+----+--------+------+------+
6 rows in set (0.00 sec)
*/
select b.no, b.name, b.ban, a.age
from join_userinfo a right join join_userban b on a.no = b.no;

select b.no, b.name, b.ban, a.age
from join_userban b left join join_userinfo a on a.no = b.no;

-- 연습문제 1~10
-- 연습문제 1
-- emp 14 / dept 4  14*4 = 56
select * from emp, dept order by empno;
-- emp, dept 테이블을 empno를 기준으로 정렬(?)
-- 모든 경우의 수가 다 나옴
-- join 연결부위 무조건 쓰기!!!

-- 연습문제 2
select *
from emp a join dept b on a.deptno = b.deptno;

select *
from emp, dept
where emp.deptno = dept.deptno
order by empno;

-- 연습문제 3
select *
from emp e join dept d on e.deptno = d.deptno;

select *
from emp e, dept d
where e.deptno = d.deptno
order by empno;
-- 누구껀지 모를 경우에는 소속 밝히기 e.empno

-- 연습문제 4
select empno, ename, deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno;
-- Error Code: 1052. Column 'deptno' in field list is ambiguous	0.000 sec
-- select에서 empno, ename, deptno, dname, loc가 emp, dept 테이블 중 어느 테이블에 소속되어 있는지 안 적음

-- 연습문제 5
-- 4번의 코드를 오류안나게 수정
select empno, ename, d.deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno;
-- deptno가 불명확하니까 어느 소속인지 밝히기!!

-- 연습문제 6
-- 필드가 명확하면 소속을 안 밝혀도 됨
select empno, ename, sal, d.deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno and sal >= 3000;

select empno, ename, sal, d.deptno, dname, loc
from emp e join dept d on (e.deptno = d.deptno)
where sal >= 3000;

select empno, ename, sal, d.deptno, dname, loc
from emp e join dept d using (deptno)
where sal >= 3000;

select empno, ename, sal, deptno, dname, loc
from emp e natural join dept d
where sal >= 3000;

alter table salagrade rename salgrade;

-- 연습문제 7
-- e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, s.grade, s.losal, s.hisal
select *
from emp e, salgrade s
where e.sal between s.losal and s.hisal
order by s.grade asc, e.sal asc;

select *
from emp e right join salgrade s on e.sal between s.losal and s.hisal
order by s.grade asc, e.sal asc;

-- 연습문제 8
-- emp1 사원정보, emp2 매니저정보, salgrade 급여정보
-- 사원정보의 mgr, 매니저정보의 empno, 사원정보의 최대, 최소값
-- 정렬 매니저정보의 사원번호를 기준으로 오름차순
-- ## 13줄
select e1.empno, e1.ename, e1.mgr, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME`
from emp e1, emp e2, salgrade s
where e1.mgr = e2.empno and e1.sal between s.losal and s.hisal
order by e2.empno asc;

-- 연습문제 9
select e1.empno, e1.ename, e1.mgr, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME`
from emp e1 left join emp e2 on (e1.mgr = e2.empno);

-- 연습문제 10
select e1.empno, e1.ename, e1.mgr, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME`
from emp e1 right join emp e2 on (e1.mgr = e2.empno)
order by e1.empno;
-- right join은 right 쪽의 테이블 값 보장

-- 연습문제 11~20
-- 연습문제 11
select empno, ename, job, mgr, hiredate, sal, comm, deptno, dname, loc
from emp e natural join dept d
order by deptno, empno;

-- 연습문제 12
select empno, ename, job, mgr, hiredate, sal, comm, e.deptno, dname, loc
from emp e join dept d using(deptno)
where sal >= 3000
order by deptno;

-- 연습문제 13
select empno, ename, job, mgr, hiredate, sal, comm, d.deptno, dname, loc
from emp e join dept d on(e.deptno = d.deptno)
where sal <= 3000
order by deptno, empno;

-- 연습문제 14
select d.deptno, dname, empno, ename, sal
from emp e, dept d
where sal > 2000 and e.deptno = d.deptno;

-- 연습문제 15 natural join은 알아서 다 해주기 때문에 select에 소속 안 밝혀도 됨
select deptno, dname, empno, ename, sal
from emp e natural join dept d
where sal > 2000;

-- 연습문제 16
select d.deptno, dname, avg(sal) `AVG_SAL`, max(sal) `MAX_SAL`, min(sal) `MIN_SAL`, count(*) `CNT`
from emp e, dept d
where e.deptno = d.deptno
group by d.deptno
order by deptno asc;

select d.deptno, dname, avg(sal) `AVG_SAL`, max(sal) `MAX_SAL`, min(sal) `MIN_SAL`, count(*) `CNT`
from emp e, dept d
where e.deptno = d.deptno
group by d.deptno, dname
order by d.deptno, dname;

-- 연습문제 17
select d.deptno, dname, avg(sal) `AVG_SAL`, max(sal) `MAX_SAL`, min(sal) `MIN_SAL`, count(*) `CNT`
from emp e join dept d using(deptno)
group by d.deptno
order by d.deptno asc;

-- 연습문제 18
select d.deptno, dname, empno, ename, job, sal
from dept d left join emp e on (e.deptno = d.deptno)
order by deptno, ename;

select d.deptno, dname, empno, ename, job, sal
from emp e left join dept d on (e.deptno = d.deptno)
order by deptno, ename;

-- 연습문제 19
select d.deptno, dname, empno, ename, job, sal
from emp e right join dept d using(deptno)
order by d.deptno, ename;

select d.deptno, dname, empno, ename, job, sal
from dept d right join emp e on (e.deptno = d.deptno)
order by deptno asc;

-- 연습문제 20
select d.deptno, dname, e.empno, e.ename, e.mgr, e.sal, e.deptno, s.losal, s.hisal, s.grade, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME`
from emp e right join dept d on(e.deptno = d.deptno) left join salgrade s on(e.sal between s.losal and s.hisal) left join emp e2 on (e.mgr = e2.empno)
order by d.deptno, e.empno;