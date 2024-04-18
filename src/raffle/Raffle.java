package raffle;

import java.util.HashSet;
import java.util.Random;

public class Raffle {

    public static void main(String[] args)
    {
      int x = 0;

      HashSet<Integer> conjunto = new HashSet<>();
        
      while(x < 5)
      {
        x++;
        Random generate = new Random();
        int number = generate.nextInt(60);
        // Conjunto para armazenar os números únicos
        conjunto.add(number);
        if(conjunto.size() < 5)
        {
        conjunto.add(number);
           
        }

        
        
      }
      System.out.println(conjunto);
    
     
      
    }

}

