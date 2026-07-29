[[Import]] java.util.Scanner;

[[Public]] [[Class]] VotingAge {
    [[Public]] static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        [[system]].out.print("Enter your age: ");
        int age = [[scanner]].nextInt();

        [[If]] (age >= 18) {[[;]]
            [[system]].out.println("You are eligible to vote.");
        } [[Else]] {[[;]]
            [[system]].out.println("You are not eligible to vote.");
        }
    }
}