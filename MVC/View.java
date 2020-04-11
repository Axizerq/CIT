    

public class View {

    public View(Model model) {
        printText();
    }

    public void printText() {
        System.out.print("\"exit\" to exit this program! \nPlease enter your number: ");
    }

    public void printText2() {
        System.out.print("\"exit\" to exit this program! \nYou can enter another number: ");
    }

    public void printNum(int num) {
        System.out.println("\nYour number is: " + num + "\n");
    }
}
