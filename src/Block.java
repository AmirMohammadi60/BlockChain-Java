
import java.util.Arrays;


public class  Block {
   private int previosHash;
   private String[] transactions;
   private int blockHash;
   
   public Block( int previosHash, String[] transactions){
    this.previosHash = previosHash;
    this.transactions = transactions;
     Object[]   contens = {Arrays.hashCode(transactions), previosHash};
     this.blockHash = Arrays.hashCode(contens);
   }
   public int getPerviosHash(){
   return previosHash;
   }
   public String[] getTrnsactions(){
      return  transactions;
   }
   public int getHashBlock(){
   return blockHash;
   }
}
