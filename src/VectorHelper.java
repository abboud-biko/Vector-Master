/**
 * The VectorHelper class offers some methods helping to manipulate vectors
 * such as sorting and inverting.
 */
public class VectorHelper {
    /**
     * the manipulated vector
     */
    private int[] vector;
    /**
     * the size of the vector
     */
    private int size;
    /**
     * the maximum value of the vector
     */
    private int max;
    /**
     * the minimum value of the vector
     */
    private int min;

    /**
     *  constructor for initialising the vector and its size
     * @param vector the manipulated vector
     */
    public VectorHelper(int[] vector) {
        this.size = vector.length;
        this.vector = vector;
    }

    /**
     * sort the vector
     * @return sorted vector
     */
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

    /**
     * add the two vectors
     * @param vector2 the second vector to add
     * @return the sum of the two vectors
     * @throws differentLengthException if the size of the two vectors not equals
     */
    public int[] addVector( int[] vector2 ) throws differentLengthException{
        int[] result = new int[size];
        if ( vector.length != vector2.length ) throw new differentLengthException();
        else {
            for (int i=0; i<vector.length; i++){
                result[i] = vector2[i] + vector[i];
            }
        }
        return result;
    }

    /**
     * invert the vector
     * @return the inverted vector
     */
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

    /**
     * find and show the min and max values from the vector
     */
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

    /**
     * modify the values of the vectors by a specific function
     * @return modified vector
     */
    public int[] changeVector(){
        int[] result = new int[size];
        for (int i=0; i<vector.length; i++){
            result[i] = modifie(vector[i]);
        }
       return result;
    }

    /**
     * modify the value
     * @param val the value to modify
     * @return the modified value
     */
    public int modifie(int val){
        val = val*2 - 1;
        return val;
    }

    /**
     * get the maximum value of the vector
     * @return maximum value of the vector
     */
    public int getMax(){
        return this.max;
    }

    /**
     * get the minimum value of the vector
     * @return minimum value of the vector
     */
    public int getMin(){
        return this.min;
    }

    public void setVector(int[] vector){
        this.size = vector.length;
        this.vector = vector;
        
    }
   
    public int[] getVector(){
        return this.vector;
    }

    
}
