package formularios;

import javax.swing.JOptionPane;
import dao.TVenta;

/**
 *
 * @author Jorge Chávez
 */
public class VentanaVentas extends javax.swing.JInternalFrame {
    TVenta tventa = new TVenta();
     int posActual = 0;
     boolean esNuevo;
    /**
     * Creates new form VentanaVentas
     */
    public VentanaVentas() {
        initComponents();
        this.dispose();
        this.setTitle("TALLER DE REPUESTOS 'RAPIDITO' ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfDescripcion = new javax.swing.JTextField();
        tfEstante = new javax.swing.JTextField();
        tfStock = new javax.swing.JTextField();
        tfCantidad = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfPrecio1 = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        IContador = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(782, 537));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Estante:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Stock:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Precio:");

        tfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoKeyTyped(evt);
            }
        });

        tfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfEstante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEstante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEstanteActionPerformed(evt);
            }
        });
        tfEstante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEstanteKeyTyped(evt);
            }
        });

        tfStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfStock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStockActionPerformed(evt);
            }
        });
        tfStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfStockKeyTyped(evt);
            }
        });

        tfCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantidadActionPerformed(evt);
            }
        });
        tfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantidadKeyTyped(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(204, 204, 204));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guartdar.png"))); // NOI18N
        btnModificar.setText(" Guardar");
        btnModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Nuevo");
        btnLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cantidad:");

        tfPrecio1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPrecio1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecio1ActionPerformed(evt);
            }
        });
        tfPrecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrecio1KeyTyped(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/anterior (1).png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        IContador.setText("0 DE 0");

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/proximo.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/accept_ok_database_16695.png"))); // NOI18N
        btnActualizar.setText("Actualizar BD");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescripcion)
                            .addComponent(tfCodigo)
                            .addComponent(tfNombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrecio1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfStock, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfEstante)
                            .addComponent(tfCantidad))))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnAtras)
                .addGap(18, 18, 18)
                .addComponent(IContador)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente)
                .addGap(62, 62, 62)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnActualizar)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IContador)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed

    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEstanteActionPerformed

    }//GEN-LAST:event_tfEstanteActionPerformed

    private void tfStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStockActionPerformed

    }//GEN-LAST:event_tfStockActionPerformed

    private void tfCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantidadActionPerformed

    }//GEN-LAST:event_tfCantidadActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
     if(Integer.parseInt(tfCantidad.getText()) > Integer.parseInt(tfStock.getText())){
       JOptionPane.showMessageDialog(null, "No hay suficiente Stock", "Aviso Taller 'Rapidito'", JOptionPane.ERROR_MESSAGE);
     }else{
      int b = tventa.modificarProducto(Integer.parseInt(tfCodigo.getText()), 
          tfNombre.getText(), tfDescripcion.getText(), tfEstante.getText(),
          Float.parseFloat(tfPrecio1.getText()), Integer.parseInt(tfStock.getText()), Integer.parseInt(tfCantidad.getText()));
        if(b == 1){
            JOptionPane.showMessageDialog(this, "Registro modificado correctamente...",
                    "Taller", JOptionPane.INFORMATION_MESSAGE);  
        }
        else{
            JOptionPane.showMessageDialog(this, "Error inesperado", "Taller", 
                    JOptionPane.ERROR_MESSAGE);
        }
     }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Limpia los datos antes de ser ingresados a la tabla
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
        private void limpiar() {
        tfCodigo.setText("");
        tfNombre.setText("");
        tfDescripcion.setText("");
        tfEstante.setText("");
        tfEstante.setText("");
        tfPrecio1.setText("");
        tfStock.setText("");
        tfCantidad.setText("");
        esNuevo = true;
    }
    private void tfPrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecio1ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        if (posActual == 0) posActual = tventa.getLista().size();
        posActual--;
        this.mostrarEnTF(posActual);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        posActual++;
        if (posActual == tventa.getLista().size()) posActual = 0;
        this.mostrarEnTF(posActual);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String msn = tventa.actualizarBD();
        JOptionPane.showMessageDialog(this, msn, "Actualizar Base de Datos",
            JOptionPane.INFORMATION_MESSAGE);
        posActual = 0;
        mostrarEnTF(posActual);
        limpiar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyTyped
        char Validar = evt.getKeyChar();
                
                if(Character.isLetter(Validar)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros", "Aviso Taller 'Rapidito' ", JOptionPane.WARNING_MESSAGE);
                   
                }
    }//GEN-LAST:event_tfCodigoKeyTyped

    private void tfCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantidadKeyTyped
       char Validar = evt.getKeyChar();
                
                if(Character.isLetter(Validar)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros", "Aviso Taller 'Rapidito' ", JOptionPane.WARNING_MESSAGE);
                   
                }
    }//GEN-LAST:event_tfCantidadKeyTyped

    private void tfPrecio1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecio1KeyTyped
       char Validar = evt.getKeyChar();
                
                if(Character.isLetter(Validar)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros", "Aviso Taller 'Rapidito' ", JOptionPane.WARNING_MESSAGE);
                   
                }
    }//GEN-LAST:event_tfPrecio1KeyTyped

    private void tfStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStockKeyTyped
       char Validar = evt.getKeyChar();
                
                if(Character.isLetter(Validar)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros", "Aviso Taller 'Rapidito' ", JOptionPane.WARNING_MESSAGE);
                   
                }
    }//GEN-LAST:event_tfStockKeyTyped

    private void tfEstanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEstanteKeyTyped
        char validar = evt.getKeyChar();
       
       if(Character.isDigit(validar)){
       getToolkit().beep();
       evt.consume();
         JOptionPane.showMessageDialog(null, "Ingrese solo letras", "Aviso Taller 'Rapidito' ", JOptionPane.WARNING_MESSAGE);
       
       }
    }//GEN-LAST:event_tfEstanteKeyTyped

    private void mostrarEnTF(int fila) {
        if (!tventa.getLista().isEmpty()) {
            tfCodigo.setText(String.valueOf(tventa.getLista().get(fila).getCodProducto()));
            tfNombre.setText(tventa.getLista().get(fila).getNombre());
            tfDescripcion.setText(tventa.getLista().get(fila).getDescripcion());
            tfEstante.setText(tventa.getLista().get(fila).getEstante());
            tfPrecio1.setText(String.valueOf(tventa.getLista().get(fila).getPrecio()));
            tfStock.setText(String.valueOf(tventa.getLista().get(fila).getStock()));
            tfCantidad.setText(String.valueOf(tventa.getLista().get(fila).getSalida()));

            esNuevo = false;
            
            int ultReg = tventa.getLista().size();
            IContador.setText("" + (fila + 1) + " de " + ultReg);
            tfNombre.requestFocus();
            System.out.println("check");
        } else {
            limpiar();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IContador;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfEstante;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio1;
    private javax.swing.JTextField tfStock;
    // End of variables declaration//GEN-END:variables
}
