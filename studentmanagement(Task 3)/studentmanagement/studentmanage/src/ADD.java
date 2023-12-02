import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.spec.ECField;
import java.util.LinkedList;

public class ADD extends JFrame{
    private JTextField textField1;
    public JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton submitButton;
    private JButton ADDButton;
    private JPanel panel2;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextArea textArea1;
    private JTextField textField6;
    public LinkedList<Student> list = new LinkedList<Student>();

    public void panel(LinkedList<Student> list1){
        setVisible(true);
        add(panel2);
        setSize(650,650);
        setTitle("Add Students Form");
        this.list=list1;
        ADDButton.addActionListener(event-> {
            try {
                addStudent();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });




        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                new register(list);
            }
        });
    }

    public ADD() {


    }
    public boolean IDPresent(String input) {
        boolean present = false;
        for (Student check : list) {
            if (check.getID().compareToIgnoreCase(input) == 0) {
                present = true;
            }
        }

        return present;
    }
    //String course="ITC";
    public void addStudent() throws IOException {
            if (IDPresent(textField2.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Given ID is already present.");
            } else {
                String select = comboBox2.getSelectedItem().toString();
                String select2 = comboBox3.getSelectedItem().toString();

                if (select.equals("Under Graduate") && select2.equals("BSCS")) {
                    textArea1.setText("- Introduction to Computer Science/technology (ITC)\n" +
                            "- Programming on C language\n" +
                            "- Calculus\n" +
                            "- English Composition and Comprehension\n" +
                            "- Applied Physics\n");
                } else if (select.equals("Under Graduate") && select2.equals("BBA")) {
                    textArea1.setText("- Brand Marketing\n" +
                            "- Business Analysis\n" +
                            "- Calculus\n" +
                            "- English Composition and Comprehension\n" +
                            "-Business Economics\n");
                } else if (select.equals("Under Graduate") && select2.equals("BSAF")) {
                    textArea1.setText("- Cost & Management Accounting\n" +
                            "- Business Finance\n" +
                            "- Corporate Accounting-II\n" +
                            "- English Composition and Comprehension\n" +
                            "-Business Math - II\n");
                } else if (select.equals("Under Graduate") && select2.equals("BSS")) {
                    textArea1.setText("-History\n" +
                            "- Linguistics\n" +
                            "- Law\n" +
                            "- Economic Policy\n" +
                            "-Psychology\n");
                } else if (select.equals("Post Graduate") && select2.equals("MBA")) {
                    textArea1.setText("- Brand Marketing\n" +
                            "- Business Analysis\n" +
                            "- Calculus\n" +
                            "- English Composition and Comprehension\n" +
                            "-Business Economics\n");
                } else if (select.equals("Post Graduate") && select2.equals("MSAF")) {
                    textArea1.setText("- Cost & Management Accounting\n" +
                            "- Business Finance\n" +
                            "- Corporate Accounting-II\n" +
                            "- English Composition and Comprehension\n" +
                            "-Business Math - II\n");
                } else if (select.equals("Post Graduate") && select2.equals("MSS")) {
                    textArea1.setText("-History\n" +
                            "- Linguistics\n" +
                            "- Law\n" +
                            "- Economic Policy\n" +
                            "-Psychology\n");
                } else if (select.equals("Post Graduate") && select2.equals("MCS")) {
                    textArea1.setText("- Introduction to Computer Science/technology (ITC)\n" +
                            "- Programming on C language\n" +
                            "- Calculus\n" +
                            "- English Composition and Comprehension\n" +
                            "- Applied Physics\n");
                } else if (select.equals("Under Graduate") && select2.equals("MCS")) {
                    JOptionPane.showMessageDialog(null, "invalid choice for program and department.");
                    select=null;
                    select2=null;
                } else if (select.equals("Under Graduate") && select2.equals("MBA")) {
                    JOptionPane.showMessageDialog(null, "invalid choice for program and department.");
                    select=null;
                    select2=null;
                } else if (select.equals("Under Graduate") && select2.equals("MSS")) {
                    JOptionPane.showMessageDialog(null, "invalid choice for program and department.");
                    select=null;
                    select2=null;
                } else if (select.equals("Under Graduate") && select2.equals("MSAF")) {
                    JOptionPane.showMessageDialog(null, "invalid choice for program and department.");
                    select=null;
                    select2=null;
                } else if (select.equals("Post Graduate") && select2.equals("BSCS")) {
                    JOptionPane.showMessageDialog(null, "invalid choice for program and department.");
                    select=null;
                    select2=null;
                } else if (select.equals("Post Graduate") && select2.equals("BBA")) {
                    JOptionPane.showMessageDialog(null, "invalid choice for program and department.");
                    select=null;
                    select2=null;
                } else if (select.equals("Post Graduate") && select2.equals("BSS")) {
                    JOptionPane.showMessageDialog(null, "invalid choice for program and department.");
                    select=null;
                    select2=null;
                } else if (select.equals("Post Graduate") && select2.equals("BSAF")) {
                    JOptionPane.showMessageDialog(null, "invalid choice for program and department.");
                    select=null;
                    select2=null;
                }
                int integer = 0;
                int contact=0;
                int contact2=0;
                int year=0;
                String Name = null;
                String Father = null;

                try {
                    integer = Integer.parseInt((textField2.getText()));
                }catch (Exception e){
                    if(!textField2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Invalid input of ID. It should be an integer.");
                }}
                try {
                    contact=Integer.parseInt(textField6.getText());

                }catch (Exception e){
                    if(!textField6.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Invalid input of Father's contact number. It should be an integer.");

                }}
                try {
                    contact2=Integer.parseInt(textField5.getText());
                }catch (Exception e){
                    if(!textField5.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Invalid input of student's contact number. It should be an integer.");

                }}
                try {
                    year=Integer.parseInt(textField3.getText());

                }catch (Exception e){
                    if(!textField3.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Invalid input of Year of joining. It should be an integer.");

                }}
                try {
                    Name= String.valueOf(textField1.getText());

                }catch (Exception e){
                    if(!textField1.getText().equals("")){

                    JOptionPane.showMessageDialog(null,"Invalid input of Name. It should be a string.");

                }}

                try {
                    Father= String.valueOf(textField4.getText());

                }catch (Exception e){
                    if(!textField4.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Invalid input of Father's Name. It should be a string.");

                }}
                list.add(new Student(Name, String.valueOf(integer), Father, String.valueOf(contact), String.valueOf(contact2),  select, select2, String.valueOf(year),textArea1.getText()));
                if(textField1.getText().equals("") && textField2.getText().equals("")&& textField3.getText().equals("")&& textField4.getText().equals("")&& textField5.getText().equals("")&& textField6.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "All Text fields are empty.\n Try giving input.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Record Added.");

                }
                /*BufferedWriter bw = null;
                bw = new BufferedWriter(new FileWriter(new File("out.txt"), true));
                bw.write("Name:" + Name + "\n" +  "ID:" + String.valueOf(integer) + "\n" + "Program:"
                        + select + "\n" + "Year of joining:" + year + "\n " + "Department:" + select2+ "\n"+ "Courses: " +textArea1.getText()+"\n");
                bw.close();*/

                //JOptionPane.showMessageDialog(""+reg.list);

                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField3.setText("");
                textArea1.setText("");
                textField1.setText("");
                textField2.setText("");
            }

    }
    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public LinkedList<Student> getList() {
        return list;
    }

    public void setList(LinkedList<Student> list) {
        this.list = list;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {

            this.textField1 = textField1;
    }
    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {

        this.textField2 = textField2;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public JTextField getTextField5() {
        return textField5;
    }

    public void setTextField5(JTextField textField5) {
        this.textField5 = textField5;
    }
}
