/*Comprimento: Metro, Quilômetro, Milhas e Polegada.*/
package ProjetoIntegrador;
import static ProjetoIntegrador.TelaPrincipal.dado;
import static ProjetoIntegrador.TelaPrincipal.saida;
public class Comprimento {
    //Começo METRO
    public static void metroKm(){//Metro=Km 2.1.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void metroMilhas(){//Metro=Milhas 2.1.2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.000621371;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void metroPolegada(){//Metro=Polegada 2.1.3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 39.3701;
        dado = Double.toString(x);
        saida.setText(dado);
    }//Fim METRO
    //Começo KM
    public static void kmMetro(){//Km=Metro 2.2.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1000;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void kmMilha(){//Km=Milha 2.2.2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.621371;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void kmPolegada(){//Km=Polegada 2.2.3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 39370.1;
        dado = Double.toString(x);
        saida.setText(dado);
    }//Fim KM
    //Começo MILHA
    public static void milhaMetro(){//Milha=Metro  2.3.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1609.34;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void milhaKm(){//Milha=Km  2.3.2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1.60934;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void milhaPolegada(){//Milha=Polegada  2.3.3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 63360;
        dado = Double.toString(x);
        saida.setText(dado);
    }//Fim MILHA
    //Começo POLEGADA
    public static void polegadaMetro(){//Polegada=Metro 2.4.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.0254;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void polegadaKm(){//Polegada=Km 2.4.2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.000025;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void polegadaMilha(){//Polegada=Milha 2.4.3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.0000157832598024;
        dado = Double.toString(x);
        saida.setText(dado);
    }//Fim POLEGADA
}