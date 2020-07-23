package com.suo.array;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	  public List<String> fizzBuzz(int n) {
	        List<String> r = new ArrayList<>(n);
	        for(int i =1;i<=n;i++){
	            StringBuilder sb = new StringBuilder();
	            if(i%3==0){
	                sb.append("fizz ");
	            }
	            if(i%5==0){
	                sb.append("buzz");
	            }
	            if(sb.length()==0){
	                sb.append(i);
	            }
	            r.add(sb.toString().trim());
	        }
	        return r;
	        
	        
	    }
}
