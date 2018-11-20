package com.harichandu.javabasics;

public class StringTest {
	private static TV tvRemote = new TV();
	static {
		tvRemote.showChannel("bbc");
		System.out.println("static, tv = " + tvRemote);
	}

	public static void main(String[] args) {

		String str = "Haritha";
		 System.out.println(str.length());
		 System.out.println("main before, tv = " + tvRemote);
		 final TV myTv = tvRemote;
//		 
		 myTv.showChannel("nick jr");
//		 
		TV myTv1 = new TV();
		 
		 System.out.println("main after, tv = " + tvRemote);
		 someOtherMethod();
		 
	}

	
	private static void someOtherMethod() {
		System.out.println("someOtherMethod , tv = " + tvRemote);
		
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
	            'i', 'n', 'a', 't', 'e', 'd'};
	            
	}


	static class TV {
		private String channel;

		public void showChannel(String channel) {
			this.channel = channel;
		}

		public String toString() {
			return "TV [channel=" + channel + "]";
		}
	}
}
