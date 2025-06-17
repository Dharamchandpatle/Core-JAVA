package Static_Block;

public class StaticBlock {
    static int a;

    StaticBlock() {
        System.out.println("Static block Constructor");
    }

    public static void main(String aa[]) {
        System.out.println("main block ");
    }

    static {
        a = 10;
        new StaticBlock();
        System.out.println("Static block ");
    }
}
