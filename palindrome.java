public class MainClass {
  public static void main(String[] args) {
    int n=555,remainder;
    int reversedNum=0;
    int temp=n;
    while(n>0){
      remainder = n % 10;
      reversedNum = reversedNum * 10 + remainder;
      n /= 10;
    }
    if(temp==reversedNum){
        System.out.println("True");
    }
    else{
      System.out.println("False");
  }
}
}
