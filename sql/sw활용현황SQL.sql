-- 년월별 접속자 수
select substring(`createDate`, 1, 4) as `date`, count(case when `requestcode`=? then 1 end) as `totCnt`
from statistc.requestinfo
where substring(`createDate`, 1, 2)= ? and `requestcode` = ?
group by `date` order by `date` DESC;

-- 일자별 접속자 수
select substring(`createDate`, 1, 6) as `date`, count(case when `requestcode`=? then 1 end) as `totCnt`
from statistc.requestinfo
where substring(`createDate`, 1, 4)= ? and `requestcode` = ?
group by `date`  order by `date` DESC;

-- 평균 하루 로그인 수
select count(case when `requestcode` = ? then 1 end) / count(distinct substring(`createDate`, 1, 6)) as `meanCnt`
from statistc.requestinfo
where `requestcode` = ?;

-- 휴일을 제외한 로그인 수 (현재 버전은 휴일 포함)
select count(case when requestcode='L' then 1 end) as totCnt
from statistc.requestinfo;

-- 부서별 년월별 로그인 수
select u.HR_ORGAN as `dep`, substring(ri.createDate, 1, 4) as `date`, count(case when ri.requestcode= ? then 1 end) as `totCnt`
from statistc.requestinfo as ri
join statistc.user as u on u.userID = ri.userID
where substring(ri.createDate, 1, 2)= ? and ri.requestcode = ?
group by u.HR_ORGAN, substring(ri.createDate, 1, 4)
order by u.HR_ORGAN, substring(ri.createDate, 1, 4) DESC;
