import static java.lang.System.out;

class HelloWorld{
    public static void main(String[] args){
        int number = 5*10;
        out.print(number);
        float percent1 = 5.5f; //That value is 4 bytes 
        double percent = 10.5; //That value is 8 bytes
        out.print('\n');
        out.print(percent1);
        out.print('\n');
        out.print(percent);
        out.print('\n');
    }
}
