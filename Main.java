package dsa;
import java.util.*;
class Main {
    public static int minimumIndex(List<Integer> nums) {
        int dominant = findDominantElement(nums);
        if (dominant == -1) return -1;

        int leftCount = 0, totalDominantCount = 0;
        for (int num : nums) {
            if (num == dominant) {
                totalDominantCount++;
            }
        }

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == dominant) {
                leftCount++;
            }

            int leftSubarrayCount = leftCount;
            int rightSubarrayCount = totalDominantCount - leftCount;

            if (leftSubarrayCount > (i + 1) / 2 &&
                    rightSubarrayCount > (nums.size() - i - 1) / 2) {
                return i;
            }
        }

        return -1;
    }

    static int findDominantElement(List<Integer> arr) {
        int candidate = -1, count = 0;

        // Boyer-Moore Majority Vote algorithm
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        int totalCount = 0;
        for (int num : arr) {
            if (num == candidate) {
                totalCount++;
            }
        }

        return (totalCount > arr.size() / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(1);
        l.add(3);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(7);
        l.add(1);
        l.add(2);
        l.add(1);
        int ans=minimumIndex(l);
        System.out.println("answer :"+ans);
    }
}