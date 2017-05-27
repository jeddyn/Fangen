import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-27.
 */
public class PrintFangen {
    Scanner scanner;
    private int size, helpVar;
    private char tab[][];

    PrintFangen(int size, int helpVar, char tab[][]){
        this.helpVar =helpVar;
        this.size =size;
        this.tab=tab;

    }
    public void completeTabDot(char tab[][]){
        for(int i = 0; i < 2* size; i++)
        {
            for(int k = 0; k < 2* size; k++)
            {
                tab[i][k] = '.';
            }
        }
    }

    public void printLeft(){

            for(int i = 0, p = 0; i < size; i++,p++)
            {
                tab[size -p-1][size -p-1] = '*';
                for(int k = 1; k+p< size; k++)
                    tab[size -p-1-k][size -p-1] = '*';

                tab[size -p-1][size +p] = '*';
                for(int k = 1; k+p< size; k++)
                    tab[size -p-1][size +p+k] = '*';

                tab[size +p][size -p-1] = '*';
                for(int k = 1; k+p< size; k++)
                    tab[size +p][size -p-1-k] = '*';

                tab[size +p][size +p] = '*';
                for(int k = 1; k+p< size; k++)
                    tab[size +p+k][size +p] = '*';
        }

    }


    public void printRight(){
            for(int i = 0, p = 0; i < size; i++,p++)
            {
                tab[size -p-1][size -p-1] = '*';
                for(int k = 1; k + p < size; k++)
                    tab[size -p-1][size -p-1-k] = '*';

                tab[size -p-1][size +p] = '*';
                for(int k = 1; k+p< size; k++)
                    tab[size -p-1-k][size +p] = '*';

                tab[size +p][size -p-1] = '*';
                for(int k = 1; k+p< size; k++)
                    tab[size +p+k][size -p-1] = '*';

                tab[size +p][size +p] = '*';
                for(int k = 1; k+p< size; k++)
                    tab[size +p][size +p+k] = '*';
            }


    }
}
