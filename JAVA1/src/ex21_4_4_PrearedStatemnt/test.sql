create table hakjum (
	GRADE   VARCHAR2(3) primary key,
	LOWSCORE     NUMBER(3),
	HISCORE      NUMBER(5,2)
);

create table student (
		no number(2) primary key ,
		name varchar2(21) not null ,
		kor number (3) not null check (kor between 0 and 100)  ,
		eng number (3) not null check (eng between 0 and 100) ,
		mat number(3) not null check (mat between 0 and 100) ,
		tot number(3) ,
		avg number(5,2),
		grade varchar2(3),
		FOREIGN KEY (grade) REFERENCES hakjum (grade)
		
		--grade varchar2(3) REFERENCES hakjum (grade)
);

insert into hakjum values('D0',64.99,60);
insert into hakjum values('D+',69.99,65);
insert into hakjum values('C0',74.99,70);
insert into hakjum values('C+',79.99,85);
insert into hakjum values('B0',84.99,80);
insert into hakjum values('B+',89.99,85);
insert into hakjum values('A0',94.99,90);
insert into hakjum values('A+',100,95);

create sequence student_seq;

select grade from hakjum where 100 between lowscore and hiscore;

select * from hakjum;
select * from student;
