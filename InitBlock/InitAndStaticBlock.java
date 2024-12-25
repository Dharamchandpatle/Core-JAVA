package InitBlock;

public class InitAndStaticBlock {
    int a;

    InitAndStaticBlock() {
        System.out.println("Deafault constructor ");
    }

    InitAndStaticBlock(int x) {
        System.out.println("Deafault constructor " + x);
    }

    InitAndStaticBlock(int y, int z) {
        System.out.println("Deafault constructor " + y + " " + z);
    }

    static {
        System.out.println("Static block ");
        new InitAndStaticBlock();
        new InitAndStaticBlock(10);
        new InitAndStaticBlock(10, 20);
    }
    static {
        System.out.println("Static block ");
        new InitAndStaticBlock();
        new InitAndStaticBlock(10);
        new InitAndStaticBlock(10, 20);
    }
    static {
        System.out.println("Static block ");
        new InitAndStaticBlock();
        new InitAndStaticBlock(10);
        new InitAndStaticBlock(10, 20);
    }

    public static void main(String aa[]) {

        System.out.println("main ");
        {
            System.out.println("Init block ");
        }

    }

    static {
        System.out.println("Static block ");
        new InitAndStaticBlock();
        new InitAndStaticBlock(10);
        new InitAndStaticBlock(10, 20);
    }
    static {
        System.out.println("Static block ");
        new InitAndStaticBlock();
        new InitAndStaticBlock(10);
        new InitAndStaticBlock(10, 20);
    }
    static {
        System.out.println("Static block ");
        new InitAndStaticBlock();
        new InitAndStaticBlock(10);
        new InitAndStaticBlock(10, 20);
    }

}
