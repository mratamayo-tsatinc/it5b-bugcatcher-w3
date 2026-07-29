[[Import]] [[Java]].util.Scanner;

[[Class]] NameInput [[}]]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.[[out]]);
		
        [[system]].out.print("Enter your name: ");
        String name = scanner.nextLine();
		
        [[system]].out.println("Welcome, " + name + "!");
    [[{]]
}