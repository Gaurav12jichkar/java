class throwkeyword
{
 static void voting(int age)
    {
        if (age<18)
        {
            throw new ArithmeticException("You can not eligible for voting ");
        }
        else{
            System.out.println("you are eligible for voting");
        }
    }
    public static void main(String[] args) {
        voting(11);
    }
}