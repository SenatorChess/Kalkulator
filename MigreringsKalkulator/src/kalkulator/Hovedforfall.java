package kalkulator;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;

public class Hovedforfall {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("HFF Kalkulator!");
				frame.getContentPane().setBackground(Color.ORANGE);
				
				JButton btnNewButton = new JButton("Enter");
				btnNewButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
					}
				});
				
				JTextPane txtpnNringsbil = new JTextPane();
				txtpnNringsbil.setForeground(Color.WHITE);
				txtpnNringsbil.setFont(new Font("Arial Black", Font.PLAIN, 14));
				txtpnNringsbil.setEditable(false);
				txtpnNringsbil.setBackground(new Color(0, 0, 255));
				txtpnNringsbil.setText("N\u00E6ringsbil");
				
				JFormattedTextField xX = new JFormattedTextField();
				xX.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent x) {
						char c =  x.getKeyChar();
						if((Character.isLetter(c) || c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
							x.consume();
						}
					}
				});
				
				JFormattedTextField yY = new JFormattedTextField();
				yY.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent y) {
						char c =  y.getKeyChar();
						if((Character.isLetter(c) || c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
							y.consume();
					}}
				});
				
				JFormattedTextField zZ = new JFormattedTextField();
				zZ.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent z) {
						char c =  z.getKeyChar();
						if((Character.isLetter(c) || c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
							z.consume();
					}}
				});
				
				JFormattedTextField aA = new JFormattedTextField();
				aA.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent a) {
						char c =  a.getKeyChar();
						if((Character.isLetter(c) || c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
							a.consume();
					}}
				});
				
				JFormattedTextField bB = new JFormattedTextField();
				bB.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent b) {
						char c =  b.getKeyChar();
						if((Character.isLetter(c) || c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
							b.consume();
					}}
				});
				
				JTextPane txtpnPrisTia = new JTextPane();
				txtpnPrisTia.setBackground(new Color(102, 153, 102));
				txtpnPrisTia.setText("Pris TIA");
				txtpnPrisTia.setFont(new Font("Bodoni MT", Font.ITALIC, 14));
				txtpnPrisTia.setEditable(false);
				
				JTextPane txtpnNaturskadetia = new JTextPane();
				txtpnNaturskadetia.setBackground(new Color(102, 153, 102));
				txtpnNaturskadetia.setText("Naturskade");
				txtpnNaturskadetia.setFont(new Font("Bodoni MT", Font.ITALIC, 14));
				txtpnNaturskadetia.setEditable(false);
				
				JTextPane txtpnrligPremieCps = new JTextPane();
				txtpnrligPremieCps.setBackground(new Color(102, 102, 153));
				txtpnrligPremieCps.setText("Pris CPS");
				txtpnrligPremieCps.setFont(new Font("Bodoni MT", Font.ITALIC, 14));
				txtpnrligPremieCps.setEditable(false);
				
				JTextPane txtpnNaturskade = new JTextPane();
				txtpnNaturskade.setBackground(new Color(102, 102, 153));
				txtpnNaturskade.setText("Naturskade");
				txtpnNaturskade.setFont(new Font("Bodoni MT", Font.ITALIC, 16));
				txtpnNaturskade.setEditable(false);
				
				JTextPane txtpnkning = new JTextPane();
				txtpnkning.setBackground(new Color(0, 255, 255));
				txtpnkning.setText("\u00D8kning");
				txtpnkning.setFont(new Font("Bodoni MT", Font.ITALIC, 16));
				txtpnkning.setEditable(false);
				
				JTextPane txtpnTekniskRabatt = new JTextPane();
				txtpnTekniskRabatt.setBackground(SystemColor.info);
				txtpnTekniskRabatt.setEditable(false);
				txtpnTekniskRabatt.setText("Teknisk rabatt");
				txtpnTekniskRabatt.setToolTipText("");
				txtpnTekniskRabatt.setFont(new Font("Arial Black", Font.PLAIN, 15));
				
				JFormattedTextField formattedTextField_5 = new JFormattedTextField();
				formattedTextField_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println(aA);
					}
				});
				formattedTextField_5.setEditable(false);
				GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
				groupLayout.setHorizontalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtpnPrisTia)
										.addComponent(xX, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(yY, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(zZ, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(aA, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(bB, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtpnNaturskadetia, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtpnrligPremieCps, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtpnNaturskade, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtpnkning, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtpnTekniskRabatt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtpnNringsbil, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
									.addGap(437))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(formattedTextField_5, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
				);
				groupLayout.setVerticalGroup(
					groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnNringsbil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtpnTekniskRabatt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnPrisTia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnNaturskadetia, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnrligPremieCps, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnkning, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnNaturskade, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(xX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(yY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(zZ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(aA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(bB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(16))
				);
				frame.getContentPane().setLayout(groupLayout);
				frame.setSize(600, 350);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
			
		});
	}
}
