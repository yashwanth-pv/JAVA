   class Functions_without_parameters
{
    public static void add()
    {
        int a = 10;
        int b = 18;
        System.out.println(a + b);
    }

    public static void main(String[] args)
    {
        add();
    }
}

  class Functions_with_parameters
{
    public static void subtract(int a, int b)
    {
        System.out.println(a - b);
    }

    public static void main(String[] args)
    {
        subtract(10, 8);
    }
}
