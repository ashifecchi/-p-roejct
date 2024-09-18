import java.util.ArrayList;

public class basetwohelper {
    public static ArrayList<Integer> sep(String num){
        ArrayList<Integer> newlist = new ArrayList<>();
        for (int i = 0; i < num.length(); i++){
            newlist.add((int)(num.charAt(i)));
        }
        return newlist;
    }
    public static int calc(int num, int numbase,int outbase){
        int sum = 0;
        if (numbase == 2 && outbase != 2){
            ArrayList<Integer> list = sep(""+num);
            for (int i = 0; i < list.size(); i++){
                sum += list.get(i);
            }
        } else{
            sum = num*numbase;
        }
        if (outbase == 2){

        } else{
            int thing = sum/outbase;
        }
    }
}
