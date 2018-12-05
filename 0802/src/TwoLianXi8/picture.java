package TwoLianXi8;

import org.omg.Messaging.SyncScopeHelper;

public class picture {
	private String name ;

	public picture(String name) {
		super();
		this.name = name;
	}
	public void print(){
		System.out.println(name+ new phone().TakePhoto() + "," + new Cam().TakePhoto() + "," + new ipad().TakePhoto());
	}
}
