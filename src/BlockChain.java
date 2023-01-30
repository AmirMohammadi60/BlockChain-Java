
import java.util.ArrayList;
public class BlockChain {
    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) {
        String[]  genesisTransactions = {"Satoshi sent a 10012 BTC to Amir"," Amir send 0,5 BTC to Sara"}; 
        Block genesisBlock = new Block(0, genesisTransactions);
        System.out.print("Hash of gebesisBlock: ");
        System.out.format("[%d]\n",genesisBlock.getHashBlock());
        
         String[] block2Transactions = {"Sara send 0,5 BTC to Amir", "Amir send 5 BTC to Satoshi"};
         Block block2 = new Block(genesisBlock.getHashBlock(), block2Transactions);
         System.out.print("Hash of Block 2: ");
         System.out.format("[%d]\n",block2.getHashBlock());
         
          String[] block3Transactiion = {" Amir send 2 BTC to Jefri","Jefri send 1 BTC Rami"};
          Block block3 = new Block(block2.getHashBlock(),block3Transactiion);
          System.out.print("Hash of Block 3: ");
          System.out.format("[%d]\n",block3.getHashBlock());
          
          
      
         
         
    }
    
}
