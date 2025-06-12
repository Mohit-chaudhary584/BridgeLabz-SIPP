import java.util.Scanner;

class DistanceTravelled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();

        int distanceFromToVia = sc.nextInt();
        int distanceViaToFinal = sc.nextInt();
        int timeFromToVia = sc.nextInt();
        int timeViaToFinal = sc.nextInt();

        int totalDistance = distanceFromToVia + distanceViaToFinal;
        int totalTime = timeFromToVia + timeViaToFinal;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}