package demo;

import java.util.ArrayList;

import entity.Member;
import service.MemberService;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
		//Serviceインスタンスのメソッドを利用する
//		MemberServiceImpl service = new MemberServiceImpl();
		//（Impl消す）差し込む時にここがインターフェース名の方がやらやすい
		MemberService service = MemberServiceImpl.getInstance();
		System.out.println(service.greet(2));
		
		System.out.println(service.getAll());
		ArrayList<Member> list = service.getAll();
		for (Member mem : list) {
			System.out.println(mem.getId() + "," + mem.getName() + mem.getEmail());
		}
		//sumOf(3,5) 3 + 4 + 5 = 12を返す
		//3、Mainクラスで実装(sumOf(x,y))。
		System.out.println(service.sumOf(3,5));
	}

}
