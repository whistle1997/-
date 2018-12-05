package com.wsl.control;


import java.util.List;
import java.util.Scanner;

import com.wsl.bean.Car;
import com.wsl.bean.Goods;
import com.wsl.bean.Orders;
import com.wsl.bean.Person;
import com.wsl.dao.CarDao;
import com.wsl.dao.PersonDao;
import com.wsl.impl.CarDaoImpl;
import com.wsl.impl.PersonDaoImpl;
import com.wsl.service.GoodsService;
import com.wsl.service.OrdersService;
import com.wsl.service.PersonService;
import com.wsl.service.impl.GoodsServiceImpl;
import com.wsl.service.impl.OrdersServiceImpl;
import com.wsl.service.impl.PersonServiceImpl;
import com.wsl.util.IDutil;
import com.wsl.util.MyDateFatmet;
import com.wsl.util.UUIDUtil;

public class Main {
	static PersonService ps = new PersonServiceImpl();
	static Scanner in = new Scanner(System.in);
	static GoodsService gs = new GoodsServiceImpl();
	static OrdersService os = new OrdersServiceImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addPC();
		login();
		
	}
	
	public static void addPC(){
		Person per = new Person();
		per.setId(IDutil.getID());
		per.setName("李四");
		per.setAddress("重庆");
		per.setBirthday(MyDateFatmet.getDate("1998-01-20"));
		per.setAge(1000);
		

		
		Car car = new Car();
		car.setCid(per.getId());
		car.setCdis(per.getName()+"的购物车");
		
		per.setCar(car);
		
		ps.addPeron(per);
//		pd.deletePerson(1);
//		pd.updatePerson(per);
//		List<Person> list = pd.getAllInfo();
//		for(Person p : list)
//			System.out.println(p);
	}

	public static void login(){
		System.out.println("请输入您的登录id：");
		int pid = in.nextInt();
		System.out.println("-----------------商品列表-----------------");
		Person per = ps.getPerson(pid);
		if(per != null){
			
			gs.GoodsList();
				
			System.out.println("选择您要购买的商品id：");
			int gid = in.nextInt();
			System.out.println("输入购买个数:");
			int count = in.nextInt();
			Orders ord = new Orders();
			ord.setOid(UUIDUtil.getUUID());
			ord.setOdis(per.getName()+"购买了"+gs.GoodsName(gid));
			ord.setCount(count);
			ord.setPer(per);
			os.addOrders(ord,gid);
		}else{
			System.out.println("用户不存在");
			login();
		}
	}
}
