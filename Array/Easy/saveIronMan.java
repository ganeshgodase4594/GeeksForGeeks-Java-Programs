

/*
 
 */



package Array.Easy;

public class saveIronMan {

    static boolean saveIronman (String s) {
        
        int left =0 ;
        int right = s.length()-1;
        
        s = s.toLowerCase();

        System.out.println(s);

        while(left <= right){

            System.out.print(s.charAt(left)+" ");
            System.out.print(s.charAt(right)+" ");
            System.out.println();

            if((s.charAt(left)>=97 && s.charAt(left)<=122) && (s.charAt(right)>=97 && s.charAt(right)<=122)){
                if(s.charAt(right)!=s.charAt(left)){
                    return false;
                }
            }

            else if((s.charAt(left)<97 || s.charAt(left)>122) && (s.charAt(right)>=97 && s.charAt(right)<=122)){
                left++;
            }

            else if((s.charAt(right)<97 || s.charAt(right)>122) && (s.charAt(left)>=97 && s.charAt(left)<=122)){
                right--;
            }

            else{
                left++;
                right--;
            }   
        }
        
        
      
      return true;
    
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        System.out.println(saveIronman(str));
    }
}
