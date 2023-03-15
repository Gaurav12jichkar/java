class newarray
{ 
    
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6};
       int min,max;
       min=max=number[0];
        for(int i=0;i<number.length;i++)
        {
            
      if (number[i]<min)
      {
        min=number[i];
        
      }
      if(number[i]>max)
      {
        max=number[i];
        
    }
        }
   
        System.out.println(min);
        System.out.println(max);
    }
}