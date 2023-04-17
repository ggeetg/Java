public class validTriangle{
    public static void main(String[] args) {
        var a=3; var b=4; var c=5;
        if((a+b)>c){
            if((b+c)>a){
                if((a+c)>b){
                    System.out.println("Three sides provided are of a valid triangle");
                }
            }
        }else{
            System.out.println("Not Valid");
        }

    }
}