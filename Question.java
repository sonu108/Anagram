// Complexity of this program is O(length of S) and comparing two arrays of size 256 will not take much time

import java.util.*;
import java.lang.*;
import java.io.*;

class Question
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      in.init(System.in);
	      String t = in.next();
	      String s = in.next();
	      if(solve(t,s))
	      System.out.println("true");
	      else
	      System.out.println("false");
	}
	public static boolean solve(String t, String s)
	{
	      boolean result = false;
	      int lenT = t.length();
	      int lenS = s.length();
	      int[] freqT = new int[256];
	      int[] freqSwindow = new int[256];
	      for(int i=0;i<lenT;++i)
	      {
	        freqT[t.charAt(i)]++;
	        freqSwindow[s.charAt(i)]++;
	      }
	      for(int i=lenT;i<lenS;++i)
	      {
	            if(compare(freqT,freqSwindow))
	            {
	                  result = true;
	                  break;
	            }
	      }
	      return result;
	}
	public static boolean compare(int[] a,int[] b)
	{
	      for(int i=0;i<256;++i)
	      {
	            if(a[i]!=b[i])
	            return false;
	      }
	      return true;
	}
}
class in {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
     static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
