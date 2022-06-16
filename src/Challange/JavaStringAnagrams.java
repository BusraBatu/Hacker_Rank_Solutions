package Challange;
import java.util.Scanner;
public class JavaStringAnagrams {

        static boolean isAnagram(String A, String B) {
            A=A.toUpperCase();
            B=B.toUpperCase();
            boolean ret = false;
            StringBuilder c= new StringBuilder(B);

            if(A.length()==B.length()){
                for(int i=0; i<A.length();i++){
                    for(int j=0; j<c.length();j++){
                        if(A.charAt(i)==c.charAt(j)){
                            c.deleteCharAt(j);
                            if(i==A.length()-1 && c.length()==0){
                                ret=true;
                                break;
                            }
                            break;

                        }

                    }
                }
            }return ret;

        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }


