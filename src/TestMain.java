public class TestMain {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.putElement("first", 1);
      //  tc.putElement("second", 2);
       // tc.putElement("third", 3);
       // tc.load();
        System.out.println(tc.isKeyIn("first"));
        System.out.println(tc.isKeyIn("second"));
        System.out.println(tc.isKeyIn("fourth"));

        System.out.println(tc.isKeyIn("third"));
        //tc.putElement("fourth", 4);
        tc.save();
    }
}
