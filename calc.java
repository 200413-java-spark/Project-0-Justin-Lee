import java.util.Arrays;

class calc {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        //int a = Integer.parseInt(args[0]);
        int[] fullpoints = new int[args.length];
        int[] xchords = new int[(args.length)/2];
        int[] ychords =new int [(args.length)/2] ;
      
        // parse inputs into data sets, complete list of info, then xchords, then y chords
        for(int i=0; i< (args.length) ; i++){
            fullpoints[i] = Integer.parseInt(args[i]);
            if ((i/2)*2==i) {
                xchords[i/2] = Integer.parseInt(args[i]);
            } else {
                ychords[i/2] = Integer.parseInt(args[i]);
            }
        }

        //start aquiring information about vertical lines







        System.out.println(Arrays.toString(fullpoints));
        System.out.println(Arrays.toString(xchords));
        System.out.println(Arrays.toString(ychords));

    }
}