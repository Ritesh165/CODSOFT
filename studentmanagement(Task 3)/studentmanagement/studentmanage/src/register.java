import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class register extends JFrame {
    private JButton addButton;
    private JButton displayButton;
    private JButton exitButton;
    private JButton searchButton;
    private JButton deleteButton;
    private JPanel panel1;
    private JButton updateButton;
    public LinkedList<Student> list1 = new LinkedList<Student>();


    ADD add = new ADD();

    public register(LinkedList<Student> list) {
        setVisible(true);
        add(panel1);
        setSize(500, 500);
        setTitle("Registration form");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                add.panel(list1);
            }
        });
        searchButton.addActionListener(event -> Search());
        this.list1 = list;

        deleteButton.addActionListener(event -> dltstd());

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                new Display(list1);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        updateButton.addActionListener(event -> update());

    }

    private void dltstd() {

        if (list1.size() == 0) {
            JOptionPane.showMessageDialog(null, "List is empty.");
        }
       else {
            int times = Integer.parseInt(JOptionPane.showInputDialog("How many students you want to delete:"));
            for (int i = 0; i < times; i++) {
                String id = JOptionPane.showInputDialog("Enter the ID you want to delete:");
                for (int s = 0; s < list1.size(); s++) {
                    String currId = list1.get(s).getID();
                    if (currId.compareToIgnoreCase(id) == 0) {
                        list1.remove(s);
                        JOptionPane.showMessageDialog(null, " Student Deleted!. ");
                        // JOptionPane.showMessageDialog(null, " This is the ID of Student you deleted: " + id);

                    }
                }
                }
                JOptionPane.showMessageDialog(null, " Remaining Students:!\n" + list1);

        }
    }
    public void update() {
        if (list1.size() == 0) {
            JOptionPane.showMessageDialog(null, "List is empty.");
        } else {
            int times = Integer.parseInt(JOptionPane.showInputDialog("How many students you want to update:"));
            for (int i = 0; i < times; i++) {
                String id = JOptionPane.showInputDialog("Enter the ID you want to update:");
                for (int s = 0; s < list1.size(); s++) {
                    String currId = list1.get(s).getID();
                    if (currId.compareToIgnoreCase(id) == 0) {
                        list1.remove(s);
                    }
                    JOptionPane.showMessageDialog(null, " Add new information");
                    setVisible(false);
                    add.panel(list1);
                }
            }
        }
    }
    public void Search(){

      //  JOptionPane.showMessageDialog(null, " Student Found!. "+list1);


        if (list1.size() == 0) {
            JOptionPane.showMessageDialog(null, "List is empty.");
        }

        else  {
            int times = Integer.parseInt(JOptionPane.showInputDialog("How many students you want to search:"));
            for (int i = 0; i < times; i++) {
                String id = JOptionPane.showInputDialog("Enter the ID you want to search:");
                for (int s = 0; s < list1.size(); s++) {
                    String currId = list1.get(s).getID();
                    String CurrInfo = list1.get(s).toString();
                    if (currId.compareToIgnoreCase(id) == 0) {
                        JOptionPane.showMessageDialog(null, " Student Found!. ");
                        JOptionPane.showMessageDialog(null, " This is the Info of Student you searched for:\n" + CurrInfo);
                    }

                }
            }
        }
        /*else if (add.IDPresent(add.textField2.getText())==false){

            JOptionPane.showMessageDialog(null, " Student not Found!. ");

        }*/


    }

}
