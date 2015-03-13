package za.ac.cput.factoryMethodDemo;

/**
 * Created by student on 2015/03/04.
 */
public class ShapeFactory {
    private static ShapeFactory shapeFactory = null;

    private ShapeFactory(){}

    public static ShapeFactory getInstance()
    {
        if(shapeFactory == null)
            return new ShapeFactory();
        return shapeFactory;
    }

    public Shape getShapeType(String shape)
    {
        if ("Circle".equalsIgnoreCase(shape))
            return new Circle();
        else {
            return new Rectangle();
        }
    }
}
