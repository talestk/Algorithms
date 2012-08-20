/* 	The program Cat shown above is a sample client of In and Out that uses multiple 
 * input streams to concatenate several input files into a single output file.*/


public class Concat {

    public static void main(String[] args) { 
        Out out = new Out(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) {
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
