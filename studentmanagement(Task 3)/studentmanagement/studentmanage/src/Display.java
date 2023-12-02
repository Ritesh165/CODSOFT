import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Display extends JFrame{
    private JTextArea textArea1;
    private JButton DISPLAYButton;
    private JPanel panel3;
    private JButton RETURNButton;
    public LinkedList<Student> list2 = new LinkedList<Student>();


    public Display(LinkedList<Student> list1){
        setVisible(true);
        add(panel3);
        setSize(500,500);
        setTitle("Display Students Form");
        DISPLAYButton.addActionListener(event-> {
            try {
                displayAll();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        this.list2=list1;
        RETURNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                new register(list2);
            }
        });
    }
    private void displayAll() throws IOException {
       // JOptionPane.showMessageDialog(null, " Student Found!. "+list2);
        textArea1.setText("");
        for (Student display: list2){
            textArea1.append(display +"\n");
        }
        /*String record;
        File file = new File("out.txt");
        boolean bool = false;
        bool = file.exists();
        if (bool == true) {
            BufferedReader br = new BufferedReader(new FileReader(file));


            while ((record = br.readLine()) != null) {
                textArea1.append(record +"\n");

            }
            br.close();
        }*/

        //else {
          //  System.out.println("File not found.");
       // }
    }
}


