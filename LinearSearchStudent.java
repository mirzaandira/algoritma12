public class LinearSearchStudent {
    public static void linearSearch(String[] names, int[] nim, String[] address, String key) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(key)) {
                System.out.println(nim[i] + " - " + names[i] + " - " + address[i] + " - Data nomor " + (i + 1));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data yang Anda cari tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        String[] names = {"Andri Hariadi", "Dewi Lestari", "Dewi Agustin", "Reni Indrayanti", "Toni Sukmawan", "Toni Gunawan"};
        int[] nim = {1102021, 1102021, 1102023, 1102024, 1102025, 1102026};
        String[] address = {"BANDUNG", "SURABAYA", "MALANG", "MALANG", "SURABAYA", "BANDUNG"};

        String searchKey = "Toni";
        linearSearch(names, nim, address, searchKey);
    }
}
