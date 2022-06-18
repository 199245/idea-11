public class Test {
    public static void main(String[] args) {
        int prices[] = new int[]{7, 1, 5, 3, 6, 4};
                int soFarMin = prices[0];
                int max = 0;
                for (int i = 1; i < prices.length; i++) {
                    //若当前价格比soFarMin低，就更新soFarMin
                    if (soFarMin > prices[i])
                        soFarMin = prices[i];
                        //若当前价格比soFarMin高或相等，将当前最高利润更新为当前价格与soFarMin的差值
                    else max = Math.max(max, prices[i] - soFarMin);
            }
        System.out.println(max);
        }

    }






