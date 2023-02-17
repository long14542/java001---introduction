package bai7.circle;

public class circle {
    float bankinh;

    public circle(float bankinh) {
        this.bankinh = bankinh;
    }

    public double chuvi() {
        return Math.PI * bankinh * 2;
    }

    public double dientich() {
        return Math.PI * bankinh * bankinh;
    }
}


