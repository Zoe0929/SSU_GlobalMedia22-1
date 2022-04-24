class Song
{
    String title;
    String  artist;
    int year;
    String country;

    public Song(){
    }
    public Song(String title, String artist, int year, String country){

        this.artist=artist;
        this.title=title;
        this.year=year;
        this.country=country;
    }
    void show(){
        System.out.println(year+"년"+ country+"국적의 "+"노래 제목은 "+ title+"가수 이름은 "+artist);
    }


    public static void main(String[] args) {
        Song song= new Song("Dancing Queen","ABBA",1978,"스웨덴");
        song.show();
        Car car = new Car();
    }
}

class Car{
    public Car(){

    }
}
