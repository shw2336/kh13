create table phone(
phone_name varchar2(60) not null,
phone_telecom char(2) not null, check(phone_telecom in('SK', 'KT', 'LG')),
--이름 + 통신사를 합쳐서 같은 경우는 없다
unique(phone_name, phone_telecom),
phone_price number not null check(phone_price >= 0),
phone_contract number(2) check(phone_contract in(0, 24, 30)) /*안쓸 수 있거나(null), 쓰는경우(0or24or30)이기때문에 number(2)*/
);

drop table phone;

insert into phone(phone_name, phone_telecom, phone_price)/*이렇게 contract를 빼주면 된다 null자리에 아무것도 안적을 수 있음*/
	values('갤럭시Fold4', 'SK', 1800000);
insert into phone(phone_name, phone_telecom, phone_price, phone_contract)
	values('갤럭시Fold4', 'KT', 1750000, 24);
insert into phone(phone_name, phone_telecom, phone_price, phone_contract)
	values('아이폰15', 'LG', 2000000, 30);
insert into phone(phone_name, phone_telecom, phone_price, phone_contract)/*이렇게 contract넣을거면 values에 null넣어주기*/
	values('아이폰15', 'SK', 1990000, null);

select * from phone;
