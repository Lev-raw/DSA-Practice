public class pra1{
    //Stack overflow concept 1
    void f(){
        System.out.println("1");
        f();
    }

    public static void main(String[] args) {
        pra1 s = new pra1();

        s.f();
    }
}