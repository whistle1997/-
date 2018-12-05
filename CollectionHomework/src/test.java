import java.util.InputMismatchException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
				new View().UI();
			}catch(InputMismatchException e){
				System.out.println(" ‰»Î¿‡–Õ¥ÌŒÛ");
				new View().UI();
			}
		
	}

}
