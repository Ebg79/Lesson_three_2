public class BmiService {
    public int calculate(double weightKG, double heightM) {
        double result = weightKG / (heightM * heightM);
        return (int) result;
    }
}
