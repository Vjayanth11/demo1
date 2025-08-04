
class prg1{
public static boolean isVowelPuzzle(String str){
    boolean res = false;
    int count=0;
    String vowels = "aeiou";
        if(vowels.indexOf(str.charAt(0))!=-1&&vowels.indexOf(str.charAt(str.length()-1))!=-1){
            res = true;
        }
        for(int i=1; i<str.length()-1; i++){
            char ch = str.charAt(i);
            if(vowels.indexOf(ch)!=-1){
                count++;
            }
        }
        if(count==2){
            res = true;
        }else{
            res = false;
        }
return res;
}
public static void main(String[] args) {
    String res = "abiodo";
    if(isVowelPuzzle(res)){
        System.out.println("valid");
    }else{
        System.out.println("not valid");
    }
}
}