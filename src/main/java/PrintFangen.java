/**
 * Created by Mateusz on 2017-05-27.
 */
public class PrintFangen {
    private int size, helpVar;
    private char tab[][];

    PrintFangen(int size, int helpVar){
        this.helpVar =helpVar;
        this.size =size;
        int tabSize = size*2;
        this.tab=new char[tabSize][tabSize];
    }

    public char[][] makeTab(){
        completeTabDot();

        if(this.helpVar > 0){
            printRight();
        }else if(this.helpVar < 0){
            printLeft();
        }

        return this.tab;
    }

    private char[][] completeTabDot(){
        for(int i = 0; i < 2* this.size; i++)
        {
            for(int k = 0; k < 2* this.size; k++)
            {
                this.tab[i][k] = '.';
            }
        }
        return this.tab;
    }

    private void printLeft(){

            for(int i = 0, p = 0; i < this.size; i++,p++)
            {
                tab[this.size -p-1][this.size -p-1] = '*';
                for(int k = 1; k+p< size; k++)
                    tab[this.size -p-1-k][this.size -p-1] = '*';

                tab[this.size -p-1][this.size +p] = '*';
                for(int k = 1; k+p< this.size; k++)
                    tab[this.size -p-1][this.size +p+k] = '*';

                tab[this.size +p][this.size -p-1] = '*';
                for(int k = 1; k+p< this.size; k++)
                    tab[this.size +p][this.size -p-1-k] = '*';

                tab[this.size +p][this.size +p] = '*';
                for(int k = 1; k+p< this.size; k++)
                    tab[this.size +p+k][this.size +p] = '*';
        }

    }


    private void printRight(){
            for(int i = 0, p = 0; i < this.size; i++,p++)
            {
                tab[this.size -p-1][this.size -p-1] = '*';
                for(int k = 1; k + p < this.size; k++)
                    tab[this.size -p-1][this.size -p-1-k] = '*';

                tab[this.size -p-1][this.size +p] = '*';
                for(int k = 1; k+p< this.size; k++)
                    tab[this.size -p-1-k][this.size +p] = '*';

                tab[this.size +p][this.size -p-1] = '*';
                for(int k = 1; k+p< this.size; k++)
                    tab[this.size +p+k][this.size -p-1] = '*';

                tab[this.size +p][this.size +p] = '*';
                for(int k = 1; k+p< this.size; k++)
                    tab[this.size +p][this.size +p+k] = '*';
            }


    }
}
