import java.io.*;
import java.util.*;

class Sorting{
    public static void main(String args[]) {
       int arr[] = new int[]{15,16,27,27,28,15};
       int n= arr.length;
       countF(arr,n);

    }
    static void countF(int arr[],int n){
        HashMap<Integer,Integer> result= new HashMap<Integer,Integer >();
        for(int i= 0 ; i<n; i++){
            if(result.containsKey(arr[i])){ 
            result.put(arr[i],result.get(arr[i]+1));

        }
    }
        else
        {
            result.put(arr[i],1);
        }
     
    
      for(Map.Entry<Integer,Integer > 1 , result.entrySet())  
      {
          System.out.println(i.getKey()+ " "+ i.getValue());
     }
}





