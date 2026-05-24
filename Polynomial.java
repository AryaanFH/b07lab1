public class Polynomial{
    private double[] coefficients;

    public Polynomial() {
        coefficients = new double[]{0};
    }

    public Polynomial(double[] coeffs) {
        coefficients = coeffs;
    }

    public Polynomial add(Polynomial other) {

        int maxLength = Math.max(
            this.coefficients.length,
            other.coefficients.length
        );

        double[] result = new double[maxLength];

        for (int i = 0; i < maxLength; i++) {

            double a = 0;
            double b = 0;

            if (i < this.coefficients.length) {
                a = this.coefficients[i];
            }

            if (i < other.coefficients.length) {
                b = other.coefficients[i];
            }

            result[i] = a + b;
        }

        return new Polynomial(result);
    }
    public double evaluate(double num){
        int length = this.coefficients.length;
	double result =0;
	for (int i =0; i<length; i++){
	    result += this.coefficients[i]*Math.pow(num, i);
	}
	return result;
    }
    public boolean hasRoot(double x){
	return evaluate(x) == 0;
    }
}