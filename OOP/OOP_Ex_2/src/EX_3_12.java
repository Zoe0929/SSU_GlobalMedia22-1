public class EX_3_12
{
    static int[] makeArray(){
        int[] temp= new int[4];
        for(int i=0;i<temp.length;i++){
            temp[i]=i;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] intArray=makeArray();
        for(int prInt:intArray){
            System.out.print(prInt+" ");
        }
    }
}
