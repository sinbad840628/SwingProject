///ͬѧ������
public class classmate 
{
	 String name;//ͬѧ������
	 String sex;//ͬѧ���Ա�
	 String homephone;//ͬѧ�ļ�ͥ�绰
	 String address;//ͬѧ�����ڵ�ַ
	 String company;//ͬѧ���ڵĹ�˾
	 String duty;//ͬѧ�ڹ�˾���ְ��
	 String salary;//ͬѧ��нˮ
	 String contact;//ͬѧ�ĸ�����ϵ��ʽ
	 String homeaddress;//ͬѧ�ϼҵ�ַ
	 String city;
	 String interesting;
///ͨ���������Ĺ�������������������ֵ
	  classmate(String name)
	 {
	     this.name=name;
	 }
	 public String getname()
	 {
	     return name;
	 }
///ͨ����������SET���ͻ�ȡ����GET����Ϊ���༸��������ֵ
	 public void setcity(String city)
	 {
		 this.city=city;
	 }
	 public void sethomeaddress(String homeaddress)
	 {
		 this.homeaddress=homeaddress;
	 }
	 public void setcontact(String contact)
	 {
		 this.contact=contact;
	 }
	 public void setinteresting(String interesting)
	 {
		 this.interesting=interesting;
	 }
	 
	 public void setsexy(String sex)
	    {
	        this.sex=sex;
	    }
	    public void sethomephone(String homephone)
	    {
	        this.homephone=homephone;
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
	    public String getsex()
	    {
	        return sex;
	    }
	    public String gethomeaddress()
	    {
	        return homeaddress;
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
	    public String getcontact()
	    {
	        return contact;
	    }
	    public String gethomephone()
	    {
	        return homephone;
	    }
	    public String getcity()
	    {
	    	return city;
	    }
///ͨ��tostring()�������Խ���������ַ�����ʽ������ڱ�ϵͳ�д˷������Բ���Ҫ����������ֻ���ö����ܹ���Ϥ�����÷���
	    public String toString()
	    {
	        String information="ͬѧ������"+name+"�Ա�"+sex+"���ڵ�ַ��"+address+"��ͥ��ַ��"+homeaddress+"���ڳ��У�"+city+"���ڹ�˾��"+company+"ְ��"+duty+"нˮ��"+salary+"��ϵ��ʽ��"+contact+"��ͥ�绰��"+homephone+"������Ȥ��"+interesting;
	        return information;
	    }
}
