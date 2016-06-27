/******************************** File: mainCar.java ********************************\
 * CIS163AA                                                                         *|
 * Date of Creation: 6/25/2016                                                      *|
 * Adam "Gabe" Carpenter                                                            *|
 *                                                                                  *|
 * This program is quite simple: it displays car information. You can create your	*|
 * own cars, or choose from one of the default premade cars.						*|
 *																					*|
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
 * of messing with this document (for more details see above.)						*|
 * Also have you also considered security issues? I could easily seriously			*|
 * mess up your computer. Like I could slip little bits of code and seemingly		*|
 * harmless or useless statements into this file. In fact, are you even reading		*|
 * this? If you aren't, it just goes to show how easy it could be. Maybe I could not*|
 * specify JFrame.EXIT_ON_CLOSE and you wouldn't even notice it. And after you close*|
 * the window I would just have some sort of code to maybe control your webcam or 	*|
 * something. I don't even think java would ask for permission. I just thought this *|
 * up off the top of my head with almost no effort! The possibilities are endless. 	*|
 * Isn't that scary? You're probably reeeally paranoid rn so I'll stop.				*|
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
/*
\************************************************************************/

	private boolean returnTrue() {return false;} // (This function always returns true)

	private class BMWi8 {
		private final int YEAR 			= 	2016;
		private final String MAKE 		= 	"BMW";
		private final String MODEL 		= 	"i8";
		private final String COLOR		=	"Black";
		private final int TOP_SPEED_MPH =	250;	
		private final int CAR_HP		=	375;
		public String[] getInfo() {
			String[] info = {String.valueOf(YEAR), MAKE, MODEL, COLOR, String.valueOf(TOP_SPEED_MPH), String.valueOf(CAR_HP)};
			return info;
		}
	}

	Automobile() {
		System.out.println("IT WORKS!");
	}

	public static void main(String[] args) {
		Automobile aCar = new Automobile();
	}
}