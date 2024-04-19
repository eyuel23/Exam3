package demo;

public class Dimension {
    private int width;
    private int heigh;
    private int depth;


    public Dimension(int width, int heigh, int depth) {
        this.width = width;
        this.heigh = heigh;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "width=" + width +
                ", heigh=" + heigh +
                ", depth=" + depth +
                '}';
    }
}
