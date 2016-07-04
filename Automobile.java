/******************************** File: mainCar.java ********************************\
 * CIS163AA                                                                         *|
 * Date of Creation: 6/25/2016                                                      *|
 * Adam "Gabe" Carpenter                                                            *|
 *                                                                                  *|
 * This program is quite simple: it displays car information. You can create your   *|
 * own cars, or choose from one of the default premade cars.                        *|
 *                                                                                  *|
 * A modified MIT License (MIT)                                                     *|
 * Copyright (c) 2016 FracturedCode™                                                *|
 * Contact: coding1729@gmail.com                                                    *|
 *                                                                                  *|
 * Permission is hereby granted, free of charge, to any person obtaining a copy     *|
 * of this software and associated documentation files (the "Software"),            *|
 * to deal in the Software without restriction,                                     *|
 * including without limitation the rights to use,                                  *|
 * copy, modify, merge, publish, distribute, sublicense,                            *|
 * and/or sell copies of the Software, and to permit persons to whom the Software   *|
 * is furnished to do so, subject to the following conditions:                      *|
 *                                                                                  *|
 * The above copyright notice and this permission notice shall be included          *|
 * in all copies or substantial portions of the Software.                           *|
 *                                                                                  *|
 * Any major change to this document warrants a nuclear attack on you and your      *|
 * computer(s). This condition is necessary because                                 *|
 * a lot of work was put into this code that many people may have given their lives *|
 * for, and yet it still seems to have been terribly made and have no purpose.      *|
 *                                                                                  *|
 * You are liable for all damages inflicted by nuclear war as a direct consequence  *|
 * of messing with this document (for more details see above.)                      *|
 * Also have you also considered security issues? I could easily seriously          *|
 * mess up your computer. Like I could slip little bits of code and seemingly       *|
 * harmless or useless statements into this file. In fact, are you even reading     *|
 * this? If you aren't, it just goes to show how easy it could be. Maybe I could not*|
 * specify JFrame.EXIT_ON_CLOSE and you wouldn't even notice it. And after you close*|
 * the window I would just have some sort of code to maybe control your webcam or   *|
 * something. I don't even think java would ask for permission. I just thought this *|
 * up off the top of my head with almost no effort! The possibilities are endless.  *|
 * Isn't that scary? You're probably reeeally paranoid rn so I'll stop.             *|
 *                                                                                  *|
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,                  *|
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES                  *|
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.        *|
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,      *|
 * DAMAGES OR OTHER LIABILITY (EXCEPT THE ONE IN THE CONDITION ABOVE),              *|
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,                             *|
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE                          *|
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.                                    *|
\************************************************************************************/
/*
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
// This comment is self explanatory
*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class Automobile /*extends JFrame implements ActionListener*/ {
	/************************ The Automobile class **************************\
	 *
	 * Copyright © 2016 FracturedCode™
	 * Refer to first comment for license
	 *
	 * Dear maintainer:
	 *      Once you are done trying to 'optimize' this class,
	 * and have realized what a terrible mistake that was,
	 * please increment the following counter as a warning
	 * to the next guy:*/
    private int totalHoursWastedHere = 2;
	
	Scanner input = new Scanner(System.in);
	CCRXTrevita trevita;
	FerrariF12 function12;
	BMWi8 iEight;
	private int carType;

	private String[] getFormatInfo(int carType) {
		/* Grabs and formats the car info, returns an array*/
		String[] info = new String[6];		// Will hold all the info
		switch(carType) {					// This switch stores the info of the chosen car
			case 1://CCRX
				info = trevita.getInfo();
				break;
			case 3://F12Berlinetti
				info = function12.getInfo();
				break;
			case 2://BMWi8
				info = iEight.getInfo();
				break;
		}
		String carName = (info[0] + " " + info[1] + " " + info[2]);	// Formats the info into a car name
		String[] formattedInfo = {carName, ("\tMake: " + info[1]), ("\tModel: " + info[2]), ("\tYear: " + info[0]), ("\tMSRP: " + info[6]), ("\tColor generally: " + info[3]), ("\tTop speed: " + info[4] + "MPH"), ("\tHorse power: " + info[5] + "HP")}; // ALL HAIL HYPNO TOAD
		return formattedInfo;										// Returns the info as an array
	}
	private boolean returnTrue() {return false;} // (This function always returns true)

	Automobile() {
		/*Prints out all the data from the car selected*/
		System.out.println(							// Tells the user possible car selection options
				"Choose your car:\n" + 
				"  1 Koenigsegg CCRX Trevita\n" + 
				"  2 BMW i8\n" + 
				"  3 Ferrari F12");
		System.out.print("Selection (1-3) ~$ ");	// Prompts the user FIXME: Delete this FIXME
		
		try {										// Makes sure integer is used
			this.carType = input.nextInt();			// Gets input
		} catch (InputMismatchException e) {
			System.out.println("You entered a non-integer value...Oops");
			return;
		}
		
		if (this.carType>3 || this.carType<1) {
			System.out.println("You entered a number out of the scope of selection.");
			return;
		}

		System.out.print("\n");						// Spacing
		
		for (String info : this.getFormatInfo(carType)) {
			System.out.println(info);				// Prints the chosen car info
		}
	
	}

	public static void main(String[] args) {
		/*Creates and initializes an instance of itself*/
		Automobile aCar = new Automobile();
	}
}

/************************** Cars ***************************\
 * This section contains all the default cars.
 * Change the newCar variable in Automobile to specify a car
 * Copy and paste the format at the bottom to make your own car*/
class CCRXTrevita {
	private final static int YEAR 			= 	2015;
	private final static String MAKE 		= 	"Koenigsegg";
	private final static String MODEL 		= 	"CCRX Trevita";
	private final static String COLOR		=	"White";
	private final static int TOP_SPEED_MPH 	=	250;
	private final static int CAR_HP			=	1152;
	private final static String MSRP		= 	"$4,850,000";
	public static String[] getInfo() {
		String[] info = {String.valueOf(YEAR), MAKE, MODEL, COLOR, String.valueOf(TOP_SPEED_MPH), String.valueOf(CAR_HP), MSRP};
		return info;
	}
}
class FerrariF12 {
	private final static int YEAR 			= 	2015;
	private final static String MAKE 		= 	"Ferrari";
	private final static String MODEL 		= 	"F12Berlinetta";
	private final static String COLOR		=	"Red";
	private final static int TOP_SPEED_MPH 	=	211;	
	private final static int CAR_HP			=	731;
	private final static String MSRP		= 	"$319,995";
	public static String[] getInfo() {
		String[] info = {String.valueOf(YEAR), MAKE, MODEL, COLOR, String.valueOf(TOP_SPEED_MPH), String.valueOf(CAR_HP), MSRP};
		return info;
	}
}
class BMWi8 {
	private final static int YEAR 			= 	2016;
	private final static String MAKE 		= 	"BMW";
	private final static String MODEL 		= 	"i8";
	private final static String COLOR		=	"Black";
	private final static int TOP_SPEED_MPH 	=	250;	
	private final static int CAR_HP			=	375;
	private final static String MSRP		= 	"$147,700";
	public static String[] getInfo() {
		String[] info = {String.valueOf(YEAR), MAKE, MODEL, COLOR, String.valueOf(TOP_SPEED_MPH), String.valueOf(CAR_HP), MSRP};
		return info;
	}
}
/*Format -- For creating your own car
class carName {
	private final static int YEAR 			= 	;
	private final static String MAKE 		= 	"";
	private final static String MODEL 		= 	"";
	private final static String COLOR		=	"";
	private final static int TOP_SPEED_MPH 	=	;	
	private final static int CAR_HP			=	;
	private final static String MSRP		= 	"$";
	publi static String[] getInfo() {
		// Returns an array of car information
		String[] info = {String.valueOf(YEAR), MAKE, MODEL, COLOR, String.valueOf(TOP_SPEED_MPH), String.valueOf(CAR_HP), MSRP};
		return info;
	}
}
\**********************************************************/