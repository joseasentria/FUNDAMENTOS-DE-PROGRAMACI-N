public class Addition {

   public int addTwoNumbers(int a, int b){
	return a+b;
   }
}

class Test{
   public static void main(String args[]){
      Addition obj = new Addition();
      System.out.println(obj.addTwoNumbers(100, 1));
   }
}