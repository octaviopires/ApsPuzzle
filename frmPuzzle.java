import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class frmPuzzle 
{

	private JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try 
				{
					frmPuzzle window = new frmPuzzle();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public frmPuzzle() 
	{
	initialize();
	}

	
	int x = 1;
	public Image img1, img2;
	
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 735, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lbl1 = new JLabel("");
		final JLabel lbl2 = new JLabel("");

		/* cpt1 e cpt2 são imagens aleatórias que eu escolhi que eu escolhi
		 clica com botão direito no projeto e executa:  new > source folder. Pode dar o nome que quiser
		 pra pasta
		 e coloca as imagens la com os nome cpt1 e cpt2 
		*/
		
		img1 = new ImageIcon(this.getClass().getResource("cpt1.jpg")).getImage();
		img2 = new ImageIcon(this.getClass().getResource("cpt2.jpg")).getImage();
		
		

	    
		
		    lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(x == 0)
				{
				lbl1.setIcon(new ImageIcon(img1));
				lbl2.setIcon(new ImageIcon(img2));
				x = 1;

				}
				else
				{
					lbl1.setIcon(new ImageIcon(img2));
					lbl2.setIcon(new ImageIcon(img1));
					x = 0;
				

				}
			}
		});
		lbl1.setBounds(100, 42, 241, 166);
		frame.getContentPane().add(lbl1);
		
        lbl2.setBounds(111, 243, 234, 172);
		frame.getContentPane().add(lbl2);
		
		lbl1.setIcon(new ImageIcon(img1));
		lbl2.setIcon(new ImageIcon(img2));
		
				
		
	}	
}
