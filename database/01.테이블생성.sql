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
