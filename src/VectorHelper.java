public class VectorHelper {

    private int[] vector;
    private int size;

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
    
}
