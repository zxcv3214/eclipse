/* 계좌 이체와 잔액 출력을 동시에 하는 멀티스레드 프로그램
 * 
 * - 회사의 계좌에서 인출된 100만원이 직원의 계좌로 입금되기 전에
 *   PrintThread로 실행 제어가 넘어가 계좌 잔액 합계 29000000 출력되었습니다.
 *  -문제 해결법
 *   동기화: 공유 데이터 사용 중에 그 공유 데이터를 다른 스레드가 사용하지 못하도록 만드는 것을 의미 
 * */

package ex17_08_syn_problem;

public class MultithreadExample {
	public static void main(String[] args) {
		Account a1 = new Account("111-111-1111", "회사", 20000000);
		Account a2 = new Account("222-222-2222", "직원", 10000000);
		SharedArea area = new SharedArea(a1, a2);
		TransferThread th1= new TransferThread(area);
		PrintThread th2 =new PrintThread(area);
		th1.start();
		th2.start();
	}
}
