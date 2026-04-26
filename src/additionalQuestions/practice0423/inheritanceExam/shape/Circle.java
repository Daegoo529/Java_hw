package additionalQuestions.practice0423.inheritanceExam.shape;

public class Circle extends Shape{
    private double radius;

    public Circle(String name , double radius ){
       super(name);
       this.radius =radius;
    }
    @Override
    public void calculationArea() {
        setArea(radius * radius * Math.PI);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
