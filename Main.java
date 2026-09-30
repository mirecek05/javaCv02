package cviceni2;

public class Main {
    public static void main(String[] args){
        Backpack b = new Backpack(10,10);
        Item item1 = new Item(5,4);
        Item item2 = new Item(5,5);
        Item item3 = new Item(1,1);
        //sout a tabulator vytvori vypis
        System.out.println(b.putItem(item1));
        System.out.println(b.putItem(item2));
        System.out.println(b.putItem(item3));

        System.out.println(Rectangle.getInstanceCount()); //staticka metoda - zatim vypise 0
        Rectangle.getInstance();
        Rectangle r = Rectangle.getInstance(8);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        Rectangle.getInstance(7,-8);//nemel by se vytvorit
        System.out.println(Rectangle.getInstanceCount()); //vypise 2
    }
}
