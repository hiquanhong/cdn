import java.time.*;
import  java.util.Locale;

public class test {

    public static void main (String[] args){
        LocalDateTime  nowTime = LocalDateTime.now();
        String pattern = "%tY-%t<tm-%td(%<tA)%<tT";
        String S= String.format(pattern,nowTime);
        System.out.println(S);
        S=String.format(Locale.US,"%ta%<%td%<tY%<tp%<tT",nowTime);
        System.out.println(S);
    }
}
