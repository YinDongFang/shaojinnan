/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import business.Car;
import business.Manufacturer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shaojinnan
 */
public class CarManagementJPanel extends javax.swing.JPanel {
    
    private List<Car>cars;
    private List<Car> results;
    private JSplitPane pane;
    private List<Manufacturer> manufacturers;

    /**
     * Creates new form CarManagementJPanel
     */
    public CarManagementJPanel(JSplitPane pane, List<Car>cars, List<Manufacturer> manufacturers) {
        initComponents();
        
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for(Manufacturer item : manufacturers) {
            model.addElement(item);
        }
        
        manufacturerCombobox.setModel(model);
        
        this.pane = pane;
        this.cars = cars;
        this.manufacturers = manufacturers;
        
        reset();
    }
    
    /**
     * reset params
     */
    private void reset() {
        availableCheckbox.setSelected(false);
        unavailableCheckbox.setSelected(false);
        manufacturerCombobox.setSelectedIndex(-1);
        manufacturerTimeField.setText("");
        serialNumberField.setText("");
        modelNumberField.setText("");
        cityField.setText("");
        seatsField1.setValue(0);
        seatsField2.setValue(10);
        lastUpdateTimeField.setText("");
        expiredCheckbox.setSelected(false);
        notExpiredCheckbox.setSelected(false);
        
        search();
    }
    
    /**
     * search cars
     */
    private void search() {
        DefaultTableModel dtm = (DefaultTableModel) carTable.getModel();
        dtm.setRowCount(0);
        
        results = new ArrayList<Car>();
        
        for(Car car: cars) {
            boolean pass = validateAvailable(car) &&
                    validateManufacturer(car) &&
                    validateManufacturerTime(car) &&
                    validateSeat(car) &&
                    validateSerialNumber(car) &&
                    validateModelNumber(car) &&
                    validateCity(car) &&
                    validateLastUpdateTime(car) &&
                    validateExpired(car);
            if(pass) {
               Object[] row = new Object[9];
               row[0] = car.isAvailable();
               row[1] = car.getManufacturer();
               row[3] = car.getManufacturingTime();
               row[4] = car.getSeats();
               row[5] = car.getModelNumber();
               row[6] = car.getCity();
               row[7] = new SimpleDateFormat("yyyy-M-d").format(car.getLastUpdateTime());               
               row[8] = car.isExpired();
               
               
                
               dtm.addRow(row);
               
               results.add(car);
            }
        }
        
        countLabel.setText(results.size() + "");
    }
    
    private boolean validateAvailable(Car car) {       
        if(availableCheckbox.isSelected() && unavailableCheckbox.isSelected()) {
            return true;
        } else if(availableCheckbox.isSelected()) {
            return car.isAvailable();
        } else if(unavailableCheckbox.isSelected()) {
            return !car.isAvailable();
        }    
        return true;
    }
    
    private boolean validateManufacturer(Car car) {
        Object selected = manufacturerCombobox.getSelectedItem();
        return selected == null || selected == car.getManufacturer();
    }
    
    private boolean validateManufacturerTime(Car car) {
        String text = manufacturerTimeField.getText();
        if(text.isEmpty())    return true;
        try {
            Date time = new SimpleDateFormat("yyyy").parse(text);
            
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(time);
            
            return calendar.get(Calendar.YEAR) == car.getManufacturingTime();
        } catch (ParseException ex) {
            return false;
        }      
    }
    
    private boolean validateSeat(Car car) {
        int from = (int)seatsField1.getValue();
        int to = (int)seatsField2.getValue();
        int seat = car.getSeats();
        return seat >= from && seat <= to;
    }

    private boolean validateSerialNumber(Car car) {
        String input = serialNumberField.getText();
        String carNumber = car.getSerialNumber();
        return carNumber.contains(input);
    }
    
    private boolean validateModelNumber(Car car) {
        String input = modelNumberField.getText();
        String carNumber = car.getModelNumber();
        return carNumber.contains(input);
    }
    
    private boolean validateCity(Car car) {
        String input = cityField.getText();
        String carNumber = car.getCity();
        return carNumber.contains(input);
    }
    
    private boolean validateLastUpdateTime(Car car) {
        String text = lastUpdateTimeField.getText();
        if(text.isEmpty())    return true;
        try {
            Date time = new SimpleDateFormat("yyyy-M-d").parse(text);
            Calendar date1 = Calendar.getInstance();
            date1.setTime(car.getLastUpdateTime());
            Calendar date2 = Calendar.getInstance();
            date2.setTime(time);
            return date1.get(Calendar.YEAR) == date2.get(Calendar.YEAR) &&
                    date1.get(Calendar.MONTH) == date2.get(Calendar.MONTH) &&
                    date1.get(Calendar.DAY_OF_YEAR) == date2.get(Calendar.DAY_OF_YEAR);
        } catch (ParseException ex) {
            return false;
        }      
    }
    
    private boolean validateExpired(Car car) {       
        if(expiredCheckbox.isSelected() && notExpiredCheckbox.isSelected()) {
            return true;
        } else if(expiredCheckbox.isSelected()) {
            return car.isAvailable();
        } else if(notExpiredCheckbox.isSelected()) {
            return !car.isExpired();
        }    
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        availableCheckbox = new javax.swing.JCheckBox();
        unavailableCheckbox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        manufacturerCombobox = new javax.swing.JComboBox<>();
        manufacturerTimeField = new javax.swing.JFormattedTextField();
        seatsField2 = new javax.swing.JSpinner();
        serialNumberField = new javax.swing.JTextField();
        modelNumberField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        lastUpdateTimeField = new javax.swing.JFormattedTextField();
        notExpiredCheckbox = new javax.swing.JCheckBox();
        expiredCheckbox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        seatsField1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        countLabel = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Cars");

        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Available", "Manufacturer", "Manufacturing Time", "Seats", "Serial Number", "Model Number", "City", "Last Update Time", "Is Expired"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(carTable);

        jButton4.setText("Create");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        availableCheckbox.setText("True");
        availableCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableCheckboxActionPerformed(evt);
            }
        });

        unavailableCheckbox.setText("False");
        unavailableCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unavailableCheckboxActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("IsAvailable:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Manufacturer:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Manufacturer Time:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Seats:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Serial Number:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Model Number:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("CIty:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Last Update Time:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Is Expired:");

        manufacturerCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerComboboxActionPerformed(evt);
            }
        });

        manufacturerTimeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));

        seatsField2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        serialNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumberFieldActionPerformed(evt);
            }
        });

        lastUpdateTimeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        notExpiredCheckbox.setText("False");
        notExpiredCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notExpiredCheckboxActionPerformed(evt);
            }
        });

        expiredCheckbox.setText("True");
        expiredCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiredCheckboxActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        seatsField1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel11.setText("-");

        jButton3.setText("Mock");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setText("Count:");

        countLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addGap(655, 655, 655))
                            .addComponent(jScrollPane2))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cityField)
                                .addComponent(modelNumberField)
                                .addComponent(serialNumberField)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(availableCheckbox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(unavailableCheckbox))
                                .addComponent(manufacturerCombobox, 0, 180, Short.MAX_VALUE)
                                .addComponent(manufacturerTimeField)
                                .addComponent(lastUpdateTimeField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(seatsField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(seatsField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(expiredCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(notExpiredCheckbox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countLabel)))
                        .addContainerGap(283, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel1)
                    .addComponent(availableCheckbox)
                    .addComponent(unavailableCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel3)
                    .addComponent(manufacturerCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jLabel4)
                    .addComponent(manufacturerTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(seatsField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(serialNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(modelNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastUpdateTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(expiredCheckbox)
                        .addComponent(notExpiredCheckbox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel12)
                    .addComponent(countLabel))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int row = carTable.getSelectedRow();
        if(row == -1)    return;
        
        Car car = results.get(row);
        
        pane.setRightComponent(new CreateJPanel(car, cars, manufacturers));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int row = carTable.getSelectedRow();
        if(row == -1)    return;
        
        Car car = results.get(row);
        
        cars.remove(car);
        
        search();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void unavailableCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unavailableCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unavailableCheckboxActionPerformed

    private void availableCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableCheckboxActionPerformed

    private void manufacturerComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerComboboxActionPerformed

    private void notExpiredCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notExpiredCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notExpiredCheckboxActionPerformed

    private void expiredCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiredCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiredCheckboxActionPerformed

    private void serialNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNumberFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        Random random = new Random();
        
        String[] serialNumbers = {"1-234566", "2-359825", "3-5499845"};
        String[] modelNumbers = {"m1-234566", "m2-359825", "m3-5499845"};
        String[] citys = {"beijing", "guangzhou", "zhengzhou"};
        
        Car car = new Car();
        car.setAvailable(random.nextBoolean());
        car.setSeats(random.nextInt(10));
        car.setCity(citys[random.nextInt(3)]);
        car.setModelNumber(modelNumbers[random.nextInt(3)]);
        car.setSerialNumber(serialNumbers[random.nextInt(3)]);
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(random.nextInt(10) + 2015, random.nextInt(12), 1);       
        car.setExpired(calendar.getTime());
        
        car.setLastUpdateTime(new Date());
        car.setManufacturingTime(random.nextInt(10) + 2015);
        car.setManufacturer(manufacturers.get(random.nextInt(manufacturers.size())));
                
                cars.add(car);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(new CreateJPanel(cars, manufacturers));
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox availableCheckbox;
    private javax.swing.JTable carTable;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel countLabel;
    private javax.swing.JCheckBox expiredCheckbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField lastUpdateTimeField;
    private javax.swing.JComboBox<String> manufacturerCombobox;
    private javax.swing.JFormattedTextField manufacturerTimeField;
    private javax.swing.JTextField modelNumberField;
    private javax.swing.JCheckBox notExpiredCheckbox;
    private javax.swing.JSpinner seatsField1;
    private javax.swing.JSpinner seatsField2;
    private javax.swing.JTextField serialNumberField;
    private javax.swing.JCheckBox unavailableCheckbox;
    // End of variables declaration//GEN-END:variables
}
