import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dibyarupa extends Frame implements ActionListener {
	private Label U,P;
	private Button B1;
	private TextField t1,t2,t3;
	
	
	public Dibyarupa()
	{
	
		U=new Label("USER NAME");
		P=new Label("PASSWORD");
		B1=new Button("SIGN IN");
		t1=new TextField(30);
		t2=new TextField(30);
		t3=new TextField(7);
		add(U);
		
		add(t1);
		add(P);
		add(t2);
		add(t3);
		add(B1);
		B1.addActionListener(this);
	}
	public static void main(String[] args)
	{
		Dibyarupa A= new Dibyarupa();
		A.setSize(300,300);
		A.setVisible(true);
		A.setLayout(new FlowLayout());
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String s1=t1.getText();
		String s2=t2.getText();
		String S="INVALID";
		String S3="CORRECT";
		
		if(e.getSource()==B1)
		{
			if(s1.equals("Dibyarupa123") && s2.equals("Dibyarupa"))
			{
				this.dispose();
				t3.setText(S3);
				new SCREEN();
			}
			
			else
			{	
				t3.setText(S);
			}
		}
		
	}


}
class SCREEN extends Frame{
	Label A,B,C,D,E,F,G,H,I,J,K;
	public SCREEN() {
		setBackground(Color.red);
		A=new Label(" Name"+":"+" Dibyarupa");
		B=new Label("D.O.B"+": 12/05/1999");
		C=new Label("Address: Nalco Nagar, Angul");
		D=new Label("Contact: +++++++++");
		E=new Label("School: Delhi Public School");
		F=new Label("10th:95.5%");
		G=new Label("Vikash Resedential school");
		H=new Label("12th: 90.5"+"%"+"C.B.S.E");
		J=new Label("Tranning attended: Attended a certification coursee 120Hrs in frontend web development using Angular js");
		add(A);
		add(B);
		add(C);
		add(D);
		add(E);
		add(F);
		add(G);
		add(H);
		add(J);
		setSize(200,200);
		setVisible(true);
		setLayout(new GridLayout(11,1,2,2));
		setBackground(Color.pink);
	
	}
}

	
	
