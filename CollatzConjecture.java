public class MainClass {
  public static void main(String[] args) {
    int n=1;
    while(n>1){
        if(n==1){
            break;
        }
        if(n%2==0){
            n=n/2;
            System.out.println(n);
        }else{
            n=n*3+1;
            System.out.println(n);
        }
        
    }
     
   
}
}
