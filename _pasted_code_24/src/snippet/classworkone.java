package snippet;

public class classworkone {
	
	public void arr1(double[] random) {
		
		double sum = 0;
		for (int i = 0; i < random.length; i++) {
			sum += random[i] * i;
			
		}
		
		System.out.println(sum);
	}
	
	public void arr2(char[] cool) {
		
		String a = "";
		
		for (int i = 0; i < cool.length; i++) {
			
		
			if (cool[i] >= 97 && cool[i] <= 122) {
				a += cool[i];
			}
	
		}
		
		System.out.println(a);
	
	}
}

