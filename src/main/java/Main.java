import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-19.
 */
public class Main {
    static int size=0,helpVar;
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
        helpVar = scanner.nextInt();

        if (helpVar >= -200 && helpVar <= 200) {
            if(helpVar==0) break;
            else size=Math.abs(helpVar); 

            PrintFangen printFangen = new PrintFangen(size,helpVar);
            showResult(printFangen.makeTab());
         }
    }
    }

    private static void showResult(char[][] tab) {
        for(int i = 0 ; i < 2*size ; i++)
        {
            for(int k = 0 ; k < 2*size ; k++)
            {
                System.out.print(tab[i][k]);
            }
            System.out.println();
        }
        System.out.println(" ");
    }
}

