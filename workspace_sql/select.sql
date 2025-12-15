SELECT * FROM EMP
WHERE sal > 1500 and sal <= 3000;

SELECT * FROM emp
WHERE job = 'CLERK' OR sal > 2000 AND deptno = 10;

SELECT * FROM emp
WHERE job = 'CLERK' AND sal > 2000 OR deptno = 10;

SELECT * FROM emp
WHERE job = 'CLERK' AND sal < 2000 OR deptno = 10;

--문제
--1 o
SELECT * FROM EMP WHERE ename like '%S';

--2 x 지정한 컬럼만 뽑아야 했는데 그러질않고 모든 컬럼이 나오게 함
SELECT * FROM emp WHERE deptno = 30 AND job = 'SALESMAN';

--SELECT empno, ename, job, sal, deptno  FROM emp WHERE deptno = 30 AND job = 'SALESMAN';

--3 x 2번 동일 
SELECT * FROM emp WHERE deptno IN (20, 30) AND sal > 2000;

--SELECT empno, ename, job, sal, deptno FROM emp WHERE deptno IN (20, 30) AND sal > 2000;

--3-2 x 2번동일
SELECT * FROM emp WHERE deptno = 20 AND sal > 2000
UNION 
SELECT * FROM emp WHERE deptno = 30 AND sal > 2000;

/*SELECT empno, ename, job, sal, deptno FROM emp WHERE deptno = 20 AND sal > 2000
UNION all
SELECT empno, ename, job, sal, deptno FROM emp WHERE deptno = 30 AND sal > 2000;
*/

--4 o
SELECT * FROM emp WHERE NOT (sal >= 2000 AND sal <= 3000);

--5 x 2번동일
SELECT * FROM emp WHERE ename LIKE '%E%' AND deptno = 30 AND not (sal >= 1000 AND sal <= 2000);

--SELECT empno, ename, job, sal, deptno FROM emp WHERE ename LIKE '%E%' AND deptno = 30 AND not (sal >= 1000 AND sal <= 2000);

--6 x 직책을 포함하지 않음 or이 아닌 and
SELECT * FROM emp WHERE COMM IS NULL AND MGR IS NOT NULL or ENAME NOT like'_L%';   

--SELECT * FROM emp WHERE COMM IS NULL AND MGR IS NOT NULL and (job ='MANAGER' or job = 'CLERK') and ENAME NOT like'_L%';  






