class outer1
{
private static String s="kkjksadhkj";
class inner
{
void display()
{
System.out.println("My name is:-"+s);
}
Static void show()
{
System.out.println("I am static function");
}
}
public static void main(String args[])
{
outer1.inner uk=new outer1.inner();
uk.display();
inner.show();
}
}