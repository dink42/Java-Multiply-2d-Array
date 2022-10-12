class OvningTolvEtt {
    public static void main(String[] args) {
        int[][] mu = new int[10][10];

        for (int i = 1; i <= mu.length; i++) {
            for (int j = 1; j <= mu.length; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + " | ");
            }
            System.out.println();
        }
        
    }
}