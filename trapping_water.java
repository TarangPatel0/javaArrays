package arrays;

public class trapping_water {
    public static int trap(int[] height) {
        int lmax[] = new int[height.length];
        int rmax[] = new int[height.length];
        lmax[0] = height[0];
        rmax[height.length - 1] = height[height.length - 1];
        for(int i = 1; i < height.length; i++) {
            lmax[i] = Math.max(lmax[i - 1], height[i]);
        }
        for(int i = height.length - 2; i >= 0 ; i--) {
            rmax[i] = Math.max(rmax[i + 1], height[i]);
        }
        int water = 0;
        for(int i = 1; i < height.length - 1; i++) {
            water += Math.min(rmax[i], lmax[i]) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {
        int roof[] = {2, 9, 2, 8, 9};
        int res = trap(roof);
        System.out.println(res);
    }
}
