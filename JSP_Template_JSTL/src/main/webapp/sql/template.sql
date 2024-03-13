-- jumin은 앞자리와 '-'와 뒷자리로 구성합니다.
-- email은 아이디@도메인으로 구성합니다.
-- hobby는 여러 개의 취미를 콤마로 구분합니다.
-- gender의 value값을 m 또는 f 로 변경합니다.
-- post는 0으로 시작하는 우편번호가 있어 문자형으로 처리합니다. (01234를 숫자형으로 저장하면 1234만 저장됩니다.)

create table template_join(
	id varchar2(20) primary key,
	password varchar2(20),
	jumin varchar2(14),
	email varchar2(30),
	gender char(1) check(gender in ('m', 'f')),
	hobby varchar2(40),
	post varchar2(5),
	address varchar2(150),
	intro varchar2(100),
	register_date date default sysdate
);
insert into template_join
(id, password, jumin, email, gender,hobby,post,address,intro)
values('admin','1234','900909-1234567','admin@naver.com','m',
		'공부,운동','12345','서울시 종로구','좋아요.');
		
insert into template_join
(id, password, jumin, email, gender,hobby,post,address,intro)
values('admin','1234','856204-1234567','admin@naver.com','m',
		'공부,운동','12345','서울시 종로구','좋아요.');
insert into template_join
(id, password, jumin, email, gender,hobby,post,address,intro)
values('aaaa1','1234','752310-2234567','admin@naver.com','f',
		'낚시,운동','12345','서울시 종로구','좋아요.');
insert into template_join
(id, password, jumin, email, gender,hobby,post,address,intro)
values('bbbb2','1234','625201-2234567','admin@naver.com','f',
		'공부,운동','12345','서울시 강남구','날씨가 좋아요.');		
insert into template_join
(id, password, jumin, email, gender,hobby,post,address,intro)
values('cccc3','1234','000909-1204767','admin@naver.com','m',
		'등산,운동','32345','서울 서대문구','좋아요.');
insert into template_join
(id, password, jumin, email, gender,hobby,post,address,intro)
values('dddd4','1234','980120-1234567','admin@naver.com','m',
		'공부,운동','12345','서울시 종로구','좋아요.');
insert into template_join
(id, password, jumin, email, gender,hobby,post,address,intro)
values('eeee5','1234','900909-1234567','admin@naver.com','m',
		'공부,운동','12345','서울시 마포구','따뜻한 날씨.');
insert into template_join
(id, password, jumin, email, gender,hobby,post,address,intro)
values('ffff6','1234','900909-2234567','admin@naver.com','f',
		'공부,운동,등산','12345','서울시 종로구','ㅎㅇㅎㅇ.');
		
select * from template_join;