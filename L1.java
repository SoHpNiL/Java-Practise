class L1 {
 public static void main(String[] args) {
      sumOfArray(new int[]{});
      sumOfArray(new int[]{3});
      sumOfArray(new int[]{23});
      sumOfArray(new int[]{-5});
      sumOfArray(new int[]{-3, -2, 1});
      sumOfArray(new int[]{2, 4, 8, -2, 1});
  }



  public static void sumOfArray(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    if (sum < 5 && sum != 0){
      System.out.println("under");
    }

    else if (sum > 30){
      System.out.println("over");
    }

    else if (sum == 0){
      System.out.println("empty");
    }
    else{
      System.out.println(sum);
    }
  }
}
  
