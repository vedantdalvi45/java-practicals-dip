interface NewShape{
    void draw();
}

interface Circle  {
    void getRadius();
    int radious=10;
}
class NewCircle implements Circle,NewShape{
    public void draw() {};
    public void getRadius()
    {
        System.out.println(radious);
    }
}
class ExtendInterface extends NewCircle
{
    public static void main(String args[])
    {
        NewCircle nc=new NewCircle();
        nc.getRadius();
    }
}