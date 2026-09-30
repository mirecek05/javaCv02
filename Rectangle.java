package cviceni2;

public class Rectangle {
    private int a,b;
    private static int instanceCount = 0;

    public int getArea(){
        return a*b;
    }

    public int getPerimeter(){
        return 2*(a+b);
    }

    private Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        instanceCount++;
    }

    public static Rectangle getInstance(int a, int b){
        if(a > 0 && b > 0){
            return new Rectangle(a,b);
        }
        return null;
    }
    public static Rectangle getInstance(int a){
        return getInstance(a,a);
    }

    public static Rectangle getInstance(){
        return getInstance(3,5);
    }

    public static int getInstanceCount(){
        return instanceCount;
    }



}
