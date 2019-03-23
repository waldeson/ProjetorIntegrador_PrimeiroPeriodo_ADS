/*Capacidade: Litro, Galão, Quilolitro, m 3 , cm 3 , dm 3 ..*/
package ProjetoIntegrador;
import static ProjetoIntegrador.TelaPrincipal.dado;
import static ProjetoIntegrador.TelaPrincipal.saida;
public class Volume {
    //COMEÇO VOLUME
    public static void litroGalao(){//LITRO = GALÃO(EUA) \\6.1.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.264172;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void litroQuilolitro(){//LITRO = Quilolitro \\6.1.2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void litroM3(){//LITRO = Metro cúbico \\6.1.3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void litroCm3(){//LITRO = CENTRIMETRO CUBICO \\6.1.4
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1000;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void litroDm3(){// LITRO = Decimetro cubico \\6.1.5
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1;
        dado = Double.toString(x);
        saida.setText(dado);
    }   
    /*
    *
    *
    *
    *
    *
    */
    public static void galaoLitro(){//GALÃO(EUA) = LITRO \\6.2.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 3.78541;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void galaoQuilolitro(){//GALÃO(EUA) = QUILOLITRO 6.2.2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.00378541;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void galaoM3(){//GALÃO(EUA) = METRO CUBICO 6.2.3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.00378541;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void galaoCm3(){//GALÃO(EUA) = CENTRIMETRO CUBICO \\6.2.4
        Double x;
        x=Double.parseDouble(dado);
        x = x * 3785.41;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void galaoDm3(){//GALÃO(EUA) = DECIMETRO CUBICO \\6.2.5
        Double x;
        x=Double.parseDouble(dado);
        x = x * 3.78541;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    /*
    *
    *
    *
    *
    *
    */
    public static void quiloLitro(){//QUILOLITRO = LITRO \\6.3.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1000;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void quiloGalao(){//QUILOLITRO = GALÃO(EUA) \\6.3.2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 264.172;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    
    public static void quiloM3(){//QUILOLITRO = METRO CUBICO \\6.3.3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void quiloCm3(){//QUILOLITRO = CENTIMETRO CUBICO \\6.3.4
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1000000;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void quiloDm3(){// QUILOLITRO = DECIMETRO CUBICO \\6.3.5
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1000;
        dado = Double.toString(x);
        saida.setText(dado);
    }    
    /*
    *
    *
    *
    *
    *
    */
    public static void metro3Litro(){//METRO CUBICO = LITRO \\6.4.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1000;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void metro3Galao(){//METRO CUBICO = GALÃO(EUA) \\6.4.2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.264172;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void metro3Quilolitro(){// METRO CUBICO = QUILOLITRO 6.4.3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void metro3Cm3(){//METRO CUBICO = CENTIMETRO CUBICO \\6.4.4
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1000000;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void metro3Dm3(){//METRO CUBICO = DECIMETRO CUBICO \\6.4.5
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1000;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    /*
    *
    *
    *
    *
    *
    */
    public static void centimetro3Litro(){//CENTIMETRO CUBICO = LITRO \\6.5.1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void centimetro3Galao(){//CENTIMETRO CUBICO = GALÃO(EUA) \\6.5.2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.000264172;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void centimetro3Quilolitro(){//CENTIMETRO CUBICO = QUILOLITRO 6.5.3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.000001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void centimetro3M3(){//CENTIMETRO CUBICO = METRO CUBICO \\6.5.4
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.000001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void centimetro3Dm3(){//CENTIMETRO CUBICO = DECIMETRO CUBICO \\6.5.5
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    /*
    *
    *
    *
    *
    *
    */ 
    public static void decimetro3Litro(){//DECIMETRO CUBICO = LITRO \\1
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void decimetro3Galao(){//DECIMETRO CUBICO = GALÃO(EUA) \\2
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.264172;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void decimetro3Quilolitro(){//DECIMETRO CUBICO = QUILOLITRO \\3
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void decimetro3M3(){//DECIMETRO CUBICO = METRO CUBICO \\4
        Double x;
        x=Double.parseDouble(dado);
        x = x * 0.001;
        dado = Double.toString(x);
        saida.setText(dado);
    }
    public static void decimetro3Cm3(){//DECIMETRO CUBICO = CENTIMETRO CUBICO \\5
        Double x;
        x=Double.parseDouble(dado);
        x = x * 1000;
        dado = Double.toString(x);
        saida.setText(dado);
    }//FIM VOLUME
    /*
    *
    *
    *
    *
    *
    */
}