//POJOを作成します

/*Entityクラス
 * public class Member {
 * 		//フィールド（メンバ変数）
 * 		private int id;
 * 		private String name;
 * 		private String email;
 * 
 * 		//メソッド（メンバメソッド）
 *      //constructor
 *      //getter and setter
 */
package entity;

public class Member {
	
	private int id;
	private String name;
	private String email;
	
	public Member(){}

	public Member(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};
	
	
	

}