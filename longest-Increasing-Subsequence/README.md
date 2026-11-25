# Longest Increasing Subsequence (LIS) - Java

Chương trình giải bài toán **Dãy con đơn điệu tăng dài nhất (Longest Increasing Subsequence)** bằng phương pháp **Quy hoạch động (Dynamic Programming)** viết bằng ngôn ngữ Java.

## Mô tả bài toán

Cho một mảng số nguyên `nums`, tìm độ dài của dãy con tăng dài nhất. Dãy con được tạo bằng cách xóa một số (hoặc không xóa) phần tử từ mảng ban đầu mà không làm thay đổi thứ tự của các phần tử còn lại.

**Ví dụ:**
* **Input:** `nums = [10, 9, 2, 5, 3, 7, 101, 18]`
* **Output:** `4`
* **Giải thích:** Dãy con tăng dài nhất là `[2, 3, 7, 101]` hoặc `[2, 3, 7, 18]`, có độ dài là `4`.

## Thuật toán (Quy hoạch động)

* **Trạng thái:** `dp[i]` là độ dài dãy con tăng dài nhất kết thúc tại vị trí `i`.
* **Khởi tạo:** `dp[i] = 1` với mọi `i` (mỗi phần tử tự tạo thành một dãy con độ dài 1).
* **Công thức chuyển trạng thái:** Với mỗi `i` và mọi `j < i`:
  * Nếu `nums[j] < nums[i]`, cập nhật `dp[i] = Math.max(dp[i], dp[j] + 1)`.
* **Kết quả:** Giá trị lớn nhất trong mảng `dp`.

## Độ phức tạp

* **Thời gian:** $O(n^2)$ (hai vòng lặp lồng nhau).
* **Không gian:** $O(n)$ (lưu trữ mảng `dp`).

## Cấu trúc thư mục

```text
.
├── src/
│   └── LongestIncreasingSubsequence.java
└── README.md