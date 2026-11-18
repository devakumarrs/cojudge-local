class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int i = -1, j = 0;
        while (j < asteroids.length) {
            if (i < 0 || asteroids[i] < 0 || asteroids[j] > 0) {
                asteroids[++i] = asteroids[j++];
                continue;
            }
            while (i >= 0 && asteroids[i] > 0 && asteroids[i] < -asteroids[j]) {
                i--;
            }
            if (i < 0 || asteroids[i] < 0) {
                asteroids[++i] = asteroids[j];
            } else if (asteroids[i] == -asteroids[j]) {
                i--;
            }
            j++;
        }
        int[] arr = new int[i + 1];
        System.arraycopy(asteroids, 0, arr, 0, i + 1);
        return arr;
    }
}