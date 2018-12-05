package err;
/*
 * sun提供了很多异常类，用于描述程序的不正常情况 ，但提供的异常类
 * 还不足以描述现实生活中所有不正常情况，那么这时候需要我们自定义异常类
 * 
 * 
 * 需求：模拟feiQ上线时没插网线，那么就抛出一个没插网线的异常，如果插上了
 * 那么正常显示好友列表
 * 
 * 自定义异常类的步骤
 * 	1、自定义一个类继承Exception即可
 * */

class NoIpException extends Exception{
	public NoIpException(String message){
		super(message);
	}
}
public class ZiDingYiException {
	public static void main(String[] args) {
		//String ip = "192.168.10.100";
		String ip = null;
		try{
			feiQ(ip);
		}catch(NoIpException e){
			e.printStackTrace();
			System.out.println("插上网线");
		}
	}
	public static void feiQ(String ip) throws NoIpException{
		if(ip == null){
			//抛出一个没有插上网线的异常
			//throw new 没网线异常（）；
			throw new NoIpException("来来来");
		}
		System.out.println("正常显示好友列表");
	}
}
