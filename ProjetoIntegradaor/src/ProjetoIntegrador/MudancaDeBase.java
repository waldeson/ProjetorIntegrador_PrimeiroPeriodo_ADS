/*Mudança de Base: Binária, Octal, Hexadecimal e Decimal.*/
package ProjetoIntegrador;

import static ProjetoIntegrador.TelaPrincipal.cont;
import static ProjetoIntegrador.TelaPrincipal.dado;
import static ProjetoIntegrador.TelaPrincipal.entrada;
import static ProjetoIntegrador.TelaPrincipal.saida;
import javax.swing.JOptionPane;

public class MudancaDeBase {
    //Começo Binário
    public static void binarioOctal(){//5.1.1
        char[] teste = new char[cont];
        boolean fim;
        try{
            dado = entrada.getText();
            fim=true;
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                if(!(teste[i]=='1'||teste[i]=='0')){
                    JOptionPane.showMessageDialog(null, "Para binário digite apenas '0' e/ou '1'");
                    fim=false;
                    break;  
                }
            }
        } catch(Exception erro) {
            fim=false;
        }
        if(fim==true){
            int conta=cont;
            double x=0;
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                conta--;
                switch (teste[i]){
                    case ('0'):
                        x=x+(0*(Math.pow(2, conta)));
                        break;
                    case ('1'):
                        x=x+(1*(Math.pow(2, conta)));
                        break;    
                }
                
            }
            int inte = (int) x,resto= (int) x;
            dado = Integer.toString(inte);
            int ff=dado.length();
            char[] oc = new char[ff];
            double[] octal = new double[ff];
            String passa="";
            while(!(inte==1||inte==0)){
                resto=inte%8;
                inte=inte/8;
                passa=passa+resto;
                if((inte==1||inte==0)) passa=passa+inte;
            }
            dado="";
            for (int i = passa.length() - 1; i >= 0; i--) dado += passa.charAt(i);
            saida.setText(dado);
        }//Fim if
    }
    public static void binarioHexa(){//5.1.2
        char[] teste = new char[cont];
        boolean fim;
        try{
            dado = entrada.getText();
            fim=true;
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                if(!(teste[i]=='1'||teste[i]=='0')){
                    JOptionPane.showMessageDialog(null, "Para binário digite apenas '0' e/ou '1'");
                    fim=false;
                    break;  
                }
            }
        } catch(Exception erro) {
            fim=false;
        }
        if(fim==true){
            if(!(entrada.getText().length()==4||entrada.getText().length()==8||entrada.getText().length()==12)){
                dado=entrada.getText();
                while (!(dado.length()%4==0)) {
                    dado="0"+dado;
                }
            }
            String p1="",p2="",p3="";
            switch (dado.length()/4){
                case(1):
                    if((dado.equals("0000")))dado="0";
                    else if((dado.equals("0001")))dado="1";
                    else if((dado.equals("0010")))dado="2";
                    else if((dado.equals("0011")))dado="3";
                    else if((dado.equals("0100")))dado="4";
                    else if((dado.equals("0101")))dado="5";
                    else if((dado.equals("0110")))dado="6";
                    else if((dado.equals("0111")))dado="7";
                    else if((dado.equals("1000")))dado="8";
                    else if((dado.equals("1001")))dado="9";
                    else if((dado.equals("1010")))dado="A";
                    else if((dado.equals("1011")))dado="B";
                    else if((dado.equals("1100")))dado="C";
                    else if((dado.equals("1101")))dado="D";
                    else if((dado.equals("1110")))dado="E";
                    else if((dado.equals("1111")))dado="F";
                    break;
                case (2):
                    p1="";
                    p2="";
                    for (int i = 0; i < dado.length(); i++) {
                        if(i<4) p1=p1+dado.charAt(i);
                        else p2=p2+dado.charAt(i);
                    }
                    if((p1.equals("0000")))p1="0";
                    else if((p1.equals("0001")))p1="1";
                    else if((p1.equals("0010")))p1="2";
                    else if((p1.equals("0011")))p1="3";
                    else if((p1.equals("0100")))p1="4";
                    else if((p1.equals("0101")))p1="5";
                    else if((p1.equals("0110")))p1="6";
                    else if((p1.equals("0111")))p1="7";
                    else if((p1.equals("1000")))p1="8";
                    else if((p1.equals("1001")))p1="9";
                    else if((p1.equals("1010")))p1="A";
                    else if((p1.equals("1011")))p1="B";
                    else if((p1.equals("1100")))p1="C";
                    else if((p1.equals("1101")))p1="D";
                    else if((p1.equals("1110")))p1="E";
                    else if((p1.equals("1111")))p1="F";
                    if((p2.equals("0000")))p2="0";
                    else if((p2.equals("0001")))p2="1";
                    else if((p2.equals("0010")))p2="2";
                    else if((p2.equals("0011")))p2="3";
                    else if((p2.equals("0100")))p2="4";
                    else if((p2.equals("0101")))p2="5";
                    else if((p2.equals("0110")))p2="6";
                    else if((p2.equals("0111")))p2="7";
                    else if((p2.equals("1000")))p2="8";
                    else if((p2.equals("1001")))p2="9";
                    else if((p2.equals("1010")))p2="A";
                    else if((p2.equals("1011")))p2="B";
                    else if((p2.equals("1100")))p2="C";
                    else if((p2.equals("1101")))p2="D";
                    else if((p2.equals("1110")))p2="E";
                    else if((p2.equals("1111")))p2="F";
                    dado=""+p1+p2;
                    break;
                case (3):
                    p1="";
                    p2="";
                    p3="";
                    for (int i = 0; i < dado.length(); i++) {
                        if(i<4) p1=p1+dado.charAt(i);
                        else if(i>=4&&i<8) p2=p2+dado.charAt(i); 
                        else p3=p3+dado.charAt(i);
                    }
                    if((p1.equals("0000")))p1="0";
                    else if((p1.equals("0001")))p1="1";
                    else if((p1.equals("0010")))p1="2";
                    else if((p1.equals("0011")))p1="3";
                    else if((p1.equals("0100")))p1="4";
                    else if((p1.equals("0101")))p1="5";
                    else if((p1.equals("0110")))p1="6";
                    else if((p1.equals("0111")))p1="7";
                    else if((p1.equals("1000")))p1="8";
                    else if((p1.equals("1001")))p1="9";
                    else if((p1.equals("1010")))p1="A";
                    else if((p1.equals("1011")))p1="B";
                    else if((p1.equals("1100")))p1="C";
                    else if((p1.equals("1101")))p1="D";
                    else if((p1.equals("1110")))p1="E";
                    else if((p1.equals("1111")))p1="F";
                    if((p2.equals("0000")))p2="0";
                    else if((p2.equals("0001")))p2="1";
                    else if((p2.equals("0010")))p2="2";
                    else if((p2.equals("0011")))p2="3";
                    else if((p2.equals("0100")))p2="4";
                    else if((p2.equals("0101")))p2="5";
                    else if((p2.equals("0110")))p2="6";
                    else if((p2.equals("0111")))p2="7";
                    else if((p2.equals("1000")))p2="8";
                    else if((p2.equals("1001")))p2="9";
                    else if((p2.equals("1010")))p2="A";
                    else if((p2.equals("1011")))p2="B";
                    else if((p2.equals("1100")))p2="C";
                    else if((p2.equals("1101")))p2="D";
                    else if((p2.equals("1110")))p2="E";
                    else if((p2.equals("1111")))p2="F";
                    if((p3.equals("0000")))p3="0";
                    else if((p3.equals("0001")))p3="1";
                    else if((p3.equals("0010")))p3="2";
                    else if((p3.equals("0011")))p3="3";
                    else if((p3.equals("0100")))p3="4";
                    else if((p3.equals("0101")))p3="5";
                    else if((p3.equals("0110")))p3="6";
                    else if((p3.equals("0111")))p3="7";
                    else if((p3.equals("1000")))p3="8";
                    else if((p3.equals("1001")))p3="9";
                    else if((p3.equals("1010")))p3="A";
                    else if((p3.equals("1011")))p3="B";
                    else if((p3.equals("1100")))p3="C";
                    else if((p3.equals("1101")))p3="D";
                    else if((p3.equals("1110")))p3="E";
                    else if((p3.equals("1111")))p3="F";
                    dado=""+p1+p2+p3;
                    break;
            }
            saida.setText(dado);
        }//Fim se
    }
    public static void binarioDecimal(){//5.1.3
        char[] teste = new char[cont];
        boolean fim;
        try{
            dado = entrada.getText();
            fim=true;
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                if(!(teste[i]=='1'||teste[i]=='0')){
                    JOptionPane.showMessageDialog(null, "Para binário digite apenas '0' e/ou '1'");
                    fim=false;
                    break;  
                }
            }
        } catch(Exception erro) {
            fim=false;
        }
        if(fim==true){
            int conta=cont;
            double x=0;
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                conta--;
                switch (teste[i]){
                    case ('0'):
                        x=x+(0*(Math.pow(2, conta)));
                        break;
                    case ('1'):
                        x=x+(1*(Math.pow(2, conta)));
                        break;    
                }
                
            }
            dado = Double.toString(x);
            saida.setText(dado);
        }
    }
    //Fim Binario
    //Começo Octal
    public static void octalBinario(){//5.2.1
        char[] teste = new char[cont];
        boolean fim;
        try{
            dado = entrada.getText();
            fim=true;
            if(entrada.getText().length()>=5){
                JOptionPane.showMessageDialog(null, "Para Octal serão aceito apenas 3 characters ");
                fim=false;
            }
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                if(!(teste[i]=='1'||teste[i]=='0'||teste[i]=='2'||teste[i]=='3'||teste[i]=='4'||teste[i]=='5'||teste[i]=='6'||teste[i]=='7')){
                    JOptionPane.showMessageDialog(null, "Para Octal digite apenas de '0' até '7'");
                    fim=false;
                    break;  
                }
            }
        } catch(Exception erro) {
            fim=false;
        }
        if(fim==true){
            int conta=cont;
            double x=0;
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                conta--;
                switch (teste[i]){
                    case ('0'):
                        x=x+(0*(Math.pow(8, conta)));
                        break;
                    case ('1'):
                        x=x+(1*(Math.pow(8, conta)));
                        break;
                    case ('2'):
                        x=x+(2*(Math.pow(8, conta)));
                        break;
                    case ('3'):
                        x=x+(3*(Math.pow(8, conta)));
                        break;
                    case ('4'):
                        x=x+(4*(Math.pow(8, conta)));
                        break;
                    case ('5'):
                        x=x+(5*(Math.pow(8, conta)));
                        break;
                    case ('6'):
                        x=x+(6*(Math.pow(8, conta)));
                        break;
                    case ('7'):
                        x=x+(7*(Math.pow(8, conta)));
                        break;
                }
            }
            int inte = (int) x,resto= (int) x;
            dado = Integer.toString(inte);
            int ff=dado.length();
            char[] oc = new char[ff];
            double[] octal = new double[ff];
            String passa="";
            while(!(inte==1||inte==0)){
                resto=inte%2;
                inte=inte/2;
                passa=passa+resto;
                if((inte==1||inte==0)) passa=passa+inte;
            }
            dado="";
            for (int i = passa.length() - 1; i >= 0; i--) dado += passa.charAt(i);
            saida.setText(dado);
        }//Fim if
    }
    public static void octalHexa(){//5.2.2
        char[] teste = new char[cont];
        boolean fim;
        try{
            dado = entrada.getText();
            fim=true;
            if(entrada.getText().length()>=5){
                JOptionPane.showMessageDialog(null, "Para Octal serão aceito apenas 3 characters ");
                fim=false;
            }
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                if(!(teste[i]=='1'||teste[i]=='0'||teste[i]=='2'||teste[i]=='3'||teste[i]=='4'||teste[i]=='5'||teste[i]=='6'||teste[i]=='7')){
                    JOptionPane.showMessageDialog(null, "Para Octal digite apenas de '0' até '7'");
                    fim=false;
                    break;  
                }
            }
        } catch(Exception erro) {
            fim=false;
        }
        if(fim==true){
            int conta=cont;
            double x=0;
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                conta--;
                switch (teste[i]){
                    case ('0'):
                        x=x+(0*(Math.pow(8, conta)));
                        break;
                    case ('1'):
                        x=x+(1*(Math.pow(8, conta)));
                        break;
                    case ('2'):
                        x=x+(2*(Math.pow(8, conta)));
                        break;
                    case ('3'):
                        x=x+(3*(Math.pow(8, conta)));
                        break;
                    case ('4'):
                        x=x+(4*(Math.pow(8, conta)));
                        break;
                    case ('5'):
                        x=x+(5*(Math.pow(8, conta)));
                        break;
                    case ('6'):
                        x=x+(6*(Math.pow(8, conta)));
                        break;
                    case ('7'):
                        x=x+(7*(Math.pow(8, conta)));
                        break;
                }
            }
            int inte = (int) x,resto= (int) x;
            dado = Integer.toString(inte);
            int ff=dado.length();
            char[] oc = new char[ff];
            double[] octal = new double[ff];
            String passa="";
            while(!(inte==1||inte==0)){
                resto=inte%2;
                inte=inte/2;
                passa=passa+resto;
                if((inte==1||inte==0)) passa=passa+inte;
            }
            dado="";
            for (int i = passa.length() - 1; i >= 0; i--) dado += passa.charAt(i);
            if(!(dado.length()==4||dado.length()==8||dado.length()==12)){
                while (!(dado.length()%4==0)) {
                    dado="0"+dado;
                }
            }
            String p1="",p2="",p3="";
            switch (dado.length()/4){
                case(1):
                    if((dado.equals("0000")))dado="0";
                    else if((dado.equals("0001")))dado="1";
                    else if((dado.equals("0010")))dado="2";
                    else if((dado.equals("0011")))dado="3";
                    else if((dado.equals("0100")))dado="4";
                    else if((dado.equals("0101")))dado="5";
                    else if((dado.equals("0110")))dado="6";
                    else if((dado.equals("0111")))dado="7";
                    else if((dado.equals("1000")))dado="8";
                    else if((dado.equals("1001")))dado="9";
                    else if((dado.equals("1010")))dado="A";
                    else if((dado.equals("1011")))dado="B";
                    else if((dado.equals("1100")))dado="C";
                    else if((dado.equals("1101")))dado="D";
                    else if((dado.equals("1110")))dado="E";
                    else if((dado.equals("1111")))dado="F";
                    break;
                case (2):
                    p1="";
                    p2="";
                    for (int i = 0; i < dado.length(); i++) {
                        if(i<4) p1=p1+dado.charAt(i);
                        else p2=p2+dado.charAt(i);
                    }
                    if((p1.equals("0000")))p1="0";
                    else if((p1.equals("0001")))p1="1";
                    else if((p1.equals("0010")))p1="2";
                    else if((p1.equals("0011")))p1="3";
                    else if((p1.equals("0100")))p1="4";
                    else if((p1.equals("0101")))p1="5";
                    else if((p1.equals("0110")))p1="6";
                    else if((p1.equals("0111")))p1="7";
                    else if((p1.equals("1000")))p1="8";
                    else if((p1.equals("1001")))p1="9";
                    else if((p1.equals("1010")))p1="A";
                    else if((p1.equals("1011")))p1="B";
                    else if((p1.equals("1100")))p1="C";
                    else if((p1.equals("1101")))p1="D";
                    else if((p1.equals("1110")))p1="E";
                    else if((p1.equals("1111")))p1="F";
                    if((p2.equals("0000")))p2="0";
                    else if((p2.equals("0001")))p2="1";
                    else if((p2.equals("0010")))p2="2";
                    else if((p2.equals("0011")))p2="3";
                    else if((p2.equals("0100")))p2="4";
                    else if((p2.equals("0101")))p2="5";
                    else if((p2.equals("0110")))p2="6";
                    else if((p2.equals("0111")))p2="7";
                    else if((p2.equals("1000")))p2="8";
                    else if((p2.equals("1001")))p2="9";
                    else if((p2.equals("1010")))p2="A";
                    else if((p2.equals("1011")))p2="B";
                    else if((p2.equals("1100")))p2="C";
                    else if((p2.equals("1101")))p2="D";
                    else if((p2.equals("1110")))p2="E";
                    else if((p2.equals("1111")))p2="F";
                    dado=""+p1+p2;
                    break;
                case (3):
                    p1="";
                    p2="";
                    p3="";
                    for (int i = 0; i < dado.length(); i++) {
                        if(i<4) p1=p1+dado.charAt(i);
                        else if(i>=4&&i<8) p2=p2+dado.charAt(i); 
                        else p3=p3+dado.charAt(i);
                    }
                    if((p1.equals("0000")))p1="0";
                    else if((p1.equals("0001")))p1="1";
                    else if((p1.equals("0010")))p1="2";
                    else if((p1.equals("0011")))p1="3";
                    else if((p1.equals("0100")))p1="4";
                    else if((p1.equals("0101")))p1="5";
                    else if((p1.equals("0110")))p1="6";
                    else if((p1.equals("0111")))p1="7";
                    else if((p1.equals("1000")))p1="8";
                    else if((p1.equals("1001")))p1="9";
                    else if((p1.equals("1010")))p1="A";
                    else if((p1.equals("1011")))p1="B";
                    else if((p1.equals("1100")))p1="C";
                    else if((p1.equals("1101")))p1="D";
                    else if((p1.equals("1110")))p1="E";
                    else if((p1.equals("1111")))p1="F";
                    if((p2.equals("0000")))p2="0";
                    else if((p2.equals("0001")))p2="1";
                    else if((p2.equals("0010")))p2="2";
                    else if((p2.equals("0011")))p2="3";
                    else if((p2.equals("0100")))p2="4";
                    else if((p2.equals("0101")))p2="5";
                    else if((p2.equals("0110")))p2="6";
                    else if((p2.equals("0111")))p2="7";
                    else if((p2.equals("1000")))p2="8";
                    else if((p2.equals("1001")))p2="9";
                    else if((p2.equals("1010")))p2="A";
                    else if((p2.equals("1011")))p2="B";
                    else if((p2.equals("1100")))p2="C";
                    else if((p2.equals("1101")))p2="D";
                    else if((p2.equals("1110")))p2="E";
                    else if((p2.equals("1111")))p2="F";
                    if((p3.equals("0000")))p3="0";
                    else if((p3.equals("0001")))p3="1";
                    else if((p3.equals("0010")))p3="2";
                    else if((p3.equals("0011")))p3="3";
                    else if((p3.equals("0100")))p3="4";
                    else if((p3.equals("0101")))p3="5";
                    else if((p3.equals("0110")))p3="6";
                    else if((p3.equals("0111")))p3="7";
                    else if((p3.equals("1000")))p3="8";
                    else if((p3.equals("1001")))p3="9";
                    else if((p3.equals("1010")))p3="A";
                    else if((p3.equals("1011")))p3="B";
                    else if((p3.equals("1100")))p3="C";
                    else if((p3.equals("1101")))p3="D";
                    else if((p3.equals("1110")))p3="E";
                    else if((p3.equals("1111")))p3="F";
                    dado=""+p1+p2+p3;
                    break;
            }
            saida.setText(dado);
        }//Fim if
    }
    public static void octaDecimal(){//5.2.3
        char[] teste = new char[cont];
        boolean fim;
        try{
            dado = entrada.getText();
            fim=true;
            if(entrada.getText().length()>=5){
                JOptionPane.showMessageDialog(null, "Para Octal serão aceito apenas 3 characters ");
                fim=false;
            }
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                if(!(teste[i]=='1'||teste[i]=='0'||teste[i]=='2'||teste[i]=='3'||teste[i]=='4'||teste[i]=='5'||teste[i]=='6'||teste[i]=='7')){
                    JOptionPane.showMessageDialog(null, "Para Octal digite apenas de '0' até '7'");
                    fim=false;
                    break;  
                }
            }
        } catch(Exception erro) {
            fim=false;
        }
        if(fim==true){
            int conta=cont;
            double x=0;
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                conta--;
                switch (teste[i]){
                    case ('0'):
                        x=x+(0*(Math.pow(8, conta)));
                        break;
                    case ('1'):
                        x=x+(1*(Math.pow(8, conta)));
                        break;
                    case ('2'):
                        x=x+(2*(Math.pow(8, conta)));
                        break;
                    case ('3'):
                        x=x+(3*(Math.pow(8, conta)));
                        break;
                    case ('4'):
                        x=x+(4*(Math.pow(8, conta)));
                        break;
                    case ('5'):
                        x=x+(5*(Math.pow(8, conta)));
                        break;
                    case ('6'):
                        x=x+(6*(Math.pow(8, conta)));
                        break;
                    case ('7'):
                        x=x+(7*(Math.pow(8, conta)));
                        break;
                }
            }
            dado = Double.toString(x);
            saida.setText(dado);
        }
    }
    //Fim Octal
    //Começo Hexa
    public static void hexaBinario(){//5.3.1
        char[] teste = new char[cont];
        boolean fim;
        try{
            dado = entrada.getText();
            fim=true;
            if(entrada.getText().length()>=4){
                JOptionPane.showMessageDialog(null, "Para Hexa serão aceito apenas 3 characters ");
                fim=false;
            }
            else{
                for (int i = 0; i < entrada.getText().length(); i++) {
                    teste[i]=dado.toLowerCase().charAt(i);
                    if(!(teste[i]=='1'||teste[i]=='0'||teste[i]=='2'||teste[i]=='3'||teste[i]=='4'||teste[i]=='5'||teste[i]=='6'||teste[i]=='7'||teste[i]=='8'||teste[i]=='9'||teste[i]=='a'||teste[i]=='b'||teste[i]=='c'||teste[i]=='d'||teste[i]=='e'||teste[i]=='f')){
                        JOptionPane.showMessageDialog(null, "Para Hexadecimal digite apenas de '0' até '9' e apenas as letras de 'A' até 'F'");
                        fim=false;
                        break;  
                    }
                }
            }
        } catch(Exception erro) {
            fim=false;
        }
        if(fim==true){
            int conta=cont;
            String x="";
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.charAt(i);
                if(teste[i]=='0')x=x+"0000";
                else if(teste[i]=='1')x=x+"0001";
                else if(teste[i]=='2')x=x+"0010";
                else if(teste[i]=='3')x=x+"0011";
                else if(teste[i]=='4')x=x+"0100";
                else if(teste[i]=='5')x=x+"0101";
                else if(teste[i]=='6')x=x+"0110";
                else if(teste[i]=='7')x=x+"0111";
                else if(teste[i]=='8')x=x+"1000";
                else if(teste[i]=='9')x=x+"1001";
                else if(teste[i]=='a')x=x+"1010";
                else if(teste[i]=='b')x=x+"1011";
                else if(teste[i]=='c')x=x+"1100";
                else if(teste[i]=='d')x=x+"1101";
                else if(teste[i]=='e')x=x+"1110";
                else if(teste[i]=='f')x=x+"1111";
            }
            dado=x;
            saida.setText(dado);
        }
    }
    public static void hexaOctal(){//5.3.2
        char[] teste = new char[cont];
        boolean fim;
        try{
            dado = entrada.getText();
            fim=true;
            if(entrada.getText().length()>=4){
                JOptionPane.showMessageDialog(null, "Para Hexa serão aceito apenas 3 characters ");
                fim=false;
            }
            else{
                for (int i = 0; i < entrada.getText().length(); i++) {
                    teste[i]=dado.toLowerCase().charAt(i);
                    if(!(teste[i]=='1'||teste[i]=='0'||teste[i]=='2'||teste[i]=='3'||teste[i]=='4'||teste[i]=='5'||teste[i]=='6'||teste[i]=='7'||teste[i]=='8'||teste[i]=='9'||teste[i]=='a'||teste[i]=='b'||teste[i]=='c'||teste[i]=='d'||teste[i]=='e'||teste[i]=='f')){
                        JOptionPane.showMessageDialog(null, "Para Hexadecimal digite apenas de '0' até '9' e apenas as letras de 'A' até 'F'");
                        fim=false;
                        break;  
                    }
                }
            }
        } catch(Exception erro) {
            fim=false;
        }
        if(fim==true){
            int conta=cont;
            String x="";
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.toLowerCase().charAt(i);
                if(teste[i]=='0')x=x+"0000";
                else if(teste[i]=='1')x=x+"0001";
                else if(teste[i]=='2')x=x+"0010";
                else if(teste[i]=='3')x=x+"0011";
                else if(teste[i]=='4')x=x+"0100";
                else if(teste[i]=='5')x=x+"0101";
                else if(teste[i]=='6')x=x+"0110";
                else if(teste[i]=='7')x=x+"0111";
                else if(teste[i]=='8')x=x+"1000";
                else if(teste[i]=='9')x=x+"1001";
                else if(teste[i]=='a')x=x+"1010";
                else if(teste[i]=='b')x=x+"1011";
                else if(teste[i]=='c')x=x+"1100";
                else if(teste[i]=='d')x=x+"1101";
                else if(teste[i]=='e')x=x+"1110";
                else if(teste[i]=='f')x=x+"1111";
            }
            if(!(x.length()%3==0)){
                while (!(x.length()%3==0)) {
                    x="0"+x;
                }
            }
            dado=x;
            String p1="",p2="",p3="",p4="";
            switch (dado.length()/3){
                case(1):
                    if((dado.equals("000")))dado="0";
                    else if((dado.equals("001")))dado="1";
                    else if((dado.equals("010")))dado="2";
                    else if((dado.equals("011")))dado="3";
                    else if((dado.equals("100")))dado="4";
                    else if((dado.equals("101")))dado="5";
                    else if((dado.equals("110")))dado="6";
                    else if((dado.equals("111")))dado="7";
                    break;
                case (2):
                    p1="";
                    p2="";
                    for (int i = 0; i < dado.length(); i++) {
                        if(i<3) p1=p1+dado.charAt(i);
                        else p2=p2+dado.charAt(i);
                    }
                    if((p1.equals("000")))p1="0";
                    else if((p1.equals("001")))p1="1";
                    else if((p1.equals("010")))p1="2";
                    else if((p1.equals("011")))p1="3";
                    else if((p1.equals("100")))p1="4";
                    else if((p1.equals("101")))p1="5";
                    else if((p1.equals("110")))p1="6";
                    else if((p1.equals("111")))p1="7";
                    if((p2.equals("000")))p2="0";
                    else if((p2.equals("001")))p2="1";
                    else if((p2.equals("010")))p2="2";
                    else if((p2.equals("011")))p2="3";
                    else if((p2.equals("100")))p2="4";
                    else if((p2.equals("101")))p2="5";
                    else if((p2.equals("110")))p2="6";
                    else if((p2.equals("111")))p2="7";
                    dado=""+p1+p2;
                    break;
                case (3):
                    p1="";
                    p2="";
                    p3="";
                    for (int i = 0; i < dado.length(); i++) {
                        if(i<3) p1=p1+dado.charAt(i);
                        else if(i>=3&&i<6) p2=p2+dado.charAt(i); 
                        else p3=p3+dado.charAt(i);
                    }
                    if((p1.equals("000")))p1="0";
                    else if((p1.equals("001")))p1="1";
                    else if((p1.equals("010")))p1="2";
                    else if((p1.equals("011")))p1="3";
                    else if((p1.equals("100")))p1="4";
                    else if((p1.equals("101")))p1="5";
                    else if((p1.equals("110")))p1="6";
                    else if((p1.equals("111")))p1="7";
                    if((p2.equals("000")))p2="0";
                    else if((p2.equals("001")))p2="1";
                    else if((p2.equals("010")))p2="2";
                    else if((p2.equals("011")))p2="3";
                    else if((p2.equals("100")))p2="4";
                    else if((p2.equals("101")))p2="5";
                    else if((p2.equals("110")))p2="6";
                    else if((p2.equals("111")))p2="7";
                    if((p3.equals("000")))p3="0";
                    else if((p3.equals("001")))p3="1";
                    else if((p3.equals("010")))p3="2";
                    else if((p3.equals("011")))p3="3";
                    else if((p3.equals("100")))p3="4";
                    else if((p3.equals("101")))p3="5";
                    else if((p3.equals("110")))p3="6";
                    else if((p3.equals("111")))p3="7";
                    dado=""+p1+p2+p3;
                    break;
                    case (4):
                    p1="";
                    p2="";
                    p3="";
                    p4="";
                    for (int i = 0; i < dado.length(); i++) {
                        if(i<3) p1=p1+dado.charAt(i);
                        else if(i>=3&&i<6) p2=p2+dado.charAt(i); 
                        else if(i>=6&&i<9)p3=p3+dado.charAt(i);
                        else p4=p4+dado.charAt(i);
                    }
                    if((p1.equals("000")))p1="0";
                    else if((p1.equals("001")))p1="1";
                    else if((p1.equals("010")))p1="2";
                    else if((p1.equals("011")))p1="3";
                    else if((p1.equals("100")))p1="4";
                    else if((p1.equals("101")))p1="5";
                    else if((p1.equals("110")))p1="6";
                    else if((p1.equals("111")))p1="7";
                    if((p2.equals("000")))p2="0";
                    else if((p2.equals("001")))p2="1";
                    else if((p2.equals("010")))p2="2";
                    else if((p2.equals("011")))p2="3";
                    else if((p2.equals("100")))p2="4";
                    else if((p2.equals("101")))p2="5";
                    else if((p2.equals("110")))p2="6";
                    else if((p2.equals("111")))p2="7";
                    if((p3.equals("000")))p3="0";
                    else if((p3.equals("001")))p3="1";
                    else if((p3.equals("010")))p3="2";
                    else if((p3.equals("011")))p3="3";
                    else if((p3.equals("100")))p3="4";
                    else if((p3.equals("101")))p3="5";
                    else if((p3.equals("110")))p3="6";
                    else if((p3.equals("111")))p3="7";
                    if((p4.equals("000")))p1="0";
                    else if((p4.equals("001")))p4="1";
                    else if((p4.equals("010")))p4="2";
                    else if((p4.equals("011")))p4="3";
                    else if((p4.equals("100")))p4="4";
                    else if((p4.equals("101")))p4="5";
                    else if((p4.equals("110")))p4="6";
                    else if((p4.equals("111")))p4="7";
                    dado=""+p1+p2+p3+p4;
                    break;
            }
            saida.setText(dado);
        }
    }
    public static void hexaDecimal(){//5.2.3
        char[] teste = new char[cont];
        boolean fim;
        try{
            dado = entrada.getText();
            fim=true;
            if(entrada.getText().length()>=4){
                JOptionPane.showMessageDialog(null, "Para Hexa serão aceito apenas 3 characters ");
                fim=false;
            }
            else{
                for (int i = 0; i < entrada.getText().length(); i++) {
                    teste[i]=dado.toLowerCase().charAt(i);
                    if(!(teste[i]=='1'||teste[i]=='0'||teste[i]=='2'||teste[i]=='3'||teste[i]=='4'||teste[i]=='5'||teste[i]=='6'||teste[i]=='7'||teste[i]=='8'||teste[i]=='9'||teste[i]=='a'||teste[i]=='b'||teste[i]=='c'||teste[i]=='d'||teste[i]=='e'||teste[i]=='f')){
                        JOptionPane.showMessageDialog(null, "Para Hexadecimal digite apenas de '0' até '9' e apenas as letras de 'A' até 'F'");
                        fim=false;
                        break;  
                    }
                }
            }
        } catch(Exception erro) {
            fim=false;
        }
        if(fim==true){
            int conta=cont;
            String x="";
            dado=entrada.getText();
            for (int i = 0; i < entrada.getText().length(); i++) {
                teste[i]=dado.toLowerCase().charAt(i);
                if(teste[i]=='0')x=x+"0000";
                else if(teste[i]=='1')x=x+"0001";
                else if(teste[i]=='2')x=x+"0010";
                else if(teste[i]=='3')x=x+"0011";
                else if(teste[i]=='4')x=x+"0100";
                else if(teste[i]=='5')x=x+"0101";
                else if(teste[i]=='6')x=x+"0110";
                else if(teste[i]=='7')x=x+"0111";
                else if(teste[i]=='8')x=x+"1000";
                else if(teste[i]=='9')x=x+"1001";
                else if(teste[i]=='a')x=x+"1010";
                else if(teste[i]=='b')x=x+"1011";
                else if(teste[i]=='c')x=x+"1100";
                else if(teste[i]=='d')x=x+"1101";
                else if(teste[i]=='e')x=x+"1110";
                else if(teste[i]=='f')x=x+"1111";
            }
            dado=x;
            double y=0;
            conta=dado.length();
            char[] tester = new char[conta];
            System.out.println(conta);
            for (int i = 0; i < dado.length(); i++) {
                tester[i]=dado.charAt(i);
                conta--;
                switch (tester[i]){
                    case ('0'):
                        y=y+(0*(Math.pow(2, conta)));
                        break;
                    case ('1'):
                        y=y+(1*(Math.pow(2, conta)));
                        break;    
                }
                
            }
            dado = Double.toString(y);
            saida.setText(dado);
        }
    }
    //Fim Hexa
    //Começo Decimal
    public static void decimalBinario(){//5.4.1
        boolean ero;
        try{
                char[] teste = new char[entrada.getText().length()];
                dado = entrada.getText();
                ero=true;
                Double testeErro=Double.parseDouble(dado);
                if(testeErro<0){
                    JOptionPane.showMessageDialog(null, "Não válido números negativos");
                    ero=false;
                }
                if(dado.length()>9){
                    JOptionPane.showMessageDialog(null, "Para decimal aceito apenas 9 characters.");
                    ero=false;
                }
                for (int i = 0; i < entrada.getText().length(); i++) {
                    teste[i]=dado.toLowerCase().charAt(i);
                    if(teste[i]=='.'){
                        JOptionPane.showMessageDialog(null, "Para Decimal não aceita casas decimais.");
                        ero=false;
                        break;  
                    }
                }
                
            } catch(Exception erro) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n"+erro);
                entrada.setText("Digite characters válidos ");
                ero=false;
            }
        if(ero==true){
            int resto=0,coci;
            coci=Integer.parseInt(dado);
            String tudo = "";
            while (!(coci==1||coci==0)) {
                resto=coci%2;
                coci=coci/2;
                tudo=resto+tudo;
                if(coci==1||coci==0) tudo=coci+tudo;
            }
            dado=tudo;
            saida.setText(dado);
        }
    }
    public static void decimalOctal(){//5.4.2
        boolean ero;
        try{
                dado = entrada.getText();
                ero=true;
                Double testeErro=Double.parseDouble(dado);
                if(testeErro<0){
                    JOptionPane.showMessageDialog(null, "Não válido números negativos");
                    ero=false;
                }
                if(dado.length()>9){
                    JOptionPane.showMessageDialog(null, "Para decimal aceito apenas 9 characters.");
                    ero=false;
                }
                char[] teste = new char[entrada.getText().length()];
                for (int i = 0; i < entrada.getText().length(); i++) {
                    teste[i]=dado.toLowerCase().charAt(i);
                    if(teste[i]=='.'){
                        JOptionPane.showMessageDialog(null, "Para Decimal não aceita casas decimais.");
                        ero=false;
                        break;  
                    }
                }
                
            } catch(Exception erro) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n"+erro);
                entrada.setText("Digite characters válidos ");
                ero=false;
            }
        if(ero==true){
            int resto=0,coci;
            coci=Integer.parseInt(dado);
            String tudo = "";
            while (!(coci==1||coci==0)) {
                resto=coci%8;
                coci=coci/8;
                tudo=resto+tudo;
                if(coci==1||coci==0) tudo=coci+tudo;
            }
            dado=tudo;
            saida.setText(dado);
        }
    }
    public static void decimalHexa(){//5.4.3
       boolean ero;
        try{
                dado = entrada.getText();
                ero=true;
                Double testeErro=Double.parseDouble(dado);
                if(testeErro<0){
                    JOptionPane.showMessageDialog(null, "Não válido números negativos");
                    ero=false;
                }
                if(dado.length()>9){
                    JOptionPane.showMessageDialog(null, "Para decimal aceito apenas 9 characters.");
                    ero=false;
                }
                char[] teste = new char[entrada.getText().length()];
                for (int i = 0; i < entrada.getText().length(); i++) {
                    teste[i]=dado.toLowerCase().charAt(i);
                    if(teste[i]=='.'){
                        JOptionPane.showMessageDialog(null, "Para Decimal não aceita casas decimais.");
                        ero=false;
                        break;  
                    }
                }
                
            } catch(Exception erro) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n"+erro);
                entrada.setText("Digite characters válidos ");
                ero=false;
            }
        if(ero==true){
            int resto=0,coci;
            coci=Integer.parseInt(dado);
            String tudo = "";
            while (!(coci==1||coci==0)) {
                resto=coci%16;
                coci=coci/16;
                dado=""+resto;
                if((dado.equals("0")))dado="0";
                    else if((dado.equals("1")))dado="1";
                    else if((dado.equals("2")))dado="2";
                    else if((dado.equals("3")))dado="3";
                    else if((dado.equals("4")))dado="4";
                    else if((dado.equals("5")))dado="5";
                    else if((dado.equals("6")))dado="6";
                    else if((dado.equals("7")))dado="7";
                    else if((dado.equals("8")))dado="8";
                    else if((dado.equals("9")))dado="9";
                    else if((dado.equals("10")))dado="A";
                    else if((dado.equals("11")))dado="B";
                    else if((dado.equals("12")))dado="C";
                    else if((dado.equals("13")))dado="D";
                    else if((dado.equals("14")))dado="E";
                    else if((dado.equals("15")))dado="F";
                tudo=dado+tudo;
                if(coci==1||coci==0){
                    dado=coci+"";
                    if((dado.equals("0")))dado="0";
                    else if((dado.equals("1")))dado="1";
                    else if((dado.equals("2")))dado="2";
                    else if((dado.equals("3")))dado="3";
                    else if((dado.equals("4")))dado="4";
                    else if((dado.equals("5")))dado="5";
                    else if((dado.equals("6")))dado="6";
                    else if((dado.equals("7")))dado="7";
                    else if((dado.equals("8")))dado="8";
                    else if((dado.equals("9")))dado="9";
                    else if((dado.equals("10")))dado="A";
                    else if((dado.equals("11")))dado="B";
                    else if((dado.equals("12")))dado="C";
                    else if((dado.equals("13")))dado="D";
                    else if((dado.equals("14")))dado="E";
                    else if((dado.equals("15")))dado="F";
                    tudo=dado+tudo;
                }
            }
            dado=tudo;
            saida.setText(dado);
        } 
    }
}