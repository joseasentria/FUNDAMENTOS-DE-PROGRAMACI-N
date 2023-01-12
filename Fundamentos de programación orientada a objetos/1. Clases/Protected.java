public class Addition {

   protected int addTwoNumbers(int a, int b){
	return a+b;
   }
}

class Test extends Addition{
   public static void main(String args[]){
   Test obj = new Test();
   System.out.println(obj.addTwoNumbers(11, 22));
   }
}