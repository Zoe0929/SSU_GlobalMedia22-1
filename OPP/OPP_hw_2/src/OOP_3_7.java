public class OOP_3_7 {
    public static void main(String[] args) {
        int [] numArr=new int[10];
        int sum=0;
        System.out.print("랜던함 정수들 : ");
        for(int i=0;i<10;i++){
            numArr[i]=(int)(Math.random()*10+1);
            System.out.print(numArr[i]+" ");
            sum+=numArr[i];
        }
        System.out.println();
        System.out.println("평균은 "+sum/10);

    }
}
