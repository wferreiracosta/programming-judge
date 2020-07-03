public class TestesJudge {

    public static void main(String[] args) {
        int[] t = { 0,3 };
        System.out.println("Final: " + makeArrayConsecutive2(t));
    }

    public static int makeArrayConsecutive2(int[] statues) {
        Integer quantidade = 0;
        for (Integer statue : statues) {
            if (((statue + 1) != statue)) {
                quantidade++;
            }
        }
        return quantidade;
    }

}