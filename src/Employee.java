 class identity {
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setId(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }
}
public class Employee
{
    public static void main(String[] args) {
        identity id1=new identity();
        id1.setName("Ritesh");
        System.out.println(id1.getName());
        id1.setId(6666);
        System.out.println(id1.getId());

    }
}
