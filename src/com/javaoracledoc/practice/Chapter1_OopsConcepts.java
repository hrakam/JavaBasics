package com.javaoracledoc.practice;

public class Chapter1_OopsConcepts {

	static class Car implements Icar {

		static int speed;
		static int gear;
		static String colour;

		public int decreaseSpeed(int newspeed) {
			int reduce = 0;
			newspeed = speed - reduce;
			return newspeed;
		}
		
		public String changeColur(String newColour) {
			return newColour;
		}

		@Override
		public int changeGear() {
			return 0;
		}

//		@Override
		public int increaseSpeed(int newspeed) {
			int increase = 0;
			newspeed = speed - increase;
			return newspeed;
		}

		@Override
		public int decreaseSpeed() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int changeColur() {
			// TODO Auto-generated method stub
			return 0;
		}

	}
}
