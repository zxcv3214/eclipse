/*
데이터 빈(DataBean) 클래스 작성
게시판에서 사용되는 정보들을 데이터 빈이라는 하나의 객체에 저장하게 되고
이 객체를 전달하면 각 정보를 하나씩 전달할 필요가 없으며
한꺼번에 모든 정보가 전달된다.
이런 클래스를 DTO(Data Transfer Object), VO(Value Object)라고 한다.
DB에서 만들었던 컬럼명과 동일하게 프로퍼티들을 생성한다.
 */

package net.board.db;

public class BoardBean {
	private int board_num; //글번호
	private String board_name; //글 작성자
	private String board_pass; //글 비밀번호
	private String board_subject; //글 제목
	private String board_content; //글 내용
	private String board_file; //첨부될 파일의 이름
	private int board_re_ref; //답변 글 작성시 참조되는 글 번호
	private int board_re_lev; //답변 글의 깊이
	private int board_re_seq; //답변 글의 순서
	private int board_readcount; //글의 조회수
	private String board_date;
	private int cnt;
	
	
	
	
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBoard_pass() {
		return board_pass;
	}
	public void setBoard_pass(String board_pass) {
		this.board_pass = board_pass;
	}
	public String getBoard_subject() {
		return board_subject;
	}
	public void setBoard_subject(String board_subject) {
		this.board_subject = board_subject;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_file() {
		return board_file;
	}
	public void setBoard_file(String board_file) {
		this.board_file = board_file;
	}
	public int getBoard_re_ref() {
		return board_re_ref;
	}
	public void setBoard_re_ref(int board_re_ref) {
		this.board_re_ref = board_re_ref;
	}
	public int getBoard_re_lev() {
		return board_re_lev;
	}
	public void setBoard_re_lev(int board_re_lev) {
		this.board_re_lev = board_re_lev;
	}
	public int getBoard_re_seq() {
		return board_re_seq;
	}
	public void setBoard_re_seq(int board_re_seq) {
		this.board_re_seq = board_re_seq;
	}
	public int getBoard_readcount() {
		return board_readcount;
	}
	public void setBoard_readcount(int board_readcount) {
		this.board_readcount = board_readcount;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
