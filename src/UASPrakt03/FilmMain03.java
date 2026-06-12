public class FilmMain03 {
    public static void main(String[] args) {
        BinarySearchTreeFilm03 bst = new BinarySearchTreeFilm03(); 

        bst.add(new Film03("FL105", "Interstellar", "Sci-Fi", 8.6));
        bst.add(new Film03("FL102", "Coco", "Animation", 8.4));
        bst.add(new Film03("FL108", "Inception", "Sci-Fi", 8.8));
        bst.add(new Film03("FL101", "Up", "Animation", 8.3));
        bst.add(new Film03("FL104", "Parasite", "Thriller", 8.5));
        bst.add(new Film03("FL107", "Spirited Away", "Fantasy", 8.6));

        // Menampilkan seluruh data film menggunakan in order traversal
        System.out.println("\n=== Daftar seluruh data film (inOrder traversal) ===");
        System.out.println();
        bst.traverseInOrder(bst.root);

        // Menampilkan seluruh data film menggunakan pre order traversal
        System.out.println("\n=== Daftar seluruh data film (preOrder traversal) ===");
        System.out.println();
        bst.traversePreOrder(bst.root);

        // Melakukan pencarian kode film tertentu dan menampilkan hasilnya
        System.out.println("\n=== Pencarian kode film ===");
        System.out.println();

        System.out.print("Cari kode film: FL104 : ");
        String hasilCari = bst.find("FL104") ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari kode film: FL110 : ");
        hasilCari = bst.find("FL110") ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        // Menampilkan jumlah seluruh film yang ada di dalam binary search tree
        System.out.println("\n=== Tampilkan jumlah seluruh film ===");
        System.out.println();
        System.out.println("Jumlah film: " + bst.hitungJumlahFilm(bst.root));

        // Menampilkan data film dengan rating tertinggi
        System.out.println("\n=== Tampilkan data film dengan rating tertinggi ===");
        System.out.println();
        Film03 filmTertinggi = bst.cariRatingTertinggi(bst.root);
        
        // Menampilkan informasi film dengan rating tertinggi jika ada, atau menampilkan pesan jika tidak ada film dalam tree
        if (filmTertinggi != null) {
            System.out.println("Film dengan rating tertinggi:");
            filmTertinggi.tampilInformasi();
        } else {
            System.out.println("Tidak ada data film dalam tree.");
        }
    }
}
