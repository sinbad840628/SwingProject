///同学类的设计
public class classmate 
{
	 String name;//同学的姓名
	 String sex;//同学的性别
	 String homephone;//同学的家庭电话
	 String address;//同学的现在地址
	 String company;//同学所在的公司
	 String duty;//同学在公司里的职务
	 String salary;//同学的薪水
	 String contact;//同学的个人联系方式
	 String homeaddress;//同学老家地址
	 String city;
	 String interesting;
///通过带参数的构造器来将姓名变量赋值
	  classmate(String name)
	 {
	     this.name=name;
	 }
	 public String getname()
	 {
	     return name;
	 }
///通过设置器（SET）和获取器（GET）来为其余几个变量赋值
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
///通过tostring()方法可以将类对象以字符串形式输出，在本系统中此方法可以不需要，列在这里只是让读者能够熟悉它的用法。
	    public String toString()
	    {
	        String information="同学姓名："+name+"性别："+sex+"所在地址："+address+"家庭地址："+homeaddress+"所在城市："+city+"所在公司："+company+"职责："+duty+"薪水："+salary+"联系方式："+contact+"家庭电话："+homephone+"爱好兴趣："+interesting;
	        return information;
	    }
}
