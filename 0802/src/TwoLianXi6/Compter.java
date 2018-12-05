package TwoLianXi6;

public class Compter {
	public void useUSB(USB u){
		if(u instanceof Mp3){
			Mp3 m = (Mp3)u;
			m.work();
		}else if(u instanceof Upan){
			Upan p = (Upan)u;
			p.work();
		}
	}
}
