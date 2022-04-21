public class Add {
    public static void main(String[] args) {
        int sum=0, num;
        for (int i=0;i<args.length;i++){
            try
            {
             num=Integer.parseInt(args[i]);
             sum+=num;
            }
            catch (NumberFormatException e)
            {
            }
        }
        System.out.println(sum);
    }
}
