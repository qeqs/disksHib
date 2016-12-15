/*
 * Created by JFormDesigner on Fri Dec 16 00:14:27 MSK 2016
 */

package form;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import info.clearthought.layout.*;

/**
 * @author Vadim Lygin
 */
public class Form extends JFrame {

    public static void main(String[] args){
        Form form = new Form();
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setVisible(true);
    }

    public Form() {
        initComponents();
    }

    private void buttonAddActionPerformed(ActionEvent e) {
        // TODO add your code here
        frame1.setVisible(true);
    }

    private void buttonDeleteActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void buttonUpdateActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void buttonSearchActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void buttonSubmitActionPerformed(ActionEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vadim Lygin
        scrollPane1 = new JScrollPane();
        table1 = new JTable(new Object[][]{},new Object[]{"Category","Type","Description"});
        toolBar1 = new JToolBar();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        frame1 = new JFrame();
        button5 = new JButton();
        panel1 = new JPanel();
        textField1 = new JTextField();
        label1 = new JLabel();
        textField2 = new JTextField();
        label2 = new JLabel();
        textField3 = new JTextField();
        label3 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1, BorderLayout.CENTER);

        //======== toolBar1 ========
        {

            //---- button1 ----
            button1.setText("Add");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonAddActionPerformed(e);
                }
            });
            toolBar1.add(button1);

            //---- button2 ----
            button2.setText("Delete");
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonDeleteActionPerformed(e);
                }
            });
            toolBar1.add(button2);

            //---- button3 ----
            button3.setText("Update");
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonUpdateActionPerformed(e);
                }
            });
            toolBar1.add(button3);

            //---- button4 ----
            button4.setText("Search");
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonSearchActionPerformed(e);
                }
            });
            toolBar1.add(button4);
        }
        contentPane.add(toolBar1, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());

        //======== frame1 ========
        {
            Container frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new BorderLayout());

            //---- button5 ----
            button5.setText("submit");
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonSubmitActionPerformed(e);
                }
            });
            frame1ContentPane.add(button5, BorderLayout.SOUTH);

            //======== panel1 ========
            {

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

                panel1.setLayout(new TableLayout(new double[][] {
                    {TableLayout.PREFERRED, TableLayout.PREFERRED},
                    {TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED}}));
                ((TableLayout)panel1.getLayout()).setHGap(5);
                ((TableLayout)panel1.getLayout()).setVGap(5);

                //---- textField1 ----
                textField1.setColumns(10);
                panel1.add(textField1, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

                //---- label1 ----
                label1.setText("category");
                panel1.add(label1, new TableLayoutConstraints(1, 0, 1, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

                //---- textField2 ----
                textField2.setColumns(10);
                panel1.add(textField2, new TableLayoutConstraints(0, 1, 0, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

                //---- label2 ----
                label2.setText("type");
                panel1.add(label2, new TableLayoutConstraints(1, 1, 1, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

                //---- textField3 ----
                textField3.setColumns(10);
                panel1.add(textField3, new TableLayoutConstraints(0, 2, 0, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

                //---- label3 ----
                label3.setText("description");
                panel1.add(label3, new TableLayoutConstraints(1, 2, 1, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
            }
            frame1ContentPane.add(panel1, BorderLayout.CENTER);
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents


    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vadim Lygin
    private JScrollPane scrollPane1;
    private JTable table1;
    private JToolBar toolBar1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JFrame frame1;
    private JButton button5;
    private JPanel panel1;
    private JTextField textField1;
    private JLabel label1;
    private JTextField textField2;
    private JLabel label2;
    private JTextField textField3;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
