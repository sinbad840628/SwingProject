item4.addActionListener(new ActionListener()
    	{
    		 public void actionPerformed(ActionEvent Event) 
             {
    			  color = JColorChooser.showDialog(frame, "Choose Color", color);//����һ����ɫѡ����
    			  setBackground (color);
    			 }
    	});
