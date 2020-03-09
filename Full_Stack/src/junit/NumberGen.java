package junit;

import java.util.Random;

 class NumberGen {
	Random rand=new Random();
   public  int getRand(int i) {
	   return rand.nextInt(100);
   }
}
