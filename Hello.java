class Hello {
	public static void main(String[] args) { 
		System.out.println("Hello!!!");
		MemberDAO dao = new MemberDAO();
		dao.insert();
	}
}
