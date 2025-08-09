class ReverseArray {

    public static void reverse(int[] a, int l, int r) {
        if(l >= r) return ;
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        reverse(a, l+1, r-1);
    }
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 1, 0, 6};
        reverse(a, 0, a.length-1);
        for(int num : a) {
            System.out.print(num+" ");
        }
    }
}
