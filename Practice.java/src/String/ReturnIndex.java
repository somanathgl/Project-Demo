package String;

public class ReturnIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="somanath";
		char c='a';
		//First Index
		
		char ca[]=s.toCharArray();
		int cnt=0;
		for (int i = 0; i < ca.length; i++) {
			if (ca[i]==c) {
				System.out.println(i);
				cnt++;
				break;
			}
		}
		if(cnt==0){
			System.out.println("-1");
		}
		
		//Last Index
		int cnt1=0;
		for (int i = ca.length-1; 0<i; i--) {
			if (ca[i]==c) {
				System.out.println(i);
				cnt1++;
				break;
			}
		}
		if(cnt1==0){
			System.out.println("-1");
		}
	}

}
