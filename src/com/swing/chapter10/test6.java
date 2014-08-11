item3.addActionListener(new ActionListener()
    	{
    		 public void actionPerformed(ActionEvent Event) 
             {
    			  File file = null;
    		      int result;
    			 fileChooser=new JFileChooser("D:\\");
    		      //利用addChoosableFileFilter()方法加入欲过滤的文件类型,使用addChoosableFileFilter()可以加入多种文件类型, 
    		      //若你只需要过滤出一种文件类型,可使用setFileFilter()方法.
    		  	 fileChooser.addChoosableFileFilter(new JAVAFileFilter("txt"));
    		  	 result=fileChooser.showSaveDialog(frame);
///如果选择确定按钮的话，那么则可以打开现有的文件
    		  	 if (result==JFileChooser.APPROVE_OPTION)
    		     {
    		  		 file = fileChooser.getSelectedFile();
    		  	     frame.setTitle("你保存了:"+file.getName()+"文件");	
    		  	 }
///将文本框中的内容以输出流的方式写入到txt文档中
    		  	FileOutputStream fileOutStream = null;
                if(file != null)
                {
                    try{
                        fileOutStream = new FileOutputStream(file);
                    }catch(FileNotFoundException fe){

                        return;
                    }
                    String content = text.getText();//获得文本框中的文本字符串
                    try{
                        fileOutStream.write(content.getBytes());//将文本写入到文档中
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
