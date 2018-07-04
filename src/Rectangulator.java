public class Rectengulator {

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int width = Interger.parseInt(args[1]);
        Rectangle myRectangle = new Rectangle(length, width);
        String output = "Rec length: " + myRectangle.length;
        System.out.println(output);
    }
}

