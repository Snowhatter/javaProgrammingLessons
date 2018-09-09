
public class ArrayDemo2 {
	public static void main(String[] args){
		String[] myPets;
		myPets = new String[3];
		myPets[0] = "Max";
		myPets[1] = "Bitsy";
		myPets[2] = "Mindy";
		
		System.out.println(myPets.length);
		
		for(int i=0; i<myPets.length; i++){
			System.out.println(myPets[i]);
		}
	}
}
