import java.io.FileInputStream;
class ukinput
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("E:\\FileK17UK\\mynewfile.doc");
int i=fin.read();
System.out.println((char)i);
System.out.println(fin.read());
System.out.println((char)fin.read());
int x=fin.available();
System.out.println("Number of bytes available:- "+x);
long l=fin.slip(1010);
System.out.println((char)l);
System.out.println("Current Object:-"+fin.getChannel());
System.out.println("Machine Specific Information :-",fin.getFD());}
catch(Exception e)
{System.out.println(e);}
}
}
}