public class VectorHelper {

    private int[] vector;
    private int size;
    private int max;
    private int min;

    public VectorHelper(int[] vector) {
        this.size = vector.length;
        this.vector = vector;
    }
   
    public int[] sortVector(){
        int i = 0;
        while ( i < vector.length ){
            int index = i;
            int min = vector[i];
            for (int j=i; j<vector.length; j++){
                if ( vector[j] < min){
                    min = vector[j];
                    index = j;
                }
            }
            int s = vector[i];
            vector[i] = vector[index];
            vector[index] = s;
            i++;
        }
        return vector;
    }

    public int[] addVector( int[] vector2 ) throws diffrentLenghtException{
        int[] result = new int[size];
        if ( vector.length != vector2.length ) throw new diffrentLenghtException();
        else {
            for (int i=0; i<vector.length; i++){
                result[i] = vector2[i] + vector[i];
            }
        }
        return result;
    }

    public int[] invertVector(){
        int j = vector.length - 1;
        int s;
        for (int i=0; i<vector.length/2; i++){
            s = vector[i];
            vector[i] = vector[j];
            vector[j] = s;
            j--;
        }
        return vector;
    }

    public void getMinAndMax(){
        int min = vector[0];
        int max = min;
        for (int i=0; i<vector.length; i++){
            if (vector[i] > max) max = vector[i];
            if (vector[i] < min) min = vector[i];
        }
        System.out.println("Max : "+max+" | Min : "+min);
        this.min=min;
        this.max=max;
    }

    public int[] changeVector(){
        int[] result = new int[size];
        for (int i=0; i<vector.length; i++){
            result[i] = modifie(vector[i]);
        }
       return result;
    }

    public int modifie(int val){
        val = val*2 - 1;
        return val;
    }

    public int getMax(){
        return this.max;
    }
    
    public int getMin(){
        return this.min;
    }


    
}
