package Guvi;
import java.util.ArrayList;
import java.util.List;

public class Translate {
	
	public static void main(String[] args)
	{
	List<String> codes = findAllCodes("110203");

			System.out.println(codes.size());
			for (String code : codes){
				System.out.println(code);
			}
		}

		private static List<String> findAllCodes(String string) {

			
			List<String> r = new ArrayList<String>();
			List<String> pr = new ArrayList<String>();

			for (int i = 0; i< string.length(); i++){
				List<String> t1 = new ArrayList<String>();
				List<String> t2 = new ArrayList<String>();
					if (i >=  1){
						int val = Integer.valueOf(string.substring(i - 1, i + 1));
						if (val <= 26 && val >= 10){
							char ch= (char)(val + 96);
							t1 = addChrToPrefix(pr, ch);
						}
					}
					int val = Integer.valueOf(string.substring(i, i+ 1));
					if (val != 0){
						char chr = (char)(val + 96);
						t2  = addChrToPrefix(r, chr);
					}
					pr = r;
					t1.addAll(t2);
					r = t1;
				}
			return r;
		}
		


		private static List<String> addChrToPrefix(List<String> preRet, char chr) {
			
			List<String> ret = new ArrayList<String>();
			if (preRet.size() == 0){
				ret.add(String.valueOf(chr));
			} 
			for (String item : preRet){
				ret.add(item + String.valueOf(chr));
			}
			return ret;
		}

	}
		