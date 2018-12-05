package day25;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface House{
	void live();
}

class HouseKeeper implements House{
	public void live(){
		System.out.println("房子可以出租，住人");
	}
}

class LianJia implements InvocationHandler{
	private Object hk ;
	
	public Object realHouseKeeper(Object hk){
		this.hk = hk ;
		return Proxy.newProxyInstance(hk.getClass().getClassLoader(), hk.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		method.invoke(hk, args);
		return null;
	}
	
}

public class DongTaiDaili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LianJia lj = new LianJia();
		
		HouseKeeper hk = new HouseKeeper();
		House h = (House)lj.realHouseKeeper(hk);
		h.live();
	}

}
