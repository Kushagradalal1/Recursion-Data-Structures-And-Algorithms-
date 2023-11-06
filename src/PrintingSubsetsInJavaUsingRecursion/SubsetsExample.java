package PrintingSubsetsInJavaUsingRecursion;

public class SubsetsExample {
    public static void subSets(String s, String curr, int idx){
        if (idx==s.length()){
            System.out.println(curr);
            return;
        }
        subSets(s,curr,idx+1);
        subSets(s,curr+s.charAt(idx),idx+1);
    }
    public static void main(String[] args) {
        String s= "AB";
        subSets(s,"",0);
    }
}
