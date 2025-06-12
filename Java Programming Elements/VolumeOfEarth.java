import java.lang.Math;
class VolumeOfEarth{
	public static void main(String[] args){
		int radiusInKM = 6378;
		float kmToMiles = 1.6f;
		float radiusInMiles = radiusInKM * kmToMiles;
		double pi = Math.PI;
		double volumeInKM = (4/3) * pi * Math.pow(radiusInKM, 3);
		double volumeInMiles = (4/3) * pi * Math.pow(radiusInMiles, 3);
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKM + " and cubic miles is " + volumeInMiles);
	}
}