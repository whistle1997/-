package com.offcn.exam;
//������Ŀ�࣬ÿһ��item�������һ����Ŀ
public class Item {
	private String stem ; //��ʾ���
	private String A ;
	private String B ;
	private String C;
	private String D ;
	private String trueAnswer ;
	public Item(String stem , String A , String B , String C , String D , String trueAnswer){
		this.stem = stem ;
		this.A = A ;
		this.B = B ;
		this.C = C ;
		this.D = D ;
		this.trueAnswer = trueAnswer ;
	}
	public String getAnswer(){
		return trueAnswer ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stem + "\r\n" + A + "\r\n" + B + "\r\n" + C + "\r\n" + D;
	}

}
