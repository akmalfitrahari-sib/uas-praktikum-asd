public class NodeFilm03 {
    Film03 data;
    NodeFilm03 left;
    NodeFilm03 right;

    // Konstruktor default
    public NodeFilm03() {
    }

    // Konstruktor dengan parameter
    public NodeFilm03(Film03 data) {
        this.data = data;
        left = right = null; // Inisialisasi left dan right dengan null
    }
}
