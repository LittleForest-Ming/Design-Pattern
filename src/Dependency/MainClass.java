package Dependency;

public class MainClass {
public static void main (String[] argus) {
	AbstractSource source = new DatabaseSource();
	AbstractTransformer transformer = new XMLTransformer();
	source.source = "";
	transformer.transformer = "";
	System.out.println(source.source + "and" + transformer.transformer);
} 
}
