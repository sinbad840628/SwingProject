public class friend 
{
	 String name;///��������
	 String sex;///���ѵ��Ա�
	 String birthday;///���ѵĳ�������
	 String address;///���ѵľ�ס��ַ
	 String company;///�������ڹ�˾
	 String duty;///�����ڹ�˾����ְ��
	 String salary;///���ѵ�нˮ
	 String tel;///���ѵĵ绰����
	 String phone;///���ѵ��ֻ�����
///ͨ����������������������ֵ
	  friend(String name)
	 {
	     this.name=name;
	 }
	 public String getname()
	 {
	     return name;
	 }
///ͨ���������ͻ�ȡ��Ϊ���������ֵ
	 public void setsex(String sex)
	    {
	        this.sex=sex;
	    }
	    public void setbirthday(String birthday)
	    {
	        this.birthday=birthday;
	    }
	    public void setaddress(String address)
	    {
	        this.address=address;
	    }
	    public void setcompany(String company)
	    {
	        this.company=company;
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
	    public void setphone(String phone)
	    {
	    	this.phone=phone;
	    }
	    public String getsex()
	    {
	        return sex;
	    }
	    public String getbirthday()
	    {
	        return birthday;
	    }
	    public String getaddress()
	    {
	        return address;
	    }
	    public String getcompany()
	    {
	        return company;
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
	    public String getphone()
	    {
	        return phone;
	    }
///ͨ��tostring()������������������ַ�����ʽ���
	    public String toString()
	    {
	        String information="����������"+name+"�Ա�"+sex+"��ͥ��ַ��"+address+"�������£�"+birthday+"���ڹ�˾��"+company+"ְ��"+duty+"нˮ��"+salary+"��ϵ��ʽ��"+tel+"��ͥ�绰��"+phone;
	        return information;
	    }
}
