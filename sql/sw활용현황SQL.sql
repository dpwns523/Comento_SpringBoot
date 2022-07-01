-- 년월별 접속자 수
select substring(createDate, 1, 4) as 'yearMonth', count(*) as totCnt
from statistc.requestInfo
where requestCode = 'L'
group by substring(createDate, 1, 4);

-- 일자별 접속자 수
select substring(createDate, 1, 6) as date, count(*) as totCnt
from statistc.requestinfo
where requestCode='L'
group by createDate; 

-- 평균 하루 로그인 수
select substring(createDate, 1, 6) as date, count(*) / count(distinct createDate) as meanCnt
from statistc.requestinfo
where requestCode='L'
group by createDate order by meanCnt DESC;

-- 휴일을 제외한 로그인 수 (현재 버전은 휴일 포함)
select count(*) as totCnt
from statistc.requestinfo
where requestCode='L';

-- 부서별 년월별 로그인 수
select u.HR_ORGAN as 'department', substring(ri.createDate, 1, 4) as 'yearMonth', count(*) as totCnt
from statistc.requestInfo as ri
join statistc.user as u on u.userID = ri.userID
where ri.requestCode = 'L'
group by u.HR_ORGAN, substring(ri.createDate, 1, 4)
order by u.HR_ORGAN, substring(ri.createDate, 1, 4) DESC;