import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaInicial extends JPanel{
    private JFrame frame;
    private JPanel panel1, panel2;
    private JLabel lconta, lagencia, lsenha, banco;
    private JTextField conta, agencia;
    private JPasswordField senha;
    private JButton ok, sair, idioma;

    public TelaInicial(){
        frame = new JFrame("Tela Inicial");
        frame.setLayout(new BorderLayout());
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,2,5,1));
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,3));
        banco = new JLabel("Bem Vindo ao Banco X!");
        lconta = new JLabel("Conta: ");
        lagencia = new JLabel("Agência: ");
        lsenha = new JLabel("Senha: ");
        conta = new JTextField(5);
        agencia = new JTextField(3);
        senha = new JPasswordField(6);
        panel1.add(lagencia);
        panel1.add(agencia);
        panel1.add(lconta);
        panel1.add(conta);
        panel1.add(lsenha);
        panel1.add(senha);
        ok = new JButton("OK");
        ok.addActionListener(new ButtonListener());
        sair = new JButton("Sair");
        sair.addActionListener(new ButtonListener());
        idioma = new JButton("EN/ES?");
        panel2.add(ok);
        panel2.add(sair);
        panel2.add(idioma);
        frame.add(banco, BorderLayout.NORTH);
        frame.add(panel1,BorderLayout.CENTER);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String []args){
        new TelaInicial();
    }
    class ButtonListener implements ActionListener{
        ButtonListener(){
        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==sair){
                frame.dispose();
                System.exit(0);
            }
            if(e.getSource()==ok){
                JOptionPane.showMessageDialog(null,"Teste");
            }
        }
    }
}