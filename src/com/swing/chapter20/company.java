package com.swing.chapter20;


public class company 
{
	 String name;//ͬ�µ�����
	 String code;//ͬ�µĹ���
	 String birthday;//ͬ�µ�����
	 String sex;//ͬ�µ��Ա�
	 String address;//ͬ�µļ�ͥ��ַ
	 String duty;//ͬ�µ�ְ��
	 String salary;//ͬ�µ�нˮ
	 String tel;//ͬ�µ���ϵ�绰
	 String motel;//ͬ�µ��ƶ��绰
	 String department;//ͬ�µ����ڲ���
///ͨ����������������������ֵ
	  company(String name)
	   {
	     this.name=name;
	   }
	   public String getname()
	   {
	     return name;
	   }
///ͨ���������ͻ�ȡ����Ϊ���������ֵ
	   public void setcode(String code)
	   {
		   this.code=code;
	   }
	   public void setsex(String sex)
	    {
	        this.sex=sex;
	    }
	   public void setdepartment(String department)
	   {
		   this.department=department;
	   }
	    public void setbirthday(String birthday)
	    {
	        this.birthday=birthday;
	    }
	    public void setaddress(String address)
	    {
	        this.address=address;
	    }
	    public void setduty(String duty)
	    {
	        this.duty=duty;
	    }
	    public void setsalary(String salary)
	    {
	        this.salary=salary;
	    }
	    public void settel(String tel)
	    {
	        this.tel=tel;
	    }
	    public void setmotel(String motel)
	    {
	    	this.motel=motel;
	    }
	    public String getcode()
	    {
	    	return code;
	    }
	    public String getsex()
	    {
	        return sex;
	    }
	    public String getaddress()
	    {
	        return address;
	    }
	    public String getbirthday()
	    {
	        return birthday;
	    }
	    public String getdepartment()
	    {
	        return department;
	    }
	    public String address()
	    {
	        return address;
	    }
	    public String getduty()
	    {
	        return duty;
	    }
	    public String getsalary()
	    {
	        return salary;
	    }
	    public String gettel()
	    {
	        return tel;
	    }
	    public String getmotel()
	    {
	        return motel;
	    }
///ͨ��tostring()�������Խ���������ַ�����ʽ���
	    public String toString()
	    {
	        String information="ͬ��������"+name+"���ţ�"+code+"���ڲ��ţ�"+department+"�Ա�"+sex+"���ڵ�ַ��"+address+"�������£�"+birthday+"ְ��"+duty+"нˮ��"+salary+"��ϵ��ʽ��"+tel+"�ƶ��绰��"+motel;
	        return information;
	    }
}
