int[] prices = {350, 275, 420, 310, 295};
int[] longer = new int[7];
System.arraycopy(prices, 0, longer, 2, 5);
longer
Arrays.copyOf(prices, 7)
Arrays.copyOfRange(prices, 1, 4)
prices.clone()
