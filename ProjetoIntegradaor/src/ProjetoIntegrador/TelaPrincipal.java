package ProjetoIntegrador;

import static ProjetoIntegrador.Comprimento.kmMetro;
import static ProjetoIntegrador.Comprimento.kmMilha;
import static ProjetoIntegrador.Comprimento.kmPolegada;
import static ProjetoIntegrador.Comprimento.metroKm;
import static ProjetoIntegrador.Comprimento.metroMilhas;
import static ProjetoIntegrador.Comprimento.metroPolegada;
import static ProjetoIntegrador.Comprimento.milhaKm;
import static ProjetoIntegrador.Comprimento.milhaMetro;
import static ProjetoIntegrador.Comprimento.milhaPolegada;
import static ProjetoIntegrador.Comprimento.polegadaKm;
import static ProjetoIntegrador.Comprimento.polegadaMetro;
import static ProjetoIntegrador.Comprimento.polegadaMilha;
import static ProjetoIntegrador.Geometria.grausRadianos;
import static ProjetoIntegrador.Geometria.radianosGraus;
import static ProjetoIntegrador.MudancaDeBase.binarioDecimal;
import static ProjetoIntegrador.MudancaDeBase.binarioHexa;
import static ProjetoIntegrador.MudancaDeBase.binarioOctal;
import static ProjetoIntegrador.MudancaDeBase.decimalBinario;
import static ProjetoIntegrador.MudancaDeBase.decimalHexa;
import static ProjetoIntegrador.MudancaDeBase.decimalOctal;
import static ProjetoIntegrador.MudancaDeBase.hexaBinario;
import static ProjetoIntegrador.MudancaDeBase.hexaDecimal;
import static ProjetoIntegrador.MudancaDeBase.hexaOctal;
import static ProjetoIntegrador.MudancaDeBase.octaDecimal;
import static ProjetoIntegrador.MudancaDeBase.octalBinario;
import static ProjetoIntegrador.MudancaDeBase.octalHexa;
import static ProjetoIntegrador.Pressao.barPsi;
import static ProjetoIntegrador.Pressao.psiBar;
import static ProjetoIntegrador.Temperatura.cF;
import static ProjetoIntegrador.Temperatura.cK;
import static ProjetoIntegrador.Temperatura.fC;
import static ProjetoIntegrador.Temperatura.fK;
import static ProjetoIntegrador.Temperatura.kC;
import static ProjetoIntegrador.Temperatura.kF;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    static String dado;
    static int ip,ie,is,cont;
    public TelaPrincipal() {
        setResizable(false);
        setTitle("S.W.V");
        setLocationRelativeTo(null);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entrada = new javax.swing.JTextField();
        saida = new javax.swing.JTextField();
        itemEntrada = new javax.swing.JComboBox<>();
        itemSaida = new javax.swing.JComboBox<>();
        itemPrincipal = new javax.swing.JComboBox<>();
        gerar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.red);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALCULADORA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Wide Latin", 1, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        entrada.setBackground(java.awt.Color.yellow);
        entrada.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });
        entrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                entradaKeyTyped(evt);
            }
        });

        saida.setEditable(false);
        saida.setBackground(java.awt.Color.yellow);
        saida.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaActionPerformed(evt);
            }
        });

        itemEntrada.setBackground(java.awt.Color.yellow);
        itemEntrada.setFont(new java.awt.Font("Wide Latin", 1, 9)); // NOI18N
        itemEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEntradaActionPerformed(evt);
            }
        });

        itemSaida.setBackground(java.awt.Color.yellow);
        itemSaida.setFont(new java.awt.Font("Wide Latin", 1, 9)); // NOI18N
        itemSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaidaActionPerformed(evt);
            }
        });

        itemPrincipal.setBackground(java.awt.Color.yellow);
        itemPrincipal.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        itemPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLHA", "PRESSÃO", "COMPRIMENTO", "TEMPERATURA", "GEOMETRIA", "MUDANÇA DE BASE", "VOLUME" }));
        itemPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPrincipalActionPerformed(evt);
            }
        });

        gerar.setBackground(java.awt.Color.yellow);
        gerar.setFont(new java.awt.Font("Wide Latin", 1, 11)); // NOI18N
        gerar.setText("GERAR");
        gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(itemPrincipal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(itemEntrada, 0, 180, Short.MAX_VALUE)
                            .addComponent(entrada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saida)
                            .addComponent(itemSaida, 0, 180, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(itemPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarActionPerformed
        cont=entrada.getText().length();
        boolean ero;
        is = itemSaida.getSelectedIndex();
        ip = itemPrincipal.getSelectedIndex();
        ie = itemEntrada.getSelectedIndex();
        if(itemPrincipal.getSelectedIndex() != 0 && itemEntrada.getSelectedIndex() != 0 && itemSaida.getSelectedIndex() != 0 && !entrada.getText().isEmpty()){
            if(ip==5){//Mudança de base
                if(ie==1){ //2.1
                            if(is==1) binarioOctal();//5.1.1
                            else if(is==2) binarioHexa();//5.1.2
                            else if(is==3) binarioDecimal();//5.1.3
                        }
                        else if(ie==2){
                            if(is==1) octalBinario();//5.2.1
                            else if(is==2) octalHexa();//5.2.2
                            else if(is==3) octaDecimal();//5.2.3
                        }
                        else if(ie==3){
                            if(is==1) hexaBinario();//5.3.1
                            else if(is==2) hexaOctal();//5.3.2
                            else if(is==3) hexaDecimal();//5.3.3
                        }
                        else if(ie==4){
                            if(is==1) decimalBinario();//5.4.1
                            else if(is==2) decimalOctal();//5.4.2
                            else if(is==3) decimalHexa();//5.4.3
                        }
            }
            else {
                try{
                    dado = entrada.getText();
                    Double testeErro=Double.parseDouble(dado);
                    ero=true;
                    if(testeErro==-0) dado="0";
                } catch(Exception erro) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n"+erro);
                    entrada.setText("Digite characters válidos ");
                    ero=false;
                }
                saida.setText("");
                if(ero==true){
                    switch (ip){
                        case (1)://Começo Pressão
                        if(ie==1){//psi/bar
                            psiBar();
                        }
                        if(ie==2){//bar/psi
                            barPsi();
                        }
                        break;
                        //Fim Pressão
                        case (2)://Começo Comprimento 2
                        if(ie==1){ //2.1
                            if(is==1) metroKm();//2.1.1
                            else if(is==2) metroMilhas();//2.1.2
                            else if(is==3) metroPolegada();//2.1.3
                        }
                        else if(ie==2){
                            if(is==1) kmMetro();//2.2.1
                            else if(is==2) kmMilha();//2.2.2
                            else if(is==3) kmPolegada();//2.2.3
                        }
                        else if(ie==3){
                            if(is==1) milhaMetro();//2.3.1
                            else if(is==2) milhaKm();//2.3.2
                            else if(is==3) milhaPolegada();//2.3.3
                        }
                        else if(ie==4){
                            if(is==1) polegadaMetro();//2.4.1
                            else if(is==2) polegadaKm();//2.4.2
                            else if(is==3) polegadaMilha();//2.4.3
                        }
                        break;
                        //Fim Comprimento
                        case (3)://Começo Temperatura
                        if(ie==1){ //3.1
                            if(is==1) kF();//3.1.1
                            else if(is==2) kC();//3.1.2
                        }
                        else if(ie==2){
                            if(is==1) fK();//3.2.1
                            else if(is==2) fC();//3.2.2
                        }
                        else if(ie==3){
                            if(is==1) cK();//3.3.1
                            else if(is==2) cF();//3.3.2
                        }
                        break;
                        //Fim Temperatura
                        case (4)://Começo Geometria
                        if(ie==1)//Graus/Radianos
                            grausRadianos();//4.1.1
                        if(ie==2)//Radianos/Graus
                            radianosGraus();//4.2.1
                        break;
                        //Fim Geometria
                        case (6):
                            if(ie==1){//6.1
                                if(is==1){//6.1.1
                                    Volume.litroGalao();
                                }
                                else if(is==2){//6.1.2
                                    Volume.litroQuilolitro();
                                }
                                else if(is==3){//6.1.3
                                    Volume.litroM3();
                                }
                                else if(is==4){//6.1.4
                                    Volume.litroCm3();
                                }
                                else if(is==5){//6.1.5
                                    Volume.litroDm3();
                                }
                            }
                            else if(ie==2){//6.2
                                if(is==1){//6.
                                    Volume.galaoLitro();
                                }
                                else if(is==2){//6.
                                    Volume.galaoQuilolitro();
                                }
                                else if(is==3){//6.
                                    Volume.galaoM3();
                                }
                                else if(is==4){//6.
                                    Volume.galaoCm3();
                                }
                                else if(is==5){//6.
                                    Volume.galaoDm3();
                                }
                            }
                            else if(ie==3){//6.3
                                if(is==1){//6.
                                    Volume.quiloLitro();
                                }
                                else if(is==2){//6.
                                    Volume.quiloGalao();
                                }
                                else if(is==3){//6.
                                    Volume.quiloM3();
                                }
                                else if(is==4){//6.
                                    Volume.quiloCm3();
                                }
                                else if(is==5){//6.
                                    Volume.quiloDm3();
                                }
                            }
                            else if(ie==4){//6.4
                                if(is==1){//6.
                                    Volume.metro3Litro();
                                }
                                else if(is==2){//6.
                                    Volume.metro3Galao();
                                }
                                else if(is==3){//6.
                                    Volume.metro3Quilolitro();
                                }
                                else if(is==4){//6.
                                    Volume.metro3Cm3();
                                }
                                else if(is==5){//6.
                                    Volume.metro3Dm3();
                                }
                            }
                            else if(ie==5){//6.5
                                if(is==1){//6.
                                    Volume.centimetro3Litro();
                                }
                                else if(is==2){//6.
                                    Volume.centimetro3Galao();
                                }
                                else if(is==3){//6.
                                    Volume.centimetro3Quilolitro();
                                }
                                else if(is==4){//6.
                                    Volume.centimetro3M3();
                                }
                                else if(is==5){//6.
                                    Volume.centimetro3Dm3();
                                }
                            }
                            else if(ie==6){//6.6
                                if(is==1){//6.
                                    Volume.decimetro3Litro();
                                }
                                else if(is==2){//6.
                                    Volume.decimetro3Galao();
                                }
                                else if(is==3){//6.
                                    Volume.decimetro3Quilolitro();
                                }
                                else if(is==4){//6.
                                    Volume.decimetro3M3();
                                }
                                else if(is==5){//6.
                                    Volume.decimetro3Cm3();
                                }
                            }
                            break;
                    }
                }//else if(is==) ;//if(is==) ;//
            }
        }
    }//GEN-LAST:event_gerarActionPerformed

    private void itemPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPrincipalActionPerformed
        saida.setText("S.W.V");
        entrada.setText("1º ADS");
        ip = itemPrincipal.getSelectedIndex();
        ie = itemEntrada.getSelectedIndex();
        is = itemSaida.getSelectedIndex();
        itemSaida.removeAllItems();
        itemEntrada.removeAllItems();
        switch (ip){
            case (1)://Pressão
            itemEntrada.removeAllItems();
            itemEntrada.addItem("ESCOLHA");
            itemEntrada.addItem("PSI");
            itemEntrada.addItem("BAR");
            break;
            case (2)://Comprimento
            itemEntrada.removeAllItems();
            itemEntrada.addItem("ESCOLHA");
            itemEntrada.addItem("METRO");//2.1
            itemEntrada.addItem("QUILÔMETRO");//2.2
            itemEntrada.addItem("MILHA");//2.3
            itemEntrada.addItem("POLEGADA");//2.4
            break;
            case (3)://Temperatura
            itemEntrada.removeAllItems();
            itemEntrada.addItem("ESCOLHA");
            itemEntrada.addItem("KELVIN");//3.1
            itemEntrada.addItem("FAHRENHEIT");//3.2
            itemEntrada.addItem("CELSIUS");//3.3
            break;
            case(4)://Geometria
            itemEntrada.removeAllItems();
            itemEntrada.addItem("ESCOLHA");
            itemEntrada.addItem("GRAUS");//4.1
            itemEntrada.addItem("RADIANOS");//4.2
            break;
            case (5)://Mudança de base
                itemEntrada.removeAllItems();
                itemEntrada.addItem("ESCOLHA");
                itemEntrada.addItem("BINÁRIO");//5.1
                itemEntrada.addItem("OCTAL");//5.2
                itemEntrada.addItem("HEXADECIMAL");//5.3
                itemEntrada.addItem("DECIMAL");//5.4
                break;
            case (6)://Volume
                itemEntrada.removeAllItems();
                itemEntrada.addItem("ESCOLHA");
                itemEntrada.addItem("LITRO");//6.1
                itemEntrada.addItem("GALÃO");//6.2
                itemEntrada.addItem("QUILOLITRO");//6.3
                itemEntrada.addItem("METRO CÚBICO");//6.4
                itemEntrada.addItem("CENT. CÚBICO");//6.5
                itemEntrada.addItem("DEC. CÚBICO");//6.6
                break;
        }
    }//GEN-LAST:event_itemPrincipalActionPerformed

    private void itemSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaidaActionPerformed
        is = itemSaida.getSelectedIndex();
        ip = itemPrincipal.getSelectedIndex();
        ie = itemEntrada.getSelectedIndex();
    }//GEN-LAST:event_itemSaidaActionPerformed

    private void itemEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEntradaActionPerformed
        ie = itemEntrada.getSelectedIndex();
        switch (ip){
            case (1)://Começo Pressão
            if(ie==1){
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("BAR");
            }
            else if(ie==2){
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("PSI");
            }
            break;
            //Fim Pressão
            case (2)://Começo Comprimento
            if(ie==1){//Metro 2.1
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("QUILÔMETRO");
                itemSaida.addItem("MILHA");
                itemSaida.addItem("POLEGADA");
            }
            else if(ie==2){//Km 2.2
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("METRO");
                itemSaida.addItem("MILHA");
                itemSaida.addItem("POLEGADA");
            }
            else if(ie==3){//Milha 2.3
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("METRO");
                itemSaida.addItem("QUILÔMETRO");
                itemSaida.addItem("POLEGADA");
            }
            else if(ie==4){//Polegada 2.4
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("METRO");
                itemSaida.addItem("QUILÔMETRO");
                itemSaida.addItem("MILHA");
            }
            break;
            //Fim Comprimento
            case (3)://Começo Temperatura
            if(ie==1){//Kelvin 3.1
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("FAHRENHEIT");
                itemSaida.addItem("CELSIUS");
            }
            else if(ie==2){//FAHRENHEIT 3.2
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("KELVIN");
                itemSaida.addItem("CELSIUS");
            }
            else if(ie==3){//Celsius 3.3
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("KELVIN");
                itemSaida.addItem("FAHRENHEIT");
            }
            break;
            //Fim Temperatura
            case(4)://Começo Geometria
            if(ie==1){
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("RADIANOS");//4.1.1
            }
            else if(ie==2){
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("GRAUS");//4.2.1
            }
            break;
            //Fim Geometria
            case (5)://Começo mudança de base 
                if(ie==1){//Binário 5.1
                itemSaida.removeAllItems();
                itemSaida.addItem("ESCOLHA");
                itemSaida.addItem("OCTAL");
                itemSaida.addItem("HEXADECIMAL");
                itemSaida.addItem("DECIMAL");
                }
                else if(ie==2){//Octal 5.2
                    itemSaida.removeAllItems();
                    itemSaida.addItem("ESCOLHA");
                    itemSaida.addItem("BINÁRIO");
                    itemSaida.addItem("HEXADECIMAL");
                    itemSaida.addItem("DECIMAL");
                }
                else if(ie==3){//Hexa 5.3
                    itemSaida.removeAllItems();
                    itemSaida.addItem("ESCOLHA");
                    itemSaida.addItem("BINÁRIO");
                    itemSaida.addItem("OCTAL");
                    itemSaida.addItem("DECIMAL");
                }
                else if(ie==4){//Decimal 5.4
                    itemSaida.removeAllItems();
                    itemSaida.addItem("ESCOLHA");
                    itemSaida.addItem("BINÁRIO");
                    itemSaida.addItem("OCTAL");
                    itemSaida.addItem("HEXADECIMAL");
                }
                break;
                //Fim mudança de base
            case (6)://Começo Volume
                itemSaida.removeAllItems();
                if(ie==1){//Litro 6.1
                    itemSaida.removeAllItems();
                    itemSaida.addItem("ESCOLHA");
                    itemSaida.addItem("GALÃO");
                    itemSaida.addItem("QUILOLITRO");
                    itemSaida.addItem("METRO CÚBICO");
                    itemSaida.addItem("CENT. CÚBICO");
                    itemSaida.addItem("DEC. CÚBICO");
                }
                else if(ie==2){//Galão 6.2
                    itemSaida.removeAllItems();
                    itemSaida.addItem("ESCOLHA");
                    itemSaida.addItem("LITRO");
                    itemSaida.addItem("QUILOLITRO");
                    itemSaida.addItem("METRO CÚBICO");
                    itemSaida.addItem("CENT. CÚBICO");
                    itemSaida.addItem("DEC. CÚBICO");
                }
                else if(ie==3){//Quilolitro 6.3
                    itemSaida.removeAllItems();
                    itemSaida.addItem("ESCOLHA");
                    itemSaida.addItem("LITRO");
                    itemSaida.addItem("GALÃO");
                    itemSaida.addItem("METRO CÚBICO");
                    itemSaida.addItem("CENT. CÚBICO");
                    itemSaida.addItem("DEC. CÚBICO");
                }
                else if(ie==4){//Metro cúbico 6.4
                    itemSaida.removeAllItems();
                    itemSaida.addItem("ESCOLHA");
                    itemSaida.addItem("LITRO");
                    itemSaida.addItem("GALÃO");
                    itemSaida.addItem("QUILOLITRO");
                    itemSaida.addItem("CENT. CÚBICO");
                    itemSaida.addItem("DEC. CÚBICO");
                }
                else if(ie==5){//Centímetro cúbico 6.5
                    itemSaida.removeAllItems();
                    itemSaida.addItem("ESCOLHA");
                    itemSaida.addItem("LITRO");
                    itemSaida.addItem("GALÃO");
                    itemSaida.addItem("QUILOLITRO");
                    itemSaida.addItem("METRO CÚBICO");
                    itemSaida.addItem("DEC. CÚBICO");
                }
                else if(ie==6){//Decímetro cúbico 6.6
                    itemSaida.removeAllItems();
                    itemSaida.addItem("ESCOLHA");
                    itemSaida.addItem("LITRO");
                    itemSaida.addItem("GALÃO");
                    itemSaida.addItem("QUILOLITRO");
                    itemSaida.addItem("METRO CÚBICO");
                    itemSaida.addItem("CENT. CÚBICO");
                }
                break;
        }
        is = itemSaida.getSelectedIndex();
        ip = itemPrincipal.getSelectedIndex();
        ie = itemEntrada.getSelectedIndex();
    }//GEN-LAST:event_itemEntradaActionPerformed

    private void saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaActionPerformed
        
    }//GEN-LAST:event_saidaActionPerformed

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        
    }//GEN-LAST:event_entradaActionPerformed

    private void entradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaKeyTyped
        int num = 12;
        if(entrada.getText().length()>=num){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Número máximo de characters.(12)");
        }
    }//GEN-LAST:event_entradaKeyTyped
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField entrada;
    public static javax.swing.JButton gerar;
    public static javax.swing.JComboBox<String> itemEntrada;
    public static javax.swing.JComboBox<String> itemPrincipal;
    public static javax.swing.JComboBox<String> itemSaida;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField saida;
    // End of variables declaration//GEN-END:variables
}
