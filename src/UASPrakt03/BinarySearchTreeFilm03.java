public class BinarySearchTreeFilm03 {
    NodeFilm03 root;

    // Konstruktor default
    public BinarySearchTreeFilm03() {
        root = null; // Inisialisasi root dengan null
    }
    
    // Metode untuk memeriksa apakah binary search tree kosong
    boolean isEmpty() {
        return root == null;
    }

    // Metode untuk menambahkan data film ke dalam binary search tree
    public void add(Film03 film) {
        NodeFilm03 newNode = new NodeFilm03();
        if(isEmpty()) {
            newNode.data = film;
            root = newNode;
        } else {
            NodeFilm03 current = root;
            NodeFilm03 parent = null;
            while(true) {
                parent = current;
                if(film.rating < current.data.rating) {
                    current = current.left;
                    if(current == null) {
                        newNode.data = film;
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if(current == null) {
                        newNode.data = film;
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Metode untuk mencari kode film tertentu
    boolean find(String kodefilm) {
        return findRekursif(root, kodefilm);
    }
    
    // Metode rekursif untuk mencari kode film
    boolean findRekursif(NodeFilm03 node, String kodefilm) {
        if(node == null) {
            return false; // Return false jika mencapai node null (tidak ditemukan)
        }
        if(node.data.kodefilm.equals(kodefilm)) {
            return true; // Return true jika kode film ditemukan
        }
        // Mencari di kedua sub pohon karena kode film tidak dijamin terurut berdasarkan rating
        return findRekursif(node.left, kodefilm) || findRekursif(node.right, kodefilm); 
    }

    // Metode untuk menampilkan seluruh data film menggunakan in order traversal
    void traverseInOrder(NodeFilm03 node) {
        if(node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    // Metode untuk menampilkan seluruh data film menggunakan pre order traversal
    void traversePreOrder(NodeFilm03 node) {
        if(node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Metode untuk menghitung jumlah seluruh film dalam binary search tree
    int hitungJumlahFilm(NodeFilm03 node) {
        if(node == null) {
            return 0;
        } else {
            int leftCount = hitungJumlahFilm(node.left); // Hitung jumlah film di sub pohon kiri
            int rightCount = hitungJumlahFilm(node.right); // Hitung jumlah film di sub pohon kanan
            return leftCount + rightCount + 1; // Total jumlah film adalah jumlah film kiri + jumlah film kanan + 1 (untuk node saat ini)
        }
    }

    // Metode untuk mencari film dengan rating tertinggi
    Film03 cariRatingTertinggi(NodeFilm03 node) {
        if(node == null) {
            return null;
        } else {
            Film03 leftMax = cariRatingTertinggi(node.left); // Cari film dengan rating tertinggi di sub pohon kiri
            Film03 rightMax = cariRatingTertinggi(node.right); // Cari film dengan rating tertinggi di sub pohon kanan
            Film03 currentMax = node.data; 

            // Bandingkan rating film saat ini dengan rating tertinggi dari sub pohon kiri dan kanan
            if(leftMax != null && leftMax.rating > currentMax.rating) {
                currentMax = leftMax;
            }
            if(rightMax != null && rightMax.rating > currentMax.rating) {
                currentMax = rightMax;
            }
            return currentMax;
        }
    }
}
