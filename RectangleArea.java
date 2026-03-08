class RectangleArea{
public static void main(String[] args){
    int result6 = calculateRectangleArea(-3, -7);
    System.out.println("The rectangular area is " + result6);

    int result1 = calculateRectangleArea(5, 6);
    System.out.println("The rectangular area is " + result1);
}


public static int calculateRectangleArea(int width, int height) {
    System.out.println("Calculating rectangle area with width: " + width + " and height: " + height);

    if (width < 0){
        System.out.println("Width is less than 0, setting it to 0");
    }

    if (height < 0){
        System.out.println("Height is less than 0, setting it to 0");
    }

    else{
        int area = width * height;
        return area;
    }

    return 0;
}
}