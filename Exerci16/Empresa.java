package Exerci16;

public class Empresa {
    float salarioFunc[] = new float[5];
    float salarioFinal[] = new float[5];
    float reajusteReal[] = new float[5];

    float reajuste(int i) {
        if (salarioFunc[i] <= 4050) {
            reajusteReal[i] += (salarioFunc[i] / 2);
            salarioFinal[i] = salarioFunc[i] + (salarioFunc[i] / 2);
        } else if (salarioFunc[i] > 4050 && salarioFunc[i] <= 13500) {
            reajusteReal[i] += (salarioFunc[i] / 5);
            salarioFinal[i] = salarioFunc[i] + (salarioFunc[i] / 5);
        } else if (salarioFunc[i] > 13500 && salarioFunc[i] <= 27000) {
            reajusteReal[i] += ((salarioFunc[i] * 15) / 100);
            salarioFinal[i] = salarioFunc[i] + ((salarioFunc[i] * 15) / 100);
        } else if (salarioFunc[i] > 27000) {
            reajusteReal[i] += ((salarioFunc[i] * 10) / 100);
            salarioFinal[i] = salarioFunc[i] + ((salarioFunc[i] * 10) / 100);
        }
        return reajusteReal[i];
    }
}
