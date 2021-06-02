import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayDemo2
{
public static void main(String[] args)
{
String sa[] = { "A","B","C","D"};
System.out.println("Intial Array:\n "+ Arrays.toString(sa));
String ne = "G";
List<String> l = new ArrayList<String>(Arrays.asList(sa));
l.add(ne);
sa = l.toArray(sa);
System.out.println("Arrayswith added value: \n"+ Arrays.toString(sa));
}
}
