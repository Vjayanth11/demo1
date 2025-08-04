public class prg2 {
    public static  int isAirport(int[] ar){
        int count=0;
        for(int i=0; i<ar.length-1; i++){
            if(ar[i]>ar[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] ar = {101,102,104,103, 105,107,106};
        int res = isAirport(ar);
        System.out.println(res);
    }
    
}
