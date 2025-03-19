-- Q0. 데이터 복사
create table select_emp select * from emp;  -- 구조 + 데이터 복사
alter table select_emp modify empno int not null auto_increment primary key;
desc select_emp;
select * from select_emp;

## 1~10
-- Q1.테이블의 모든 열 출력
select * from select_emp;

-- Q2.부서번호가 30인 데이터 출력
select * from select_emp
where deptno=30;

-- Q3.부서번호가 30이고 job이 SALESMAN인 데이터 출력
select * from select_emp
where deptno=30 and job='SALESMAN';

-- Q4.부서번호가 30이거나 job CLERK인 데이터 출력
select * from select_emp
where deptno=30 or job='CLERK';

-- Q5.급여*12한 값이 36000인 행 출력
select * from select_emp
where sal*12=36000;

-- Q6.대소비교연산자를 이용하여 급여가 3000이상인 사원정보 조회
select * from select_emp
where sal >= 3000;

-- Q7.대소비교연산자를 이용하여 시원의 첫문자가 F와 같거나 뒤쪽인 사원정보
select * from select_emp
where ename like 'F%' or ename between 'F%' and 'Z%';

select * from select_emp
where ename >= 'F';

-- Q8.대소비교연산자를 이용하여 사원이 이름이 FORD 문자열보다 알파벳순서로 앞에 있는 사원정보 출력
select * from select_emp
where ename like '%F%' or ename between 'A%' and 'F%';

select * from select_emp
where ename <= 'FORD';

-- Q9.등가비교연산자 (!=)를 이용하여 급여가 3000이 아닌 사원의 데이터 출력
select * from select_emp
where sal != 3000;

-- Q10.등가비교연산자 (<>)를 이용하여 급여가 3000이 아닌 사원의 데이터 출력
select * from select_emp
where sal <> 3000;

## 11~20
-- Q11. NOT 연산자를이용하여 급여가 3000이 아닌 사원의 데이터 출력
select * from select_emp
where not sal = 3000;

select * from select_emp
where sal not in (3000);

-- Q12. OR 연산자를 이용하여 job이 MANAGER이거나 SALESMAN 또는 CLERK인 데이터 출력
select * from select_emp
where job='MANAGER' or job='SALESMAN' or job='CLERK';

-- Q13. IN 연산자를 이용하여 job이 MANAGER이거나 SALESMAN 또는 CLERK인 데이터 출력
select * from select_emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');

-- Q14. AND 연산자와 등가비교연산자(!=, <>)를 이용하여 job이 MANAGER이거나 SALESMAN 또는 CLERK이 아닌 데이터 출력
select * from select_emp
where job != 'MANAGER' and job <> 'SALESMAN' and job <> 'CLERK';

-- Q15. NOT연산자와 IN연산자를 이용하여 job이 MANAGER이거나 SALESMAN 또는 CLERK가 아닌 데이터 출력
select * from select_emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');

-- Q16. 대소비교연산자(>=, <=)와 AND 연산자를 이용하여 급여가 2000~3000인 사원 데이터 출력
select * from select_emp
where sal>=2000 and sal<=3000;

-- Q17. BETWEEN과 AND 연산자를 이용하여 급여가 2000~3000인 사원 데이터 출력
select * from select_emp
where sal between 2000 and 3000;

-- Q18. NOT BETWEEN과 AND 연산자를 이용하여 급여가 2000~3000사이 외의 사원 데이터 출력
select * from select_emp
where sal not between 2000 and 3000;

-- Q19. NOT과 AND 연산자를 이용하여 급여가 2000~3000사이 외의 사원 데이터 출력
select * from select_emp
where not (sal>=2000 and sal<=3000);

-- Q20. empno가 7499이고 deptno가 30인 데이터 출력
select * from select_emp
where empno=7499 and deptno=30;

## 21~30
-- Q21. deptno가 20이거나 job이 SALSEMAN인 데이터 출력
select * from select_emp
where deptno=20 or job='SALESMAN';

-- Q22. 대소비교연산자를 이용하여 급여가 2500 이상이고 직업이 ANALYST인 사원 정보 출력
select * from select_emp
where sal>=2500 and job='ANALYST';

-- Q23. deptno가 10, 20번인 사원 정보 출력
select * from select_emp
where deptno in (10, 20);

-- Q24. IN을 이용하여 deptno가 10, 20번이 아닌 사원 정보 출력
select * from select_emp
where deptno not in (10, 20);

-- Q25. LIKE 연산자를 이용하여 이름이 S로 시작하는 사원 정보 출력
select * from select_emp
where ename like 'S%';

-- Q26. LIKE 연산자를 이용하여 이름의 두번째 글자가 L인 사원 정보 출력
select * from select_emp
where ename like '_L%';

-- Q27. LIKE 연산자를 이용하여 이름에 AM이 포함되어 있는 사원 정보 출력
select * from select_emp
where ename like '%AM%';

-- Q28. LIKE 연산자를 이용하여 이름에 AM이 포함되어 있지 않은 사원 정보 출력
select * from select_emp
where ename not like '%AM%';

-- Q29. ename에 AM이 포함되어 있는 사원의 별칭을 사용하여 ename, sal, sal*12+comm, comm 사원 정보 출력
-- 숫자 + null 계산 안 됨.
-- 출력 X
select ename as 'ENAME', sal as 'SAL', sal as 'ANNSAL', comm as 'COMM'
from select_emp
where ename like '%AM%';

select ename, sal, sal*12+comm 'annal', comm
from select_emp
where ename like '%AM%';

-- Q30. 등가비교연산자(=)와 NULL을 이용하여 comm이 NULL인 사원 정보 출력
-- X
select * from select_emp
where comm = null;

## 31~40
-- Q31. IS NULL을 이용하여 comm이 NULL인 사원 데이터 출력
select * from select_emp
where comm is null;

-- Q32. IS NOT NULL을 이용하여 MGR이 있는 사원 데이터 출력
select * from select_emp
where mgr is not null;

-- Q33. null 값이 없음 / 상태를 나타냄
select * from select_emp
where sal > null; -- 비교 할 수 없음

-- Q34.
select * from select_emp
where sal > null or comm is null;
--       null    or    true  => true

-- Q35. ename이 S로 끝나는 사원 데이터 출력
select * from select_emp
where ename like '%S';

-- Q36. deptno가 30이고 job이 SALESMAN인 사원 데이터 출력
select empno, ename, job, sal, deptno
from select_emp
where deptno=30 and job='SALESMAN';

-- Q37. deptno가 20, 30인 사원 중 sal이 2000 초과인 사원 데이터 출력
select empno, ename, job, sal, deptno
from select_emp
where deptno in (20, 30) and sal>2000;

-- Q38. NOT BETWEEN을 사용하지 않고 sal이 2000이상 3000이하 외의 값을 가진 사원 데이터 출력
/*
select * from select_emp
where not (sal<2000 and sal>3000);
*/

select empno, ename, job, sal, deptno
from select_emp
where sal<2000 or sal>3000;

-- Q39. deptno가 30이고 이름에 E가 포함되어 있는 사원 중 sal이 1000~2000사이가 아닌 값을 가진 사원 데이터 출력
select ename, empno, sal, deptno
from select_emp
where deptno=30 and ename like '%E%' and not (sal>1000 and sal<2000);

select ename, empno, job, sal, deptno
from select_emp
where deptno=30 and ename like '%E%' and sal not between 1000 and 2000;

-- Q40. comm이 없고 mgr은 존재하며 job이 MANAGER, CLERK 중에서 사원이름의 두번째 글자가 L이 아닌 사원 데이터 출력
select * from select_emp
where (comm is not null or mgr is null) and (job='MANAGER' and job='CLERK') and (ename not like '_L%');

select * from select_emp
where comm is null and mgr is not null and job in('MANAGER', 'CLERK') and ename not like '_L%';