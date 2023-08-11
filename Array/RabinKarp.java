package Array;


public class RabinKarp {
static long HashValue(String pattern){
    long hashValue=0;
    for(int i=0;i<pattern.length();i++){
        hashValue+=pattern.charAt(i)*Math.pow(10,i);
    }
    return hashValue;
}

    static int searchPattern(String text, String pattern){
        int textLength=text.length();
        int patternLength=pattern.length();
        long patternHash=HashValue(pattern);
        long textHash=HashValue(text.substring(0, patternLength));
        for(int i=0;i<=textLength-patternLength;i++){
            if(patternHash==textHash){
                return i;
            }
            if(i<textLength-patternLength){
                String newString=text.substring(i,i+patternLength);
                textHash=HashValue(newString);
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String pattern="abcd";
        String text="abababcdbabdbc";
        System.out.println(searchPattern(text, pattern));
    }
}
