class RectangleArea{
public static void main(String[] args){
    int result1 = calculateRectangleArea(5, 6);
    System.out.println("The rectangular area is " + result1);
    
    int result2 = calculateRectangleArea(3, 7);
    System.out.println("The rectangular area is " + result2);
   
    int result3 = calculateRectangleArea(0, 7);
    System.out.println("The rectangular area is " + result3);
    
    int result4 = calculateRectangleArea(-3, 7);
    System.out.println("The rectangular area is " + result4);
   
    int result5 = calculateRectangleArea(2, -7);
    System.out.println("The rectangular area is " + result5);
   
    int result6 = calculateRectangleArea(-3, -7);
    System.out.println("The rectangular area is " + result6);
   
    int result7 = calculateRectangleArea(0, 0);
    System.out.println("The rectangular area is " + result7);
   
    int result8 = calculateRectangleArea(5, 0);
    System.out.println("The rectangular area is " + result8);
}


public static int calculateRectangleArea(int width, int height) {
    System.out.println("Calculating rectangle area with width: " + width + " and height: " + height);

    if (width < 0){
        System.out.println("Width is less than 0, setting it to 0");
    }

    if (height < 0){
        System.out.println("Height is less than 0, setting it to 0");
    }

    if (width >=0 && height >= 0){
        int area = width * height;
        return area;
    }

    return 0;
}
}