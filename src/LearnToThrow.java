
public class LearnToThrow {

    public static void main(String[] args) throws Exception {
        arrayPractice(6);

    }

    public  static  void arrayPractice(int i) throws Exception {
        int [] a = new int[5];

        if(i>5){
            throw  new Exception("Hey don't put indexes too high");
        }

    }

}
