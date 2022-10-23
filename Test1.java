package Framework.SDET;

import org.junit.Test;

public class Test1 {
	
	@Test
	public void example1(){
		String s ="workaattech";
		int k=3;
		int maximumVowels = maximumVowels(s,k);
		System.out.println(maximumVowels);
	}
	
	
	/********
	 * Given a String s and number K
	 * 
	 * Find the maximum number of vowels substring of size K
	 * K=3 String s = "workaattech"
	 *
	 * @param args
	 */
	
	
	
	
	public int maximumVowels(String s,int k) {
		
		int end = s.length(),start=0,count=0;
		
		int max =0;
		
		for(int j=0;j<end;j++) {
			if(j-start+1<k) {
				if(isVowels(s.charAt(j))){
					count++;
				}
				max = Math.max(max, count);
				if(isVowels(s.charAt(start))) {
					count--;
				}
				start++;
			}
		}
		
		
		
		
		return max;
		
		
	}
	
	private boolean isVowels(char c) {
		if(c == 'a' || c=='A'|| c=='e'||c=='E'|| c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			return true;
		return false;
	}

}
