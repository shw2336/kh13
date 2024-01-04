create table lecture(
lecture_name varchar2(60) not null unique,
lecture_time number not null check(lecture_time >= 0 and mod(lecture_time, 30) = 0),
lecture_price number not null check(lecture_price >= 0),
lecture_type varchar2(12) not null check(lecture_type in ('온라인', '오프라인', '혼합'))
);

drop table lecture;

insert into lecture(lecture_name, lecture_time, lecture_price, lecture_type)
values('자바 마스터과정', 90, 1000000, '온라인');
insert into lecture(lecture_name, lecture_time, lecture_price, lecture_type)
values('파이썬 기초', 61, 600000, '온라인');
insert into lecture(lecture_name, lecture_time, lecture_price, lecture_type)
values('웹 개발자 단기과정', 120, 1200000, '오프라인');

select * from lecture;
