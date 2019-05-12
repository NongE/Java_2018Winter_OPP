package checkTableUI;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

import checkClient.*;
import model.*;

public class tableButton extends JButton{
	JLabel tLabel;
	JLabel pLabel;
	int tnum;
	int pnum;
	String tmode;
	
	checkClient client;
	CustomerVO customerdata;
	tableButton(int num){
		System.out.println("정보를 가져왔습니다.");	
		client = new checkClient();
		customerdata = new CustomerVO();
		
		System.out.println(client.customerlist.get(num).getSex());
		System.out.println(client.customerlist.get(num).getNumofpeo());
		
		tnum = num+1;
		
		System.out.println("정보를 가져옵니다.");
		tmode = client.customerlist.get(num).getSex();
		pnum = client.customerlist.get(num).getNumofpeo();
		System.out.println(tmode);
		System.out.println(pnum);
		
		System.out.println("정보를 가져왔습니다.");
		tLabel = new JLabel("좌석 번호 : "+Integer.toString(tnum));
		tLabel.setFont(new Font("",Font.PLAIN,10));
		
		pLabel = new JLabel(Integer.toString(pnum));
		pLabel.setFont(new Font("",Font.PLAIN,15));
		
		setLayout(new BorderLayout());
		
		add(tLabel, BorderLayout.NORTH);
		add(pLabel, BorderLayout.CENTER);
		
		switch(tmode) {
		case "x":
			setBackground(Color.gray);
			break;
		case "여":
			setBackground(Color.pink);
			break;
		case "남":
			setBackground(Color.blue);
			break;
		case "혼":
			setBackground(Color.GREEN);
			break;
		default :
			break;
		}
		setOpaque(true);
	}
	
	

}
