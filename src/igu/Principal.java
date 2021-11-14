package igu;

import javax.swing.*;
import logica.Controladora;

public class Principal extends javax.swing.JFrame {

    Controladora control;

    public Principal(Controladora con) {

        initComponents();
        this.control = con;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        labNumeroCliente = new javax.swing.JLabel();
        campoNCliente = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        labNombre = new javax.swing.JLabel();
        labRaza = new javax.swing.JLabel();
        campoRaza = new javax.swing.JTextField();
        campoColor = new javax.swing.JTextField();
        labColor = new javax.swing.JLabel();
        labAlergico = new javax.swing.JLabel();
        comAlergico = new javax.swing.JComboBox<>();
        labEspecial = new javax.swing.JLabel();
        comEspecial = new javax.swing.JComboBox<>();
        labNombreDuenio = new javax.swing.JLabel();
        campoNombreDuenio = new javax.swing.JTextField();
        campoCelular = new javax.swing.JTextField();
        labCel = new javax.swing.JLabel();
        labObervacion = new javax.swing.JLabel();
        campoObaservacion = new javax.swing.JTextField();
        botonLimpiar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgen/peluqueria.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img)
                .addGap(127, 127, 127))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(img)
                .addGap(90, 90, 90))
        );

        labTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labTitulo.setText("Peluqueria Canina");

        labNumeroCliente.setText("N° Cliente: ");

        labNombre.setText("Nombre: ");

        labRaza.setText("Raza: ");

        labColor.setText("Color: ");

        labAlergico.setText("Alergico: ");

        comAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        labEspecial.setText("Atencion Especial: ");

        comEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        labNombreDuenio.setText("Nombre del dueño: ");

        labCel.setText("Celular: ");

        labObervacion.setText("observaciones");

        botonLimpiar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonGuardar.setText("Guadar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(labNumeroCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNCliente))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labNombre)
                            .addComponent(labRaza)
                            .addComponent(labColor))
                        .addGap(21, 21, 21)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoColor)
                            .addComponent(campoNombre)
                            .addComponent(campoRaza)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(labNombreDuenio)
                        .addGap(21, 21, 21)
                        .addComponent(campoNombreDuenio))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(labObervacion)
                        .addGap(21, 21, 21)
                        .addComponent(campoObaservacion))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(0, 89, Short.MAX_VALUE)
                        .addComponent(labTitulo)
                        .addContainerGap())
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(labAlergico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(labEspecial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(labCel)
                        .addGap(75, 75, 75)
                        .addComponent(campoCelular))))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNumeroCliente)
                    .addComponent(campoNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labRaza)
                    .addComponent(campoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labColor)
                    .addComponent(campoColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAlergico)
                    .addComponent(comAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labEspecial)
                    .addComponent(comEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNombreDuenio)
                    .addComponent(campoNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCel)
                    .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labObervacion)
                    .addComponent(campoObaservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        campoColor.setText("");
        campoNCliente.setText("");
        campoNombre.setText("");
        campoNombreDuenio.setText("");
        campoObaservacion.setText("");
        campoRaza.setText("");
        campoCelular.setText("");
        comAlergico = null;
        comEspecial = null;
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        String numeroCliente = "";
        String nombre_perro = "";
        String raza = "";
        String color = "";
        Boolean alergico = true;
        Boolean especial = true;
        String nombre_duenio = "";
        String cel = "";
        String observaciones = "";
        String alergicoCombo = (String) comAlergico.getSelectedItem();
        String especialCombo = (String) comAlergico.getSelectedItem();

        JOptionPane msj = new JOptionPane("Datos Ingresados", JOptionPane.INFORMATION_MESSAGE);

        if (campoColor.getText().equals("") && campoNCliente.getText().equals("")
                && campoNombre.getText().equals("") && campoNombreDuenio.getText().equals("")
                && campoRaza.getText().equals("") && campoCelular.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Complete los campos", "Importante", JOptionPane.INFORMATION_MESSAGE);

        } else {

            numeroCliente = (campoNCliente.getText());
            nombre_perro = campoNombre.getText();
            raza = campoRaza.getText();
            color = campoColor.getText();
            alergico = (alergicoCombo.equals("SI"));
            especial = (especialCombo.equals("SI"));
            nombre_duenio = campoNombreDuenio.getText();
            cel = campoCelular.getText();
            observaciones = campoObaservacion.getText();

            control.altaCliente(numeroCliente, nombre_perro, raza, color, alergico, especial, nombre_duenio, cel, observaciones);

            JOptionPane.showMessageDialog(rootPane, "Cliente Guardado correctamente", "Importante", JOptionPane.INFORMATION_MESSAGE);
            
        } 

    }//GEN-LAST:event_botonGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoColor;
    private javax.swing.JTextField campoNCliente;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNombreDuenio;
    private javax.swing.JTextField campoObaservacion;
    private javax.swing.JTextField campoRaza;
    private javax.swing.JComboBox<String> comAlergico;
    private javax.swing.JComboBox<String> comEspecial;
    private javax.swing.JLabel img;
    private javax.swing.JLabel labAlergico;
    private javax.swing.JLabel labCel;
    private javax.swing.JLabel labColor;
    private javax.swing.JLabel labEspecial;
    private javax.swing.JLabel labNombre;
    private javax.swing.JLabel labNombreDuenio;
    private javax.swing.JLabel labNumeroCliente;
    private javax.swing.JLabel labObervacion;
    private javax.swing.JLabel labRaza;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
