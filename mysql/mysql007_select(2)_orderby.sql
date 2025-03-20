## ■ 1. order by + limit
/*
select   필드1, 필드2 
from     테이블명
where    조건식
order by 기준필드 [asc(1, 2, 3 오름차순) | desc(3, 2, 1 내림차순)]
limit    몇 개(필요한 개수)
*/
-- 1-1  테이블준비
use mbasic;
show tables;
select * from select_userinfo;
delete from select_userinfo where no=7;

-- 1-2. 정렬
select * from select_userinfo;

select * from select_userinfo order by age desc; -- 내림차순
select * from select_userinfo order by age asc;  -- 오름차순

-- 나이 많은 3명
select * from select_userinfo order by age desc limit 3;
select * from select_userinfo order by age desc limit 2;

-- no가 높은 순으로 4명
select * from select_userinfo order by no desc limit 4;

-- no가 두번째로 높은 순으로 2명(limit 1, 2) limit 어디서부터, 몇 개
select * from select_userinfo order by no desc limit 0, 2;  -- 6, 5
select * from select_userinfo order by no desc limit 1, 2;  -- 5, 4

-- 1-3.연습문제
-- job이 'SALESMAN'인 레코드 조회
select * from select_emp where job='SALESMAN';
/*
+-------+--------+----------+------+------------+------+------+--------+
| empno | ename  | job      | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+----------+------+------------+------+------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500 |    0 |     30 |
+-------+--------+----------+------+------------+------+------+--------+
4 rows in set (0.00 sec)
*/
-- ename, mgr, sal 필드 조회
select ename, mgr, sal
from select_emp;
/*
+--------+------+------+
| ename  | mgr  | sal  |
+--------+------+------+
| SMITH  | 7902 |  800 |
| ALLEN  | 7698 | 1600 |
| WARD   | 7698 | 1250 |
| JONES  | 7839 | 2975 |
| MARTIN | 7698 | 1250 |
| BLAKE  | 7839 | 2850 |
| CLARK  | 7839 | 2450 |
| SCOTT  | 7566 | 3000 |
| KING   | NULL | 5000 |
| TURNER | 7698 | 1500 |
| ADAMS  | 7788 | 1100 |
| JAMES  | 7698 |  950 |
| FORD   | 7566 | 3000 |
| MILLER | 7782 | 1300 |
+--------+------+------+
14 rows in set (0.00 sec)
*/

-- job이 'SALESMAN'인 레코드의 enmae, mgr, sal 필드 조회
select ename, mgr, sal
from select_emp
where job='SALESMAN';
/*
+--------+------+------+
| ename  | mgr  | sal  |
+--------+------+------+
| ALLEN  | 7698 | 1600 |
| WARD   | 7698 | 1250 |
| MARTIN | 7698 | 1250 |
| TURNER | 7698 | 1500 |
+--------+------+------+
4 rows in set (0.00 sec)
*/
-- 급여가 높은 순서로 조회
select * from select_emp
order by sal desc;
/*
+-------+--------+-----------+------+------------+------+------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/
-- job은 올림차순, 같으면 sal 기준으로 내림차순
select * from select_emp
order by job asc, sal desc;
/*
+-------+--------+-----------+------+------------+------+------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/
-- sal이 2000이상 ename, sal,select_empno필드를 select_empno 기준으로 내림차순 정렬
select ename, sal, empno 'select_empno'
from select_emp
where sal >= 2000
order by empno desc;
/*
+-------+------+-------+
| ename | sal  | select_empno |
+-------+------+-------+
| FORD  | 3000 |  7902 |
| KING  | 5000 |  7839 |
| SCOTT | 3000 |  7788 |
| CLARK | 2450 |  7782 |
| BLAKE | 2850 |  7698 |
| JONES | 2975 |  7566 |
+-------+------+-------+

6 rows in set (0.00 sec)
*/
-- job을 기준으로 중복행 제거하고 같은 것은 한 번만 나오게
-- distinct
select distinct job
from select_emp;
/*
+-----------+
| job       |
+-----------+
| CLERK     |
| SALESMAN  |
| MANAGER   |
| ANALYST   |
| PRESIDENT |
+-----------+
5 rows in set (0.00 sec)
*/
-- empno(사원번호), ename(이름), job(담당업무)
select empno as '사원번호', ename as '이름', job as '담당업무' -- 백틱 안 써도 실행됨 as 빼도 됨
from select_emp;
/*
+----------+--------+-----------+
| 사원번호   | 이름     | 담담 업무   |
+----------+--------+-----------+
|     7369 | SMITH  | CLERK     |
|     7499 | ALLEN  | SALESMAN  |
|     7521 | WARD   | SALESMAN  |
|     7566 | JONES  | MANAGER   |
|     7654 | MARTIN | SALESMAN  |
|     7698 | BLAKE  | MANAGER   |
|     7782 | CLARK  | MANAGER   |
|     7788 | SCOTT  | ANALYST   |
|     7839 | KING   | PRESIDENT |
|     7844 | TURNER | SALESMAN  |
|     7876 | ADAMS  | CLERK     |
|     7900 | JAMES  | CLERK     |
|     7902 | FORD   | ANALYST   |
|     7934 | MILLER | CLERK     |
+----------+--------+-----------+
14 rows in set (0.00 sec)
*/
-- 급여 기준으로 오름차순
select * from select_emp
order by sal asc; -- 아무것도 안 쓰면 오름차순 order by sal;
/*
+-------+--------+-----------+------+------------+------+------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/
-- 급여 기준으로 내림차순
select * from select_emp
order by sal desc;
/*
+-------+--------+-----------+------+------------+------+------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/
-- 부서번호(deptno) 기준으로 오름차순, 급여를 기준으로 sal 내림차순
select * from select_emp
order by deptno asc, sal desc;
/*
+-------+--------+-----------+------+------------+------+------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/
-- 다음 결과가 나오게 조회
select *
from select_emp
order by deptno desc, ename asc;
-- empno `select_empLOYEE_NO`, ename `select_empLOYEE_NAME`, job, mgr `MANAGER`, hiredate, sal `SALARY`, comm `COMMISSION`, deptno `DEPARTMENT_NO`
/*
+-------+--------+-----------+------+------------+------+------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
+-------+--------+-----------+------+------------+------+------+--------+
14 rows in set (0.00 sec)
*/