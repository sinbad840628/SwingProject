package com.swing.chapter20;


public class company 
{
	 String name;//同事的姓名
	 String code;//同事的工号
	 String birthday;//同事的生日
	 String sex;//同事的性别
	 String address;//同事的家庭地址
	 String duty;//同事的职务
	 String salary;//同事的薪水
	 String tel;//同事的联系电话
	 String motel;//同事的移动电话
	 String department;//同事的所在部门
///通过构造器来给姓名变量赋值
	  company(String name)
	   {
	     this.name=name;
	   }
	   public String getname()
	   {
	     return name;
	   }
///通过设置器和获取器来为其余变量赋值
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
///通过tostring()方法可以将类对象以字符串形式输出
	    public String toString()
	    {
	        String information="同事姓名："+name+"工号："+code+"所在部门："+department+"性别："+sex+"所在地址："+address+"出生年月："+birthday+"职责："+duty+"薪水："+salary+"联系方式："+tel+"移动电话："+motel;
	        return information;
	    }
}
