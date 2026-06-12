public class Film03 {
    String kodefilm;
    String judul;
    String genre;
    double rating;

// Konstruktor default
public Film03(){
}

// Konstruktor dengan parameter
public Film03(String kodefilm, String judul, String genre, double rating) {
    this.kodefilm = kodefilm;
    this.judul = judul;
    this.genre = genre;
    this.rating = rating;
}

// Metode untuk menampilkan informasi film
void tampilInformasi() {
    System.out.println("Kode Film: " + kodefilm);
    System.out.println("Judul: " + judul);
    System.out.println("Genre: " + genre);
    System.out.println("Rating: " + rating);
    System.out.println();
}
}
