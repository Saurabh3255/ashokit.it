package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.bean.Car;

public class App 
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		Car car=context.getBean(Car.class);
     	car.drive();
		
	}
}
