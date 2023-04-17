public class checkPrimeNumbers {
    public static void main(String[] args) {
        var n = 34;
        var i =2;
        if(i<n){
            if((n%2)==0){
                System.out.println("Not Prime");
            }else{i=i+1;}
        }
        else{
            System.out.println("Prime");
        }
}
}
