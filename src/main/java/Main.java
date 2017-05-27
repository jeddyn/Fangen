import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-19.
 */
public class Main {
    public static void main(String[] args) {
    int size=0,helpVar,tabSize;

    Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
        helpVar = scanner.nextInt();

        if (helpVar >= -200 && helpVar <= 200) {
            if (helpVar > 0)
                    size=helpVar;
             else if (helpVar < 0)
                size = helpVar*(-1);
            else break;

             tabSize = size*2;
            char tab[][] = new char[tabSize][tabSize];
            PrintFangen printFangen = new PrintFangen(size,helpVar,tab);
            printFangen.completeTabDot(tab);

               if(helpVar<0)
                   printFangen.printLeft();

                if(helpVar>0)
                   printFangen.printRight();

                showResult(size, tab);
         }
    }
    }

    private static void showResult(int size, char[][] tab) {
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

