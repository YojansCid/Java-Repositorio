import java.awt.EventQueue;

public class main {
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					new VentanaIntro();
		
				} catch (Exception e) {
                                    System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		});
	}
}

