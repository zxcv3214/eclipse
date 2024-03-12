select * from board;

delete from board;

drop sequence board_seq;
create sequence board_seq;

---- 게시판 페이징처리 ----
SELECT *
FROM (
		SELECT ROWNUM RUM, S.* --별칭 S 테이블의 모든 컬럼
			FROM
				(SELECT BOARD_NUM, BOARD_NAME, BOARD_SUBJECT, BOARD_CONTENT,
				 BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV, 
				 BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE
				 FROM BOARD
				 ORDER BY BOARD_RE_REF DESC, BOARD_RE_SEQ ASC
				 ) S
			WHERE ROWNUM <= 10
	)
WHERE RUM>=1 AND RUM <=10;

select * from board;

 delete from board
			where	board_re_ref = ?
			and	board_re_lev >=?
			and	board_re_seq >=?
			and	board_re_seq <= (nvl(select min(board_re_seq)-1
						from	board
						where	board_re_ref=1
						and	board_re_lev=1
						and	board_re_seq>2) ,
						select max(board_re_seq)
						from	board
						where	board_re_ref=1 )
					);
					
Insert into BOARD.BOARD (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE) values (11,'admin','1234','JSP 공부는 재미있어요','열심히 해봐요',null,null,11,0,0,0,to_date('24/02/13','RR/MM/DD'));
Insert into BOARD.BOARD (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE) values (1,'admin','1234','힘내세요','힘내세요',null,null,1,0,0,0,to_date('24/02/13','RR/MM/DD'));
Insert into BOARD.BOARD (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE) values (2,'admin','1234','저도요','저도요',null,null,2,1,3,0,to_date('24/02/13','RR/MM/DD'));
Insert into BOARD.BOARD (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE) values (13,'admin','1234','나도 찬성','찬성입니다.',null,null,11,2,4,0,to_date('24/02/13','RR/MM/DD'));
Insert into BOARD.BOARD (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE) values (14,'admin','1234','나도 찬성','하하',null,null,11,3,5,0,to_date('24/02/13','RR/MM/DD'));
Insert into BOARD.BOARD (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE) values (2,'admin','1234','JAVA도','JAVA도',null,null,1,1,1,0,to_date('24/02/13','RR/MM/DD'));
Insert into BOARD.BOARD (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE) values (16,'admin','1234','나도 찬성이요','찬성',null,null,11,2,2,0,to_date('24/02/13','RR/MM/DD'));
Insert into BOARD.BOARD (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE) values (17,'admin','1234','힘내세요','운동하세요',null,null,10,1,1,0,to_date('24/02/13','RR/MM/DD'));


update board set BOARD_NUM=8,BOARD_RE_REF=6  where BOARD_NUM=16;