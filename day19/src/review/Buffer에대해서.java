package review;

public class Buffer에대해서 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 10; i++) {
			sb.append("Number: ").append(i).append("\n");
		}
		
		String result = sb.toString();
		System.out.println(result);
	}

}
