

public class Calculadora_Adapter
extends Calculadora_202321250008
implements ICalculadora_Dhiego {

    @Override
    public int soma(int a, int b) {
        double da = a;
        double db = b;
        return (int) super.somar(da, db);
    }

    @Override
    public int sub(int a, int b) {
        double da = a;
        double db = b;
        return (int) super.subtrair(da, db);
    }

    @Override
    public int mult(int a, int b) {
        double da = a;
        double db = b;
        return (int) super.multiplicar(da, db);
    }

    @Override
    public int div(int a, int b) {
        double da = a;
        double db = b;
        return (int) super.dividir(da, db);
    }
}