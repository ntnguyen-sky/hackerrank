package Top150;

public class Test {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Chỉ số cuối cùng của nums1 sau khi trộn
        int last = m + n - 1;
        
        // Chỉ số cuối cùng của mảng nums1 và nums2
        int i = m - 1;
        int j = n - 1;
        
        // Trộn mảng từ cuối đến đầu
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[last] = nums1[i];
                i--;
            } else {
                nums1[last] = nums2[j];
                j--;
            }
            last--;
        }
        
        // Nếu còn phần tử trong nums2 thì chép vào nums1
        while (j >= 0) {
            nums1[last] = nums2[j];
            j--;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {6, 12, 3, 7, 0, 0, 0}; // Đã mở rộng độ dài để chứa kết quả
        int m = 4;
        int[] nums2 = {5, 4, 1, 20, 22};
        int n = 5;

        merge(nums1, m, nums2, n);

        // In kết quả mảng nums1 sau khi trộn
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

}
