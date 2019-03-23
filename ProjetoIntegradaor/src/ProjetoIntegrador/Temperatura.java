/*Temperatura: Kelvin, Fahrenheit e Celsius.*/
package ProjetoIntegrador;
import static ProjetoIntegrador.TelaPrincipal.dado;
import static ProjetoIntegrador.TelaPrincipal.saida;
public class Temperatura {
    //Começo Kelvin(K)
    public static void kF(){//Kelvin=Fahrenheit 3.1.1
        
        Double x;
        x=Double.parseDouble(dado);
        x = (1.8*(x-273))+32;
        if(x<=-460||x>=213) saida.setText("Temperatura inexistente!");
        else{
            dado = Double.toString(x);
            saida.setText(dado);
        }
    }
    public static void kC(){//Kelvin=Celsius 3.1.2
        Double x;
        x=Double.parseDouble(dado);
        x = x-273.15;
        if(x<=-274||x>=101) saida.setText("Temperatura inexistente!");
        else{
            dado = Double.toString(x);
            saida.setText(dado);
        }
    }//Fim Kelvin
    //Começo Fahtenheit
    public static void fK(){//Fahtenheit=Kelvin 3.2.1
        Double x;
        x=Double.parseDouble(dado);
        x = (x + 459.67)*5/9;
        if(x<=-1||x>=374) saida.setText("Temperatura inexistente!");
        else{
            dado = Double.toString(x);
            saida.setText(dado);
        }
    }
    public static void fC(){//Fahtenheit=celsius 3.2.2
        Double x;
        x=Double.parseDouble(dado);
        x = (x-32)/1.8;
        if(x<=-274||x>=101) saida.setText("Temperatura inexistente!");
        else{
            dado = Double.toString(x);
            saida.setText(dado);
        }
    }//Fim Fahtenheit
    //Começo Celsius
    public static void cK(){//Celsius=Kelvin 3.3.1
        Double x;
        x=Double.parseDouble(dado);
        x = x+273.15;
        if(x<=-1||x>=374) saida.setText("Temperatura inexistente!");
        else{
            dado = Double.toString(x);
            saida.setText(dado);
        }
    }
    public static void cF(){//Celsius=Fahtenheit 3.3.2
        Double x;
        x=Double.parseDouble(dado);
        x = (x*1.8)+32;
        if(x<=-460||x>=213) saida.setText("Temperatura inexistente!");
        else{
            dado = Double.toString(x);
            saida.setText(dado);
        }
    }//Fim Celsius
}