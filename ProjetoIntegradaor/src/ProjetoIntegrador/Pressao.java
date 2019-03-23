/*PSI e BAR.
1 bar = 14.503773773 psi
1 psi = 0.06894757293178 bar */
package ProjetoIntegrador;
import static ProjetoIntegrador.TelaPrincipal.dado;
import static ProjetoIntegrador.TelaPrincipal.saida;
public class Pressao {
    static double barp=14.503773773,psib=0.06894757293178;
    public static void psiBar(){
        Double psiBar,a;
        a=Double.parseDouble(dado);
        psiBar = a * psib;
        dado = Double.toString(psiBar);
        saida.setText(dado);
    }
    public static void barPsi(){
        Double barPsi,a;
        a=Double.parseDouble(dado);
        barPsi=a*barp;
        dado = Double.toString(barPsi);
        saida.setText(dado);
    }
}