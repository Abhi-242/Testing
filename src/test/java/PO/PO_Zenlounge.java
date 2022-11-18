package PO;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class PO_Zenlounge {
    
    WebDriver driver;
    public PO_Zenlounge(WebDriver driver)
    {
        this.driver = driver;
        
    }
    @FindBy(how=How.XPATH,using = "//input[@id='username']")
    WebElement username;
    
    @FindBy(how=How.XPATH,using = "//input[@id='password']")
    WebElement password;
    
    @FindBy(how=How.XPATH,using = "//input[@name='submit']")
    WebElement click;
    
    public void username1(String uname)
    {
        username.sendKeys(uname);
    }
    
    public void pass1(String pass)
    {
        password.sendKeys(pass);
    }
    
    public void click1()
    {
        password.sendKeys();
    }
    
    public void valid(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void invalid1(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void blank(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void invalid2(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void invalid3(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void invalid4(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void invalid5(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void invalid6(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void invalid7(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void invalid8(String uname,String pass)
    {
        try
        {
        username1(uname);
        pass1(pass);
        click1();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }



}