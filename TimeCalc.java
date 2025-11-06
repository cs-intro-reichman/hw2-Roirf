public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addedTime  = Integer.parseInt(args[1]);
        int TotalMinutes = hours * 60 + minutes + addedTime;
        int NewHours = (TotalMinutes / 60) % 24;
        int NewMinutes = TotalMinutes % 60;
        if (NewMinutes < 10) {
            System.out.println(NewHours + ":0" + NewMinutes);}
            else
             {System.out.println(NewHours + ":" + NewMinutes);}
    
        }
    }

