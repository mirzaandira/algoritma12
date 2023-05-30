public class LinearSearchNumber {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Mengembalikan indeks jika data ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika data tidak ditemukan
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 10, 13, 18, 20};
        int searchKey = 13;
        int result = linearSearch(numbers, searchKey);
        
        if (result == -1) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Data ditemukan pada indeks ke-" + result);
        }
    }
}
