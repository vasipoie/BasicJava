package kr.or.ddit.study06.exam4;

import java.util.ArrayList;
import java.util.List;

public class Testt {
	public static void main(String[] args) {
		
//	    System.out.println(" result : "+cal("-4--120/3+2-2"));
		
	}
	List<Double> numList = new ArrayList<Double>();
	public double cal(String org){
    	
		double result = 0;         
    	
		char orgChar[] = org.replaceAll(" ", "").toCharArray();
        
		List<Integer> index = new ArrayList<Integer>();
        
		for (int i = 0; i < orgChar.length; i++){      
            boolean numChk = String.valueOf(orgChar).matches("[0-9.]");              
            boolean numEd = index.size() % 2 == 0 ? true: false; 
            if (!(numChk || numEd)) index.add(i);             
            else if (numChk && (numEd || i == 0)) index.add(i);  
            if (i == orgChar.length - 1) index.add(orgChar.length);         
        }         
        for (int i = 0; i < index.size(); i+=2){
            String opValue = i == 0 ? org.substring(0, index.get(i)) :  org.substring(index.get(i - 1), index.get(i)); 
            int state = (opValue.length() - opValue.replaceAll("-", "").length()) % 2 == 0 ? 1 : -1;            
            double numValue = state * Double.parseDouble(org.substring(index.get(i), index.get(i+1))); 
            if (opValue.contains("*")) numValue *= numList.remove(numList.size() - 1);
            if (opValue.contains("/")) numValue = numList.remove(numList.size() - 1)/numValue  ;   
            numList.add(numValue);         
        }         
        for (int i = 0; i < numList.size(); i++) result += numList.get(i);   
        return result;    
    }
}
