/* Geometria: Graus e Radianos. */
package ProjetoIntegrador;
import static ProjetoIntegrador.TelaPrincipal.dado;
import static ProjetoIntegrador.TelaPrincipal.saida;
public class Geometria {
    public static void grausRadianos(){//Graus=Radianos 4.1.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.0174533;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void radianosGraus(){//Radianos=Graus 4.2.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 57.2958;
        dado = Double.toString(x);
        saida.setText(dado);
    }
}
