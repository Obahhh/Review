//Serviceクラスを作ります

package service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {
	
	String greet(int i);//greet(int i)引数の数字に応じて異なる挨拶文を返す
	
	//１，インターフェースに処理を追加（sumOf(x,y);　２はImplへ
	int sumOf(int x, int y);
	
	ArrayList<Member> getAll();//getAll()会員の一覧データを返す

}
