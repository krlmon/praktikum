
package SI_GudangSepatu90476;
import Menu90476.Menu90476;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author GENESIS
 */
public class SI_GudangSepatu90476 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int pil;
        do{
        Menu90476.menuUtama90476();
            pil = scan.nextInt();
            switch(pil){
                case 1:
                    Menu90476.menuTambah90476();
                    break;
                case 2:
                   Menu90476.menuUbah90476();
                    break;
                case 3:
                   Menu90476.menuHapus90476();
                  break;
                case 4:
                   Menu90476.showData90476();
                  break;
                case 5:
                    //
                }
    }while(pil != 5);
      
    }
    
    
}
