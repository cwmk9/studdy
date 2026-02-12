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

SELECT ename, lower(ENAME), initcap(ENAME), upper(ename) FROM emp;

SELECT 2 FROM dual;

SELECT upper('aBc'), lower ('aBc'), initcap('aBc') FROM dual;

SELECT * FROM emp WHERE lower (ename) LIKE lower ('%aM%');

SELECT * FROM emp WHERE ename LIKE upper ('%am%');

SELECT ename, length(ename) FROM emp;

SELECT *FROM emp WHERE LENGTH(ename) = 5

SELECT * FROM emp WHERE LENGTH(job) = 7

SELECT * FROM emp
WHERE comm IS NULL AND mgr IS NOT NULL AND (job ='MANAGER' or job ='CLERK') AND ename NOT like ('_L%');

--gpt 문제
--1 o
SELECT * FROM emp WHERE sal > 1000 AND sal <= 2500; 
--gpt가알려준 다른방법 나는 1001을 하면 된다는걸 못떠올림
SELECT * FROM emp WHERE sal BETWEEN 1001 AND 2500;

--2 o
SELECT * FROM emp WHERE job = 'SALESMAN' AND comm IS NOT NULL;

--3 x 급여가 이상인데 초과로 함
SELECT * FROM emp WHERE deptno NOT IN (10, 20, 30 ) AND sal > 2000;
--오답노트
SELECT * FROM emp WHERE deptno NOT IN (10, 20, 30 ) AND sal >= 2000;

--4 x or에 가로를 쳣어야함 안쳐서 이름에 a가 포함안되는 급여 5000의 킹이 들어옴
SELECT * FROM emp WHERE ename LIKE ('%A%') AND sal <= 1500 OR sal > 3000;
--오답노트
SELECT * FROM emp WHERE ename LIKE ('%A%') AND (sal <= 1500 OR sal > 3000);

--5 x
SELECT * FROM emp WHERE deptno = 20 AND sal = 30000 / 12;
--오답노트
SELECT * FROM emp WHERE deptno = 20 AND sal * 12 >= 30000;

--6 o 정답이긴하나 가로 습관들이기
SELECT * FROM emp WHERE deptno IN (10, 30) AND NOT job = 'MANAGER';
--더좋은답
SELECT * FROM emp WHERE deptno IN (10, 30) AND NOT (job = 'MANAGER');

/* 7 모든 사원의

사원이름

급여

연봉(급여 * 12)
을 조회하고,
연봉 내림차순, 연봉이 같으면 급여 오름차순으로 정렬하시오.
*/
SELECT ename, sal FROM emp ORDER BY sal DESC;

--8
SELECT * FROM emp WHERE comm IS NULL AND deptno IN (20, 30);

--9

--10
SELECT * FROM emp WHERE deptno in(10, 20) AND sal >= 2000 AND ename NOT LIKE ('%S');

--gpt 퀴즈
--1 o
SELECT * FROM emp 
WHERE sal > 1000 AND sal <= 2500;

--2 o 정답이지만 가로 습관화하기
SELECT * FROM emp 
WHERE job = 'MANAGER' OR sal >= 3000 AND deptno = 20;

--3 o
SELECT * FROM emp 
WHERE deptno NOT in (30, 40);

--4 o
SELECT * FROM emp 
WHERE deptno in(10, 20) AND sal >= 1500 AND sal <= 3000
ORDER BY sal desc, ename;

--5 o
SELECT * FROM emp 
WHERE ename NOT LIKE ('%A%');

--6 o
SELECT * FROM emp 
WHERE comm IS NOT NULL AND sal >= 2000;

--7 x in/not in 을 요구햇으나 not in을 충족하지못함
SELECT * FROM emp 
WHERE  job IN ( 'CLERK', 'SALESMAN') AND NOT (deptno=10);  
/*오답노트
 * select * from emp 
 * where job (" 'CLERK', 'SALESMAN') and deptno not in (10);
 */

--8 x 미만은 초과의 반대
SELECT * FROM emp 
WHERE deptno in( 20, 30) AND sal <= 3000 
ORDER BY ename DESC;
/* 오답노트
 * SELECT * FROM emp 
WHERE  deptno in( 20, 30) AND sal < 3000 
ORDER BY ename DESC;
 */

--1 x 2000이상 이거나 매니저가 아닌 사원이라 or이 와야함
SELECT * FROM emp 
WHERE deptno IN (10, 30) AND sal >= 2000 AND job != 'MANAGER';
/*오탑노트
 * SELECT * FROM emp 
WHERE deptno IN (10, 30) AND (sal >= 2000 or job != 'MANAGER');
 */

--2 o
SELECT * FROM emp 
WHERE (sal BETWEEN 1500 AND 3000) AND comm IS NOT NULL AND deptno != 20;

--3 o
SELECT * FROM emp 
WHERE ename NOT LIKE  ('A%') AND ename NOT LIKE ('%N');

--4 x 미만과 이하는 다르다 같은 실수
SELECT * FROM emp 
WHERE job IN ('CLERK', 'SALESMAN') and sal > 1000 AND sal <= 3000
ORDER BY deptno ASC, sal DESC;
/* 오탑노트
 SELECT * FROM emp 
WHERE job IN ('CLERK', 'SALESMAN') and sal > 1000 AND sal < 3000
ORDER BY deptno ASC, sal DESC;
 */
--5

/*upper 룰 넣으려다 실패한 이유 upper은 컬럼이 아닌 함수라 ()가 함께해야한다
SELECT * FROM emp 
WHERE upper job IN ('CLERK', 'SALESMAN') and sal > 1000 AND sal <= 3000
ORDER BY deptno ASC, sal DESC;
*/

SELECT * FROM emp 
WHERE upper(job) IN ('CLERK', 'SALESMAN') and sal > 1000 AND sal <= 3000
ORDER BY deptno ASC, sal DESC;

--x A를 소문자로 씀
SELECT * FROM emp 
WHERE deptno IN (10, 20) AND job != 'MANAGER' AND (sal >= 2000 OR comm IS NULL) AND ename NOT LIKE ('%a%');
--오답노트
SELECT * FROM emp 
WHERE deptno IN (10, 20) AND job != 'MANAGER' AND (sal >= 2000 OR comm IS NULL) AND ename NOT LIKE ('%A%');

--수업
--한글은 비트수를 더 먹는다
SELECT LENGTH ('a'), LENGTH ('한'), lengthb('a'), lengthb('한') FROM dual;

-- substr = 문자열 일부 추출
SELECT job, substr(JOB, 1, 2), substr(JOB, 3, 2), substr(JOB, 5) FROM emp;

SELECT job, substr(job, 2, 5) FROM emp;

SELECT ename, substr(ename, 2, 3) FROM emp;
SELECT ename, substr(ename, 2, 30) FROM emp; -- 마지막 숫자가 커도 끝까지만 출력
SELECT ename, substr(ename, 20, 3) FROM emp; -- 실제 길이보다 시작이 크면 null이 된다
SELECT ename, substr(ename, -3, 2) FROM emp; -- -를 시작하면 끝에서 부터 시작한다
SELECT ename, substr(ename, -30, 3) FROM emp; -- 너무크면 null

--replace
SELECT '010-6707-7558' AS REPLACE_BEFORE,
       replace('010-6707-7558', '-', ' ') AS replace_1,
       replace('010-6707-7558', '-') AS replace_2, 
       replace('010-6707-7558', '-', '한') as replace_3, 
       replace('010-6707-7558', '-', '3') AS replace_4 
       FROM dual;

SELECT ename, replace(ename, 'A', 'abc') FROM emp;

--pad
SELECT ename, lpad (ename, 10, '@') FROM emp;
SELECT ename, rpad (ename, 10, '@') FROM emp;
/*
 * 모자르면 채우고 넘치면 자른다
 * 즉, 두번째 값의 길이로 만들어 준다
 */
SELECT ename, lpad (ename, 10, '@'),
                lpad (ename, 5, '@') FROM emp;

--문제
--1
SELECT ename, substr (ename, 1, 2) FROM emp;
--2
SELECT ename, rPAD ( substr(ename, 1, 2), 6, '*' )FROM emp;
--3
SELECT ename, rPAD (substr(ename, 1, 2), LENGTH(ename), '*') 
FROM emp;
--4
SELECT 
       ename, lpad (substr(ename, 3), length(ename), '*') 
FROM emp;

SELECT 'ab' || 'cd' || 'ef' from dual;
SELECT empno || ':' || ename FROM emp;

SELECT
ename,substr (ename,-2) FROM emp;

SELECT
ename, lpad(substr (ename, -2),LENGTH(ename), '*') FROM emp;

SELECT
ename, lpad(substr (ename, -2), 4, '*') FROM emp;

SELECT
ename, lpad(substr(ename, 3), length(ename), '*') 
FROM emp;

SELECT
     '[' || ' _ _oracle_ _ ' || ']',
     '[' || trim (' _ _oracle_ _ ') || ']'
     FROM dual;
     
SELECT
     round(14.46),
     round(14.46, 1),
     round(14.46, -1)
FROM emp;

SELECT
     trunc(14.46),
     trunc(14.46, 0),
     trunc(14.46, 1),
     trunc(14.46, -1),
     trunc(-14.46)
FROM emp;

SELECT
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14),
    trunc(-3.14)
FROM emp;

SELECT
      mod(15, 6), mod(15, 0)
FROM dual;

SELECT 15/6, 15/0 FROM dual;

SELECT 
MOD(6, 3), mod(7, 3), MOD(8,3), mod(9,3)
FROM dual;

SELECT sysdate FROM dual;

SELECT ename FROM EMP
WHERE LENGTH(ename) >= 6;

SELECT sysdate FROM dual;

SELECT to_char(sysdate, 'yyyy/mm/dd  hh24:mi:ss') FROM dual;
--한글은 "" 로 감싸줘여 작동
SELECT to_char(sysdate, 'yyyy"년" mm"월" dd"일"  hh24"시" mi"분" ss"초"') FROM dual;

SELECT * FROM EMP
where hiredate > to_date('1981/06/01', 'yyyy/mm/dd');

SELECT sal, comm, 
       nvl(comm, 0),
       sal+nvl(comm, 0),
       sal+comm
FROM emp;

SELECT job, sal,
    decode(job,                         --job이
            'MANAGER', sal*1.1,         --정확히 MANAGER라면
            'SALESMAN', sal*1.05,
            'ANALYST', sal,
            sal*1.03                    -- 위 조건에 없다면
            ) AS upsal
FROM emp;

SELECT job, sal,
     CASE job
          WHEN 'MANAGER' THEN sal*1.1
          WHEN 'SALESMAN' THEN sal*1.05
          WHEN 'ALNLYST' THEN sal
          ELSE sal*1.03
     END upsal
     FROM emp;

SELECT empno, ename, comm,
    CASE
    	when comm IS NULL THEN '해당 사항 없음'
        when comm = 0 THEN  '수당없음'
        when comm > 0 THEN  '수당 : ' || comm
   END tetx
FROM emp;

--책문제
--1
SELECT empno, 
rpad(substr(empno, 1,2), length(empno), '*') AS MASKIN_EMPNO,
ename, rpad(substr(ename,1,1), LENGTH(ename), '*') AS MASKING_ENAME
FROM emp
WHERE length(ename) >= 5 and LENGTH(ename) < 6;

--2
SELECT empno, ename, sal,
	trunc (CASE ename
				WHEN ename THEN sal / 21.5		
 		   END, 1) AS DAY_PAY,
  	round (CASE ENAME 
 		   		WHEN ename THEN sal / 21.5 / 8
 		   END, 1 ) AS TIME_PAY
FROM emp;
--3
--then이 문자면 else도 문자가 와야하고 숫자면 숫자가 와야한다''는 문자
SELECT empno, ename, mgr,  
	CASE
		WHEN mgr IS NULL THEN 0000
		WHEN mgr LIKE ('75%') THEN 5555
		WHEN mgr LIKE ('76%') THEN 6666
		WHEN mgr LIKE ('77%') THEN 7777
		WHEN mgr LIKE ('78%') THEN 8888
		ELSE mgr 
	END AS CHG_MGR
FROM emp;	

SELECT empno, ename, comm,
	CASE
		WHEN comm IS NULL THEN 'NO_COMM'
		WHEN comm = 0 THEN 'ZERO'
		WHEN comm > 0 THEN 'HAS-COMM'
	END
FROM emp;

SELECT empno, ename, mgr,
	CASE
		WHEN mgr IS NULL THEN 9999
		WHEN mgr LIKE('7%') THEN 7000
		WHEN mgr LIKE('8%') THEN 8000
	ELSE mgr
	END AS NEW_MGR
FROM emp;

SELECT empno, ename, sal,
	trunc(CASE sal
		WHEN sal THEN sal / 22
	END) AS DAY_PAY,
	trunc(CASE sal
		WHEN sal THEN sal / 22 /8
	END) AS HOUT_PAY
FROM emp;
	
SELECT empno, ename, sal,
	CASE
		WHEN sal IS NULL THEN 'NO_SAL'
		WHEN sal >= 3000 THEN 'HIGH'
		WHEN sal <= 3000 THEN 'LOW'
	END aS SAL_GRADE
FROM emp;

SELECT empno, ename, sal,
	trunc(decode(sal,
			sal , sal / 22)) AS DAY_PAY,
	trunc(decode(sal,
			sal , sal / 22 /8)) AS HOUR_PAY
FROM Emp;

SELECT empno, ename, mgr,
	CASE
		WHEN MGR IS NULL THEN 0000
		WHEN MGR LIKE ('7%') THEN 7000
		WHEN MGR LIKE ('8%') THEN 8000
		ELSE MGR 
	END AS new_mgr
FROM EMP;

SELECT empno, ename, job, sal,
	trunc(CASE job
			WHEN 'SALESMAN' THEN (sal / 22 / 8) * 1.20
			ELSE sal / 22 /8
			END) AS HOUR_PAY
FROM emp;

SELECT empno, ename, sal,
	CASE
		WHEN sal IS NULL THEN 'NO_SAL'
		WHEN sal < 2000 THEN 'LOW'
		WHEN sal >= 2000 OR sal < 4000 THEN 'MID'
		WHEN sal >= 4000 THEN 'HIGH'
	END AS SAL_LEVEL
FROM emp; 

SELECT empno, ename, sal,
	trunc(CASE sal
			WHEN sal THEN sal / 21
		END) AS DAY_PAY,	
	trunc(CASE sal
			WHEN sal THEN sal / 21 / 7
		END) AS HOUR_PAY
FROM emp;
	
SELECT empno, ename, sal,
	TRUNC(decode(sal,
		sal, sal / 21)) AS DAY_PAY,
	trunc(decode (sal,
		SAL, SAL / 21 / 7)) AS HOUR_PAY
FROM emp;

SELECT empno, ename, mgr,
	CASE
		WHEN mgr IS NULL THEN 'NONE'
		WHEN mgr LIKE('78%') THEN 'A'
		WHEN mgr like('79%') THEN 'B'
		ELSE TO_CHAR(mgr)
	END AS MGR_GROUP
FROM emp;
	
SELECT empno, ename, job, sal,
	CASE
		WHEN sal IS NULL THEN 'NO SAL'
ELSE to_char(	
	trunc(CASE
			WHEN job = 'MANAGER' THEN (sal / 22) * 1.10
			WHEN job='SALESMAN' THEN (SAL / 22) * 1.05
			ELSE sal / 22
		END))
		END AS DAY_PAY_RESULT
FROM emp;
	
SELECT empno, ename, job, sal,
	CASE
		WHEN sal IS NULL THEN 'NO_SAL'
		ELSE
		TO_CHAR(
		trunc(
		CASE job
			WHEn 'ANALYST' AND sal >= 3000 THEN (sal / 22) * 1.20
			WHEN 'ANALYST' AND sal < 3000 THEN (sal / 22) * 1.10
			ELSE sal / 22 
		END))
	END AS DAY_PAY_RESULT
FROM emp;

SELECT empno, ename, job, sal,
	CASE
		WHEN sal IS NULL THEN 'NO SAL'
		ELSE 
		TO_char(
		trunc(
			CASE
				WHEN job = 'ANALYST' AND sal >= 4000 THEN (sal / 22) * 1.30
				WHEN job = 'ANALYST' AND sal >= 3000 THEN (sal / 22) * 1.20
				WHEN job = 'ANALYST' AND sal < 4000 THEN (sal / 22) * 1.10
				WHEN job = 'MANAGER' THEN (sal / 22) * 1.15
				ELSE sal / 22
			END))
	END AS DAY_PAY_RESULT
FROM emp; 
	
SELECT ename, LENGTH(ename) from emp;

SELECT sum(comm) FROM emp;

--select sum(sal), sal  FROM emp; 안됨 not a single-group group function

--count는 몇갠지 세주는거

SELECT count(sal) FROM emp;
SELECT count(comm) FROM emp;
SELECT count(*) FROM emp;

SELECT count(*) FROM emp
WHERE deptno = 30;

SELECT max(sal) FROM emp;
SELECT min(sal) FROM emp;

SELECT max(sal), min(sal), min(hiredate), min(comm), count(*), sum(sal)
FROM emp;

SELECT avg(sal) FROM EMp;

-- 이름에 a가 들어가는 사람은 몇명?
SELECT count(*) FROM emp
WHERE lower(ename) LIKE lower ('%a%'); 

SELECT DISTINCT deptno FROM EMP;--중복없이
SELECT deptno FROM EMP;

--단점
-- group by
/*
 *	제약1 select에는 group by에 적은 컬럼 명만 가능하다
 *	제약2 select에 집계 함수는 가능하다
 * 
 * 
 */
SELECT deptno
FROM emp
GROUP BY deptno; --distinct 쉽게

SELECT deptno, count(*), sum(sal)
FROM emp
GROUP BY deptno; --distinct 쉽게

SELECT deptno, job
FROM  emp
GROUP BY deptno, job;

SELECT deptno, job, count(*)
FROM  emp
GROUP BY deptno, job;

--SELECT *FROM emp
--WHERE avg(sal) < sal; 아직은 where에 avg안됨

SELECT deptno, job 
FROM EMP
WHERE deptno =10
GROUP BY deptno, JOB; 

SELECT deptno, job 
FROM EMP
--WHERE deptno =10
GROUP BY deptno, JOB
HAVING deptno =10;

SELECT deptno, job, avg(sal) 
FROM EMP
GROUP BY deptno, JOB;

--group by가 없으면 having를 쓸수 없음
SELECT deptno, job, avg(sal) 
FROM EMP
GROUP BY deptno, JOB
HAVING avg(sal) > 2000;

-- job별로 3명 이상인 job과 count(*)출력
SELECT job, count(*)
FROM EMP
GROUP BY job
HAVING count(job) >= 3;

--실행순서
/* 5 */SELECT job, 1 AS num
/* 1 */FROM emp
/* 2 */where sal > 1000
/* 3 */GROUP BY job
/* 4 */HAVING count (*) >= 3
/* 6 */ORDER BY num DESC;

SELECT * FROM dept;
SELECT * FROM emp;

SELECT * FROM emp, dept;

SELECT * FROM emp, dept
ORDER BY empno;

SELECT deptno FROM emp
WHERE ename='SMITH';

SELECT * FROM dept WHERE deptno = 20;

SELECT * FROM emp, DEPT
WHERE emp.deptno = dept.deptno and sal > 2000;

SELECT * FROM emp e, dept d
--WHERE emp.deptno = dept.deptno; 별칭주면 원래 이름 못씀
WHERE e.deptno = d.deptno;

--SELECT ename, * FROM emp; 안됨
SELECT ename, emp.* FROM emp; -- *이 다른 컬럼과 섞이면 emp.을 붙여야함

-- ambiguously
--SELECT ename, deptno 
--FROM emp e, DEPT d
--WHERE e.deptno = d.deptno;

SELECT ename, e.deptno, e.* 
FROM emp e, DEPT d
WHERE e.deptno = d.deptno;

SELECT * FROM salgrade;

--800
SELECT sal FROM emp
WHERE ename='SMITH';

SELECT ename, sal, grade, losal, hisal 
FROM emp e, salgrade s
WHERE e.sal >=s.losal AND e.sal <= s.hisal;

--7902
SELECT mgr FROM emp
WHERE ename='SMITH';

SELECT * FROM emp
WHERE empno = 7902;

-- King은 mgr이 null이어서 결과에서 빠졌다
SELECT e1.empno, e1.ename, e1.mgr,
	   e2.empno, e2.ename, e2.mgr
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno;

SELECT *
FROM  emp e NATURAL JOIN dept d;

SELECT deptno
FROM  emp e NATURAL JOIN dept d; --잘안씀 뇌에서 지워도됨

SELECT deptno, e.empno, dname
FROM emp e JOIN dept d using(deptno); 

SELECT d.deptno, d.* --join이랑 on은 같이 다니는 친구
FROM emp e JOIN dept d on(e.deptno = d.deptno)
WHERE sal <= 2000;

SELECT *
FROM emp e1 JOIN emp e2 on(e1.mgr = e2.empno);

SELECT *
FROM emp e1 LEFT OUTER JOIN emp e2 on(e1.mgr = e2.empno); --실수에서 많이씀

SELECT *
FROM emp e1 right OUTER JOIN emp e2 on(e1.mgr = e2.empno);

SELECT *
FROM emp e1 full OUTER JOIN emp e2 on(e1.mgr = e2.empno);

-- 퀴즈
-- 각 부서별로
-- 가장 높은 급여, 가장 낮은 급여의 차액 부서 번호
-- 힌트 : 결과는 총 3줄
SELECT max(sal), min(sal),max(sal) - min(sal)
FROM EMP
GROUP BY deptno;

SELECT e1.deptno, d1.dname, e1.empno, e1.ename, e1.sal
FROM dept d1 left OUTER join emp e1 on(e1.deptno = d1.deptno)
WHERE e1.sal > 2000
ORDER by e1.deptno, e1.job aSC;

       						--floor을 선호하자
SELECT e1.deptno, d1.dname, trunc(avg(e1.sal)) AVG_SAL, max(e1.sal) MAX_SAL, min(e1.sal) MIN_SAL, count(e1.deptno) CNT
FROM EMP e1 LEFT OUTER join dept d1 ON(e1.deptno = d1.deptno)
GROUP BY e1.deptno, d1.dname;

SELECT d1.deptno, d1.dname, e1.empno, e1.ename, e1.job, e1.sal
FROM dept d1 left OUTER join emp e1 on(e1.deptno = d1.deptno)
ORDER by d1.deptno, e1.ename aSC;

SELECT d1.deptno, d1.dname, e1.empno,e1.ename, e1.mgr, e1.sal, e1.deptno deptno_1, s.losal, s.hisal, s.grade, e1.mgr,e2.ename 
FROM dept d1 left OUTER join emp e1 
on(e1.deptno = d1.deptno) LEFT OUTER join salgrade s 
ON (e1.sal>=s.losal and e1.sal<=s.hisal) LEFT OUTER JOIN emp e2
ON (e1.mgr = e2.empno)
ORDER by d1.deptno, e1.empno ASC;

------------------------------------------------------

SELECT *
FROM EMp
--where sal > 2975;
WHERE sal > (SELECT sal
 				FROM EMP
 			  WHERE ename = 'JONES');

SELECT *
FROM EMP
WHERE hiredate < (SELECT HIREDATE
					FROM EMP
					WHERE ename = 'SCOTT');
					

SELECT * FROM emp
WHERE sal > (SELECT avg(sal) FROM emp);

select max(sal) FROM emp
GROUP BY deptno;

SELECT * FROM emp
WHERE sal IN (2850, 3000, 5000);

SELECT * FROM emp
WHERE sal IN (select max(sal) FROM emp
				GROUP BY deptno);

SELECT *
FROM (SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNOM EMP 
		WHERE deptno = 10) e10, dept d
WHERE e10.deptno = d.deptno;
		
SELECT job, count(*)
FROM EMp
GROUP BY job
HAVING count(*) >= 3;		

SELECT *
from(
	SELECT job, count(*) cnt
	FROM EMp
	GROUP BY job
)		
WHERE cnt >= 3;		
		
SELECT rownum, e.*
FROM emp e;

--진행순서가 오더바이가 마지막이라 줄순서가 꼬임
SELECT rownum, e.*
FROM emp e
order BY sal;		
		
--문제
-- 연봉 오름차순으로 정렬된 채로 줄 번호 적용
--SELECT * rownum
--FROM(SELECT , e.*
--	FROM emp e	
--	order BY sal);


SELECT rownum, e.*
FROM(
	SELECT * FROM EMP 
	ORDER BY sal
) e;
WHERE rownum >=6 AND rownum <= 10; --rownum where에 못씀 

SELECT rownum rn, e.*
FROM(
	SELECT * FROM EMP 
	ORDER BY sal
) e
WHERE rn >=6 AND rn <= 10

SELECT *
from(
	SELECT rownum rn, e.*
	FROM(
		SELECT * FROM EMP 
		ORDER BY sal
		) e
)
WHERE rn >=6 AND rn <= 10;

WITH e10 AS (
	SELECT * FROM emp WHERE deptno = 10
)
SELECT * FROM e10;

SELECT 
	sal,
	ename,
	(select 
		grade
	FROM SALGRADE 
	WHERE e. sal BETWEEN losal AND hisal) grade
FROM emp e;	

-- 문제1
-- comm이 null인 사원을 급여 내림차순으로 정렬
SELECT comm, ename FROM EMP
WHERE comm IS NULL 
ORDER BY sal DESC;

-- 문제2
-- 급여 등급 별 사원 수를 등급 오름차순으로 정렬
-- 등급, 몇명 출력
SELECT grade, count(sal)
FROM emp e left OUTER JOIN salgrade ON (sal>=losal AND sal <=hisal)
GROUP BY grade
ORDER BY grade;

-- 문제3  
-- 이름 급여 급여등급 부서이름 출력
-- 급여등급 3 이상만 급여등급 내림차순 
-- 급여 등급이 같은경우 급여 내림차순
SELECT ename, sal, grade, dname
FROM emp e 
LEFT OUTER JOIN dept d ON (e.DEPTNO = d.deptno)
LEFT OUTER JOIN salgrade s ON (sal > losal AND sal <=hisal )
WHERE grade >= 3
ORDER BY grade desc, sal desc;

-- 문제4
-- 부서명이 SALES인 사원 중 
-- 급여 등급이 2 또는 3 인 사원의 급여를 내림차순으로 정렬
SELECT dname, sal
FROM emp e 
LEFT OUTER JOIN dept d ON (e.DEPTNO = d.deptno)
LEFT OUTER JOIN salgrade s ON (sal > losal AND sal <=hisal )
WHERE grade <= 3 AND grade >= 2  AND dname = 'SALES'
ORDER by sal desc;

--q1
SELECT job, empno, ename, sal, e.deptno, dname
FROM emp e 
LEFT OUTER JOIN dept d ON (e.DEPTNO = d.deptn0o)
WHERE ename = 'ALLEN';

SELECT job, empno, ename, sal, e.deptno, dname
FROM emp e 
LEFT OUTER JOIN dept d ON (e.DEPTNO = d.deptno)
WHERE job = 'SALESMAN'
ORDER BY ename;
--q2
SELECT empno, ename, dname, hiredate, loc, sal, grade
FROM emp e, dept d, SALGRADE s
where sal > (SELECT avg(sal) FROM emp)
AND e.deptno = d.DEPTNO
AND sal >= losal AND sal<=hisal
ORDER by sal desC, empno aSC;
--q3
SELECT empno, ename, job, e.deptno, dname, loc
FROM emp e, dept d, salgrade s
where e.deptno = d.DEPTNO
AND sal >= losal AND sal<=hisal
AND e.deptno = 10 AND job NOT in(
								SELECT job
								FROM emp
								WHERE deptno = 30
								);

--q4
SELECT empno, ename, sal, grade
FROM emp e, salgrade s
WHERE sal >= losal AND sal<=hisal 
AND sal > (SELECT max(sal) FROM emp
				WHERE job = 'SALESMAN');

-----------------------------------------------------
--12장
-----------------------------------------------------
DESC emp; -- dbeaver에서 안됨(근데 원래 되야함)
SELECT  FROM emp;

CREATE TABLE emp_ddl(
empno NUMBER(4),
ename varchar2(10),
job varchar2(9),
mgr number(4),
hiredate DATE,
sal number(7,2),
comm number(7,2),
deptno number(2)
);
SELECT * FROM emp_ddl;

CREATE TABLE dept_ddl
AS SELECT * FROM dept;

SELECT * FROM dept_ddl;

CREATE TABLE emp_ddl_30
AS SELECT * FROM emp WHERE deptno = 30;
SELECT * FROM emp_ddl_30;

CREATE TABLE empdept_ddl
AS
SELECT empno, ename, job job2, d.deptno, dname
FROM emp e, dept d
WHERE 1<>1;
SELECT * FROM empdept_ddl;

CREATE TABLE emp_alter
AS SELECT * FROM emp;

SELECT * FROM emp_alter;

ALTER TABLE emp_ALTER
ADD hp varchar2(20);
SELECT * FROM emp_alter;

ALTER TABLE emp_alter
RENAME COLUMN hp TO tel;
SELECT * FROM emp_alter;

-- 크기는 늘어나는 경우만 가능, 줄어들지 못함
-- 다른 타입으로 변경할 경우 모든 값이 null일 때만 가능
ALTER TABLE emp_alter
MODIFY empno NUMBER(5);

ALTER TABLE emp_alter
DROP COLUMN tel;
SELECT * FROM emp_alter;

RENAME emp_alter TO emp_rename;
SELECT * FROM emp_rename;

TRUNCATE TABLE emp_rename;

DROP TABLE emp_rename;





-------------------상담 받오곰
--------------10장------------------
CREATE TABLE dept_temp
AS SELECT * FROM dept;

SELECT * FROM dept_temp;

INSERT INTO dept_temp (deptno, dname, loc)
VALUES (50, 'DATABASE', 'SEOUL');
SELECT * FROM dept_temp;

INSERT INTO dept_temp
VALUES (60, 'Network', 'BUSAL');
SELECT * FROM dept_temp;

INSERT INTO dept_temp
VALUES (70, 'WEB', null);
SELECT * FROM dept_temp;

-- '' 도 null 취급
INSERT INTO dept_temp
VALUES (80, 'MOBILE', '');
SELECT * FROM dept_temp;

INSERT INTO dept_temp (deptno, loc)
VALUES (90, 'INCHEON');
SELECT * FROM dept_temp;

CREATE TABLE emp_temp
AS SELECT * FROM emp where 1 <> 1;
SELECT * FROM emp_temp;

INSERT INTO emp_temp(empno, ename, hiredate)
VALUES (9999,'홍길동', '2026/01/27');
SELECT * FROM dept_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (7051, '최민수', to_date('2026-01-27', 'yyyy-mm-dd'));
SELECT * FROM dept_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (3111, '심청이', sysdate);
SELECT * FROM emp_temp;

INSERT INTO emp_temp
SELECT * FROM emp WHERE deptno = 10;
SELECT * FROM emp_temp;

INSERT ALL
INTO emp_temp (empno, ename, hiredate)
	VALUES (3112, '심청이2', sysdate)
INTO emp_temp (empno, ename, hiredate)
	VALUES (3113, '심청이3', sysdate)
SELECT * FROM dual;
SELECT * FROM emp_temp;
	
----------------------------------------
-- update-------------------------------
----------------------------------------
CREATE TABLE dept_temp2
AS SELECT * FROM dept;
SELECT * FROM dept_temp2;

UPDATE dept_temp2
SET loc = 'SEOUL';
SELECT * FROM dept_temp2;

ROLLBACK;
SELECT * FROM dept_temp2;

-- update, delete 실행 하기 전에
-- where를 무조건 검증 해보기!!
SELECT * FROM dept_temp2
WHERE deptno = 40;

UPDATE dept_temp2
SET dname = 'DATABASE', loc = 'SEOUL'
WHERE deptno = 40;
SELECT * FROM dept_temp2;

UPDATE dept_temp2
SET dname = (SELECT dname
			FROM dept
			WHERE deptno = 40),
	loc= (SELECT dname
			FROM dept
			WHERE deptno = 40)
WHERE deptno = 40;
SELECT * FROM dept_temp2;

CREATE TABLE emp_tmp
AS SELECT * FROM emp;
SELECT * FROM emp_tmp;


SELECT sal, sal * 1.08 FROM emp_tmp
WHERE sal < 1000;

UPDATE emp_tmp
SET sal = sal * 1.08
WHERE sal < 1000;
SELECT * FROM emp_tmp;

SELECT * FROM emp_tmp
WHERE ename in('SMITH', 'JAMES');

CREATE TABLE emp_temp2
AS SELECT * FROM emp;
SELECT * FROM emp_temp2;

DELETE FROM emp_temp2
WHERE job = 'MANAGER';
SELECT * FROM emp_temp2;

DELETE FROM emp_temp2;
SELECT * FROM emp_temp2;

ROLLBACK;
SELECT * FROM emp_temp2;

COMMIT;
SELECT * FROM emp_temp2;

rollback;
SELECT * FROM emp_temp2;

----------------------------------------------
-- 13장
----------------------------------------------
SELECT * FROM dict;
SELECT * FROM user_tables;

-----------
-- index --
-----------
CREATE INDEX idx_emp_sal
ON emp (sal ASC);

SELECT * FROM user_indexes;
SELECT * FROM USER_ind_columns; -- 외울필욘 없음 알고 넘어가자

SELECT /*+ index(e idx_emp_sal) */ -- 강제 hint
	ename, sal
FROM emp e
WHERE sal = 3000;

CREATE VIEW vw_emp20
AS (SELECT empno, ename, job, deptno
	FROM EMP
	WHERE deptno = 20);

SELECT * FROM vw_emp20
WHERE job = 'CLERK';

CREATE TABLE dept_seq
AS SELECT * FROM dept WHERE 1 != 1;
SELECT * FROM dept_seq;

CREATE SEQUENCE seq_dept;

SELECT * FROM user_sequences;

--다음값
SELECT seq_dept.nextval FROM dual;      
SELECT seq_dept.nextval FROM dual;      
SELECT seq_dept.nextval FROM dual;      

--현재값
--생성 후에 nextval 한번은 실행하고 나서
--currval 사용 가능
SELECT seq_dept.currval from dual;

CREATE SEQUENCE seq_dept_10
start WITH 10
INCREMENT BY 10;

SELECT seq_dept_10.currval FROM dual;
SELECT seq_dept_10.nextval FROM dual;

INSERT INTO dept_seq (deptno, dname, loc)
VALUES (seq_dept_10.nextval, 'datebase', 'seoul' );
SELECT * FROM dept_seq;

INSERT INTO dept_seq (deptno, dname, loc)
VALUES (seq_dept_10.nextval, 'datebase', 'seoul' );
SELECT * FROM dept_seq;

----------
-- 제약조건
----------
-- 방법 1
-- primary key를 두개 이상 줄 수 없다
CREATE TABLE table_pk (
	login_id varchar2(20) PRIMARY KEY,
	login_pw varchar2(20) NOT NULL,
	tel varchar2(20)
);
SELECT * FROM table_pk;

-- pk를 지정하면 index 자동 생성
SELECT * FROM user_indexes;

INSERT INTO table_pk
VALUES ('id1', 'pw1', null);

--id중복
INSERT INTO table_pk
VALUES ('id1', 'pw1', null);

--not null에 null추가
INSERT INTO table_pk
VALUES ('id2', null, null);

INSERT INTO table_pk (login_id)
VALUES ('id3');

INSERT INTO table_pk (login_id)
VALUES (null);

SELECT * FROM table_pk;
-- pk나 not null을 null로 변경
UPDATE table_pk
SET lofin_id = NULL 
WHERE login_id = 'id1';

INSERT INTO table_pk
VALUES ('id2', 'pw2', null);
SELECT * FROM table_pk;

-- pk를 중복되는 값으로 변경
UPDATE table_pk
SET login_id = 'id1'
WHERE login_id = 'id2';

-- 방법2
-- pk 하나 이상 지정 가능
CREATE TABLE table_pk2 (
	login_id varchar2(20),
	login_pw varchar2(20),
	tel varchar2(20),
	
	PRIMARY KEY (login_id, login_pw)
);
SELECT * FROM table_pk2;

-- 방법3
CREATE TABLE table_pk3 (
	login_id varchar2(20),
	login_pw varchar2(20),
	tel varchar2(20)
);
ALTER TABLE table_pk3
ADD PRIMARY key(login_id, login_pw);

ALTER TABLE table_pk3
MODIFY login_id PRIMARY KEY;

-- foreign key

CREATE TABLE dept_fk(
	deptno number(2) PRIMARY KEY,
	dname varchar2(14),
	ioc varchar2(13)
);
CREATE table emp_fk(
	empno number(4) PRIMARY KEY,
	ename varchar2(10),
	deptno NUMBER (2) REFERENCES dept_fk(deptno)
);
-- null 됨(항상 됨)
INSERT INTO emp_fk
VALUES (1, '이름1', null);

-- 없는 값 안됨
INSERT INTO emp_fk
VALUES (1, '이름2', 1);

INSERT INTO dept_fk
VALUES (10, '부서', '위치');
SELECT * FROM dept_fk;

INSERT INTO emp_fk
VALUES (2, '이름2', 10);

INSERT INTO emp_fk
VALUES (3, '이름3', 10);
SELECT * FROM emp_fk;

-- 없는 값으로 update 안됨
UPDATE emp_fk
SET deptno = 20
WHERE deptno = 10;

-- 처다보고 있는 원본 값 삭제 안됨
DELETE dept_fk
WHERE deptno = 10;

DROP TABLE dept_fk;

UPDATE dept_fk
SET deptno = 20
WHERE deptno = 10;

TRUNCATE TABLE dept_fk;

DELETE emp_fk
WHERE deptno=10;

UPDATE dept_fk
SET deptno = 20
WHERE deptno = 10;
SELECT * FROM dept_fk;

SELECT  ename, rPAD ( substr(empno, 1, 2), 4, '*' ) AS empno FROM emp
ORDER BY empno DESC;

SELECT empno, ename, dname, loc
FROM emp LEFT OUTER JOIN DEPT on(emp.deptno = dept.deptno)
ORDER BY dname DESC;






















































