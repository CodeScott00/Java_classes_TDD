public class Calculator {

    private int x;
    private int y;

   public Calculator(int x, int y) {
       this.x = x;
       this.y = y;
   }


       //add
        public int add(){
            int sum = x + y;
            return sum;
       }
       //subtract
        public int subtract(){
       int sum = x - y;
       return sum;
        }

       //multiply
        public int multiply(){
       int sum = x * y;
       return sum;
        }

       //divide
        public double divide(double a, double b){
        double sum =  a /  b;
       return sum;
        }


};
