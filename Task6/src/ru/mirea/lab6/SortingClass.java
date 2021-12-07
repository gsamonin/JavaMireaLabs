package ru.mirea.lab6;
import java.util.Arrays;
import java.util.Comparator;
public class SortingClass {

    public int compare(Student o1, Student o2) {
        if(o1.getPoint() > o2.getPoint()){
            return 1;
        }
        else if(o1.getPoint() < o2.getPoint()){
            return -1;
        }
        else {
            return 0;
        }
    }
    public Student[] quickSort(Student[] source, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        Student pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (compare(source[leftMarker], pivot) == -1) {
                leftMarker++;
            }
            while (compare(source[rightMarker], pivot) == 1) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < right) {
            quickSort(source, leftMarker, right);
        }
        if (left < rightMarker) {
            quickSort(source, left, rightMarker);
        }
        return source;
    }
    public Student[] SortUnsorted(Student[] a, int lo, int hi) {
        if (hi <= lo)
            return a;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);
        Student[] std = Arrays.copyOf(a, a.length);
        for (int k = lo; k <= hi; k++)
            std[k] = a[k];
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = std[j];
                j++;
            } else if (j > hi) {
                a[k] = std[i];
                i++;
            } else if (std[j].getPoint() < std[i].getPoint()) {
                a[k] = std[j];
                j++;
            } else {
                a[k] = std[i];
                i++;
            }
        }
        return a;
    }
}
