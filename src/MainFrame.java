        import  java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.WindowAdapter;
        import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button bexit=new Button("Exit");
    private Button badd=new Button("Add");
    private Label lab=new Label("0");
    private int n=0;
    public MainFrame(){
        initComp();
    }

        private void initComp(){
            this.setLocation(100,120);
            this.setSize(400,300);
            this.setLayout(null);
            this.add( bexit);
            this.add( badd);
            this.add( lab);
            bexit.setBounds(150,250,80,30);
            bexit.setBackground(Color.CYAN);
            bexit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            badd.setBounds(150,150,80,30);
            badd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    n++;
        lab.setText(Integer.toString(n));
                }
            });
            lab.setBounds(50,150,80,30);

            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
}
