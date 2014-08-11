item4.addActionListener(new ActionListener()
    	{
    		 public void actionPerformed(ActionEvent Event) 
             {
    			  color = JColorChooser.showDialog(frame, "Choose Color", color);//创建一个颜色选择器
    			  setBackground (color);
    			 }
    	});
