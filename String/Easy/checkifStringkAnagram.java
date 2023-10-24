package String.Easy;

public class checkifStringkAnagram {

    static boolean areKAnagrams(String s1, String s2, int k) {
        
        if(s1.length()!=s2.length()){
            
            return false;
            
        }   
        
        int count = 0;
        
        String fstr1 = frequencyString(s1);
        String fstr2 = frequencyString(s2);

        System.out.println(fstr1);
        System.out.println(fstr2);
        
        for(int i=1;i<fstr1.length();i+=2){
            if(fstr1.charAt(i)!=fstr2.charAt(i)){
                count = count + Math.abs((fstr1.charAt(i)-48) - (fstr2.charAt(i)-48));
                // count++;
            }
            
            if(count>2*k){
                return false;
            }
        }

        System.out.println(count);
        
       return true;
        
    
       
    }
    
    static String frequencyString(String str){
        
        int freq[] = new int[26];
        
        for(char c : str.toCharArray()){
            freq[c-'a']++;
        }
        
        String s = "";
        char c = 'a';
        for(int i:freq){
            
            s += c;
            s += i;
            c++;
        }
        
        return s;
    }


    public static void main(String[] args) {

        String str1 = "uovwhqfaemqodyksjj", str2="swwhzsiowocjfyadvj";
        int k = 18;

        System.out.println(areKAnagrams(str1, str2, k));

    }
}
