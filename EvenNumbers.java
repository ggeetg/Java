public class EvenNumbers {
    public static void main(String[] args){
        var n = 16;
        for(var i=1; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
                i=i+1;
            }
        }
    }
}
