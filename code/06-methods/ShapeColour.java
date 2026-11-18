// @run
/** A method that returns the colour Kandinsky assigned to a basic shape. */
public class ShapeColour {
    // region value
    public static String colourFor(String shape) {
        if (shape.equals("triangle")) {
            return "yellow";
        } else if (shape.equals("square")) {
            return "red";
        } else if (shape.equals("circle")) {
            return "blue";
        } else {
            return "no basic shape";
        }
    }
    // endregion

    public static void main(String[] args) {
        System.out.println("circle: " + colourFor("circle"));
        System.out.println("triangle: " + colourFor("triangle"));
        System.out.println("hexagon: " + colourFor("hexagon"));
    }
}
