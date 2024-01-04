--player 테이블 생성 구문
create table player(
name varchar2(21),
event varchar2(12),
type varchar2(6),
gold number(2),
silver number(2),
bronze number(2)
);

drop table player;

--bank 은행 생성 구문
create table bank(
name varchar2(21),
interest number(3,2),
goodInterest number(3,2),
monthInput number(6),
year number(1)
);
drop table bank;

--soccor 생성구문
create table soccer(
rank number(2),
name varchar2(21),
win number(2),
draw number(2),
lose number(2));

drop table soccer;


create table plan(
telecom char(2),
name varchar2(60),
month_price number,
data_gb number(4),
call_min number(4),
sms_count number(4)
);


insert into plan(telecom, name, month_price, data_gb, call_min, sms_count) 
values('SK', '5G언택트 52', 52000, 200, 1000, 2000);
insert into plan(telecom, name, month_price, data_gb, call_min, sms_count) 
values('KT', '5G세이브', 45000, 100, 900, 1500);
insert into plan(telecom, name, month_price, data_gb, call_min, sms_count) 
values('LG', '5G시그니처', 130000, 500, 2000, 2500);

select * from plan;

drop table plan;
