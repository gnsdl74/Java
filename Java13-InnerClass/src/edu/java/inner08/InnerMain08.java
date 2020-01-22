package edu.java.inner08;

class FinishListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("<<< 종료 >>>");
	}

} // end FinishListener

class CancelListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("<<< 취소 >>>");
	}
} // end CancelListener

public class InnerMain08 {

	public static void main(String[] args) {
		Button btnFinish = new Button();
		
		Button.OnClickListener finListener = new FinishListener();
		
		btnFinish.setOnClickListener(finListener);
		btnFinish.click();
		
		System.out.println();
		Button btnCancel = new Button();
//		Button.OnClickListener cancel = new CancelListener();
		
		btnCancel.setOnClickListener(new CancelListener());
		btnCancel.click();
		
		// 1. btn 객체 생성
		// 2. 익명 클래스를 사용하여 listener 객체 생성(onClick 메소드를 오버라이드 하여 사용)
		// 3. btn 객체에 listener 적용(setOnclickListener())
		// 4. btn click() 메소드 호출
		System.out.println();
		Button btn = new Button();
		
		// 인터페이스 변수를 선언하고 집어넣는 경우
//		Button.OnClickListener listener = new Button.OnClickListener() {
//			@Override
//			public void onClick() {
//				System.out.println("--- 시발 ---");
//			}
//		};
//		btn.setOnClickListener(listener);
		
		// 익명클래스를 이용해서 바로 작성하는 경우
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("--- 시발 ---");
			}
		});
		btn.click();
		// 익명 클래스를 사용하는 이유
		// - 인터페이스의 메소드가 한 개인 경우,
		//   클래스를 외부에서 선언하여 implements하지 않고 사용하기 위해
		// - 익명 클래스를 사용하면 클래스를 외부에서 생성할 필요가 없음
		
	} // end main()

} // end InnerMain08
