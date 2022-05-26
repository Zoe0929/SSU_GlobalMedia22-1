abstract class PariMap{
    protected String keyArray [];
    protected  String valueArray[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PariMap{
    private int cnt;
    public Dictionary(int num){
        this.cnt=0;
        keyArray=new String[num];
        valueArray=new String[num];
    }
    @Override
    String get(String key) {
        for(int i=0;i<keyArray.length;i++){
            if(key.equals(keyArray[i])){
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for(int i =0;i< keyArray.length;i++){
            if(key.equals(keyArray[i])){
                keyArray[i]=key;
                valueArray[i]=value;
                return;
            }
        }
        keyArray[cnt]=key;
        valueArray[cnt]=value;
        cnt++;
        return;
    }

    @Override
    String delete(String key) {
        String s;
        for(int i=0;i<keyArray.length;i++){
            if(key.equals(keyArray[i])){
                s=valueArray[i];
                keyArray[i]=null;
                valueArray[i]=null;
                return s;
            }
        }
        return null;
    }

    @Override
    int length() {
        return this.cnt;
    }
}


public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic= new Dictionary(10);
        dic.put("황기태","자바");
        dic.put("이재문","파이선");
        dic.put("이재문","c++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+dic.get("황기태"));
    }

}
