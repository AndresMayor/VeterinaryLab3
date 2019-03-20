package ui;
import model.*;
import java.util.ArrayList;
import java.util.Scanner;




public class Main{
	//Relations 


	private Veterinary myLittlePet;


	//initializer 

	private Scanner reader;

	public Main(){
		init();
		reader = new Scanner(System.in);
	} 

	public static void Main(String [] args){
		Main m = new Main();
		m.menu();
		m.showMenu();
	}


	public void menu(){
		welcome();
	}



	public void welcome(){

    System.out.println(".............................................................................");
    System.out.println("--------------------           My Little Pet.            --------------------");
    System.out.println(".............................................................................");

	}



	public void showMenu(){

		int userInput=0;

		while(userInput!=9){
			showOptions();
			userInput = reader.nextInt();
			reader.nextLine();


			if(userInput==1){



			}
			else if(userInput==2){




			}
			else if(userInput==3){




			}
			else if(userInput==4){




			}
			else if(userInput==5){





			}
			else if (userInput==6){







			}
			else if(userInput==7){




			}
			else if (userInput==8){




			}











		}




	}


public void showOptions(){
  System.out.println("please type the option you want to review.");
  System.out.println("1. ");
  System.out.println("2. ");
  System.out.println("3. ");
  System.out.println("4. ");
  System.out.println("5. ");
  System.out.println("6. ");
  System.out.println("7. ");
  System.out.println("8. ");


}

public void init(){




//	public HumanClient(String name,int iD,String address,String telePhone){

HumanClient client1 = new HumanClient("Andres",122,"Cra 33a #29-56","3237985");
HumanClient client2 = new HumanClient("Richard",123,"Cra 33a #29-47","3213211");
//public Mascot(String name,double weight,int age,char type,HumanClient owner){

Mascot mascot1 = new Mascot("Bonny",20.0,3,'G',client1);
Mascot mascot2 = new Mascot("Zeus",22.0,5,'P',client2);
Mascot mascot3 = new Mascot("Hercules",30.0,6,'P',client2);
client1.getMascots().add(mascot1);
mascot1.setOwner(client1);
client2.getMascots().add(mascot2);
mascot1.setOwner(client2);
client2.getMascots().add(mascot3);
mascot1.setOwner(client2);

Date admissionDate1 = new Date (22,03,2018);
Date exitDate1 = new Date(10,03,2019);
Date admissionDate2 = new Date (20,02,2018);
Date exitDate2 = new Date(20,02,2019);
Date admissionDate3 = new Date (26,03,2019);


//public Medicine(String name, double dose, double costDose, double frecuency){

Medicine medicine1 = new Medicine("Meloxic",15.0,10.000,23.0);
Medicine medicine2 = new Medicine("Marboquin",13.0,12.000,24.0);
Medicine medicine3 = new Medicine("Mirrapel",11.0,9.000,14.0);
Medicine medicine4 = new Medicine("Drontal",10.0,8.000,9.0);

// public ClinicHistory(boolean status,String symptom,String diagnosis,Mascot datas,Date admissionDate,Date exitDate){

ClinicHistory history1 = new ClinicHistory(true,"the animal is itchy","Critical",mascot1, admissionDate1, exitDate1);
ClinicHistory history2 = new ClinicHistory(true,"the animal is fever ","low risk",mascot2,admissionDate2,exitDate2);
ClinicHistory history3 = new ClinicHistory(true, "the animal is infecte bite","Critical",mascot3,admissionDate3,null);
history1.getMedicines().add(medicine1);
history1.getMedicines().add(medicine2);
history2.getMedicines().add(medicine3);
history3.getMedicines().add(medicine4);


//Status Minirooms

Miniroom room1 = new Miniroom(false,1,null);
Miniroom room2 = new Miniroom(false,2,null);
Miniroom room3 = new Miniroom(false,3,null);
Miniroom room4 = new Miniroom(false,4,null);
Miniroom room5 = new Miniroom(true,5,history3);
Miniroom room6 = new Miniroom(false,6,null);
Miniroom room7 = new Miniroom(true,7,history1);
Miniroom room8 = new Miniroom(true,8,history2);
Miniroom[] rooms = {room1,room2,room3,room4,room5,room6,room7,room8};
Veterinary myLittlePet = new Veterinary();
		myLittlePet.setRooms(rooms);
		myLittlePet.getHistories().add(history1);
		myLittlePet.getHistories().add(history2);
        myLittlePet.getHistories().add(history3);
		myLittlePet.getClients().add(client1);
		myLittlePet.getClients().add(client2);
		myLittlePet.getClients().add(client2);
















	
} 






}