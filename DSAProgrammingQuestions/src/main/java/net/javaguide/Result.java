/*
package net.javaguide;

import java.io.IOException;

class Result {

    */
/*
     * Complete the 'columnLabel' function below.
     *//*


    public static String columnLabel(int index) {

        int arr[] = new int[9999];
        int i =0;
        StringBuilder resultSet = new StringBuilder();
        while(index>0){
            arr[i] = index%26;
            index = index/26;
            i++;
        }
        for(int k=0;k<i-1;k++){
            if(arr[k]<=0){
                arr[k] = arr[k]+26;
                arr[k+1] = arr[k+1]-1;
            }
        }
        for(int k=i;k>=0;k--){
            if(arr[k]>0){
                resultSet.append((char)'A'+arr[k]-1);
            }
        }
        return resultSet.toString();
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {

    }
}*/
