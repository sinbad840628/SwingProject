item3.addActionListener(new ActionListener()
    	{
    		 public void actionPerformed(ActionEvent Event) 
             {
    			  File file = null;
    		      int result;
    			 fileChooser=new JFileChooser("D:\\");
    		      //����addChoosableFileFilter()�������������˵��ļ�����,ʹ��addChoosableFileFilter()���Լ�������ļ�����, 
    		      //����ֻ��Ҫ���˳�һ���ļ�����,��ʹ��setFileFilter()����.
    		  	 fileChooser.addChoosableFileFilter(new JAVAFileFilter("txt"));
    		  	 result=fileChooser.showSaveDialog(frame);
///���ѡ��ȷ����ť�Ļ�����ô����Դ����е��ļ�
    		  	 if (result==JFileChooser.APPROVE_OPTION)
    		     {
    		  		 file = fileChooser.getSelectedFile();
    		  	     frame.setTitle("�㱣����:"+file.getName()+"�ļ�");	
    		  	 }
///���ı����е�������������ķ�ʽд�뵽txt�ĵ���
    		  	FileOutputStream fileOutStream = null;
                if(file != null)
                {
                    try{
                        fileOutStream = new FileOutputStream(file);
                    }catch(FileNotFoundException fe){

                        return;
                    }
                    String content = text.getText();//����ı����е��ı��ַ���
                    try{
                        fileOutStream.write(content.getBytes());//���ı�д�뵽�ĵ���
                    }catch(IOException ioe){

                    }
                    finally{
                        try{
                            if(fileOutStream != null)
                                fileOutStream.close();
                        }catch(IOException ioe2){}
                    }
                }
            }
    	});
