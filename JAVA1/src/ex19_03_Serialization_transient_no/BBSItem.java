//생성자, 메소드, 정적 필드는 직렬화 대상이 아닙니다.
//인스턴스 필드는 직렬화 대상입니다.
//transient 키워드 : 직렬화에서 제외 시킬 필드를 표시하는 키워드
//실행순서 : ObjectOutputExample3.java -> ObjectInputExample
package ex19_03_Serialization_transient_no;
import java.io.Serializable;
public class BBSItem implements Serializable {
	private static int itemNum =0;
	private String writer;
	private transient String passwd;
	private String title;
	private String content;
		
		//생성자는 직렬화 대상이 되지 않습니다.
	BBSItem (String writer, String passwd, String title, String content){
		this.writer=writer;
		this.passwd=passwd;
		this.title=title;
		this.content=content;
		itemNum++;
		}
	//메소드는 직렬화 대상이 되지 않습니다.
		void modfiyContent(String content, String passwd) {
			if(!passwd.equals(this.passwd))
				return;
			this.content =content;
		}
		//메소드는 직렬화 대상이 되지 않습니다.
		public String toString() {
			return "전체게시물 수 : " + itemNum +
					"\n글쓴이 : " + writer +
					"\n패스워드 : " + passwd +
					"\n제목 : " + title +
					"\n내용 : " + content;
		}
}
