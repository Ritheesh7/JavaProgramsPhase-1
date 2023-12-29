package finalProject;
import java.util.ArrayList;
public class PrintAllShapes {

	public static void main(String[] args) {
		ArrayList<Shape> sh = new ArrayList<>();
		
		try {
		sh.add(new Rectangle(4,6));
		sh.add(new Square(-1));
		
		for(Shape shape: sh)
		{
			shape.displayArea();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("program executed Successfully");
		}
		
	}

}
