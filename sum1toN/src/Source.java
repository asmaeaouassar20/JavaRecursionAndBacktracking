public class Source {

    static int mathFctSum1toN(int N){
        if(N==1) return 1;
        return N+mathFctSum1toN(N-1);
    }

    public static void main(String[] args) {
        int N=5; // 5 + 4 + 3 + 2 + 1 = 15
        System.out.println(mathFctSum1toN(N));
    }
}