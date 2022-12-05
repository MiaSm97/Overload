package exercise.overload;

public class Shape {
    public String shapeName;
    public int numberOfEdges;


    public void shapeCreation() {
        System.out.println("Creating a Shape Object");

    }

    public Shape(){

        this.shapeName = "Undefined shape";
    }
    public Shape(double radius){

        System.out.println("Creating a circle");

        this.shapeName = "circle";

    }


    public Shape(int edges, double edgeLength){

        System.out.println("Creating a square");

        this.shapeName = "square";
        this.numberOfEdges = edges;

    }

    public Shape(int edges, double e1, double e2){

        System.out.println("Creating a rectangle");

        this.shapeName = "rectangle";
        this.numberOfEdges = edges;

    }


    public Shape(int edges, double e1, double e2, double e3){

        System.out.println("Creating a triangle");

        this.shapeName = "triangle";
        this.numberOfEdges = edges;

    }

    public void getShapeDetails(){
        System.out.println("Shape Name: " + this.shapeName + " - Number of edges: " + this.numberOfEdges);

    }
}

        /*define a class called Shape that has:
        an instance variable shapeName
        an instance variable numberOfEdges
        1 basic constructor method with no params that
        informs the user about the Shape object creation
        assign Undefined shape to the object's shapeName
        4 params overload constructor methods:
        for circle:
        takes a double radius param
        informs the user about the object creation
        assigns the shapeName
        for square
        takes an int edges param and a double edgeLength param
        informs the user about the object creation
        assigns the values to numberOfEdges and to shapeName
        for rectangle:
        takes an int edges param and 2 double (e1, e2) params
        informs the user about the object creation
        assigns the values to numberOfEdges and to shapeName
        for triangle:
        takes an int edges param and 3 double (e1, e2, e3) params
        informs the user about the object creation
        assigns the values to numberOfEdges and to shapeName
        a method called getShapeDetails() that returns an informative String containing:
        shapeName
        numberOfEdges
        define a testing class where you:
        create the 5 Shape objects using all the different constructor invocations
        invoke getShapeDetails() for each Shape object and assign the returned values to dedicated String variables
        print in console the values of the 5 dedicated String variables*/
