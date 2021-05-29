import static java.lang.System.out;

class OperatorDemo{
    public static void main(String[] args){
      int m = 6,n = 4;
      int r1 = m+n;
      int r2 = m-n;
      int r3 = m*n;
      double r4 = (double)m/n;
      int r5 = m%n;
      out.print('\n');
      out.print(r1);
      out.print('\n');
      out.print(r2);
      out.print('\n');
      out.print(r3);
      out.print('\n');
      out.print(r4);
      out.print('\n');
      out.print(r5);
      out.print('\n');

      n += m;
      ++m; //That is pre increment

      m++; //That is post increment

      out.print(n);
      out.print('\n');
      out.print(m);
      out.print('\n');
    }
}
