import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class K extends JFrame implements ActionListener {
    double num1, num2, result;
    char op;

    JLabel l = new JLabel("Designed by CS-15");
    JButton nb[] = new JButton[10];
    JButton eq = new JButton("=");
    JButton ab = new JButton("+");
    JButton sb = new JButton("-");
    JButton mb = new JButton("*");
    JButton db = new JButton("/");
    JButton dec = new JButton(".");
    JTextField t = new JTextField();

    Font f = new Font("Arial", Font.BOLD, 40);

    Panel p = new Panel();

    public K(String s) {
        super(s);
        setLayout(new BorderLayout());
        p.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 10; i++) {
            nb[i] = new JButton(String.valueOf(i));
            nb[i].setFont(f);
            nb[i].setBackground(Color.YELLOW);
            nb[i].setForeground(Color.BLUE);
        }
        ab.setFont(f);
        ab.setBackground(Color.YELLOW);
        ab.setForeground(Color.BLUE);
        sb.setFont(f);
        sb.setBackground(Color.YELLOW);
        sb.setForeground(Color.BLUE);
        mb.setFont(f);
        mb.setBackground(Color.YELLOW);
        mb.setForeground(Color.BLUE);
        db.setFont(f);
        db.setBackground(Color.YELLOW);
        db.setForeground(Color.BLUE);
        dec.setFont(f);
        dec.setBackground(Color.YELLOW);
        dec.setForeground(Color.BLUE);
        eq.setFont(f);
        eq.setBackground(Color.YELLOW);
        eq.setForeground(Color.BLUE);
        t.setFont(f);
        p.add(nb[1]);
        p.add(nb[2]);
        p.add(nb[3]);
        p.add(ab);
        p.add(nb[4]);
        p.add(nb[5]);
        p.add(nb[6]);
        p.add(sb);
        p.add(nb[7]);
        p.add(nb[8]);
        p.add(nb[9]);
        p.add(mb);
        p.add(dec);
        p.add(nb[0]);
        p.add(eq);
        p.add(db);
        add(t, BorderLayout.NORTH);
        add(l, BorderLayout.SOUTH);
        add(p, BorderLayout.CENTER);
        for (int i = 0; i < 10; i++)
            nb[i].addActionListener(this);
        ab.addActionListener(this);
        sb.addActionListener(this);
        mb.addActionListener(this);
        db.addActionListener(this);
        eq.addActionListener(this);
        dec.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == nb[i])
                t.setText(t.getText().concat(nb[i].getLabel()));
        }
        if (e.getSource() == ab) {
            num1 = Double.parseDouble(t.getText());
            op = '+';
            t.setText("");
        }
        if (e.getSource() == sb) {
            num1 = Double.parseDouble(t.getText());
            op = '-';
            t.setText("");
        }
        if (e.getSource() == mb) {
            num1 = Double.parseDouble(t.getText());
            op = '*';
            t.setText("");
        }
        if (e.getSource() == db) {
            num1 = Double.parseDouble(t.getText());
            op = '/';
            t.setText("");
        }
        if (e.getSource() == dec) {
            t.setText(t.getText().concat(dec.getLabel()));
        }

        if (e.getSource() == eq) {
            num2 = Double.parseDouble(t.getText());
            switch (op) {
                case '+':
                    result = num1 + num2;
                    t.setText(String.valueOf(result));
                    num1 = result;
                    break;

                case '-':
                    result = num1 - num2;
                    t.setText(String.valueOf(result));
                    num1 = result;
                    break;

                case '*':
                    result = num1 * num2;
                    t.setText(String.valueOf(result));
                    num1 = result;
                    break;

                case '/':
                    result = num1 / num2;
                    t.setText(String.valueOf(result));
                    num1 = result;
                    break;
            }
        }

    }

    public static void main(String args[]) {
        K k = new K("Addition of Two Integers");
        k.setSize(500, 400);
        k.setVisible(true);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
