package additionalQuestions.practice0423.shape;

public class Rectangular extends Shape{
    private double width;
    private String hight;

    public Rectangular(String name, double width, String hight){
        super(name);
        this.width = width;
        this.hight = hight;
    }


    @Override
    public void calculationArea() {
        setArea(width*Integer.parseInt(hight));
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getHight() {
        return hight;
    }
}
