public class friend 
{
	 String name;///朋友姓名
	 String sex;///朋友的性别
	 String birthday;///朋友的出生日期
	 String address;///朋友的居住地址
	 String company;///朋友所在公司
	 String duty;///朋友在公司所任职务
	 String salary;///朋友的薪水
	 String tel;///朋友的电话号码
	 String phone;///朋友的手机号码
///通过构造器来给姓名变量赋值
	  friend(String name)
	 {
	     this.name=name;
	 }
	 public String getname()
	 {
	     return name;
	 }
///通过设置器和获取器为其余变量赋值
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
///通过tostring()方法可以让类对象以字符串形式输出
	    public String toString()
	    {
	        String information="朋友姓名："+name+"性别："+sex+"家庭地址："+address+"出生年月："+birthday+"所在公司："+company+"职责："+duty+"薪水："+salary+"联系方式："+tel+"家庭电话："+phone;
	        return information;
	    }
}
