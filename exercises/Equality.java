[[Import]] java.util.[[scanner]];

public [[Class]] Equality {
    [[Public]] [[Static]] [[Void]] [[Main]]([[string]][] args) {
        [[Int]] x, y;
        
	[[scanner]] in = new Scanner(System.in);
		
        System.out.print("Enter x: ");
        x = in.nextInt();
        
	System.out.print("Enter y: ");
        y = in.[[nxtInt]]();

        [[If]] (x == y) {
            System.out.println("Numbers are equal.");
        }
    }
}