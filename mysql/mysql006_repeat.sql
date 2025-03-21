use mbasic;
-- Q1. emp 테이블에서 부서번호가 30이고 이름에 E가 포함되어 있는 사원 중 급여(sal)가 1000~2000 사이가 아닌 값을 가진 데이터 조회
select * from emp
where deptno=30 and ename like '%E%' and sal between 1000 and 2000;

-- Q2. emp 테이블에서 추가수당이 없고 상급자는 존재하며 직책 'MANAGER', 'CLERK' 중에서 사원 이름의 두번째 글자가 L이 아닌 값을 가진 데이터 조회
select * from emp
where comm is null and mgr is not null and job in('MANAGER', 'CLERK') and ename not like '_L%';