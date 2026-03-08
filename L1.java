class L1 {
  public static void main(String[] args) {
    
    int[] numbers = {2,3,5,7,8};     
    int result = ArraySum(numbers);

    if (result < 5 && result != 0){
      System.out.println("under");
    }

    else if (result > 30){
      System.out.println("over");
    }

    else if (result == 0){
      System.out.println("empty");
    }
    else{
      System.out.println(result);
    }
  }



  public static int ArraySum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
