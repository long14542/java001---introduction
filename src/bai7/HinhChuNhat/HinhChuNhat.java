package bai7.HinhChuNhat;

public class HinhChuNhat {
    float chieuDai;
    float chieuRong;

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double dientich() {
        return chieuRong * chieuDai;
    }

    public double chuvi() {
        return 2 * (chieuDai + chieuRong);
    }
}
