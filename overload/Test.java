package exercise.overload;

public class Test {
    public static void main(String[] args) {

        Shape creation = new Shape();
        Shape circle = new Shape(2);
        Shape square = new Shape(4, 4);
        Shape rectangle = new Shape(4, 2, 4);
        Shape triangle = new Shape(3, 2, 4, 8);
        Shape undefined = new Shape();
        creation.shapeCreation();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();
        undefined.getShapeDetails();

    }
}
    /*define a testing class where you:
        create the 5 Shape objects using all the different constructor invocations
        invoke getShapeDetails() for each Shape object and assign the returned values to dedicated String variables
        print in console the values of the 5 dedicated String variables*/