package edu.cnm.deepdive;

public class FizzBuzz {
  private int beginCount = 1;
  private int endCount = 100;
  private final String FIZZ = "Fizz";
  private final String BUZZ = "Buzz";
  private final String WOOF = "Woof";

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.count();
  }
  //A mod B = A - trunc(A/B) - B --- this is different than floor mod which uses floor instead of trunc {-2.5 trunc is -2} {-2.5 floor is -3}
  private void count() {
    for(int i = beginCount; i<=endCount; i++){                                                                              
      String value = "";
      if(i%3==0){
        value += FIZZ;
        printNumber(value);
      }
      if(i%5==0){
        value += BUZZ;
        printNumber(value);
      }
      if(i%7==0){
        value += WOOF;
        printNumber(value);
      }
      if(value.isEmpty()){
        printNumber(Integer.toString(i));
      }
    }
  }

  private void printNumber(String value){
    System.out.println(value);
  }


}
