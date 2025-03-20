/*
## ■ 2. 집계함수
select   필드1, 필드2 
from     테이블명
where    조건식
group by 그룹핑
having   조건식
order by 기준필드 [asc(1, 2, 3 오름차순) | desc(3, 2, 1 내림차순)]
limit    몇 개(필요한 개수)

avg(컬럼명) 평균, max 최대값, min 최소값, sum 합계, count 개수
*/
-- 2-1. 테이블 준비
create table group_userinfo(
no int(11) not null auto_increment primary key,
name varchar(20) not null,
age int(11) not null,
sex char(2),
kor int(11),
eng int(11),
math int(11),
ban char(2),
sns char(2)
);
desc group_userinfo;
insert into group_userinfo values (1, 'first', 11, null, 100, 100, 99, 'A', 'n');
insert into group_userinfo values (2, 'second', 22, 'm', 89, 92, 78, 'B', 'y');
insert into group_userinfo values (3, 'third', 33, 'm', 90, 92, 97, 'A', 'y');
insert into group_userinfo values (4, 'fourth', 44, 'f', 40, 42, 67, 'C', 'n');
insert into group_userinfo values (5, 'fifth', 55, 'f', 89, 86, 99, 'B', 'y');
insert into group_userinfo values (6, 'sixth', 66, 'm', 10, 20, 44, 'C', 'n');
select * from group_userinfo;

alter table group_userinfo modify sns char(2) default 'y';

-- 2-2. 기본
select * from group_userinfo group by ban; -- 1
select @@sql_mode; -- 경고발생 -- 2
set SESSION sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
select * from group_userinfo;
select * from group_userinfo group by ban; -- 4

-- 나이평균
select avg(age) from group_userinfo;

-- 반 별로 몇 명 있는지
select ban, count(*) from group_userinfo group by ban;

-- 반별 국, 영, 수의 총점 확인
select ban, sum(kor) `국어총합`, sum(eng) `영어총합`, sum(math) `수학총합`  -- as 생략
from group_userinfo
group by ban;

-- 반별 국, 영, 수의 평균 확인
select ban, avg(kor) `국어평균`, avg(eng) `영어평균`, avg(math) `수학평균`
from group_userinfo
group by ban;

-- 반별 나이 총합, 나이 평균 확인
select ban, sum(age) `나이 총합`, avg(age) `나이 평균`, max(age) `최고나이`, min(age) `최저나이`
from group_userinfo
group by ban;

--  반별 국영수의 평균 확인 후 '국어'평균점수가 89이상인 데이터만 고르기
select ban, avg(kor) `국어평균`, avg(eng) `영어평균`, avg(math) `수학평균`
from group_userinfo
group by ban
having avg(kor) >= 89;

-- 반별 나이의 총합과 나이 평균 확인 후 그 중에서 나이의 평균이 35세 이상인 데이터 추출 후
-- 평균나이의 내림차순으로 정렬
select ban, sum(age) `나이 총합`, avg(age) `나이 평균`
from group_userinfo
group by ban
having avg(age) >= 35
order by age desc;
/*
select   필드1, 필드2 
from     테이블명
where    조건식
group by 그룹핑
having   조건식
order by 기준필드 [asc(1, 2, 3 오름차순) | desc(3, 2, 1 내림차순)]
limit    몇 개(필요한 개수)

avg(컬럼명) 평균, max 최대값, min 최소값, sum 합계, count 개수
*/

-- 2-3. 연습문제
desc emp;
alter table emp modify ename varchar(20);
select * from emp;

-- 1~10
-- Q1. emp 테이블에서 sum함수 사용하여 급여합계
select sum(sal) `급여합계`
from emp;

-- Q2. emp 테이블에서 sum함수를 시용하여 추가수당 합계
select sum(comm) `추가수당`
from emp;

-- Q3. emp 테이블에서 sum함수를 사용하여 다음과 같이 조회
select sum(distinct sal), sum(all sal), sum(sal)
from emp;

-- Q4. emp 테이블의 레코드 개수
select count(*) `데이터갯수`
from emp;  -- 모든 필드

select count(empno) `데이터갯수`
from emp; -- 모든 필드가 값 다 있는 필드  14

select count(comm) `데이터갯수`
from emp; -- null 값이 있는 필드는 제외  4

-- Q5. emp 테이블에서 부서번호가 30인 직원 수
select count(*) `부서30 직원수`
from emp
where deptno=30;

select count(deptno) `부서30 직원수`
from emp
where deptno=30;

-- Q6. emp 테이블에서 count를 사용하여 다음과 같이 조회
select count(distinct sal), count(all sal), count(sal)
from emp;

-- Q7. emp 테이블에서 count를 이용하여 추가수당을 받는 사원수
select count(comm) `추가수당을받는 사원수`
from emp;

-- Q8. emp 테이블에서 is not null을 이용하여 추가수당을 받는 사원 수
select count(comm) `추가수당을받는 사원수`
from emp
where comm is not null;

-- Q9. emp 테이블에서 부서번호가 10인 사원들의 최대 급여
select max(sal) `부서10 최대급여`
from emp
where deptno = 10;

-- Q10. emp 테이블에서 부서번호가 10인 사원들의 최소 급여
select min(sal) `부서10 최소급여`
from emp
where deptno = 10;

-- 11~20
-- Q11. emp 테이블에서 부서번호가 20번인 사원들의 입사일 중 제일 최근의 입사일
select max(hiredate) `부서20 최근입사일`
from emp
where deptno = 20;

-- Q12. emp 테이블에서 부서번호가 20번인 사원들의 입사일 중 제일 오래된 입사일
select min(hiredate) `부서20 제일오래 된 입사일`
from emp
where deptno = 20;

-- Q13. emp 테이블에서 부서번호가 30번인 사원들의 평균급여
select avg(sal) `부서 30 평균급여`
from emp
where deptno = 30;

-- Q14. emp 테이블에서 부서번호가 30번인 사원드르이 distinct를 이용하여 중복을 제거한 급여의 평균급여
select avg(distinct sal) `부서30 중복제거 급여평균`
from emp
where deptno = 30;

-- Q15. emp 테이블에서 group by를 이용하여 부서별 평균급여
select deptno, avg(sal) `평균급여`
from emp
group by deptno
order by deptno asc;

-- Q16. emp 테이블에서 부서번호 및 직책별 평균급여로 정렬하여 다음과 같이 조회
select deptno, job, avg(sal) `평균급여`
from emp
group by deptno, job
order by deptno asc;

-- Q17. emp 테이블에서 각 부서의 직책별 평균급여를 구하되 그 평균급여가 2000이상인 그룹만 조회
select deptno, job, avg(sal) `평균급여`
from emp
group by deptno, job
having avg(sal) >= 2000
order by deptno asc;

-- Q18. emp 테이블에서 각 부서의 직책별 평균급여를 구하되 그 평균 급여가 2000이상인 그룹만 조회
-- 다음 코드를 작성해보고 오류가 난다면 오류가 나는 이유를 적으시오
select deptno, job, avg(sal)
from emp
where avg(sal) >= 2000 -- where(전체필터링)에 함수를 먼저 구해서, group by뒤에 having에서 구해야 함
group by deptno, job
order by deptno, job;

-- Q19. emp 테이블에서 급여가 3000이하인 직원에서 각 부서의 직책별 평균급여가 2000이상인 그룹 조히
select deptno, job, avg(sal) `평균급여`
from emp
where sal <= 3000
group by deptno, job
having avg(sal) >= 2000
order by deptno asc;

-- Q20. emp 테이블에서 group by절만 사용하여
-- 각 부서의 직책별 사원수, 가장높은 급여, 급여합계, 평균급여를 다음과 같이 조회
select deptno, job, count(*) `사원수`, max(sal) `최고급여`, sum(sal) `급여합`, avg(sal) `평균급여`
from emp
group by deptno, job
order by deptno, job asc;

select deptno, job, count(*) `사원수`, max(sal) `최고급여`, sum(sal) `급여합`, avg(sal) `평균급여`
from emp
group by deptno, job; -- 데이터 들쑥날쑥하게 나옴